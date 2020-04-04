package com.zhs.sys.vo;

import com.zhs.sys.domain.BookInfo;

public class BookInfoVo extends BookInfo {
    private Integer currPage;

    public Integer getCurrPage() {
        return currPage;
    }

    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }
}
