package com.entity.model;

import com.entity.ChengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 成绩
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChengjiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer xueshengId;


    /**
     * 实验室排课
     */
    private Integer shiyanshipaikeId;


    /**
     * 类型
     */
    private Integer chengjiLeixingTypes;


    /**
     * 分数
     */
    private Integer chengjiNumber;


    /**
     * 考试时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date chengjiTime;


    /**
     * 录入时间
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
	 * 获取：实验室排课
	 */
    public Integer getShiyanshipaikeId() {
        return shiyanshipaikeId;
    }


    /**
	 * 设置：实验室排课
	 */
    public void setShiyanshipaikeId(Integer shiyanshipaikeId) {
        this.shiyanshipaikeId = shiyanshipaikeId;
    }
    /**
	 * 获取：类型
	 */
    public Integer getChengjiLeixingTypes() {
        return chengjiLeixingTypes;
    }


    /**
	 * 设置：类型
	 */
    public void setChengjiLeixingTypes(Integer chengjiLeixingTypes) {
        this.chengjiLeixingTypes = chengjiLeixingTypes;
    }
    /**
	 * 获取：分数
	 */
    public Integer getChengjiNumber() {
        return chengjiNumber;
    }


    /**
	 * 设置：分数
	 */
    public void setChengjiNumber(Integer chengjiNumber) {
        this.chengjiNumber = chengjiNumber;
    }
    /**
	 * 获取：考试时间
	 */
    public Date getChengjiTime() {
        return chengjiTime;
    }


    /**
	 * 设置：考试时间
	 */
    public void setChengjiTime(Date chengjiTime) {
        this.chengjiTime = chengjiTime;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
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
