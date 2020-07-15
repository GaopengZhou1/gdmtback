<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>系统主页</title>
<meta name="viewport" charset="utf-8" content="width=device-width, initial-scale=1">
<%@ include file="/tabledata.jsp"%>
<link href="${pageContext.request.contextPath}/css/bootstrap-override.css" rel="stylesheet">
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
			<h4 class="panel-title">新增资源信息</h4>
		</div>
		<!-- panel-heading -->
		<div class="panel-body nopadding">
			<form id="resForm" method="post" class="form-bordered">
				<div class="form-group">
					<label class="col-sm-4 control-label">资源路径</label>
					<div class="col-sm-8">
						<input class="form-control" id="res_url" name="res_url" placeholder="请输入资源名称">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-4 control-label">菜单编号</label>
					<div class="col-sm-8">
						<input class="form-control" id="dir_code" name="dir_code" placeholder="请输入菜单编号">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-4 control-label">菜单名称</label>
					<div class="col-sm-8">
						<input class="form-control" id="dir_name" name="dir_name" placeholder="请输入菜单名称">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-4 control-label">菜单级数</label>
					<div class="col-sm-8">
						<input class="form-control" id="dir_level_number" name="dir_level_number" placeholder="请输入菜单级数">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-4 control-label">父菜单信息</label>
					<div class="col-sm-8">
						<div class="input-group mb15">
							<input id="parent_name" class="form-control" type="text" name="parent_name" placeholder="请选择父菜单信息"/>
							<input id="parent_id" type="hidden" name="parent_id"/>
							<span class="input-group-addon" data-toggle="modal" data-target="#resTree"><i class="fa fa-paper-plane"></i></span> 
						</div>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-4 control-label">明细否</label>
					<div class="col-sm-8">
						<div class="radio icheck-silver icheck-inline">
							<input type="radio" value="0" name="isitem" id="isitem1"><label for="isitem1">否</label>
						</div>
						<div class="radio icheck-silver icheck-inline">
							<input type="radio" value="1" name="isitem" id="isitem2"><label for="isitem2">是</label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-4 control-label">菜单顺序号</label>
					<div class="col-sm-8">
						<input class="form-control" id="dir_order" name="dir_order" placeholder="请输入菜单顺序号">
					</div>
				</div>
				<div class="form-group" style="text-align: center;">
					<div class="col-sm-12" style="text-align: center;">
						<input type="button" class="btn btn-default" onclick="submitForm()" value="提交" />
						&nbsp;&nbsp;&nbsp;&nbsp;
						<button type="reset" class="btn btn-default">重置</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	<!-- 资源树 -->
	<div id="resTree" class="modal fade" style="height: auto;" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">资源树</h4>
				</div>
				<div class="modal-body">
					<%@ include file="/resTree.jsp"%>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" onclick="getResult()">确定</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>

	<script type="text/javascript">
		$(function(){
			toastr.options = {
				positionClass : "toast-center-center",
				timeOut : "10000",
				showMethod : "fadeIn",
				hideMethod : "fadeOut",  
				onclick : function() {
					window.location.href='${pageContext.request.contextPath}/res/resources.jsp';
				}
			};
		});
		
		function submitForm(){
				var form = $('#resForm').serialize();
				$.post('${pageContext.request.contextPath}/res/insert', form, function (data) {
					if(data == 1){
						toastr.success('<strong>成功&nbsp;! </strong>&nbsp;&nbsp;请到数据列表进行查看。');
					}else{
						toastr.error('<strong>失败&nbsp;! </strong>&nbsp;&nbsp;请检查数据正确性或联系管理员。');
					}
					
					setTimeout(function(){
						window.location.href='${pageContext.request.contextPath}/res/resources.jsp';
					}, 11000);
					
				}, "json");
		}
		
		function getResult() {
			var result = $('#result').val().split(',');
			$('#parent_name').val(result[0]);
			$('#parent_id').val(result[1]);
			$("#resTree").modal('hide'); //手动关闭
		}
		
		setBodyHeight();
		window.parent.setMainDivHeight($('#abc').css('height'));
	</script>
</body>
</html>