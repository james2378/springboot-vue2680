package com.dao;

import com.entity.ShiyanshipaikeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanshipaikeView;

/**
 * 实验室排课 Dao 接口
 *
 * @author 
 */
public interface ShiyanshipaikeDao extends BaseMapper<ShiyanshipaikeEntity> {

   List<ShiyanshipaikeView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
