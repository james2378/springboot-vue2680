package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyantaishiyongEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 实验台使用记录 服务类
 */
public interface ShiyantaishiyongService extends IService<ShiyantaishiyongEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}