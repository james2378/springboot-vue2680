package com.entity.model;

import com.entity.ShiyanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 实验室
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShiyanshiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 实验室编号
     */
    private String shiyanshiUuidNumber;


    /**
     * 所在位置
     */
    private String shiyanshiWeizhi;


    /**
     * 容纳人数
     */
    private Integer shiyanshiRenshu;


    /**
     * 实验科目
     */
    private Integer shiyanshikemuTypes;


    /**
     * 实验室介绍
     */
    private String shiyanshiContent;


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
	 * 获取：实验室编号
	 */
    public String getShiyanshiUuidNumber() {
        return shiyanshiUuidNumber;
    }


    /**
	 * 设置：实验室编号
	 */
    public void setShiyanshiUuidNumber(String shiyanshiUuidNumber) {
        this.shiyanshiUuidNumber = shiyanshiUuidNumber;
    }
    /**
	 * 获取：所在位置
	 */
    public String getShiyanshiWeizhi() {
        return shiyanshiWeizhi;
    }


    /**
	 * 设置：所在位置
	 */
    public void setShiyanshiWeizhi(String shiyanshiWeizhi) {
        this.shiyanshiWeizhi = shiyanshiWeizhi;
    }
    /**
	 * 获取：容纳人数
	 */
    public Integer getShiyanshiRenshu() {
        return shiyanshiRenshu;
    }


    /**
	 * 设置：容纳人数
	 */
    public void setShiyanshiRenshu(Integer shiyanshiRenshu) {
        this.shiyanshiRenshu = shiyanshiRenshu;
    }
    /**
	 * 获取：实验科目
	 */
    public Integer getShiyanshikemuTypes() {
        return shiyanshikemuTypes;
    }


    /**
	 * 设置：实验科目
	 */
    public void setShiyanshikemuTypes(Integer shiyanshikemuTypes) {
        this.shiyanshikemuTypes = shiyanshikemuTypes;
    }
    /**
	 * 获取：实验室介绍
	 */
    public String getShiyanshiContent() {
        return shiyanshiContent;
    }


    /**
	 * 设置：实验室介绍
	 */
    public void setShiyanshiContent(String shiyanshiContent) {
        this.shiyanshiContent = shiyanshiContent;
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
