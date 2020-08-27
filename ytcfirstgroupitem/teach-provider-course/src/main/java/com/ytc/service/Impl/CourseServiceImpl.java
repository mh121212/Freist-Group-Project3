/**
 * Copyright (C), 2020, 因特驰
 * FileName: CourseServiceImpl
 * Author:   mh
 * Date:     2020/8/25 11:21
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.service.Impl;

import com.ytc.mapper.CourseMapper;
import com.ytc.model.Course;
import com.ytc.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> queryCourseList() {
        return courseMapper.queryCourseList();
    }
}
