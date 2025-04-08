package com.entity.view;

import com.entity.ShiyanshiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 实验室
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shiyanshi")
public class ShiyanshiView extends ShiyanshiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 实验科目的值
		*/
		private String shiyanshikemuValue;



	public ShiyanshiView() {

	}

	public ShiyanshiView(ShiyanshiEntity shiyanshiEntity) {
		try {
			BeanUtils.copyProperties(this, shiyanshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 实验科目的值
			*/
			public String getShiyanshikemuValue() {
				return shiyanshikemuValue;
			}
			/**
			* 设置： 实验科目的值
			*/
			public void setShiyanshikemuValue(String shiyanshikemuValue) {
				this.shiyanshikemuValue = shiyanshikemuValue;
			}















}
