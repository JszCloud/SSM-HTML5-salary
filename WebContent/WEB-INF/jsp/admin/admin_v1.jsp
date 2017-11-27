<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!--360浏览器优先以webkit内核解析-->
<title>后台主页</title>
<link rel="shortcut icon" href="favicon.ico">
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/font-awesome.css?v=4.4.0" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/animate.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/style.css?v=4.1.0" rel="stylesheet">
</head>

<body class="gray-bg">
	<div class="row  border-bottom white-bg dashboard-header">
		<div class="col-sm-12">
			<blockquote class="text-warning" style="font-size: 14px">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;该基于HTML5的课堂考勤系统设计的目的是为了解决当前班级、课程、学生、教师的管理，以及学生请假，教师考勤，辅导员查看学生上课出勤信息等方面所面临的各个问题。该考勤管理系统涉及了三大类用户——学生，教师，辅导员，辅导员具有最高权限。系统使用范围是学校校园网，系统的后台设计是采用典型的B/S（浏览器/服务器）构架进行设计开发，手机端是使用HTML5进行开发衔接，可以完全实现跨平台操作（这里的跨平台是指客户端和服务器的跨平台，二者都可以在不同操作系统上轻松实现）。由于采用HTML5+CSS3+JavaScript动态网页显示技术，B/S设计、MVC模式，所以对硬件要求低。并且本系统有很好的扩展性，与学校校园网有很好的集成。
				<h4 class="text-danger">那么，现在HTML5的课堂考勤系统来了！</h4>
			</blockquote>
			<hr>
		</div>
	</div>
	<div class="wrapper wrapper-content">
		<div class="row">
			<div class="col-sm-4">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>联系信息</h5>
					</div>
					<div class="ibox-content">
						<p>
							<i class="fa fa-send-o"></i> 博客：<a href="http://www.520oo.cn"
								target="_blank">http://www.520oo.cn</a>
						</p>
						<p>
							<i class="fa fa-qq"></i> QQ：<a
								href="http://wpa.qq.com/msgrd?v=3&uin=516477188&site=qq&menu=yes"
								target="_blank">1073398026</a>
						</p>
						<p>
							<i class="fa fa-weixin"></i> 微信：<a href="javascript:;">L0829M</a>
						</p>
						<p>
							<i class="fa fa-credit-card"></i> 支付宝：<a href="javascript:;"
								class="支付宝信息">18385157376</a>
						</p>
					</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>更新日志</h5>
					</div>
					<div class="ibox-content">
						<p>指导老师</p>
						<ol>
							
							<li>李红梅</li>
						</ol>
						<p>开发人员</p>
						<ol>
							<li>李明易</li>
							<li>王呈</li>
							<li>宋学兵</li>
						</ol>
						<hr>
					</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>系统信息开发信息</h5>
					</div>
					<div class="ibox-content">
						<p>指导老师</p>
						<ol>
							
							<li>李红梅</li>
						</ol>
						<p>开发人员</p>
						<ol>
							<li>李明易</li>
							
							<li>王呈</li>
							
							<li>宋学兵</li>
						</ol>
						<hr>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 全局js -->
	<script src="${pageContext.request.contextPath}/js/jquery.min.js?v=2.1.4"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js?v=3.3.6"></script>
	<script src="${pageContext.request.contextPath}/js/plugins/layer/layer.min.js"></script>
	<!-- 自定义js -->
	<script src="${pageContext.request.contextPath}/js/content.js"></script>
	<!-- 欢迎信息 -->
	<script src="${pageContext.request.contextPath}/js/welcome.js"></script>
</body>

</html>
