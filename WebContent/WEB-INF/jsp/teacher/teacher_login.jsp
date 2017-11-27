<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>考勤管理系统 - 教师登录</title>
<meta name="keywords" content="考勤管理系统响应式后台">
<meta name="description"
	content="考勤管理系统是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">
<link rel="shortcut icon" href="favicon.ico">
<link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
<link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">
<link href="css/animate.css" rel="stylesheet">
<link href="css/style.css?v=4.1.0" rel="stylesheet">
<!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
<script>if(window.top !== window.self){ window.top.location = window.location;}</script>
</head>
<body class="gray-bg">
	<div class="middle-box text-center loginscreen  animated fadeInDown">
		<div>
			<div>
				<h1 class="logo-name">KQ</h1>
			</div>
			<h3>欢迎使用考勤管理系统 - 教师登录</h3>
			<form class="m-t" role="form" action="loginteacher" method="post">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="教师编号"
						required="" name="teacherNo">
				</div>
				<div class="form-group">
					<input type="password" class="form-control" placeholder="密码"
						required="" name="teacherPassword">
				</div>
				<button type="submit" class="btn btn-primary block full-width m-b">登
					录</button>
				<p class="text-muted text-center">
					 
				</p>
			</form>
			<span style="display:none" id="err">${err}</span>
		</div>
	</div>
	
	</script>
	<script src="js/jquery.min.js?v=2.1.4"></script>
	<script src="js/bootstrap.min.js?v=3.3.6"></script>
</body>
</html>
