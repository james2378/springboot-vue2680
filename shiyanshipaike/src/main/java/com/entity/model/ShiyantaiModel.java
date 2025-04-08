package com.entity.model;

import com.entity.ShiyantaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 实验台
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShiyantaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 实验台
     */
    private Integer shiyanshiId;


    /**
     * 实验台编号
     */
    private String shiyantaiBianhao;


    /**
     * 实验台名称
     */
    private String shiyantaiName;


    /**
     * 所在位置
     */
    private String shiyantaiWeizhi;


    /**
     * 备注
     */
    private String shiyantaiContent;


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
	 * 获取：实验台
	 */
    public Integer getShiyanshiId() {
        return shiyanshiId;
    }


    /**
	 * 设置：实验台
	 */
    public void setShiyanshiId(Integer shiyanshiId) {
        this.shiyanshiId = shiyanshiId;
    }
    /**
	 * 获取：实验台编号
	 */
    public String getShiyantaiBianhao() {
        return shiyantaiBianhao;
    }


    /**
	 * 设置：实验台编号
	 */
    public void setShiyantaiBianhao(String shiyantaiBianhao) {
        this.shiyantaiBianhao = shiyantaiBianhao;
    }
    /**
	 * 获取：实验台名称
	 */
    public String getShiyantaiName() {
        return shiyantaiName;
    }


    /**
	 * 设置：实验台名称
	 */
    public void setShiyantaiName(String shiyantaiName) {
        this.shiyantaiName = shiyantaiName;
    }
    /**
	 * 获取：所在位置
	 */
    public String getShiyantaiWeizhi() {
        return shiyantaiWeizhi;
    }


    /**
	 * 设置：所在位置
	 */
    public void setShiyantaiWeizhi(String shiyantaiWeizhi) {
        this.shiyantaiWeizhi = shiyantaiWeizhi;
    }
    /**
	 * 获取：备注
	 */
    public String getShiyantaiContent() {
        return shiyantaiContent;
    }


    /**
	 * 设置：备注
	 */
    public void setShiyantaiContent(String shiyantaiContent) {
        this.shiyantaiContent = shiyantaiContent;
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
