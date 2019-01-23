package com.example.demo.model;

import java.io.Serializable;

/**
 * resourceinfo
 * @author 
 */
public class Resourceinfo implements Serializable {
    private Integer resId;

    private Integer resDirId;

    private String resType;

    private String resContent;

    private String knowpointname;

    private Integer knowpointid;

    private static final long serialVersionUID = 1L;

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    public Integer getResDirId() {
        return resDirId;
    }

    public void setResDirId(Integer resDirId) {
        this.resDirId = resDirId;
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
    }

    public String getResContent() {
        return resContent;
    }

    public void setResContent(String resContent) {
        this.resContent = resContent;
    }

    public String getKnowpointname() {
        return knowpointname;
    }

    public void setKnowpointname(String knowpointname) {
        this.knowpointname = knowpointname;
    }

    public Integer getKnowpointid() {
        return knowpointid;
    }

    public void setKnowpointid(Integer knowpointid) {
        this.knowpointid = knowpointid;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Resourceinfo other = (Resourceinfo) that;
        return (this.getResId() == null ? other.getResId() == null : this.getResId().equals(other.getResId()))
            && (this.getResDirId() == null ? other.getResDirId() == null : this.getResDirId().equals(other.getResDirId()))
            && (this.getResType() == null ? other.getResType() == null : this.getResType().equals(other.getResType()))
            && (this.getResContent() == null ? other.getResContent() == null : this.getResContent().equals(other.getResContent()))
            && (this.getKnowpointname() == null ? other.getKnowpointname() == null : this.getKnowpointname().equals(other.getKnowpointname()))
            && (this.getKnowpointid() == null ? other.getKnowpointid() == null : this.getKnowpointid().equals(other.getKnowpointid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getResId() == null) ? 0 : getResId().hashCode());
        result = prime * result + ((getResDirId() == null) ? 0 : getResDirId().hashCode());
        result = prime * result + ((getResType() == null) ? 0 : getResType().hashCode());
        result = prime * result + ((getResContent() == null) ? 0 : getResContent().hashCode());
        result = prime * result + ((getKnowpointname() == null) ? 0 : getKnowpointname().hashCode());
        result = prime * result + ((getKnowpointid() == null) ? 0 : getKnowpointid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resId=").append(resId);
        sb.append(", resDirId=").append(resDirId);
        sb.append(", resType=").append(resType);
        sb.append(", resContent=").append(resContent);
        sb.append(", knowpointname=").append(knowpointname);
        sb.append(", knowpointid=").append(knowpointid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}