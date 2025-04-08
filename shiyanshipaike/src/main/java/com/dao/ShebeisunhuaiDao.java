package com.dao;

import com.entity.ShebeisunhuaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeisunhuaiView;

/**
 * 设备损坏 Dao 接口
 *
 * @author 
 */
public interface ShebeisunhuaiDao extends BaseMapper<ShebeisunhuaiEntity> {

   List<ShebeisunhuaiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
