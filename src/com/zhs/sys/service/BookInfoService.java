package com.zhs.sys.service;

import com.zhs.sys.domain.BookInfo;
import com.zhs.sys.utils.PageBean;

import java.util.List;

public interface BookInfoService {
    List<BookInfo> queryBookInfoForPage(PageBean pageBean,BookInfo bookInfo);
}
