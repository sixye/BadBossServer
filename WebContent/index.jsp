<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	登陆测试. <hr>
    	<form action="login.do" method="post">
    		<input type="text" name="username"/><br/>
    		<input type="password" name="password"/><br/>
    		<input type="submit" value="submit"/>
    		<input type="reset" value="reset"/>
    	</form>
</body>
</html>