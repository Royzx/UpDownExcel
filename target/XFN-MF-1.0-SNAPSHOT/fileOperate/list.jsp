<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ request.getContextPath()+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>list</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <style type="text/css">
        a:link {
            text-decoration: none;
        }
        a:visited {
            text-decoration: none;
        }
        a:hover {
            color: #999999;
            text-decoration: underline;
        }
    </style>
</head>
<body>
<br/>
<c:forEach items="${map}" var="v">
    <a href="<%=basePath%>fileOperate/download?filename=${v.key}">${v.value}</a><br/>
</c:forEach>
<br/><a href="<%=basePath%>fileOperate/upload.jsp">上传文件</a>
</body>
