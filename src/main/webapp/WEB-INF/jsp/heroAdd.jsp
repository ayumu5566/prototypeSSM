<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增英雄</title>
</head>
<body>
	<form action="add" method="post">
		姓名：<input type="text" id="name" name="name"><br>
		血量：<input type="text" id="hp" name="hp"><br>
		攻击：<input type="text" id="damage" name="damage"><br>
		<input type="submit" value="新增">
	</form>
</body>
</html>