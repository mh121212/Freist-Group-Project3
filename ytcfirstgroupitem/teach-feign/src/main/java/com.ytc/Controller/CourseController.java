/**
 * Copyright (C), 2020, 因特驰
 * FileName: CourseController
 * Author:   mh
 * Date:     2020/8/25 15:11
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.Controller;

import com.ytc.Service.CourseService;
import com.ytc.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("queryCourseList")
    public String queryCourseList(){
        List<Course> list = courseService.queryCourseList();
        System.out.println(list);
        return "index";
    }
}
