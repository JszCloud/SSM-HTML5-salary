<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>辅导员用户列表</title>
</head>
<body>
<div style="border: 1px solid; width: 50%;height: 100%;text-align: center;">
 
        <form action="addAdminUser" method="post">
        <p>编号：<input type="index" name="adminId" /></p>
        <p>姓名：<input type="text" name="adminName" "/></p>
        <p>密码：<input type="password" name="adminPassword"/></p>
        <p>重复密码：<input type="password" name="adminPassword1"/></p>
        <p><input type="submit" value="提交"/></p>
        </form>
       </div>
</body>
</html>