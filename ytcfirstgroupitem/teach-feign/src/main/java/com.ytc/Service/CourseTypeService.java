/**
 * Copyright (C), 2020, 因特驰
 * FileName: CourseTypeService
 * Author:   mh
 * Date:     2020/8/26 10:37
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.Service;

import com.ytc.model.CourseType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
@FeignClient(value = "teach-provider-course")
public interface CourseTypeService {

    @GetMapping("queryCourseTypeList")
    List<CourseType> queryCourseTypeList();
}
