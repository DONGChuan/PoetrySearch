<%--
  Created by IntelliJ IDEA.
  User: chuandong
  Date: 16/1/21
  Time: 下午9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>诗歌查询</title>
    <jsp:include page="jsp/head.jsp"/>
  </head>
  <body>
    <div class="container">
      <h1 class="site-title">唐代诗词搜索</h1>
      <div class="panel-container panel panel-default">
        <div class="panel-body">
          <div class="panel panel-info">
            <div class="panel-heading">
              搜索该作者所有的作品
            </div>
            <div class="panel-body">
              <form action="searchByPoetName" method="get">
                  <div class="input-group">
                    <input id="searchByPoet" type="text" name="poetName" class="form-control" placeholder="请输入作者名称">
                    <span class="input-group-btn">
                      <button class="btn btn-default" type="submit">Search</button>
                    </span>
                  </div>
              </form>
            </div>
          </div>
          <div class="panel panel-success">
            <div class="panel-heading">
              通过题目搜索
            </div>
            <div class="panel-body">
              <form action="searchByTitle" method="get">
                <div class="input-group">
                  <input id="searchByTitle" type="text" name="poetryTitle" class="form-control" placeholder="请输入诗歌名称">
                  <span class="input-group-btn">
                    <button class="btn btn-default" type="submit">Search</button>
                  </span>
                </div>
              </form>
            </div>
          </div>
          <div class="panel panel-warning">
            <div class="panel-heading">
              通过内容或者关键词搜索
            </div>
            <div class="panel-body">
              <form action="searchByContent" method="get">
                <div class="input-group">
                  <input id="searchByContent" type="text" name="poetryContent" class="form-control" placeholder="请输入诗句或关键词">
                  <span class="input-group-btn">
                    <button class="btn btn-default" type="submit">Search</button>
                  </span>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
