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
 * 成绩
 *
 * @author 
 * @email
 */
@TableName("chengji")
public class ChengjiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChengjiEntity() {

	}

	public ChengjiEntity(T t) {
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
     * 学生
     */
    @TableField(value = "xuesheng_id")

    private Integer xueshengId;


    /**
     * 实验室排课
     */
    @TableField(value = "shiyanshipaike_id")

    private Integer shiyanshipaikeId;


    /**
     * 类型
     */
    @TableField(value = "chengji_leixing_types")

    private Integer chengjiLeixingTypes;


    /**
     * 分数
     */
    @TableField(value = "chengji_number")

    private Integer chengjiNumber;


    /**
     * 考试时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "chengji_time")

    private Date chengjiTime;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 获取：学生
	 */

    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 设置：实验室排课
	 */
    public Integer getShiyanshipaikeId() {
        return shiyanshipaikeId;
    }


    /**
	 * 获取：实验室排课
	 */

    public void setShiyanshipaikeId(Integer shiyanshipaikeId) {
        this.shiyanshipaikeId = shiyanshipaikeId;
    }
    /**
	 * 设置：类型
	 */
    public Integer getChengjiLeixingTypes() {
        return chengjiLeixingTypes;
    }


    /**
	 * 获取：类型
	 */

    public void setChengjiLeixingTypes(Integer chengjiLeixingTypes) {
        this.chengjiLeixingTypes = chengjiLeixingTypes;
    }
    /**
	 * 设置：分数
	 */
    public Integer getChengjiNumber() {
        return chengjiNumber;
    }


    /**
	 * 获取：分数
	 */

    public void setChengjiNumber(Integer chengjiNumber) {
        this.chengjiNumber = chengjiNumber;
    }
    /**
	 * 设置：考试时间
	 */
    public Date getChengjiTime() {
        return chengjiTime;
    }


    /**
	 * 获取：考试时间
	 */

    public void setChengjiTime(Date chengjiTime) {
        this.chengjiTime = chengjiTime;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "Chengji{" +
            "id=" + id +
            ", xueshengId=" + xueshengId +
            ", shiyanshipaikeId=" + shiyanshipaikeId +
            ", chengjiLeixingTypes=" + chengjiLeixingTypes +
            ", chengjiNumber=" + chengjiNumber +
            ", chengjiTime=" + chengjiTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
