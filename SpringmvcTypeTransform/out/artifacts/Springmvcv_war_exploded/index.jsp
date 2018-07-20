<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<hr>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<form action="<%=basePath%>/test/register.do" method="post">
    年龄:<input type="text" name="age"/><br>
    生日:<input type="text" name="birthday"/><br>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
