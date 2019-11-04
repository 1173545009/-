<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
	background-color: pink;
	margin: 0 auto;
	font-size: 25px;
	color: green;
}


</style>
</head>
<body>
	<table border="1px">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>密码</td>

		</tr>
		<!--使用el表达式  -->
		<c:forEach items="${list}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.username}</td>
				<td>${user.password}</td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>