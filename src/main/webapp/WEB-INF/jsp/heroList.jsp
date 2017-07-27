<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>英雄列表</title>
</head>
<body>
	<table>
		<tr>
			<td>id</td>
			<td>姓名</td>
			<td>血量</td>
			<td>攻击</td>
		</tr>

		<c:forEach items="${heroList}" var="hero">
			<tr>
				<td>${hero.id}</td>
				<td>${hero.name}</td>
				<td>${hero.hp}</td>
				<td>${hero.damage}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>