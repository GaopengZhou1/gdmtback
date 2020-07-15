<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Bootstrap 实例 - 警告框（Alert）插件 alert() 方法</title>
	<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<h3>警告框（Alert）插件 alert() 方法</h3>
<div id="myAlert" class="alert alert-success">
    <a href="#" class="close" data-dismiss="alert" aria-hidden="true">&times;</a>
    <strong>成功！</strong>结果是成功的。
</div>
<div id="myAlert2" class="alert alert-warning">
    <a href="#" class="close" data-dismiss="alert" aria-hidden="true">&times;</a>
    <strong>警告！</strong>您的网络连接有问题。
</div>
 
<script>
$(function(){
    $(".close").click(function(){
        $("#myAlert").alert();
        $("#myAlert2").alert();
    });
});
</script>

</body>
</html>