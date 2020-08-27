/**
 * Copyright (C), 2020, 因特驰
 * FileName: GradeController
 * Author:   mh
 * Date:     2020/8/26 9:27
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.Controller;

import com.ytc.Service.GradeService;
import com.ytc.model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @GetMapping("queryGradeList")
    public String queryGradeList(){
        List<Grade> list = gradeService.queryGradeList();
        System.out.println(list);
        return "index";
    }
}
