package com.entity.model;

import com.entity.FangwuYuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 公寓入住申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FangwuYuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 报名编号
     */
    private String fangwuYuyueUuidNumber;


    /**
     * 公寓
     */
    private Integer fangwuId;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 申请理由
     */
    private String fangwuYuyueText;


    /**
     * 申请入住时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 申请状态
     */
    private Integer fangwuYuyueYesnoTypes;


    /**
     * 审核回复
     */
    private String fangwuYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date fangwuYuyueShenheTime;


    /**
     * 创建时间 show3 listShow
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
	 * 获取：报名编号
	 */
    public String getFangwuYuyueUuidNumber() {
        return fangwuYuyueUuidNumber;
    }


    /**
	 * 设置：报名编号
	 */
    public void setFangwuYuyueUuidNumber(String fangwuYuyueUuidNumber) {
        this.fangwuYuyueUuidNumber = fangwuYuyueUuidNumber;
    }
    /**
	 * 获取：公寓
	 */
    public Integer getFangwuId() {
        return fangwuId;
    }


    /**
	 * 设置：公寓
	 */
    public void setFangwuId(Integer fangwuId) {
        this.fangwuId = fangwuId;
    }
    /**
	 * 获取：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：申请理由
	 */
    public String getFangwuYuyueText() {
        return fangwuYuyueText;
    }


    /**
	 * 设置：申请理由
	 */
    public void setFangwuYuyueText(String fangwuYuyueText) {
        this.fangwuYuyueText = fangwuYuyueText;
    }
    /**
	 * 获取：申请入住时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：申请入住时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getFangwuYuyueYesnoTypes() {
        return fangwuYuyueYesnoTypes;
    }


    /**
	 * 设置：申请状态
	 */
    public void setFangwuYuyueYesnoTypes(Integer fangwuYuyueYesnoTypes) {
        this.fangwuYuyueYesnoTypes = fangwuYuyueYesnoTypes;
    }
    /**
	 * 获取：审核回复
	 */
    public String getFangwuYuyueYesnoText() {
        return fangwuYuyueYesnoText;
    }


    /**
	 * 设置：审核回复
	 */
    public void setFangwuYuyueYesnoText(String fangwuYuyueYesnoText) {
        this.fangwuYuyueYesnoText = fangwuYuyueYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getFangwuYuyueShenheTime() {
        return fangwuYuyueShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setFangwuYuyueShenheTime(Date fangwuYuyueShenheTime) {
        this.fangwuYuyueShenheTime = fangwuYuyueShenheTime;
    }
    /**
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }