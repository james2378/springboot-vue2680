package com.dao;

import com.entity.ShiyantaishiyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyantaishiyongView;

/**
 * 实验台使用记录 Dao 接口
 *
 * @author 
 */
public interface ShiyantaishiyongDao extends BaseMapper<ShiyantaishiyongEntity> {

   List<ShiyantaishiyongView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
