/**
 * Copyright (C), 2020, 因特驰
 * FileName: GradeController
 * Author:   mh
 * Date:     2020/8/25 20:37
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.controller;

import com.ytc.model.Grade;
import com.ytc.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @GetMapping("queryGradeList")
    public List<Grade> queryGradeList(){
        List<Grade> list = gradeService.queryGradeList();
        System.out.println(list);
        return list;
    }
}
