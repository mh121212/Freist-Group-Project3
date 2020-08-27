/**
 * Copyright (C), 2020, 因特驰
 * FileName: NewsController
 * Author:   mh
 * Date:     2020/8/26 9:32
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.Controller;

import com.ytc.Service.NewsService;
import com.ytc.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("queryNewsList")
    public String queryNewsList(){
        List<News> list = newsService.queryNewsList();
        System.out.println(list);
        return "index";
    }
}
