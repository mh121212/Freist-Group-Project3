package com.ytc.model;

import java.io.Serializable;

public class Test implements Serializable {
    private int testid;
    private int testeducation;
    private int testage;
    private int teststatus;
    private String testhobby;
    private String testname;
    private String testphone;

    @Override
    public String toString() {
        return "Test{" +
                "testid=" + testid +
                ", testeducation=" + testeducation +
                ", testage=" + testage +
                ", teststatus=" + teststatus +
                ", testhobby='" + testhobby + '\'' +
                ", testname='" + testname + '\'' +
                ", testphone='" + testphone + '\'' +
                '}';
    }

    public int getTesteducation() {
        return testeducation;
    }

    public void setTesteducation(int testeducation) {
        this.testeducation = testeducation;
    }

    public int getTestid() {
        return testid;
    }

    public void setTestid(int testid) {
        this.testid = testid;
    }

    public int getTestage() {
        return testage;
    }

    public void setTestage(int testage) {
        this.testage = testage;
    }

    public int getTeststatus() {
        return teststatus;
    }

    public void setTeststatus(int teststatus) {
        this.teststatus = teststatus;
    }

    public String getTesthobby() {
        return testhobby;
    }

    public void setTesthobby(String testhobby) {
        this.testhobby = testhobby;
    }

    public String getTestname() {
        return testname;
    }

    public void setTestname(String testname) {
        this.testname = testname;
    }

    public String getTestphone() {
        return testphone;
    }

    public void setTestphone(String testphone) {
        this.testphone = testphone;
    }

    public Test() {

    }
}
