package com.zhs.sys.domain;

import java.io.Serializable;
import java.util.Date;

public class BookInfo implements Serializable {
    private Integer bookid;

    private String bookname;

    private Integer booktype;

    private String bookauthor;

    private String publishpress;

    private Date publishdate;

    private Integer isborrow;

    private String createdby;

    private Date creationtime;

    private Date lastupdatetime;

    private static final long serialVersionUID = 1L;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public Integer getBooktype() {
        return booktype;
    }

    public void setBooktype(Integer booktype) {
        this.booktype = booktype;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor == null ? null : bookauthor.trim();
    }

    public String getPublishpress() {
        return publishpress;
    }

    public void setPublishpress(String publishpress) {
        this.publishpress = publishpress == null ? null : publishpress.trim();
    }

    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    public Integer getIsborrow() {
        return isborrow;
    }

    public void setIsborrow(Integer isborrow) {
        this.isborrow = isborrow;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bookid=").append(bookid);
        sb.append(", bookname=").append(bookname);
        sb.append(", booktype=").append(booktype);
        sb.append(", bookauthor=").append(bookauthor);
        sb.append(", publishpress=").append(publishpress);
        sb.append(", publishdate=").append(publishdate);
        sb.append(", isborrow=").append(isborrow);
        sb.append(", createdby=").append(createdby);
        sb.append(", creationtime=").append(creationtime);
        sb.append(", lastupdatetime=").append(lastupdatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}