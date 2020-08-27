/**
 * Copyright (C), 2020, 因特驰
 * FileName: CourseTypeServiceImpl
 * Author:   mh
 * Date:     2020/8/26 10:28
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.service.Impl;

import com.ytc.mapper.CourseTypeMapper;
import com.ytc.model.CourseType;
import com.ytc.service.CourseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CourseTypeServiceImpl implements CourseTypeService {

    @Autowired
    private CourseTypeMapper courseTypeMapper;

    @Override
    public List<CourseType> queryCourseTypeList() {
        return courseTypeMapper.queryCourseTypeList();
    }
}
