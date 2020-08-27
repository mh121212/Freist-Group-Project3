package com.ytc.service.impl;

import com.ytc.mapper.ChooseCourseMapper;
import com.ytc.model.ChooseCourse;
import com.ytc.service.ChooseCourseService;
import com.ytc.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChooseCourseServiceImpl implements ChooseCourseService {
   @Autowired
   private ChooseCourseMapper chooseCourseMapper;

    @Override
    public void addChooseCourse(@RequestBody ChooseCourse chooseCourse ) {
        IdWorker worker = new IdWorker(1,1,1);
        long i = worker.nextId();
        String orderno = Long.toString(i);
        chooseCourse.setOrderno(orderno);
        chooseCourseMapper.addChooseCourse(chooseCourse);
    }
}
