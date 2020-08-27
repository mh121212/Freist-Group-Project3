/**
 * Copyright (C), 2020, 因特驰
 * FileName: NewsService
 * Author:   mh
 * Date:     2020/8/25 11:48
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.service;

import com.ytc.model.News;

import java.util.List;

public interface NewsService {
    List<News> queryNewsList();
}
