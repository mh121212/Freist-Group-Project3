package com.ytc.service.impl;

import com.ytc.mapper.CourseTypeMapper;
import com.ytc.model.CourseType;
import com.ytc.service.CourseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:chengwenbin
 * @date：2020/8/25
 * @time:17:22
 */
@Service
public class CourseTypeServiceimpl implements CourseTypeService {

    @Autowired
    private CourseTypeMapper courseTypeMapper;

    @Override
    public List<CourseType> queryCourseTypeList() {
        return courseTypeMapper.queryCourseTypeList();
    }
}
