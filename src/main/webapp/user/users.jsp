<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<%@ include file="/tabledata.jsp"%>
</head>
<body>
	<div id="abc" class="panel panel-dark-head">
		<div class="panel-heading">
			<h4 class="panel-title">用户信息列表</h4>
		</div>
		<table id="user_table">
		</table>
	</div>

	<div id="toolbar" class="btn-group">
		<button id="btn_edit" type="button" class="btn btn-default">
			<span class="fa fa-edit" aria-hidden="true"></span>&nbsp;修改
		</button>
		<button id="btn_delete" type="button" class="btn btn-default">
			<span class="fa fa-trash-o" aria-hidden="true"></span>&nbsp;删除
		</button>
	</div>

	<script type="text/javascript">
		
		$(function(){
			$('#user_table').bootstrapTable({
				url : '${pageContext.request.contextPath}/user/getUsers',
				method : 'get',
				toolbar : '#toolbar',
				striped : true,
				cache : false,
				pagination: true,
				sidePagination : "server",
				queryParamsType : "limit", 
				sortOrder: "asc",
				pageNumber : 1,
				pageSize : 5,
				pageList : [5, 10, 25, 50],
				showColumns : true,
				showRefresh : true,
				clickToSelect : true,
				paginationPreText:"<<",
			    paginationNextText:">>",
				uniqueId : "user_uuid",
				columns : [ { checkbox : true, visible: true }, 
							{ field : 'username', title : '姓名', width : 120, align : 'center' },
							{ field : 'email', title : '邮箱', width : 200, align : 'center' },
							{ field : 'mobile', title : '手机', width : 150, align : 'center' },
							{ field : 'nice_name', title : '昵称', width : 130, align : 'center' },
							{ field : 'organ_name', title : '部门', width : 200, align : 'center' },
						  ],
				queryParams : function(params) {
					var temp = {
		                    offset :params.offset,// SQL语句起始索引
		                    pageNumber : params.limit  // 每页显示数量
		                };
		                return temp;
				}
			});
			
			$('#btn_edit').click(function(){
				var users = $('#user_table').bootstrapTable('getSelections');
				if(users.length > 1 || users.length == 0){
					toastr.options.positionClass = "toast-center-center";
					toastr.info('请选择一条数据进行数据编辑操作!');
					return;
				}
				window.parent.openIframe('${pageContext.request.contextPath}/user/updateUser.jsp?id=' + users[0].user_uuid);
				
			});			
			
			$('#btn_delete').click(function(){
				var users = $('#user_table').bootstrapTable('getSelections');
				if(users.length > 1 || users.length == 0){
					toastr.options.positionClass = "toast-center-center";
					toastr.info('请选择一条数据进行数据编辑操作!');
					return;
				}
				window.parent.openModel('${pageContext.request.contextPath}/deleteModal.jsp?id=' + users[0].user_uuid + '&type=user');
			});			
		});
		window.parent.setMainDivHeight(0);
		window.parent.set_iFrame(680);
	</script>
</body>
</html>





















