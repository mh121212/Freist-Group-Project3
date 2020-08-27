/**
 * Copyright (C), 2020, 因特驰
 * FileName: CourseTypeController
 * Author:   mh
 * Date:     2020/8/26 10:52
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.Controller;

import com.ytc.model.CourseType;
import com.ytc.service.CourseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseTypeController {

    @Autowired
    private CourseTypeService courseTypeService;

    @GetMapping("queryCourseTypeList")
    public List<CourseType> queryCourseTypeList(){
        List<CourseType> list = courseTypeService.queryCourseTypeList();
        System.out.println(list);
        return list;
    }
}
