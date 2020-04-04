package com.zhs.sys.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zhs.sys.domain.BookInfo;
import com.zhs.sys.mapper.BookInfoMapper;
import com.zhs.sys.service.BookInfoService;
import com.zhs.sys.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookInfoServiceImpl implements BookInfoService {
    @Autowired
    private BookInfoMapper bookInfoMapper;
    @Override
    public List<BookInfo> queryBookInfoForPage(PageBean pageBean, BookInfo bookInfo) {
        Page<BookInfo> page = PageHelper.startPage(pageBean.getCurrentPage(), pageBean.getPageSize());
        System.out.println("-------------------");
        List<BookInfo> list = this.bookInfoMapper.queryAllBook(bookInfo);
        pageBean.setTotalCount((int)page.getTotal());
        return list;
    }

    @Override
    public void updateBookInfoBorrowState(Integer bookid, Integer state) {
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookid(bookid);
        bookInfo.setIsborrow(state);
        bookInfoMapper.updateByPrimaryKeySelective(bookInfo);
    }
}
