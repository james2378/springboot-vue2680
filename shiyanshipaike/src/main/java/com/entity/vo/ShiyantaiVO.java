package com.entity.vo;

import com.entity.ShiyantaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 实验台
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shiyantai")
public class ShiyantaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
