<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: chuliu
  Date: 2017/8/12
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="include.jsp"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆结果</title>
</head>
<body>

<shiro:guest>
    欢迎游客访问，<a href="${pageContext.request.contextPath}/login.jsp">登录</a>
</shiro:guest>

<br>

<shiro:authenticated>
    用户[<shiro:principal/>]已身份验证通过
    <a href="logout.do">退出登录</a>

</shiro:authenticated>

<br>

<shiro:hasPermission name="administration">
    You have "administration" permission
</shiro:hasPermission>

<br>

<shiro:hasPermission name="development">
    You have "development" permission
</shiro:hasPermission>

<br>

<shiro:hasPermission name="browse">
    You have "browse" permission
</shiro:hasPermission>

</body>
</html>
