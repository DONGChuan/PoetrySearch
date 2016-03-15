<%--
  Created by IntelliJ IDEA.
  User: chuandong
  Date: 16/1/23
  Time: 下午1:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<html>
<head>
    <title>诗歌列表</title>
    <jsp:include page="head.jsp"/>
</head>
<body>
    <div class="container">
        <h1 class="site-title">
            <s:if test="poetName != null">
                <s:property value="poetName"/>的诗歌
            </s:if>
            <s:if test="poetryContent != null">
                搜索 <s:property value="poetryContent"/> 关键字
            </s:if>
        </h1>
        <div class="panel-container panel panel-default">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <td>#</td>
                        <td>标题</td>
                    </tr>
                </thead>
                <tbody>
                    <s:iterator value="poetryList" status="list">
                    <tr>
                        <td><s:property value="#list.index"/></td>
                        <td>
                            <a href="<s:url action="searchByTitleAndPoetName"><s:param name="poetryTitle" value="title"/><s:param name="poetName" value="poet.name"/></s:url>">
                                <s:property value="title"/>
                            </a>
                        </td>
                    </tr>
                    </s:iterator>
                </tbody>
            </table>
        </div>
    </div>
    <jsp:include page="foot.jsp"/>
</body>
</html>
