<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript" src="/static/js/jquery.min.js"></script>
<link href="/static/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/static/js/bootstrap.min.js"></script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增英雄</title>
</head>
<body>
	<div class="panel panel-info">
		<div class="panel-heading">新增英雄</div>
		<div class="panel-body">
			<form action="add" method="post">
				<div class="div_text">
					<label for="name" class="lable_text">姓名：</label>
					<input type="text" id="name" name="name" class="form-control input_text">
				</div>
				<div class="div_text">
					<label for="hp" class="lable_text">血量：</label>
					<input type="text" id="hp" name="hp" class="form-control input_text">
				</div>
				<div class="div_text">
					<label for="damage" class="lable_text">攻击：</label>
					<input type="text" id="damage" name="damage" class="form-control input_text">
				</div>
				<div class="div_text">
					<input type="submit" value="新增" class="btn btn-primary">
					<a href="list" class="btn btn-default a_text">返回</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
<style>
.div_text {
	display: flex;
	margin: 20px;
}

.lable_text {
	margin: 5px;
}

.a_text {
	margin-left: 20px;
}

.input_text {
	width: 300px;
}
</style>