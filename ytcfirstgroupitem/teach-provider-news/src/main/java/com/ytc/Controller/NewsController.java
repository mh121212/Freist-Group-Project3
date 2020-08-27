/**
 * Copyright (C), 2020, 因特驰
 * FileName: NewsController
 * Author:   mh
 * Date:     2020/8/25 11:52
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.Controller;

import com.ytc.model.News;
import com.ytc.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("queryNewsList")
    public List<News> queryNewsList(){
        List<News> list = newsService.queryNewsList();
        System.out.println(list);
        return list;
    }
}
