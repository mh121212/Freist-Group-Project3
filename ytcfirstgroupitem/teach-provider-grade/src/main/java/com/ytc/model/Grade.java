/**
 * Copyright (C), 2020, 因特驰
 * FileName: Grade
 * Author:   mh
 * Date:     2020/8/25 20:33
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.model;

import java.io.Serializable;

public class Grade implements Serializable {

    private int classid;
    private String classname;
    private int studentid;
    private int teacherid;
    private int courseid;

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public Grade() {
    }

    public Grade(int classid, String classname, int studentid, int teacherid, int courseid) {
        this.classid = classid;
        this.classname = classname;
        this.studentid = studentid;
        this.teacherid = teacherid;
        this.courseid = courseid;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "classid=" + classid +
                ", classname='" + classname + '\'' +
                ", studentid=" + studentid +
                ", teacherid=" + teacherid +
                ", courseid=" + courseid +
                '}';
    }
}
