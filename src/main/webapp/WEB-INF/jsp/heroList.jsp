<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src="/static/js/jquery.min.js"></script>
<link href="/static/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/static/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>英雄列表</title>
</head>
<body>
	<div class="panel panel-success">
		<div class="panel-heading">英雄列表</div>
		<div class="panel-body">
			<div class="div_btn">
				<a href="addPage" class="btn btn-default">新增</a>
			</div>
			<table class="table">
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
						<td>
							<a href="detail?id=${hero.id}" class="btn btn-link">详情</a>
							<a href="updatePage?id=${hero.id}" class="btn btn-link">编辑</a>
							<a href="delete?id=${hero.id}" class="btn btn-link">删除</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div class="div_page">
			<div class="div_total">共${total}条记录 当前${page.nowPage}/${page.totalPage}页</div>
			<div class="pager">
				<li><a href="?start=0" <c:if test="${page.nowPage == 1}">class="btn disabled"</c:if>>首页</a></li>
			</div>
			<div class="pagination">
				<li>
					<a href="?start=${page.pre}" aria-label="Previous"
						data-toggle="tooltip" data-placement="bottom" title="上一页"
						<c:if test="${page.nowPage == 1}">class="btn disabled"</c:if>>
						<span aria-hidden="true">&laquo;</span>
					</a>
				</li>
				<li><a href="?start=0" <c:if test="${page.nowPage == 1}">class="btn disabled"</c:if>>1</a></li>
				<li><a href="?start=5" <c:if test="${page.nowPage == 2}">class="btn disabled"</c:if>>2</a></li>
				<li><a href="?start=10" <c:if test="${page.nowPage == 3}">class="btn disabled"</c:if>>3</a></li>
				<li><a href="?start=15" <c:if test="${page.nowPage == 4}">class="btn disabled"</c:if>>4</a></li>
				<li><a href="?start=20" <c:if test="${page.nowPage == 5}">class="btn disabled"</c:if>>5</a></li>
				<li>
					<a href="?start=${page.next}" aria-label="Next"
						data-toggle="tooltip" data-placement="bottom" title="下一页"
						<c:if test="${page.nowPage == page.totalPage}">class="btn disabled"</c:if>>
						<span aria-hidden="true">&raquo;</span>
					</a>
				</li>
			</div>
			<div class="pager">
			    <li><a href="?start=${page.pre}" <c:if test="${page.nowPage == 1}">class="btn disabled"</c:if>>上一页</a></li>
			    <li><a href="?start=${page.next}" <c:if test="${page.nowPage == page.totalPage}">class="btn disabled"</c:if>>下一页</a></li>
			</div>
			<div class="pager">
				<li><a href="?start=${page.last}" <c:if test="${page.nowPage == page.totalPage}">class="btn disabled"</c:if>>末页</a></li>
			</div>
		</div>
	</div>
</body>
</html>
<script>
   $(function () { $("[data-toggle='tooltip']").tooltip(); });
</script>
<style>
.table_hero {
	text-align: center;
}

.div_btn {
	margin-bottom: 18px;
}

.div_page {
	margin-left: 1070px;
	margin-top: -10px;
}

.div_page div {
	float: left;
	margin: 10px;
}

.div_total {
	margin: 17px;
}
</style>