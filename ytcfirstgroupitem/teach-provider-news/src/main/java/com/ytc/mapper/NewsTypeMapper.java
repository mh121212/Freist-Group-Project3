/**
 * Copyright (C), 2020, 因特驰
 * FileName: NewsTypeMapper
 * Author:   mh
 * Date:     2020/8/26 11:45
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.mapper;

import com.ytc.model.NewsType;

import java.util.List;

public interface NewsTypeMapper {

    List<NewsType> queryNewsTypeList();
}
