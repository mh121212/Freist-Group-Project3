/**
 * Copyright (C), 2020, 因特驰
 * FileName: NewsType
 * Author:   mh
 * Date:     2020/8/26 11:40
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.model;

import java.io.Serializable;

public class NewsType implements Serializable {

    private int newstypeid;
    private String newstypename;
    private News news;

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public int getNewstypeid() {
        return newstypeid;
    }

    public void setNewstypeid(int newstypeid) {
        this.newstypeid = newstypeid;
    }

    public String getNewstypename() {
        return newstypename;
    }

    public void setNewstypename(String newstypename) {
        this.newstypename = newstypename;
    }

    public NewsType() {
    }

    public NewsType(int newstypeid, String newstypename) {
        this.newstypeid = newstypeid;
        this.newstypename = newstypename;
    }

    @Override
    public String toString() {
        return "NewsType{" +
                "newstypeid=" + newstypeid +
                ", newstypename='" + newstypename + '\'' +
                '}';
    }
}
