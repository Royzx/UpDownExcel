<%--
  Created by IntelliJ IDEA.
  User: po
  Date: 16/5/11
  Time: 下午4:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<n>
<!-- 输出普通字符 -->
${message } <br/>
<!-- 输出List -->
<p>书籍列表</p>
<c:forEach items="${content}" var="node">
    <c:out value="${node}"/></br>
</c:forEach>
<br/>
<br/>

<%--<!-- 输出Map -->--%>
<%--<c:forEach items="${map}" var="node">--%>
    <%--姓名：<c:out value="${node.key}"></c:out>--%>
    <%--住址：<c:out value="${node.value}"></c:out>--%>
    <%--<br/>--%>
<%--</c:forEach>--%>
</body>
</html>
