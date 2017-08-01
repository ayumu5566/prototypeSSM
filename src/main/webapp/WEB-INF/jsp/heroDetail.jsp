<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript" src="/static/libs/jquery/jquery-3.2.1.min.js"></script>
<link href="/static/libs/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/static/libs/bootstrap/js/bootstrap.min.js"></script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>英雄详情</title>
</head>
<body>
<div class="panel panel-danger">
		<div class="panel-heading">英雄详情</div>
		<div class="panel-body">
			<div class="col-sm-12">
				<label class="pull-left control-label">姓名：</label>
				<div>${hero.name}</div>
			</div>
			<div class="col-sm-12">
				<label class="pull-left control-label">血量：</label>
				<div>${hero.hp}</div>
			</div>
			<div class="col-sm-12">
				<label class="pull-left control-label">攻击：</label>
				<div>${hero.damage}</div>
			</div>
			<div><a href="list" class="btn btn-default a_back">返回</a></div>
		</div>
	</div>
</body>
</html>
<style>
.a_back {
	margin-top: 20px;
}
</style>