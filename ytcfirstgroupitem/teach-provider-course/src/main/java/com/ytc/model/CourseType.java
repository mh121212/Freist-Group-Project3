/**
 * Copyright (C), 2020, 因特驰
 * FileName: CourseType
 * Author:   mh
 * Date:     2020/8/25 11:53
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.model;

import java.io.Serializable;

public class CourseType implements Serializable {

    private int courtypeid;
    private String courtypename;
    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getCourtypeid() {
        return courtypeid;
    }

    public void setCourtypeid(int courtypeid) {
        this.courtypeid = courtypeid;
    }

    public String getCourtypename() {
        return courtypename;
    }

    public void setCourtypename(String courtypename) {
        this.courtypename = courtypename;
    }

    public CourseType() {
    }

    public CourseType(int courtypeid, String courtypename) {
        this.courtypeid = courtypeid;
        this.courtypename = courtypename;
    }

    @Override
    public String toString() {
        return "CourseType{" +
                "courtypeid=" + courtypeid +
                ", courtypename='" + courtypename + '\'' +
                '}';
    }
}
