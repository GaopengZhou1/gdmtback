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
			<h4 class="panel-title">组织机构列表</h4>
		</div>
		<table id="org_table">
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
		$('#org_table').bootstrapTable({
				url : '${pageContext.request.contextPath}/org/getOrgs',
				method : 'get',
				toolbar : '#toolbar',
				striped : true,
				cache : false,
				pagination : true,
				sidePagination : "server",
				pageNumber : 1,
				pageSize : 10,
				pageList : [ 10, 25, 50, 100 ],
				showColumns : true,
				showRefresh : true,
				clickToSelect : true,
				uniqueId : "organ_uuid",
				columns : [ { checkbox : true,  visible: true }, 
							{ field : 'organ_code', title : '组织编码', width : 120, align : 'center' },
							{ field : 'organ_name', title : '组织名称', width : 120, align : 'center' },
							{ field : 'organ_type', title : '组织类型', width : 120, align : 'center' },
							{ field : 'in_use', title : '是否在用', width : 120, align : 'center' },
							{ field : 'parent.organ_name', title : '父组织名称', width : 120, align : 'center' },
							{ field : 'shortname', title : '组织简称', width : 120, align : 'center' },
							{ field : 'modtime', title : '修改时间' ,formatter : dateFormatter, width : 120, align : 'center'}
						  ],
				queryParams : function(params) {
					var queryData = {
							pageSize : params.limit,
							pageNumber : (params.offset / params.limit) + 1
					};
					return queryData;
				}
			});
		
			$('#btn_edit').click(function(){
				var orgs = $('#org_table').bootstrapTable('getSelections');
				if(orgs.length > 1 || orgs.length == 0){
					toastr.options.positionClass = "toast-center-center";
					toastr.info('请选择一条数据进行数据编辑操作!');
					return;
				}
				window.parent.openIframe('${pageContext.request.contextPath}/org/updateOrganization.jsp?id=' + orgs[0].organ_uuid);
			});			
			
			$('#btn_delete').click(function(){
				var orgs = $('#org_table').bootstrapTable('getSelections');
				if(orgs.length > 1 || orgs.length == 0){
					toastr.options.positionClass = "toast-center-center";
					toastr.info('请选择一条数据进行数据编辑操作!');
					return;
				}
				window.parent.openModel('${pageContext.request.contextPath}/deleteModal.jsp?id=' + orgs[0].organ_uuid + '&type=org');
			});	
		});
	
		window.parent.setMainDivHeight(0);
		window.parent.set_iFrame(680);
	</script>
</body>
</html>