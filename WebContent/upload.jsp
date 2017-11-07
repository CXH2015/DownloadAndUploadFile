<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传</title>
</head>
<body>
<center>
<h1>Struts 2完成上传</h1>
<form action="upload.action" method="post" enctype="multipart/form-data">
<table>
<tr>
<td>用户名:</td>
<td><input type="text" name="username"></td>
</tr>
<tr>
<td>上传文件:</td>
<td><input type="file" name="myUpload"></td>
</tr>
<tr>
<td><input type="submit" value="上传"></td>
<td><input type="reset"></td>
</tr>
</table>
</form>
</center>
</body>
</html>