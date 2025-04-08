package com.entity.view;

import com.entity.ShebeiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 设备
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shebei")
public class ShebeiView extends ShebeiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 设备类型的值
		*/
		private String shebeiValue;



		//级联表 shiyanshi
			/**
			* 实验室编号
			*/
			private String shiyanshiUuidNumber;
			/**
			* 所在位置
			*/
			private String shiyanshiWeizhi;
			/**
			* 容纳人数
			*/
			private Integer shiyanshiRenshu;
			/**
			* 实验科目
			*/
			private Integer shiyanshikemuTypes;
				/**
				* 实验科目的值
				*/
				private String shiyanshikemuValue;
			/**
			* 实验室介绍
			*/
			private String shiyanshiContent;

	public ShebeiView() {

	}

	public ShebeiView(ShebeiEntity shebeiEntity) {
		try {
			BeanUtils.copyProperties(this, shebeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
















				//级联表的get和set shiyanshi
					/**
					* 获取： 实验室编号
					*/
					public String getShiyanshiUuidNumber() {
						return shiyanshiUuidNumber;
					}
					/**
					* 设置： 实验室编号
					*/
					public void setShiyanshiUuidNumber(String shiyanshiUuidNumber) {
						this.shiyanshiUuidNumber = shiyanshiUuidNumber;
					}
					/**
					* 获取： 所在位置
					*/
					public String getShiyanshiWeizhi() {
						return shiyanshiWeizhi;
					}
					/**
					* 设置： 所在位置
					*/
					public void setShiyanshiWeizhi(String shiyanshiWeizhi) {
						this.shiyanshiWeizhi = shiyanshiWeizhi;
					}
					/**
					* 获取： 容纳人数
					*/
					public Integer getShiyanshiRenshu() {
						return shiyanshiRenshu;
					}
					/**
					* 设置： 容纳人数
					*/
					public void setShiyanshiRenshu(Integer shiyanshiRenshu) {
						this.shiyanshiRenshu = shiyanshiRenshu;
					}
					/**
					* 获取： 实验科目
					*/
					public Integer getShiyanshikemuTypes() {
						return shiyanshikemuTypes;
					}
					/**
					* 设置： 实验科目
					*/
					public void setShiyanshikemuTypes(Integer shiyanshikemuTypes) {
						this.shiyanshikemuTypes = shiyanshikemuTypes;
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
					/**
					* 获取： 实验室介绍
					*/
					public String getShiyanshiContent() {
						return shiyanshiContent;
					}
					/**
					* 设置： 实验室介绍
					*/
					public void setShiyanshiContent(String shiyanshiContent) {
						this.shiyanshiContent = shiyanshiContent;
					}












}
