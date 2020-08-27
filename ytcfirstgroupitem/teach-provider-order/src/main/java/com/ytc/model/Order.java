package com.ytc.model;

import java.io.Serializable;

public class Order implements Serializable {
     private int orderid;//订单ID
     private String orderno;//订单编号
     private int orderstatus;//订单状态
     private String ordertime;//订单生成时间
     private int orderway;//付款方式
     private int courseid;//课程ID
    private int userid;//学生ID
    private User user;
    private Course course;
    private Choosecourse choosecourse;

    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", orderno='" + orderno + '\'' +
                ", orderstatus=" + orderstatus +
                ", ordertime='" + ordertime + '\'' +
                ", orderway=" + orderway +
                ", courseid=" + courseid +
                ", userid=" + userid +
                ", user=" + user +
                ", course=" + course +
                ", choosecourse=" + choosecourse +
                '}';
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public int getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(int orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime;
    }

    public int getOrderway() {
        return orderway;
    }

    public void setOrderway(int orderway) {
        this.orderway = orderway;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Choosecourse getChoosecourse() {
        return choosecourse;
    }

    public void setChoosecourse(Choosecourse choosecourse) {
        this.choosecourse = choosecourse;
    }

    public Order() {
    }

    public Order(int orderid, String orderno, int orderstatus, String ordertime, int orderway, int courseid, int userid, User user, Course course, Choosecourse choosecourse) {
        this.orderid = orderid;
        this.orderno = orderno;
        this.orderstatus = orderstatus;
        this.ordertime = ordertime;
        this.orderway = orderway;
        this.courseid = courseid;
        this.userid = userid;
        this.user = user;
        this.course = course;
        this.choosecourse = choosecourse;
    }
}
