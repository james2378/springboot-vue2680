package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 实验室
 *
 * @author 
 * @email
 */
@TableName("shiyanshi")
public class ShiyanshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShiyanshiEntity() {

	}

	public ShiyanshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 实验室编号
     */
    @TableField(value = "shiyanshi_uuid_number")

    private String shiyanshiUuidNumber;


    /**
     * 所在位置
     */
    @TableField(value = "shiyanshi_weizhi")

    private String shiyanshiWeizhi;


    /**
     * 容纳人数
     */
    @TableField(value = "shiyanshi_renshu")

    private Integer shiyanshiRenshu;


    /**
     * 实验科目
     */
    @TableField(value = "shiyanshikemu_types")

    private Integer shiyanshikemuTypes;


    /**
     * 实验室介绍
     */
    @TableField(value = "shiyanshi_content")

    private String shiyanshiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：实验室编号
	 */
    public String getShiyanshiUuidNumber() {
        return shiyanshiUuidNumber;
    }


    /**
	 * 获取：实验室编号
	 */

    public void setShiyanshiUuidNumber(String shiyanshiUuidNumber) {
        this.shiyanshiUuidNumber = shiyanshiUuidNumber;
    }
    /**
	 * 设置：所在位置
	 */
    public String getShiyanshiWeizhi() {
        return shiyanshiWeizhi;
    }


    /**
	 * 获取：所在位置
	 */

    public void setShiyanshiWeizhi(String shiyanshiWeizhi) {
        this.shiyanshiWeizhi = shiyanshiWeizhi;
    }
    /**
	 * 设置：容纳人数
	 */
    public Integer getShiyanshiRenshu() {
        return shiyanshiRenshu;
    }


    /**
	 * 获取：容纳人数
	 */

    public void setShiyanshiRenshu(Integer shiyanshiRenshu) {
        this.shiyanshiRenshu = shiyanshiRenshu;
    }
    /**
	 * 设置：实验科目
	 */
    public Integer getShiyanshikemuTypes() {
        return shiyanshikemuTypes;
    }


    /**
	 * 获取：实验科目
	 */

    public void setShiyanshikemuTypes(Integer shiyanshikemuTypes) {
        this.shiyanshikemuTypes = shiyanshikemuTypes;
    }
    /**
	 * 设置：实验室介绍
	 */
    public String getShiyanshiContent() {
        return shiyanshiContent;
    }


    /**
	 * 获取：实验室介绍
	 */

    public void setShiyanshiContent(String shiyanshiContent) {
        this.shiyanshiContent = shiyanshiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Shiyanshi{" +
            "id=" + id +
            ", shiyanshiUuidNumber=" + shiyanshiUuidNumber +
            ", shiyanshiWeizhi=" + shiyanshiWeizhi +
            ", shiyanshiRenshu=" + shiyanshiRenshu +
            ", shiyanshikemuTypes=" + shiyanshikemuTypes +
            ", shiyanshiContent=" + shiyanshiContent +
            ", createTime=" + createTime +
        "}";
    }
}
