package com.entity.view;

import com.entity.ChengjiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 成绩
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("chengji")
public class ChengjiView extends ChengjiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String chengjiLeixingValue;



		//级联表 shiyanshipaike
			/**
			* 实验室排课 的 老师
			*/
			private Integer shiyanshipaikeLaoshiId;
			/**
			* 星期
			*/
			private Integer xingqiTypes;
				/**
				* 星期的值
				*/
				private String xingqiValue;
			/**
			* 节数
			*/
			private Integer jieshuTypes;
				/**
				* 节数的值
				*/
				private String jieshuValue;

		//级联表 xuesheng
			/**
			* 学号
			*/
			private String xueshengUuidNumber;
			/**
			* 学生姓名
			*/
			private String xueshengName;
			/**
			* 学生手机号
			*/
			private String xueshengPhone;
			/**
			* 学生头像
			*/
			private String xueshengPhoto;
			/**
			* 班级
			*/
			private Integer banjiTypes;
				/**
				* 班级的值
				*/
				private String banjiValue;
			/**
			* 学生介绍
			*/
			private String xueshengContent;
			/**
			* 电子邮箱
			*/
			private String xueshengEmail;

	public ChengjiView() {

	}

	public ChengjiView(ChengjiEntity chengjiEntity) {
		try {
			BeanUtils.copyProperties(this, chengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getChengjiLeixingValue() {
				return chengjiLeixingValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setChengjiLeixingValue(String chengjiLeixingValue) {
				this.chengjiLeixingValue = chengjiLeixingValue;
			}


























				//级联表的get和set shiyanshipaike

					/**
					* 获取：实验室排课 的 老师
					*/
					public Integer getShiyanshipaikeLaoshiId() {
						return shiyanshipaikeLaoshiId;
					}
					/**
					* 设置：实验室排课 的 老师
					*/
					public void setShiyanshipaikeLaoshiId(Integer shiyanshipaikeLaoshiId) {
						this.shiyanshipaikeLaoshiId = shiyanshipaikeLaoshiId;
					}

					/**
					* 获取： 星期
					*/
					public Integer getXingqiTypes() {
						return xingqiTypes;
					}
					/**
					* 设置： 星期
					*/
					public void setXingqiTypes(Integer xingqiTypes) {
						this.xingqiTypes = xingqiTypes;
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
					* 获取： 节数
					*/
					public Integer getJieshuTypes() {
						return jieshuTypes;
					}
					/**
					* 设置： 节数
					*/
					public void setJieshuTypes(Integer jieshuTypes) {
						this.jieshuTypes = jieshuTypes;
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








				//级联表的get和set xuesheng
					/**
					* 获取： 学号
					*/
					public String getXueshengUuidNumber() {
						return xueshengUuidNumber;
					}
					/**
					* 设置： 学号
					*/
					public void setXueshengUuidNumber(String xueshengUuidNumber) {
						this.xueshengUuidNumber = xueshengUuidNumber;
					}
					/**
					* 获取： 学生姓名
					*/
					public String getXueshengName() {
						return xueshengName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setXueshengName(String xueshengName) {
						this.xueshengName = xueshengName;
					}
					/**
					* 获取： 学生手机号
					*/
					public String getXueshengPhone() {
						return xueshengPhone;
					}
					/**
					* 设置： 学生手机号
					*/
					public void setXueshengPhone(String xueshengPhone) {
						this.xueshengPhone = xueshengPhone;
					}
					/**
					* 获取： 学生头像
					*/
					public String getXueshengPhoto() {
						return xueshengPhoto;
					}
					/**
					* 设置： 学生头像
					*/
					public void setXueshengPhoto(String xueshengPhoto) {
						this.xueshengPhoto = xueshengPhoto;
					}
					/**
					* 获取： 班级
					*/
					public Integer getBanjiTypes() {
						return banjiTypes;
					}
					/**
					* 设置： 班级
					*/
					public void setBanjiTypes(Integer banjiTypes) {
						this.banjiTypes = banjiTypes;
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
					* 获取： 学生介绍
					*/
					public String getXueshengContent() {
						return xueshengContent;
					}
					/**
					* 设置： 学生介绍
					*/
					public void setXueshengContent(String xueshengContent) {
						this.xueshengContent = xueshengContent;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getXueshengEmail() {
						return xueshengEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setXueshengEmail(String xueshengEmail) {
						this.xueshengEmail = xueshengEmail;
					}







}
