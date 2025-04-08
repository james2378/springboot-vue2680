package com.entity.vo;

import com.entity.XueshengchuqinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 学生出勤
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xueshengchuqin")
public class XueshengchuqinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学生
     */

    @TableField(value = "xuesheng_id")
    private Integer xueshengId;


    /**
     * 实验科目
     */

    @TableField(value = "shiyanshikemu_types")
    private Integer shiyanshikemuTypes;


    /**
     * 出勤时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 备注
     */

    @TableField(value = "xueshengchuqin_content")
    private String xueshengchuqinContent;


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
	 * 设置：出勤时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：出勤时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：备注
	 */
    public String getXueshengchuqinContent() {
        return xueshengchuqinContent;
    }


    /**
	 * 获取：备注
	 */

    public void setXueshengchuqinContent(String xueshengchuqinContent) {
        this.xueshengchuqinContent = xueshengchuqinContent;
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
