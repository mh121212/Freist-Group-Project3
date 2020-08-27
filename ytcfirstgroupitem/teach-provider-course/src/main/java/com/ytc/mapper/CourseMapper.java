/**
 * Copyright (C), 2020, 因特驰
 * FileName: CourseMapper
 * Author:   mh
 * Date:     2020/8/25 12:25
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.mapper;

import com.ytc.model.Course;
import java.util.List;

public interface CourseMapper {
    
    List<Course> queryCourseList();
}
