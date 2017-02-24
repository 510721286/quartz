package com.njzhaomi.quartz.yuejia.povo;

import java.util.Date;

public class ExtendCaseAcct {
    private Long id;

    private Integer caseid;

    private String uid;

    private Integer point;

    private Integer readcnt;

    private Integer sharecnt;

    private Integer joincnt;

    private String upid;

    private Date createDate;

    private String entity;

    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCaseid() {
        return caseid;
    }

    public void setCaseid(Integer caseid) {
        this.caseid = caseid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getReadcnt() {
        return readcnt;
    }

    public void setReadcnt(Integer readcnt) {
        this.readcnt = readcnt;
    }

    public Integer getSharecnt() {
        return sharecnt;
    }

    public void setSharecnt(Integer sharecnt) {
        this.sharecnt = sharecnt;
    }

    public Integer getJoincnt() {
        return joincnt;
    }

    public void setJoincnt(Integer joincnt) {
        this.joincnt = joincnt;
    }

    public String getUpid() {
        return upid;
    }

    public void setUpid(String upid) {
        this.upid = upid == null ? null : upid.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity == null ? null : entity.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}