package com.dao;

import com.entity.ShebeijiechuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeijiechuView;

/**
 * 设备借出 Dao 接口
 *
 * @author 
 */
public interface ShebeijiechuDao extends BaseMapper<ShebeijiechuEntity> {

   List<ShebeijiechuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
