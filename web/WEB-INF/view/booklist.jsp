<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 20/4/2
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书列表</title>
</head>
<body>
<h1 align="center">图书列表</h1>
<hr>
<table align="center" width="60%" border="1" cellpadding="5">
        <tr>
            <th>编号</th>
            <th>分类</th>
            <th>名称</th>
            <th>作者</th>
            <th>出版社</th>
            <th>是否借阅</th>
        </tr>
    <c:choose>
        <c:when test="${empty lists}">
            <tr>
                <td align="center" colspan="4">
                    查无数据
                </td>
            </tr>
        </c:when>
        <c:otherwise>
            <c:forEach var="sn" items="${lists}">
                <tr>
                    <td align="center">${sn.bookid}</td>
                    <td align="center">${sn.booktype}</td>
                    <td align="center">${sn.bookname}</td>
                    <td align="center">${sn.bookauthor}</td>
                    <td align="center">${sn.publishpress}</td>
                    <td align="center">
                        <c:choose>
                            <c:when test="${sn.isborrow==1}">
                                已借阅
                            </c:when>
                            <c:otherwise>
                                <a href="javascript:void(0)" onclick="borrowBook(${sn.bookid})">申请借阅</a>
                            </c:otherwise>
                        </c:choose>

                    </td>
                </tr>
            </c:forEach>
        </c:otherwise>
    </c:choose>
        <tr>
            <td align="center" colspan="6">
                <c:choose>
                    <c:when test="${page.currentPage==1}">
                        上一页
                    </c:when>
                    <c:otherwise>
                        <a href="javascript:void(0)" onclick="changePage(${page.currentPage-1})">上一页</a>
                    </c:otherwise>
                </c:choose>

                 &nbsp;&nbsp;&nbsp;
                <c:forEach begin="1" end="${page.totalPage}" var="vn">
                    <c:choose>
                        <c:when test="${vn==page.currentPage}">
                            ${vn}
                        </c:when>
                        <c:otherwise>
                            <a href="javascript:void(0)" onclick="changePage(${vn})">${vn}</a>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>

                &nbsp;&nbsp;&nbsp;
                    <c:choose>
                        <c:when test="${page.currentPage==page.totalPage}">
                           下一页
                        </c:when>
                        <c:otherwise>
                            <a href="javascript:void(0)" onclick="changePage(${page.currentPage+1})">下一页</a>
                        </c:otherwise>
                    </c:choose>
                    &nbsp;&nbsp;&nbsp;
                    共${page.totalPage}页
                    &nbsp;&nbsp;&nbsp;

                    跳到第<select onchange="changeSel(this)">
                <c:forEach begin="1" end="${page.totalPage}" var="vn">
                    <c:choose>
                        <c:when test="${vn==page.currentPage}">
                                <option value="${vn}" selected="selected">${vn}</option>
                        </c:when>
                        <c:otherwise>
                                <option value="${vn}">${vn}</option>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </select>
            </td>
        </tr>

</table>
</body>
<script type="text/javascript">
    function changePage (pageNum) {
        window.location.href="${pageContext.request.contextPath}/bookInfo/queryAllBookInfo.action?currPage="+pageNum;
    }
    function changeSel(obj) {
        var pageNum=obj.value();
        changePage(pageNum);
    }
    function borrowBook(bookid) {
        
    }
</script>
</html>
