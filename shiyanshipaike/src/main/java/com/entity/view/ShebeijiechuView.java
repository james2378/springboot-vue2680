package com.entity.view;

import com.entity.ShebeijiechuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 设备借出
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shebeijiechu")
public class ShebeijiechuView extends ShebeijiechuEntity implements Serializable {
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

	public ShebeijiechuView() {

	}

	public ShebeijiechuView(ShebeijiechuEntity shebeijiechuEntity) {
		try {
			BeanUtils.copyProperties(this, shebeijiechuEntity);
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
