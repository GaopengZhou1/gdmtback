<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<link href="css/style.default.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
</head>

<body>
	<div class="contentpanel">
		<div class="row">
			<div class="col-md-8">
				<section class="panel panel-default">
					<div class="panel-body weather-row">
						<img src="picture/weather_image.jpg" height="243" alt="">
						<div class="weather-head">weather forecast</div>
						<div class="form-group country-select">
							<select class="width100p" data-placeholder="New York">
								<option value="">New York</option>
								<option value="">London</option>
								<option value="">Australia</option>
								<option value="">Canada</option>
								<option value="">China</option>
								<option value="">New York</option>
							</select>
						</div>
					</div>
					<div class="panel-footer">
						<div class="row weather-full-info">
							<div class="col-md-3 today-status">
								<h1>Today</h1>
								<span class="wi wi-day-cloudy"></span>
								<div class="degree">37</div>
							</div>
							<div class="col-md-9">
								<ul>
									<li>
										<h2>Tomorrow</h2> <span class="wi wi-day-cloudy text-primary"></span>
										<div class="statistics">32</div>
									</li>
									<li>
										<h2>Mon</h2> <span class="wi wi-day-cloudy text-danger"></span>
										<div class="statistics">40</div>
									</li>
									<li>
										<h2>Tue</h2> <span class="wi wi-day-cloudy text-info"></span>
										<div class="statistics">25</div>
									</li>
									<li>
										<h2>Wed</h2> <span class="wi wi-day-cloudy text-success"></span>
										<div class="statistics">37</div>
									</li>
									<li>
										<h2>Thu</h2> <span class="wi wi-day-cloudy text-warning"></span>
										<div class="statistics">15</div>
									</li>
									<li>
										<h2>Fri</h2> <span class="wi wi-day-cloudy"></span>
										<div class="statistics">21</div>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</section>
			</div>

			<div class="col-md-4">
				<section class="panel panel-default">
					<div class="clock-panel">
						<h1>December 14</h1>
						<p class="text-left">2014, Friday</p>
						<p class="text-left">7:53 PM</p>
					</div>
					<ul id="clock">
						<li id="sec"></li>
						<li id="hour"></li>
						<li id="min"></li>
					</ul>

					<ul class="clock-category">
						<li><a href="#" class="active"> <i class="fa fa-clock-o"></i> <span>Clock</span>
						</a></li>
						<li><a href="#"> <i class="fa fa-clock-o"></i> <span>Alarm</span>
						</a></li>
						<li><a href="#"> <i class="fa fa-clock-o"></i> <span>Stop watch</span>
						</a></li>
						<li><a href="#"> <i class="fa fa-clock-o"></i> <span>Timer</span>
						</a></li>
					</ul>
				</section>
			</div>
		</div>

	</div>

	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/css3clock.js"></script>

	<script type="text/javascript">
	/* var o = document.body.clientHeight;
	window.parent.set_iFrame(o); */
	</script>
</body>
</html>
