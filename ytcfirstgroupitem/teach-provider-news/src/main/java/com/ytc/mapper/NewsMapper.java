/**
 * Copyright (C), 2020, 因特驰
 * FileName: NewsMapper
 * Author:   mh
 * Date:     2020/8/25 18:52
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.mapper;

import com.ytc.model.News;
import java.util.List;

public interface NewsMapper {

    List<News> queryNewsList();
}
