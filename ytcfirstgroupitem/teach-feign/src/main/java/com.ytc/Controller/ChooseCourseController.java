package com.ytc.Controller;

import com.ytc.Service.ChooseCourseService;
import com.ytc.model.ChooseCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ChooseCourseController {

    @Autowired
    private ChooseCourseService chooseCourseService;

    @RequestMapping("addChooseCourse")
    @ResponseBody
    public void addChooseCourse(ChooseCourse chooseCourse ){
        chooseCourseService.addChooseCourse(chooseCourse);
    }
}
