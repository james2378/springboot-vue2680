package com.entity.vo;

import com.entity.ShiyantaishiyongEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 实验台使用记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shiyantaishiyong")
public class ShiyantaishiyongVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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

}
