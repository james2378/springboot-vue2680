package com.entity.view;

import com.entity.ShiyanshipaikeEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 实验室排课
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shiyanshipaike")
public class ShiyanshipaikeView extends ShiyanshipaikeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 班级的值
		*/
		private String banjiValue;
		/**
		* 星期的值
		*/
		private String xingqiValue;
		/**
		* 节数的值
		*/
		private String jieshuValue;



		//级联表 laoshi
			/**
			* 工号
			*/
			private String laoshiUuidNumber;
			/**
			* 老师姓名
			*/
			private String laoshiName;
			/**
			* 老师手机号
			*/
			private String laoshiPhone;
			/**
			* 老师头像
			*/
			private String laoshiPhoto;
			/**
			* 老师介绍
			*/
			private String laoshiContent;
			/**
			* 电子邮箱
			*/
			private String laoshiEmail;

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

	public ShiyanshipaikeView() {

	}

	public ShiyanshipaikeView(ShiyanshipaikeEntity shiyanshipaikeEntity) {
		try {
			BeanUtils.copyProperties(this, shiyanshipaikeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 班级的值
			*/
			public String getBanjiValue() {
				return banjiValue;
			}
			/**
			* 设置： 班级的值
			*/
			public void setBanjiValue(String banjiValue) {
				this.banjiValue = banjiValue;
			}
			/**
			* 获取： 星期的值
			*/
			public String getXingqiValue() {
				return xingqiValue;
			}
			/**
			* 设置： 星期的值
			*/
			public void setXingqiValue(String xingqiValue) {
				this.xingqiValue = xingqiValue;
			}
			/**
			* 获取： 节数的值
			*/
			public String getJieshuValue() {
				return jieshuValue;
			}
			/**
			* 设置： 节数的值
			*/
			public void setJieshuValue(String jieshuValue) {
				this.jieshuValue = jieshuValue;
			}











				//级联表的get和set laoshi
					/**
					* 获取： 工号
					*/
					public String getLaoshiUuidNumber() {
						return laoshiUuidNumber;
					}
					/**
					* 设置： 工号
					*/
					public void setLaoshiUuidNumber(String laoshiUuidNumber) {
						this.laoshiUuidNumber = laoshiUuidNumber;
					}
					/**
					* 获取： 老师姓名
					*/
					public String getLaoshiName() {
						return laoshiName;
					}
					/**
					* 设置： 老师姓名
					*/
					public void setLaoshiName(String laoshiName) {
						this.laoshiName = laoshiName;
					}
					/**
					* 获取： 老师手机号
					*/
					public String getLaoshiPhone() {
						return laoshiPhone;
					}
					/**
					* 设置： 老师手机号
					*/
					public void setLaoshiPhone(String laoshiPhone) {
						this.laoshiPhone = laoshiPhone;
					}
					/**
					* 获取： 老师头像
					*/
					public String getLaoshiPhoto() {
						return laoshiPhoto;
					}
					/**
					* 设置： 老师头像
					*/
					public void setLaoshiPhoto(String laoshiPhoto) {
						this.laoshiPhoto = laoshiPhoto;
					}
					/**
					* 获取： 老师介绍
					*/
					public String getLaoshiContent() {
						return laoshiContent;
					}
					/**
					* 设置： 老师介绍
					*/
					public void setLaoshiContent(String laoshiContent) {
						this.laoshiContent = laoshiContent;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getLaoshiEmail() {
						return laoshiEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setLaoshiEmail(String laoshiEmail) {
						this.laoshiEmail = laoshiEmail;
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
