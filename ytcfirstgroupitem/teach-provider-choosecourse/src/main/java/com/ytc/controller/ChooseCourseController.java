package com.ytc.controller;

import com.ytc.model.ChooseCourse;
import com.ytc.service.ChooseCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ChooseCourseController {

    @Autowired
    private ChooseCourseService chooseCourseService;

    @RequestMapping("addChooseCourse")
    public void addChooseCourse(@RequestBody ChooseCourse chooseCourse){
         chooseCourseService.addChooseCourse(chooseCourse);
    }
}
