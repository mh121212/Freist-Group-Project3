/**
 * Copyright (C), 2020, 因特驰
 * FileName: NewsServiceImpl
 * Author:   mh
 * Date:     2020/8/25 11:48
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.service.Impl;

import com.ytc.mapper.NewsMapper;
import com.ytc.model.News;
import com.ytc.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> queryNewsList() {
        return newsMapper.queryNewsList();
    }
}
