/**
 * Copyright (C), 2020, 因特驰
 * FileName: NewsTypeController
 * Author:   mh
 * Date:     2020/8/26 12:06
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.Controller;

import com.ytc.Service.NewsTypeService;
import com.ytc.model.NewsType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class NewsTypeController {

    @Autowired
    private NewsTypeService newsTypeService;

    @GetMapping("queryNewsTypeList")
    public String queryNewsTypeList(){
        List<NewsType> list = newsTypeService.queryNewsTypeList();
        System.out.println(list);
        return "index";
    }
}
