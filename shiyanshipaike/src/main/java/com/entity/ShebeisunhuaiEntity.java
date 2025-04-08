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
 * 设备损坏
 *
 * @author 
 * @email
 */
@TableName("shebeisunhuai")
public class ShebeisunhuaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShebeisunhuaiEntity() {

	}

	public ShebeisunhuaiEntity(T t) {
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
     * 设备
     */
    @TableField(value = "shebei_id")

    private Integer shebeiId;


    /**
     * 设备损坏数量
     */
    @TableField(value = "shebeisunhuai_number")

    private Integer shebeisunhuaiNumber;


    /**
     * 备注
     */
    @TableField(value = "shebeisunhuai_content")

    private String shebeisunhuaiContent;


    /**
     * 报损时间
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
	 * 设置：设备
	 */
    public Integer getShebeiId() {
        return shebeiId;
    }


    /**
	 * 获取：设备
	 */

    public void setShebeiId(Integer shebeiId) {
        this.shebeiId = shebeiId;
    }
    /**
	 * 设置：设备损坏数量
	 */
    public Integer getShebeisunhuaiNumber() {
        return shebeisunhuaiNumber;
    }


    /**
	 * 获取：设备损坏数量
	 */

    public void setShebeisunhuaiNumber(Integer shebeisunhuaiNumber) {
        this.shebeisunhuaiNumber = shebeisunhuaiNumber;
    }
    /**
	 * 设置：备注
	 */
    public String getShebeisunhuaiContent() {
        return shebeisunhuaiContent;
    }


    /**
	 * 获取：备注
	 */

    public void setShebeisunhuaiContent(String shebeisunhuaiContent) {
        this.shebeisunhuaiContent = shebeisunhuaiContent;
    }
    /**
	 * 设置：报损时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：报损时间
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
        return "Shebeisunhuai{" +
            "id=" + id +
            ", shebeiId=" + shebeiId +
            ", shebeisunhuaiNumber=" + shebeisunhuaiNumber +
            ", shebeisunhuaiContent=" + shebeisunhuaiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
