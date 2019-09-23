package com.kindergarten.dance.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


@MappedSuperclass
public class BaseEntity implements Serializable {
    @Column(updatable = false)
    private Long created = System.currentTimeMillis();
    private Long updated = System.currentTimeMillis();
    @Column(name = "deleted", columnDefinition = "boolean default 0")
    private Boolean deleted = false;

    public Boolean isDeleted() {
        if(deleted==null)deleted = false;
        return deleted;
    }

    public Boolean getDeleted() {
        if(deleted==null)deleted = false;
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
    /**
     * @return the created
     */
    public Long getCreated() {
        return created;
    }

    /**
     * @param created the created to set
     */
    public void setCreated(Long created) {
        this.created = created;
    }

    /**
     * @return the updated
     */
    public Long getUpdated() {
        return updated;
    }

    /**
     * @param updated the updated to set
     */
    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public Date getUpdatedAsDate() {
        return new Date(getUpdated().longValue());
    }

    public Date getCreatedAsDate() {
        return new Date(getCreated().longValue());
    }

    public String createdTime(){
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        return  formatter.format(created);
    }

    public String createdDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return  formatter.format(created);
    }

    @Override
    public String toString() {
        return "BaseEntity[created = " +  getCreated()!=null ? getCreated().toString() : "null" + "; updated = " +getUpdated()!=null ?  getUpdated().toString() : "null" + "]";
    }

}
