<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">

<link href="css/style.default.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<title>国电煤炭后台管理系统</title>
</head>
<body>
	<header>
		<div class="headerwrapper">
			<div class="header-left">
				<a href="index.html" class="logo"> <img src="picture/logo.png" alt="" /></a>
				<div class="pull-right">
					<a href="#" class="menu-collapse"> <i class="fa fa-bars"></i></a>
				</div>
			</div>
			<!-- header-left -->
			<div class="header-right">
				<div class="pull-right">
					<form class="form form-search" action="search-results.html">
						<input type="search" class="form-control" placeholder="Search" />
					</form>
					<div class="btn-group btn-group-list btn-group-notification">
						<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
							<i class="fa fa-bell-o"></i> <span class="badge">1</span>
						</button>
						<div class="dropdown-menu pull-right">
							<a href="#" class="link-right"><i class="fa fa-search"></i></a>
							<h5>Notification</h5>
							<ul class="media-list dropdown-list">
								<li class="media"><img class="img-circle pull-left noti-thumb" src="picture/user1.png" alt="">
									<div class="media-body">
										<strong>Nusja Nawancali</strong> likes a photo of you <small class="date"><i class="fa fa-thumbs-up"></i> 15 minutes ago</small>
									</div></li>
							</ul>
							<div class="dropdown-footer text-center">
								<a href="#" class="link">See All Notifications</a>
							</div>
						</div>
						<!-- dropdown-menu -->
					</div>
					<!-- btn-group -->

					<div class="btn-group btn-group-list btn-group-messages">
						<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
							<i class="fa fa-envelope-o"></i> <span class="badge">1</span>
						</button>
						<div class="dropdown-menu pull-right">
							<a href="#" class="link-right"><i class="fa fa-plus"></i></a>
							<h5>New Messages</h5>
							<ul class="media-list dropdown-list">
								<li class="media"><span class="badge badge-success">New</span> <img class="img-circle pull-left noti-thumb" src="picture/user1.png"
									alt="">
									<div class="media-body">
										<strong>Nusja Nawancali</strong>
										<p>Hi! How are you?...</p>
										<small class="date"><i class="fa fa-clock-o"></i> 15 minutes ago</small>
									</div></li>
								<div class="dropdown-footer text-center">
									<a href="#" class="link">See All Messages</a>
								</div>
						</div>
						<!-- dropdown-menu -->
					</div>
					<!-- btn-group -->

					<div class="btn-group btn-group-option">
						<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
							<img class="img-circle avatar-img" alt="" src="picture/profile.png"> <span class="user-name">Salma</span> <i class="fa fa-caret-down"></i>
						</button>
						<ul class="dropdown-menu pull-right" role="menu">
							<li><a href="#"><i class="glyphicon glyphicon-user"></i> My Profile</a></li>
							<li><a href="#"><i class="glyphicon glyphicon-star"></i> Activity Log</a></li>
							<li><a href="#"><i class="glyphicon glyphicon-cog"></i> Account Settings</a></li>
							<li><a href="#"><i class="glyphicon glyphicon-question-sign"></i> Help</a></li>
							<li class="divider"></li>
							<li><a href="#"><i class="glyphicon glyphicon-log-out"></i>Sign Out</a></li>
						</ul>
					</div>
					<!-- btn-group -->

				</div>
				<!-- pull-right -->

			</div>
			<!-- header-right -->
		</div>
		<!-- headerwrapper -->
	</header>

	<section>
		<div class="mainwrapper">
			<div class="leftpanel">
				<!-- 导航栏 -->
				<div class="media profile-left">
					<a class="pull-left profile-thumb" href="#"> <img class="img-circle" src="picture/profile.png" alt=""></a>
					<div class="media-body">
						<h4 class="media-heading">Salma Hayek</h4>
						<span class="user-options"> <a href="#"><i class="glyphicon glyphicon-user"></i></a> <a href="#"><i
								class="glyphicon glyphicon-envelope"></i></a> <a href="#"><i class="glyphicon glyphicon-cog"></i></a> <a href="#"><i
								class="glyphicon glyphicon-log-out"></i></a>
						</span>
					</div>
				</div>


				<ul class="nav nav-pills nav-stacked">

					<li class="active"><a href="index.jsp"><i class="fa fa-home"></i><span>首页</span></a></li>

					<li><a href="#"><span class="pull-right badge">1</span><i class="fa fa-envelope-o"></i><span>UnCheck Messages</span></a></li>

					<li class="parent"><a href="#"><i class="fa fa-users"></i> <span>用户管理</span></a>
						<ul class="children">
							<li><a href="javascript:#" title="user/insertUser.jsp" onclick="locationHtml(this)">新增用户信息</a></li>
							<li><a href="javascript:#" title="user/users.jsp" onclick="locationHtml(this)">浏览用户信息列表</a></li>
						</ul>
					</li>

					<li class="parent"><a href="#"><i class="fa fa-sitemap"></i> <span>组织管理</span></a>
						<ul class="children">
							<li><a href="javascript:#" title="org/insertOrganization.jsp" onclick="locationHtml(this)">新增组织信息</a></li>
							<li><a href="javascript:#" title="org/organizations.jsp" onclick="locationHtml(this)">浏览组织信息列表</a></li>
						</ul>
					</li>

					<li class="parent"><a href="#"><i class="fa fa-male"></i> <span>权限管理</span></a>
						<ul class="children">
							<li><a href="javascript:#" title="role/insertRole.jsp" onclick="locationHtml(this)">新增角色信息</a></li>
							<li><a href="javascript:#" title="role/roles.jsp" onclick="locationHtml(this)">浏览角色信息列表</a></li>
							<li><a href="javascript:#" title="duty/insertDuty.jsp" onclick="locationHtml(this)">新增岗位信息</a></li>
							<li><a href="javascript:#" title="duty/duties.jsp" onclick="locationHtml(this)">浏览岗位信息列表</a></li>
						</ul>
					</li>

					<li class="parent"><a href="#"><i class="fa fa-database"></i> <span>资源管理</span></a>
						<ul class="children">
							<li><a href="javascript:#" title="res/insertResource.jsp" onclick="locationHtml(this)">新增资源信息</a></li>
							<li><a href="javascript:#" title="res/resources.jsp" onclick="locationHtml(this)">浏览资源信息列表</a></li>
						</ul>
					</li>
					
					<li class="parent"><a href="#"><i class="fa fa-twitter"></i> <span>资讯管理</span></a>
						<ul class="children">
							<li><a href="javascript:#" title="news/insertNews.jsp" onclick="locationHtml(this)">新增资源信息</a></li>
							<li><a href="javascript:#" title="res/news.jsp" onclick="locationHtml(this)">浏览资源信息列表</a></li>
						</ul>
					</li>

					<li class="parent"><a href="#"><i class="fa fa-cog"></i> <span>系统信息管理</span></a>
						<ul class="children">
							<li><a href="alerts.html">数据字典</a></li>
							<li><a href="buttons.html">日志管理</a></li>
							<li><a href="alerts.html">系统参数设置</a></li>
						</ul>
					</li>

				</ul>
			</div>

			<!-- leftpanel -->
			<div class="mainpanel">
				<div id="parent" class="contentpanel" style="height: 670px">
					 <iframe id="myContainer" frameborder="0" scrolling="no" width="100%" height="100%" src="context.jsp"> </iframe> 
				</div>
			</div>


			<div class="modal fade" id="_Modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
				<div class="modal-dialog" role="document">
					<div class="modal-content"></div>
				</div>
			</div>


	<script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/data-formatter.js"></script>
	<script src="${pageContext.request.contextPath}/js/css3clock.js"></script>
	<script src="${pageContext.request.contextPath}/js/custom.js"></script>
			<script type="text/javascript">
			
			function locationHtml(obj){
				$('#myContainer').attr('src', '${pageContext.request.contextPath}/'	+ obj.title);
			}
			
			function openIframe(url){
				$('#myContainer').attr('src', url);
			}
					
			function openModel(url){
				$('#_Modal').modal({
					remote: url,
					show: true
				});
			}
			
			function set_iFrame(size){
				debugger;
				var ifm= document.getElementById("myContainer");
				ifm.height=size + 5;
			}
			
			function setMainDivHeight(value){
				if(value == 0 || value.replace('px','') < 700){
					value = '700px';
				}
				$('#parent').css('height',value);
			}
			

			</script>

			<!-- mainpanel -->
		</div>
		<!-- mainwrapper -->
	</section>


	
</body>
</html>
