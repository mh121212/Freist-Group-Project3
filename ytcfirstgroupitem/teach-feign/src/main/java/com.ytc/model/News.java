/**
 * Copyright (C), 2020, 因特驰
 * FileName: News
 * Author:   mh
 * Date:     2020/8/25 11:48
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.model;

import java.io.Serializable;

public class News implements Serializable {

    private int newsid;
    private String newstitle;
    private String newscontent;
    private String newsphotourl;
    private int newstypeid;
    private NewsType newsType;

    public int getNewsid() {
        return newsid;
    }

    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle;
    }

    public String getNewscontent() {
        return newscontent;
    }

    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent;
    }

    public String getNewsphotourl() {
        return newsphotourl;
    }

    public void setNewsphotourl(String newsphotourl) {
        this.newsphotourl = newsphotourl;
    }

    public int getNewstypeid() {
        return newstypeid;
    }

    public void setNewstypeid(int newstypeid) {
        this.newstypeid = newstypeid;
    }

    public NewsType getNewsType() {
        return newsType;
    }

    public void setNewsType(NewsType newsType) {
        this.newsType = newsType;
    }

    public News() {
    }

    public News(int newsid, String newstitle, String newscontent, String newsphotourl, int newstypeid) {
        this.newsid = newsid;
        this.newstitle = newstitle;
        this.newscontent = newscontent;
        this.newsphotourl = newsphotourl;
        this.newstypeid = newstypeid;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsid=" + newsid +
                ", newstitle='" + newstitle + '\'' +
                ", newscontent='" + newscontent + '\'' +
                ", newsphotourl='" + newsphotourl + '\'' +
                ", newstypeid=" + newstypeid +
                '}';
    }
}
