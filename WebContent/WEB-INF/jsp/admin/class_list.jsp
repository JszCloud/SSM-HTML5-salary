<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>班级列表</title>


<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
<!-- 插件使用的样式表文件，分bootstrap2和bootstrap3两个环境使用，根据使用环境引用 -->
<!-- bootstrap2环境使用 -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/b.page.css" type="text/css">
<!-- bootstrap3环境使用 -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/b.page.bootstrap3.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/list.css" type="text/css">

</head>
<body>
	<div id="list">
		<p>
			<a href="admin/addAdmin">添加</a>
		</p>
		<table style="width: 80%;"
			class="bTable table table-striped table-bordered table-hover table-condensed">
			<thead>
				<tr>
					
					<th>班级流水号</th>
					<th>班级编号</th>
					<th>班级名称</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${adminUser != null}">
					<c:forEach var="u" items="${adminUser}">
						<tr>
							
							<th>${u.adminId }</th>
							<th>${u.adminName }</th>
							<th>${u.adminPassword }</th>
							<th>
							<a href="admin/selectEdit?adminId=${u.adminId}">修改</a>&nbsp;/&nbsp;
							<a href="admin/delAdminUser?adminId=${u.adminId}">删除</a></th>
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>
	</div>

	<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js" /></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/b.page.js"></script>
</body>
</html>
