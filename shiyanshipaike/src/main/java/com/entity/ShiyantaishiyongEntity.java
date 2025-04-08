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
 * 实验台使用记录
 *
 * @author 
 * @email
 */
@TableName("shiyantaishiyong")
public class ShiyantaishiyongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShiyantaishiyongEntity() {

	}

	public ShiyantaishiyongEntity(T t) {
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
     * 实验台
     */
    @TableField(value = "shiyantai_id")

    private Integer shiyantaiId;


    /**
     * 学生
     */
    @TableField(value = "xuesheng_id")

    private Integer xueshengId;


    /**
     * 备注
     */
    @TableField(value = "shiyantaishiyong_content")

    private String shiyantaishiyongContent;


    /**
     * 使用时间
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
	 * 设置：实验台
	 */
    public Integer getShiyantaiId() {
        return shiyantaiId;
    }


    /**
	 * 获取：实验台
	 */

    public void setShiyantaiId(Integer shiyantaiId) {
        this.shiyantaiId = shiyantaiId;
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
	 * 设置：备注
	 */
    public String getShiyantaishiyongContent() {
        return shiyantaishiyongContent;
    }


    /**
	 * 获取：备注
	 */

    public void setShiyantaishiyongContent(String shiyantaishiyongContent) {
        this.shiyantaishiyongContent = shiyantaishiyongContent;
    }
    /**
	 * 设置：使用时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：使用时间
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
        return "Shiyantaishiyong{" +
            "id=" + id +
            ", shiyantaiId=" + shiyantaiId +
            ", xueshengId=" + xueshengId +
            ", shiyantaishiyongContent=" + shiyantaishiyongContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
