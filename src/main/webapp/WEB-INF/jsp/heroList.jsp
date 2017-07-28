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
	<div><a href="addPage">新增</a></div>
	<table border="8">
		<tr>
			<td>id</td>
			<td>姓名</td>
			<td>血量</td>
			<td>攻击</td>
			<td>操作</td>
		</tr>

		<c:forEach items="${heroList}" var="hero">
			<tr>
				<td>${hero.id}</td>
				<td>${hero.name}</td>
				<td>${hero.hp}</td>
				<td>${hero.damage}</td>
				<td><a href="detail?id=${hero.id}">详情</a></td>
			</tr>
		</c:forEach>
	</table>
	<div>
		共${total}条记录
		当前${page.nowPage}/${page.totalPage}页
		<a href="?start=0">首页</a>
		<a href="?start=${page.pre}">上一页</a>
		<a href="?start=${page.next}">下一页</a>
		<a href="?start=${page.last}">末页</a>
	</div>
</body>
</html>