package com.dao;

import com.entity.XueshengchuqinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengchuqinView;

/**
 * 学生出勤 Dao 接口
 *
 * @author 
 */
public interface XueshengchuqinDao extends BaseMapper<XueshengchuqinEntity> {

   List<XueshengchuqinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
