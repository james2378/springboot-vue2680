package com.entity.vo;

import com.entity.ShiyanshiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 实验室
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shiyanshi")
public class ShiyanshiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 实验室编号
     */

    @TableField(value = "shiyanshi_uuid_number")
    private String shiyanshiUuidNumber;


    /**
     * 所在位置
     */

    @TableField(value = "shiyanshi_weizhi")
    private String shiyanshiWeizhi;


    /**
     * 容纳人数
     */

    @TableField(value = "shiyanshi_renshu")
    private Integer shiyanshiRenshu;


    /**
     * 实验科目
     */

    @TableField(value = "shiyanshikemu_types")
    private Integer shiyanshikemuTypes;


    /**
     * 实验室介绍
     */

    @TableField(value = "shiyanshi_content")
    private String shiyanshiContent;


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
	 * 设置：实验室编号
	 */
    public String getShiyanshiUuidNumber() {
        return shiyanshiUuidNumber;
    }


    /**
	 * 获取：实验室编号
	 */

    public void setShiyanshiUuidNumber(String shiyanshiUuidNumber) {
        this.shiyanshiUuidNumber = shiyanshiUuidNumber;
    }
    /**
	 * 设置：所在位置
	 */
    public String getShiyanshiWeizhi() {
        return shiyanshiWeizhi;
    }


    /**
	 * 获取：所在位置
	 */

    public void setShiyanshiWeizhi(String shiyanshiWeizhi) {
        this.shiyanshiWeizhi = shiyanshiWeizhi;
    }
    /**
	 * 设置：容纳人数
	 */
    public Integer getShiyanshiRenshu() {
        return shiyanshiRenshu;
    }


    /**
	 * 获取：容纳人数
	 */

    public void setShiyanshiRenshu(Integer shiyanshiRenshu) {
        this.shiyanshiRenshu = shiyanshiRenshu;
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
	 * 设置：实验室介绍
	 */
    public String getShiyanshiContent() {
        return shiyanshiContent;
    }


    /**
	 * 获取：实验室介绍
	 */

    public void setShiyanshiContent(String shiyanshiContent) {
        this.shiyanshiContent = shiyanshiContent;
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
