
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 实验台使用记录
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shiyantaishiyong")
public class ShiyantaishiyongController {
    private static final Logger logger = LoggerFactory.getLogger(ShiyantaishiyongController.class);

    @Autowired
    private ShiyantaishiyongService shiyantaishiyongService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private ShiyantaiService shiyantaiService;
    @Autowired
    private XueshengService xueshengService;

    @Autowired
    private LaoshiService laoshiService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("学生".equals(role))
            params.put("xueshengId",request.getSession().getAttribute("userId"));
        else if("老师".equals(role))
            params.put("laoshiId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = shiyantaishiyongService.queryPage(params);

        //字典表数据转换
        List<ShiyantaishiyongView> list =(List<ShiyantaishiyongView>)page.getList();
        for(ShiyantaishiyongView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShiyantaishiyongEntity shiyantaishiyong = shiyantaishiyongService.selectById(id);
        if(shiyantaishiyong !=null){
            //entity转view
            ShiyantaishiyongView view = new ShiyantaishiyongView();
            BeanUtils.copyProperties( shiyantaishiyong , view );//把实体数据重构到view中

                //级联表
                ShiyantaiEntity shiyantai = shiyantaiService.selectById(shiyantaishiyong.getShiyantaiId());
                if(shiyantai != null){
                    BeanUtils.copyProperties( shiyantai , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setShiyantaiId(shiyantai.getId());
                }
                //级联表
                XueshengEntity xuesheng = xueshengService.selectById(shiyantaishiyong.getXueshengId());
                if(xuesheng != null){
                    BeanUtils.copyProperties( xuesheng , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setXueshengId(xuesheng.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShiyantaishiyongEntity shiyantaishiyong, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shiyantaishiyong:{}",this.getClass().getName(),shiyantaishiyong.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("学生".equals(role))
            shiyantaishiyong.setXueshengId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

            shiyantaishiyong.setInsertTime(new Date());
            shiyantaishiyong.setCreateTime(new Date());
            shiyantaishiyongService.insert(shiyantaishiyong);
            return R.ok();

    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShiyantaishiyongEntity shiyantaishiyong, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,shiyantaishiyong:{}",this.getClass().getName(),shiyantaishiyong.toString());

            shiyantaishiyongService.updateById(shiyantaishiyong);//根据id更新
            return R.ok();

    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        shiyantaishiyongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<ShiyantaishiyongEntity> shiyantaishiyongList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ShiyantaishiyongEntity shiyantaishiyongEntity = new ShiyantaishiyongEntity();
//                            shiyantaishiyongEntity.setShiyantaiId(Integer.valueOf(data.get(0)));   //实验台 要改的
//                            shiyantaishiyongEntity.setXueshengId(Integer.valueOf(data.get(0)));   //学生 要改的
//                            shiyantaishiyongEntity.setShiyantaishiyongContent("");//照片
//                            shiyantaishiyongEntity.setInsertTime(date);//时间
//                            shiyantaishiyongEntity.setCreateTime(date);//时间
                            shiyantaishiyongList.add(shiyantaishiyongEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        shiyantaishiyongService.insertBatch(shiyantaishiyongList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
