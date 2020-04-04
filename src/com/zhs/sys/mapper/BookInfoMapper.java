package com.zhs.sys.mapper;

import com.zhs.sys.domain.BookInfo;

import java.util.List;

public interface BookInfoMapper {
    int deleteByPrimaryKey(Integer bookid);

    int insert(BookInfo record);

    int insertSelective(BookInfo record);

    BookInfo selectByPrimaryKey(Integer bookid);

    int updateByPrimaryKeySelective(BookInfo record);

    int updateByPrimaryKey(BookInfo record);
    //模糊查询
    List<BookInfo> queryAllBook(BookInfo bookInfo);
}