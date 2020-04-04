package com.zhs.sys.controller;

import com.zhs.sys.domain.BookInfo;
import com.zhs.sys.service.BookInfoService;
import com.zhs.sys.utils.PageBean;
import com.zhs.sys.vo.BookInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("bookInfo")
public class BookInfoController {
    @Autowired
    private BookInfoService bookInfoService;

    @RequestMapping("queryAllBookInfo")
    public String queryAllBookInfo(BookInfoVo bookInfoVo, Model model){
        PageBean pageBean = new PageBean();
        if (null==bookInfoVo.getCurrPage()) {
            pageBean.setCurrentPage(1);
        }else {
            pageBean.setCurrentPage(bookInfoVo.getCurrPage());
        }
        List<BookInfo> lists = bookInfoService.queryBookInfoForPage(pageBean, bookInfoVo);
        model.addAttribute("lists",lists);
        model.addAttribute("page",pageBean);
        return "booklist";
    }

}
