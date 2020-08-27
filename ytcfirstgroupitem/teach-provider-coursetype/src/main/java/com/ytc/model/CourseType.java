package com.ytc.model;

import java.io.Serializable;

public class CourseType implements Serializable {
    private Integer courtypeid;

    private String courtypename;

    public CourseType() {
    }

    public Integer getCourtypeid() {
        return courtypeid;
    }

    public void setCourtypeid(Integer courtypeid) {
        this.courtypeid = courtypeid;
    }

    public String getCourtypename() {
        return courtypename;
    }

    public void setCourtypename(String courtypename) {
        this.courtypename = courtypename == null ? null : courtypename.trim();
    }
}