package com.ytc.mapper;

import com.ytc.model.ChooseCourse;
import org.springframework.web.bind.annotation.RequestBody;

public interface ChooseCourseMapper {
    void addChooseCourse(@RequestBody ChooseCourse chooseCourse);
}
