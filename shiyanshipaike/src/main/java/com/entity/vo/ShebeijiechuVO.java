package com.entity.vo;

import com.entity.ShebeijiechuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 设备借出
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shebeijiechu")
public class ShebeijiechuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 设备
     */

    @TableField(value = "shebei_id")
    private Integer shebeiId;


    /**
     * 学生
     */

    @TableField(value = "xuesheng_id")
    private Integer xueshengId;


    /**
     * 借出数量
     */

    @TableField(value = "shebeijiechu_number")
    private Integer shebeijiechuNumber;


    /**
     * 备注
     */

    @TableField(value = "shebeijiechu_content")
    private String shebeijiechuContent;


    /**
     * 借出时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jiechu_time")
    private Date jiechuTime;


    /**
     * 归还时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "guihuan_time")
    private Date guihuanTime;


    /**
     * 添加时间
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
	 * 设置：借出数量
	 */
    public Integer getShebeijiechuNumber() {
        return shebeijiechuNumber;
    }


    /**
	 * 获取：借出数量
	 */

    public void setShebeijiechuNumber(Integer shebeijiechuNumber) {
        this.shebeijiechuNumber = shebeijiechuNumber;
    }
    /**
	 * 设置：备注
	 */
    public String getShebeijiechuContent() {
        return shebeijiechuContent;
    }


    /**
	 * 获取：备注
	 */

    public void setShebeijiechuContent(String shebeijiechuContent) {
        this.shebeijiechuContent = shebeijiechuContent;
    }
    /**
	 * 设置：借出时间
	 */
    public Date getJiechuTime() {
        return jiechuTime;
    }


    /**
	 * 获取：借出时间
	 */

    public void setJiechuTime(Date jiechuTime) {
        this.jiechuTime = jiechuTime;
    }
    /**
	 * 设置：归还时间
	 */
    public Date getGuihuanTime() {
        return guihuanTime;
    }


    /**
	 * 获取：归还时间
	 */

    public void setGuihuanTime(Date guihuanTime) {
        this.guihuanTime = guihuanTime;
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

}
