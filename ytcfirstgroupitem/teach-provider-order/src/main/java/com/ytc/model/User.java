package com.ytc.model;

import java.io.Serializable;

public class User implements Serializable {
    private int userid;
    private String nickname;
    private String username;
    private String userphone;
    private String userpwd;

    public User(int userid, String nickname, String username, String userphone, String userpwd) {
        this.userid = userid;
        this.nickname = nickname;
        this.username = username;
        this.userphone = userphone;
        this.userpwd = userpwd;
    }

    public User() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", nickname='" + nickname + '\'' +
                ", username='" + username + '\'' +
                ", userphone='" + userphone + '\'' +
                ", userpwd='" + userpwd + '\'' +
                '}';
    }
}
