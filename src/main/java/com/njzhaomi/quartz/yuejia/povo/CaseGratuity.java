package com.njzhaomi.quartz.yuejia.povo;

import java.util.Date;

public class CaseGratuity {
    private Long id;

    private Integer authorMoney;

    private String authorOpenid;

    private Integer caseId;

    private Date createTime;

    private Integer money;

    private String orderNo;

    private String payerOpenid;

    private Integer shareMoney;

    private String shareOpenid;

    private Integer status;

    private Integer type;

    private Date updateTime;

    private Integer fromType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAuthorMoney() {
        return authorMoney;
    }

    public void setAuthorMoney(Integer authorMoney) {
        this.authorMoney = authorMoney;
    }

    public String getAuthorOpenid() {
        return authorOpenid;
    }

    public void setAuthorOpenid(String authorOpenid) {
        this.authorOpenid = authorOpenid == null ? null : authorOpenid.trim();
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getPayerOpenid() {
        return payerOpenid;
    }

    public void setPayerOpenid(String payerOpenid) {
        this.payerOpenid = payerOpenid == null ? null : payerOpenid.trim();
    }

    public Integer getShareMoney() {
        return shareMoney;
    }

    public void setShareMoney(Integer shareMoney) {
        this.shareMoney = shareMoney;
    }

    public String getShareOpenid() {
        return shareOpenid;
    }

    public void setShareOpenid(String shareOpenid) {
        this.shareOpenid = shareOpenid == null ? null : shareOpenid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getFromType() {
        return fromType;
    }

    public void setFromType(Integer fromType) {
        this.fromType = fromType;
    }
}