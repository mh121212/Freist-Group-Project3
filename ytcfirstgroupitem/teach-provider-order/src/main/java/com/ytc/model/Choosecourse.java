package com.ytc.model;

import java.io.Serializable;

public class Choosecourse implements Serializable {
    private int choosecourseid;
    private int userid;
    private int teacherid;
    private int courseid;
    private String orderno;

    @Override
    public String toString() {
        return "Choosecourse{" +
                "choosecourseid=" + choosecourseid +
                ", userid=" + userid +
                ", teacherid=" + teacherid +
                ", courseid=" + courseid +
                ", orderno='" + orderno + '\'' +
                '}';
    }

    public int getChoosecourseid() {
        return choosecourseid;
    }

    public void setChoosecourseid(int choosecourseid) {
        this.choosecourseid = choosecourseid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public Choosecourse() {
    }

    public Choosecourse(int choosecourseid, int userid, int teacherid, int courseid, String orderno) {
        this.choosecourseid = choosecourseid;
        this.userid = userid;
        this.teacherid = teacherid;
        this.courseid = courseid;
        this.orderno = orderno;
    }
}
