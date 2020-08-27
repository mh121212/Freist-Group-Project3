/**
 * Copyright (C), 2020, 因特驰
 * FileName: NewsTypeController
 * Author:   mh
 * Date:     2020/8/26 11:44
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.Controller;

import com.ytc.model.NewsType;
import com.ytc.service.NewsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsTypeController {

    @Autowired
    private NewsTypeService newsTypeService;

    @GetMapping("queryNewsTypeList")
    public List<NewsType> queryNewsTypeList(){
        List<NewsType> list = newsTypeService.queryNewsTypeList();
        System.out.println(list);
        return list;
    }
}
