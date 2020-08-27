package com.ytc.model;

import java.io.Serializable;

public class Course implements Serializable {
    private int courseid;
    private String coursename;
    private int coursetime;
    private String courseshow;
    private double courseprice;
    private int coursetypeid;
    private int teacherid;
    private int userid;

    @Override
    public String toString() {
        return "Course{" +
                "courseid=" + courseid +
                ", coursename='" + coursename + '\'' +
                ", coursetime=" + coursetime +
                ", courseshow='" + courseshow + '\'' +
                ", courseprice=" + courseprice +
                ", coursetypeid=" + coursetypeid +
                ", teacherid=" + teacherid +
                ", userid=" + userid +
                '}';
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getCoursetime() {
        return coursetime;
    }

    public void setCoursetime(int coursetime) {
        this.coursetime = coursetime;
    }

    public String getCourseshow() {
        return courseshow;
    }

    public void setCourseshow(String courseshow) {
        this.courseshow = courseshow;
    }

    public double getCourseprice() {
        return courseprice;
    }

    public void setCourseprice(double courseprice) {
        this.courseprice = courseprice;
    }

    public int getCoursetypeid() {
        return coursetypeid;
    }

    public void setCoursetypeid(int coursetypeid) {
        this.coursetypeid = coursetypeid;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Course() {
    }

    public Course(int courseid, String coursename, int coursetime, String courseshow, double courseprice, int coursetypeid, int teacherid, int userid) {
        this.courseid = courseid;
        this.coursename = coursename;
        this.coursetime = coursetime;
        this.courseshow = courseshow;
        this.courseprice = courseprice;
        this.coursetypeid = coursetypeid;
        this.teacherid = teacherid;
        this.userid = userid;
    }
}
