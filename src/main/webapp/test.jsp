<%--
  Created by IntelliJ IDEA.
  User: po
  Date: 16/5/12
  Time: 下午6:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
<h3>测试下载Excel功能</h3>
<form action="file/download.htm" enctype="multipart/form-data" method="post">
    <input type="submit" value="下载Excel"></input>
</form>

<h3>测试上传Excel功能</h3>
<form action="file/upload" enctype="multipart/form-data" method="post">
    <input type="file" name="file"></input>
    <input type="submit" value="上传Excel"></input>
</form>
</body>
</html>