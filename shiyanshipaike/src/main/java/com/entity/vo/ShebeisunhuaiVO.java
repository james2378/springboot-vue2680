package com.entity.vo;

import com.entity.ShebeisunhuaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 设备损坏
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shebeisunhuai")
public class ShebeisunhuaiVO implements Serializable {
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
     * 设备损坏数量
     */

    @TableField(value = "shebeisunhuai_number")
    private Integer shebeisunhuaiNumber;


    /**
     * 备注
     */

    @TableField(value = "shebeisunhuai_content")
    private String shebeisunhuaiContent;


    /**
     * 报损时间
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
	 * 设置：设备损坏数量
	 */
    public Integer getShebeisunhuaiNumber() {
        return shebeisunhuaiNumber;
    }


    /**
	 * 获取：设备损坏数量
	 */

    public void setShebeisunhuaiNumber(Integer shebeisunhuaiNumber) {
        this.shebeisunhuaiNumber = shebeisunhuaiNumber;
    }
    /**
	 * 设置：备注
	 */
    public String getShebeisunhuaiContent() {
        return shebeisunhuaiContent;
    }


    /**
	 * 获取：备注
	 */

    public void setShebeisunhuaiContent(String shebeisunhuaiContent) {
        this.shebeisunhuaiContent = shebeisunhuaiContent;
    }
    /**
	 * 设置：报损时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：报损时间
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
