<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>系统主页</title>
<meta name="viewport" charset="utf-8" content="width=device-width, initial-scale=1">
<%@ include file="/tabledata.jsp"%>
<link href="${pageContext.request.contextPath}/css/bootstrap-override.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/ckeditor/ckeditor.js"></script>
<script src="${pageContext.request.contextPath}/ckeditor/config.js"></script>
<style>
.form-control {
	border-radius: 5px;
	height: 30px;
}
</style>

</head>
<body>
	<div id="abc" class="panel panel-dark-head">
		<div class="panel-heading">
			<h4 class="panel-title">新增资讯信息</h4>
		</div>
		<!-- panel-heading -->
		<div class="panel-body nopadding">
			<form id="roleForm" method="post" class="form-bordered">
				<div class="form-group">
					<label class="col-sm-4 control-label">资讯标题</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="role_id" name="role_id" placeholder="请输入资讯标题">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-4 control-label">角色名称</label>
					<div class="col-sm-8">
						<input class="form-control" id="role_name" name="role_name" placeholder="请输入角色名称">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-4 control-label">资讯内容</label>
					<div class="col-sm-8">
					</div>
				</div>
				<div class="form-group" style="text-align: center;">
					<div class="col-sm-12" style="text-align: center;">
						<input type="button" class="btn btn-default" onclick="submitForm()" value="提交" /> &nbsp;&nbsp;&nbsp;&nbsp;
						<button type="reset" class="btn btn-default">重置</button>
					</div>
				</div>
			</form>
		</div>
	</div>

	<script type="text/javascript">
		setBodyHeight();
		window.parent.setMainDivHeight($('#abc').css('height'));
	</script>
</body>
</html>