<%@page pageEncoding="utf-8" contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<style>
			* {
				margin:0px;
				padding:0px;
			}
			body {
				background-image: url("./images/p_01.jpg");
			}
			div {
				width: 100%;
			}
			.nav-head {
				background-color:rgba(50, 50, 50, 0.5);
				padding: 10px 0px 10px 30px;
			}
			.nav-bar {
				border:1px solid;
				width: 180px;
				height: 30px;
			}
			.nav-bar a {
				display:block;
				width: 100%;
				height: 100%;
				background:#000;
			}

			.nav-content {
				height: 450px;
			}
			.nav-foot {
				height: 50px;
			}
			.log-box {
				margin: 50px auto;
				width: 380px;
				height: 500px;
				background-color:rgba(50, 50, 50, 0.6);
			}
			.selectLog{
				height:44px;
				border-bottom: 1px solid #666;
			}
			.select {
				color: #999;
				height:30px;
				width: 100px;
				float: left;
			}
			.line {
				width: 1px;
				height: 44px;
				border-left: 1px solid #666;
				float:left;
				margin: 0px 55px;
			}
			#phoneLog {
				margin: 14px 0px 0px 32px;
				border-bottom: 1px solid #fff;
			}
			#webLog {
				margin: 14px 30px 0px 0px;  
			}
			#phoneLog:hover {
				cursor: pointer;
				color:#fff;
				
			}
			#webLog:hover {
				cursor: pointer;
				color:#fff;
			}
			.log-text {
				font-size: 14px;
				margin: 20px auto;
				width: 300px;
				text-align: center;
				color: #AAA;
			}
			.form-text {
				width: 300px;
				margin: 10px auto;
				font-size: 12px;
				color: #fff;
			}
			.login-input {
				display:block;
				width: 300px;
				height: 40px;
				border: 1px solid #F60A2D;
				margin: 0px auto;
				border-radius: 4px;
				text-indent: 1em;
				font-size:12px;
			}
			.login-btn {
				text-indent: 0;
				width: 302px;
				margin-top: 35px;
				border: 0;
				font-size:14px;
				color: #fff;
				background: rgb(87, 180, 117);
			}
			.login-btn:hover {
				cursor:pointer;
				background: rgb(87, 217, 117);
			}
			.foot-img {
				margin: 0px auto;
				margin-top: 30px;
				text-align:center;
				width: 100%;
				height: 20px;
				position: relative;
			}
		</style>
		<script type="text/javascript" src="./js/jquery.js"></script>
		<script type="text/javascript">
			var monitor = 0;
			$(function(){
				var index = 0;
				var arr = ["p_01.jpg", "p_02.jpg", "p_03.jpg", "p_04.jpg", "p_05.jpg"];
				setInterval(function(){
					if(index > 4){
						index = 0;
					} else {
						$("body").css("background-image", "url('./images/"+ arr[index%arr.length]+"')").show("slow");
						index ++;
					}
						}, 20000);
			});
			$(function() {
				$("#phoneLog").click(function(){
					monitor = 0;
					$("#phoneNum").css("display","");
					$("#username").css("display","none");
					$("#phoneLog").css("border-bottom", "1px solid #fff");
					$("#webLog").css("border-bottom", "1px");
				});
			});
			$(function() {
				$("#webLog").click(function(){
					monitor = 1;
					$("#phoneNum").css("display","none");
					$("#username").css("display","");
					$("#webLog").css("border-bottom", "1px solid #fff");
					$("#phoneLog").css("border-bottom", "1px");
				});
			});
			function check() {
				$("#error-msg").html("");
				if (monitor == 0) {
					var reg1 = /^\d{11}$/;
					var phoneNum = document.getElementById("phoneNum").value;
					if(phoneNum.length == 0 || !reg1.test(phoneNum)) {
						$("#error-msg").html( "手机号码格式不正确");
						return false;
					}
				} else if (monitor == 1) {
					var reg2 = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
					var username = document.getElementById("username").value;
					if(username.length == 0 || !reg2.test(username)) {
						$("#error-msg").html( "Email格式不正确");
						return false;
					}
				}
				var password1 = document.getElementById("password1").value;
				var password2 = document.getElementById("password2").value;
				if(password1.length < 6){
						$("#error-msg").html( "密码格式错误, 长度至少需要6个字符");
						return false;
					} else if (password1 != password2) {
						$("#error-msg").html( "密码和确认密码不相等");
						return false;
					}
				return true;
			}
			function beforeSubmit() {
				var flag = check();
				return flag;
			}
		</script>
	</head>
	<body>
		<div class="nav-head">
			<div class="nav-bar">
				<a href="home.html">
					<img style="width:100%; height:100%;" src="./images/max_logo3.png"/>
				</a>
			</div>
		</div>
		<div class="nav-content">
			<div class="log-box">
				<div class="selectLog">
					<div id="phoneLog" class="select">手机账号注册</div>
					<div class="line"></div>
					<div id="webLog" class="select">网站账号注册</div>
				</div>
				<div class="log-text"><b>输入注册信息</b></div>
				<div id= "error-msg" style="margin:3px auto; width:100%; text-align: center; color:#ec3627; font-size: 12px;">
					<%
						String error = (String) request.getAttribute("error");
					%>
					<%=(error == null? "" : error ) %>
				</div>
				<form id="login-form" action="page/register/do" method="post" onsubmit="return beforeSubmit() + 1 == 2;">
					<div class="form-text">用户名:</div>
					<input id="phoneNum" class="login-input top-radius" type="text" name="phoneNum" value="" placeholder="请输入正确的手机号码"/>
					<input id="username" style="display:none" class="login-input top-radius" type="text" name="username" value="" placeholder="请输入正确的邮箱"/>
					<div class="form-text">密码:</div>
					<input id="password1" class="login-input bottom-radius" type="password" name="password1" placeholder="不少于6个字符"/>
					<div class="form-text">确认密码:</div>
					<div id="confir-text" class="form-text">
						<input id="password2" class="login-input bottom-radius" type="password" name="password2" placeholder=""/>
					</div>
					<input id="login-btn" class="login-btn login-input" type="submit" value="注册"/>
				</form>
				<div class="foot-img"> 
					<img style="width:40px; height:100%" src="./images/logo_01.png"/>
					<a style="position: absolute; right: 20px;bottom:-10px; font-size:12px; color:#999;text-decoration:none; cursor:pointer;" href="login.jsp">返回</a>
				</div>
			</div>
		</div>
		<div class="nav-foot"></div>
	</body>
</html>