package com.njzhaomi.quartz.yuejia.povo;

import java.util.Date;

public class OriginalLike {
    private Long id;

    private Date cancletime;

    private Long caseid;

    private String entity;

    private Date liketime;

    private Integer status;

    private String uid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCancletime() {
        return cancletime;
    }

    public void setCancletime(Date cancletime) {
        this.cancletime = cancletime;
    }

    public Long getCaseid() {
        return caseid;
    }

    public void setCaseid(Long caseid) {
        this.caseid = caseid;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity == null ? null : entity.trim();
    }

    public Date getLiketime() {
        return liketime;
    }

    public void setLiketime(Date liketime) {
        this.liketime = liketime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }
}