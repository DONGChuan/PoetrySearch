<%--
  Created by IntelliJ IDEA.
  User: chuandong
  Date: 16/1/23
  Time: 下午9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>错误</title>
    <jsp:include page="head.jsp"/>
    <link href="common/css/error.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="error-template">
                <h1>
                    Oops!</h1>
                <h2>
                    404 Not Found</h2>
                <div class="error-details">
                    对不起, 您查找的诗歌或者作者不存在
                </div>
                <div class="error-actions">
                    <a href="/" class="btn btn-primary btn-lg">
                        <span class="glyphicon glyphicon-home"></span>
                        返回主页 </a>
                    <a href="mailto:dongchuan55@gmail.com" class="btn btn-default btn-lg">
                        <span class="glyphicon glyphicon-envelope"></span>
                        联系作者
                    </a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
