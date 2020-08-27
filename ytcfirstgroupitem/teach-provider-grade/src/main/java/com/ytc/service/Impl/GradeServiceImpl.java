/**
 * Copyright (C), 2020, 因特驰
 * FileName: GradeServiceImpl
 * Author:   mh
 * Date:     2020/8/25 20:32
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.service.Impl;

import com.ytc.mapper.GradeMapper;
import com.ytc.model.Grade;
import com.ytc.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeMapper gradeMapper;

    @Override
    public List<Grade> queryGradeList() {
        return gradeMapper.queryGradeList();
    }
}
