package com.ytc.controller;

import com.ytc.model.CourseType;
import com.ytc.service.CourseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author:chengwenbin
 * @date：2020/8/25
 * @time:17:23
 */
@Controller
public class CourseTypeController {

    @Autowired
    private CourseTypeService courseTypeService;


    @GetMapping("queryCourseTypeList")
    @ResponseBody
    public List<CourseType> queryCourseTypeList(){
        List<CourseType> list = courseTypeService.queryCourseTypeList();
        System.out.println(list);
        return list;
    }}
