package com.ytc.service;

import com.ytc.model.ChooseCourse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

public interface ChooseCourseService {

    /**
     * 添加选课信息
     * @param chooseCourse 选课信息实体类
     */
    void addChooseCourse(@RequestBody ChooseCourse chooseCourse);
}
