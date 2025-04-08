
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
 * 实验室排课
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shiyanshipaike")
public class ShiyanshipaikeController {
    private static final Logger logger = LoggerFactory.getLogger(ShiyanshipaikeController.class);

    @Autowired
    private ShiyanshipaikeService shiyanshipaikeService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private LaoshiService laoshiService;
    @Autowired
    private ShiyanshiService shiyanshiService;

    @Autowired
    private XueshengService xueshengService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = shiyanshipaikeService.queryPage(params);

        //字典表数据转换
        List<ShiyanshipaikeView> list =(List<ShiyanshipaikeView>)page.getList();
        for(ShiyanshipaikeView c:list){
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
        ShiyanshipaikeEntity shiyanshipaike = shiyanshipaikeService.selectById(id);
        if(shiyanshipaike !=null){
            //entity转view
            ShiyanshipaikeView view = new ShiyanshipaikeView();
            BeanUtils.copyProperties( shiyanshipaike , view );//把实体数据重构到view中

                //级联表
                LaoshiEntity laoshi = laoshiService.selectById(shiyanshipaike.getLaoshiId());
                if(laoshi != null){
                    BeanUtils.copyProperties( laoshi , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setLaoshiId(laoshi.getId());
                }
                //级联表
                ShiyanshiEntity shiyanshi = shiyanshiService.selectById(shiyanshipaike.getShiyanshiId());
                if(shiyanshi != null){
                    BeanUtils.copyProperties( shiyanshi , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setShiyanshiId(shiyanshi.getId());
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
    public R save(@RequestBody ShiyanshipaikeEntity shiyanshipaike, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shiyanshipaike:{}",this.getClass().getName(),shiyanshipaike.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("老师".equals(role))
            shiyanshipaike.setLaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<ShiyanshipaikeEntity> queryWrapper = new EntityWrapper<ShiyanshipaikeEntity>()
            .eq("shiyanshi_id", shiyanshipaike.getShiyanshiId())
            .eq("xingqi_types", shiyanshipaike.getXingqiTypes())
            .eq("jieshu_types", shiyanshipaike.getJieshuTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShiyanshipaikeEntity shiyanshipaikeEntity = shiyanshipaikeService.selectOne(queryWrapper);
        if(shiyanshipaikeEntity==null){
            shiyanshipaike.setInsertTime(new Date());
            shiyanshipaike.setCreateTime(new Date());
            shiyanshipaikeService.insert(shiyanshipaike);
            return R.ok();
        }else {
            return R.error(511,"该实验室该星期的该节数已存在");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShiyanshipaikeEntity shiyanshipaike, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,shiyanshipaike:{}",this.getClass().getName(),shiyanshipaike.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(StringUtil.isEmpty(role))
//            return R.error(511,"权限为空");
//        else if("老师".equals(role))
//            shiyanshipaike.setLaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<ShiyanshipaikeEntity> queryWrapper = new EntityWrapper<ShiyanshipaikeEntity>()
            .notIn("id",shiyanshipaike.getId())
            .andNew()
            .eq("shiyanshi_id", shiyanshipaike.getShiyanshiId())
            .eq("xingqi_types", shiyanshipaike.getXingqiTypes())
            .eq("jieshu_types", shiyanshipaike.getJieshuTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShiyanshipaikeEntity shiyanshipaikeEntity = shiyanshipaikeService.selectOne(queryWrapper);
        if(shiyanshipaikeEntity==null){
            shiyanshipaikeService.updateById(shiyanshipaike);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"该实验室该星期的该节数已存在");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        shiyanshipaikeService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<ShiyanshipaikeEntity> shiyanshipaikeList = new ArrayList<>();//上传的东西
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
                            ShiyanshipaikeEntity shiyanshipaikeEntity = new ShiyanshipaikeEntity();
//                            shiyanshipaikeEntity.setShiyanshiId(Integer.valueOf(data.get(0)));   //实验室 要改的
//                            shiyanshipaikeEntity.setLaoshiId(Integer.valueOf(data.get(0)));   //老师 要改的
//                            shiyanshipaikeEntity.setBanjiTypes(Integer.valueOf(data.get(0)));   //班级 要改的
//                            shiyanshipaikeEntity.setXingqiTypes(Integer.valueOf(data.get(0)));   //星期 要改的
//                            shiyanshipaikeEntity.setJieshuTypes(Integer.valueOf(data.get(0)));   //节数 要改的
//                            shiyanshipaikeEntity.setInsertTime(date);//时间
//                            shiyanshipaikeEntity.setCreateTime(date);//时间
                            shiyanshipaikeList.add(shiyanshipaikeEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        shiyanshipaikeService.insertBatch(shiyanshipaikeList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
