package com.entity.view;

import com.entity.ShebeisunhuaiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 设备损坏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shebeisunhuai")
public class ShebeisunhuaiView extends ShebeisunhuaiEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 shebei
			/**
			* 设备名称
			*/
			private String shebeiName;
			/**
			* 设备类型
			*/
			private Integer shebeiTypes;
				/**
				* 设备类型的值
				*/
				private String shebeiValue;
			/**
			* 设备数量
			*/
			private Integer shebeiNumber;
			/**
			* 设备介绍
			*/
			private String shebeiContent;

	public ShebeisunhuaiView() {

	}

	public ShebeisunhuaiView(ShebeisunhuaiEntity shebeisunhuaiEntity) {
		try {
			BeanUtils.copyProperties(this, shebeisunhuaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













				//级联表的get和set shebei

					/**
					* 获取： 设备名称
					*/
					public String getShebeiName() {
						return shebeiName;
					}
					/**
					* 设置： 设备名称
					*/
					public void setShebeiName(String shebeiName) {
						this.shebeiName = shebeiName;
					}
					/**
					* 获取： 设备类型
					*/
					public Integer getShebeiTypes() {
						return shebeiTypes;
					}
					/**
					* 设置： 设备类型
					*/
					public void setShebeiTypes(Integer shebeiTypes) {
						this.shebeiTypes = shebeiTypes;
					}


						/**
						* 获取： 设备类型的值
						*/
						public String getShebeiValue() {
							return shebeiValue;
						}
						/**
						* 设置： 设备类型的值
						*/
						public void setShebeiValue(String shebeiValue) {
							this.shebeiValue = shebeiValue;
						}
					/**
					* 获取： 设备数量
					*/
					public Integer getShebeiNumber() {
						return shebeiNumber;
					}
					/**
					* 设置： 设备数量
					*/
					public void setShebeiNumber(Integer shebeiNumber) {
						this.shebeiNumber = shebeiNumber;
					}
					/**
					* 获取： 设备介绍
					*/
					public String getShebeiContent() {
						return shebeiContent;
					}
					/**
					* 设置： 设备介绍
					*/
					public void setShebeiContent(String shebeiContent) {
						this.shebeiContent = shebeiContent;
					}


















}
