/**
 * Copyright (C), 2020, 因特驰
 * FileName: CourseTypeController
 * Author:   mh
 * Date:     2020/8/26 10:53
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.Controller;

import com.ytc.Service.CourseTypeService;
import com.ytc.model.CourseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CourseTypeController {

    @Autowired
    private CourseTypeService courseTypeService;

    @GetMapping("queryCourseTypeList")
    public String queryCourseTypeList(){
        List<CourseType> list = courseTypeService.queryCourseTypeList();
        System.out.println(list);
        return "index";
    }
}
