/**
 * Copyright (C), 2020, 因特驰
 * FileName: CourseController
 * Author:   mh
 * Date:     2020/8/25 11:18
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.Controller;

import com.ytc.model.Course;
import com.ytc.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("queryCourseList")
    public List<Course> queryCourseList(){
        List<Course> list = courseService.queryCourseList();
        System.out.println(list);
        return list;
    }
}
