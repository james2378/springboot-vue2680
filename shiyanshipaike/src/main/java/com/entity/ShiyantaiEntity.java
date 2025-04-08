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
 * 实验台
 *
 * @author 
 * @email
 */
@TableName("shiyantai")
public class ShiyantaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShiyantaiEntity() {

	}

	public ShiyantaiEntity(T t) {
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
    @TableField(value = "shiyanshi_id")

    private Integer shiyanshiId;


    /**
     * 实验台编号
     */
    @TableField(value = "shiyantai_bianhao")

    private String shiyantaiBianhao;


    /**
     * 实验台名称
     */
    @TableField(value = "shiyantai_name")

    private String shiyantaiName;


    /**
     * 所在位置
     */
    @TableField(value = "shiyantai_weizhi")

    private String shiyantaiWeizhi;


    /**
     * 备注
     */
    @TableField(value = "shiyantai_content")

    private String shiyantaiContent;


    /**
     * 添加时间
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
    public Integer getShiyanshiId() {
        return shiyanshiId;
    }


    /**
	 * 获取：实验台
	 */

    public void setShiyanshiId(Integer shiyanshiId) {
        this.shiyanshiId = shiyanshiId;
    }
    /**
	 * 设置：实验台编号
	 */
    public String getShiyantaiBianhao() {
        return shiyantaiBianhao;
    }


    /**
	 * 获取：实验台编号
	 */

    public void setShiyantaiBianhao(String shiyantaiBianhao) {
        this.shiyantaiBianhao = shiyantaiBianhao;
    }
    /**
	 * 设置：实验台名称
	 */
    public String getShiyantaiName() {
        return shiyantaiName;
    }


    /**
	 * 获取：实验台名称
	 */

    public void setShiyantaiName(String shiyantaiName) {
        this.shiyantaiName = shiyantaiName;
    }
    /**
	 * 设置：所在位置
	 */
    public String getShiyantaiWeizhi() {
        return shiyantaiWeizhi;
    }


    /**
	 * 获取：所在位置
	 */

    public void setShiyantaiWeizhi(String shiyantaiWeizhi) {
        this.shiyantaiWeizhi = shiyantaiWeizhi;
    }
    /**
	 * 设置：备注
	 */
    public String getShiyantaiContent() {
        return shiyantaiContent;
    }


    /**
	 * 获取：备注
	 */

    public void setShiyantaiContent(String shiyantaiContent) {
        this.shiyantaiContent = shiyantaiContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
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
        return "Shiyantai{" +
            "id=" + id +
            ", shiyanshiId=" + shiyanshiId +
            ", shiyantaiBianhao=" + shiyantaiBianhao +
            ", shiyantaiName=" + shiyantaiName +
            ", shiyantaiWeizhi=" + shiyantaiWeizhi +
            ", shiyantaiContent=" + shiyantaiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
