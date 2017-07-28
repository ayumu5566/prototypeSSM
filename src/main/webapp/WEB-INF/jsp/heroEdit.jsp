<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改英雄</title>
</head>
<body>
	<form action="update" method="post">
		<input type="hidden" id="id" name="id" value="${hero.id}">
		姓名：<input type="text" id="name" name="name" value="${hero.name}"><br>
		血量：<input type="text" id="hp" name="hp" value="${hero.hp}"><br>
		攻击：<input type="text" id="damage" name="damage" value="${hero.damage}"><br>
		<input type="submit" value="修改">
	</form>
	<div><a href="list">返回</a></div>
</body>
</html>