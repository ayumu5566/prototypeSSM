<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src="/static/libs/jquery/jquery-3.2.1.min.js"></script>
<link href="/static/libs/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/static/libs/bootstrap/js/bootstrap.min.js"></script>
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
			<form id="searchForm" action="list" method="get">
				<div>
					<label for="name">姓名：</label>
					<input type="text" id="name" name="name" value="${map.name}" class="form-control input_search_text"/>
					
					<label for="hp">血量：</label>
					<input type="text" id="hp" name="hp" value="${map.hp}" class="form-control input_search_text"/>
					
					<label for="damage">攻击：</label>
					<input type="text" id="damage" name="damage" value="${map.damage}" class="form-control input_search_text"/>

					<input type="submit" id="search" value="查询" class="btn btn-primary" />
					<button id="resetBtn" class="btn btn-danger">重置</button>
				</div>
			</form>
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
		<div class="div_page">
			<div style="margin-top: 16px;">共${total}条记录 当前${page.nowPage}/${page.totalPage}页</div>
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
	$(function() {
		$("[data-toggle='tooltip']").tooltip(); 
	});
	
	$(function() {
		$('#resetBtn').click(function(){  
			$(':input','#searchForm').not(':button,:submit,:reset,:hidden').val('')
		});  
	});
	
</script>
<style>
.input_search_text {
	width: 200px;
	display: inline-block;
}

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
</style>