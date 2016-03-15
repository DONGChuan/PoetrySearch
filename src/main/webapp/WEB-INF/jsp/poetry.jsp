<%--
  Created by IntelliJ IDEA.
  User: chuandong
  Date: 16/1/23
  Time: 下午1:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>诗歌 - <s:property value="poetryTitle"/></title>
    <jsp:include page="head.jsp"/>
</head>
<body>
    <div class="container">
        <h1 class="site-title text-center">
            <s:if test="poetryTitle != null">
                <s:property value="poetryTitle"/>
            </s:if>
        </h1>
    <div class="panel-container panel-poetry-container panel panel-default">
        <table class="table table-hover">
            <thead>
                <tr>
                    <td>#</td>
                    <td>作者</td>
                    <td>标题</td>
                    <td>内容</td>
                </tr>
            </thead>
            <tbody>
            <s:iterator value="poetryList" status="list">
                <tr>
                    <td><s:property value="#list.index"/></td>
                    <td><s:property value="poet.name"/></td>
                    <td><s:property value="title"/></td>
                    <td><s:property value="content"/></td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
    </div>
    </div>
    <jsp:include page="foot.jsp"/>
</body>
</html>