package com.entity.model;

import com.entity.ShebeisunhuaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 设备损坏
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShebeisunhuaiModel implements Serializable {
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
     * 设备损坏数量
     */
    private Integer shebeisunhuaiNumber;


    /**
     * 备注
     */
    private String shebeisunhuaiContent;


    /**
     * 报损时间
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
	 * 获取：设备损坏数量
	 */
    public Integer getShebeisunhuaiNumber() {
        return shebeisunhuaiNumber;
    }


    /**
	 * 设置：设备损坏数量
	 */
    public void setShebeisunhuaiNumber(Integer shebeisunhuaiNumber) {
        this.shebeisunhuaiNumber = shebeisunhuaiNumber;
    }
    /**
	 * 获取：备注
	 */
    public String getShebeisunhuaiContent() {
        return shebeisunhuaiContent;
    }


    /**
	 * 设置：备注
	 */
    public void setShebeisunhuaiContent(String shebeisunhuaiContent) {
        this.shebeisunhuaiContent = shebeisunhuaiContent;
    }
    /**
	 * 获取：报损时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：报损时间
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
