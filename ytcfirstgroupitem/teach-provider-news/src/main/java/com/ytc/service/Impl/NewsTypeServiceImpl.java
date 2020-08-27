/**
 * Copyright (C), 2020, 因特驰
 * FileName: NewsTypeServiceImpl
 * Author:   mh
 * Date:     2020/8/26 11:45
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.service.Impl;

import com.ytc.mapper.NewsTypeMapper;
import com.ytc.model.NewsType;
import com.ytc.service.NewsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsTypeServiceImpl implements NewsTypeService {

    @Autowired
    private NewsTypeMapper newsTypeMapper;

    @Override
    public List<NewsType> queryNewsTypeList() {
        return newsTypeMapper.queryNewsTypeList();
    }
}
