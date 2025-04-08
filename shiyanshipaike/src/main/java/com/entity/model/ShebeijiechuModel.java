package com.entity.model;

import com.entity.ShebeijiechuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 设备借出
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShebeijiechuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 设备
     */
    private Integer shebeiId;


    /**
     * 学生
     */
    private Integer xueshengId;


    /**
     * 借出数量
     */
    private Integer shebeijiechuNumber;


    /**
     * 备注
     */
    private String shebeijiechuContent;


    /**
     * 借出时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jiechuTime;


    /**
     * 归还时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date guihuanTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：设备
	 */
    public Integer getShebeiId() {
        return shebeiId;
    }


    /**
	 * 设置：设备
	 */
    public void setShebeiId(Integer shebeiId) {
        this.shebeiId = shebeiId;
    }
    /**
	 * 获取：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 设置：学生
	 */
    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 获取：借出数量
	 */
    public Integer getShebeijiechuNumber() {
        return shebeijiechuNumber;
    }


    /**
	 * 设置：借出数量
	 */
    public void setShebeijiechuNumber(Integer shebeijiechuNumber) {
        this.shebeijiechuNumber = shebeijiechuNumber;
    }
    /**
	 * 获取：备注
	 */
    public String getShebeijiechuContent() {
        return shebeijiechuContent;
    }


    /**
	 * 设置：备注
	 */
    public void setShebeijiechuContent(String shebeijiechuContent) {
        this.shebeijiechuContent = shebeijiechuContent;
    }
    /**
	 * 获取：借出时间
	 */
    public Date getJiechuTime() {
        return jiechuTime;
    }


    /**
	 * 设置：借出时间
	 */
    public void setJiechuTime(Date jiechuTime) {
        this.jiechuTime = jiechuTime;
    }
    /**
	 * 获取：归还时间
	 */
    public Date getGuihuanTime() {
        return guihuanTime;
    }


    /**
	 * 设置：归还时间
	 */
    public void setGuihuanTime(Date guihuanTime) {
        this.guihuanTime = guihuanTime;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
