package com.ytc.Service;


import com.ytc.model.ChooseCourse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Component
@FeignClient(value = "teach-provider-choosecourse")
public interface ChooseCourseService {

    @RequestMapping("addChooseCourse")
    void addChooseCourse(@RequestBody ChooseCourse chooseCourse);
}
