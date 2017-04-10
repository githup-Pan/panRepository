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
				background-repeat: repeat-x;
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
				height: 500px;
				position: relative;
			}
			.nav-foot {
				height: 50px;
			}
			.log-box {
				margin: 60px auto;
				width: 380px;
				height: 420px;
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
			.log-img {
				width:120px;
				height: 30px;
				margin: 15px auto;
			}
			.log-text {
				font-size: 14px;
				text-align: center;
				color: #fff;
				margin-bottom: 15px; 
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
				width: 302px;
				margin-top: 15px;
				border: 0;
				font-size:14px;
				color: #fff;
				background: rgb(87, 180, 117);
			}
			.login-btn:hover {
				cursor:pointer;
				background: rgb(87, 217, 117);
			}
			.sign-up-btn {
				width: 302px;
				margin:15px auto;
				border: 0;
				font-size:14px;
				color: #fff;
				border-radius: 4px;
				padding: 11px 0;
				text-align: center;
				background: rgb(59, 128, 180);
			}
			.sign-up-btn:hover {
				cursor:pointer;
				background: rgb(59, 128, 255);
			}
			.foot-img {
				margin: 10px auto;
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
					var password = document.getElementById("password").value;
					if(!reg1.test(phoneNum) || password.length < 6) {
						$("#error-msg").html( "用户名或密码不正确 , 请重新输入");
						return false;
					}
					
				} else if (monitor == 1) {
					var reg2 = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
					var username = document.getElementById("username").value;
					var password = document.getElementById("password").value;
					if(!reg2.test(username) || password.length < 6) {
						$("#error-msg").html( "用户名或密码不正确 , 请重新输入");
						return false;
					}
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
					<div id="phoneLog" class="select">手机账号登录</div>
					<div class="line"></div>
					<div id="webLog" class="select">网站账号登录</div>
				</div>
				<div class="inputlog">
					<div class="log-img">
						<img style="width:100%; height:100%;" src="./images/log.png"/>
					</div>
					<div class="log-text">第一游戏数据平台</div>
					<form id="login-form" action="page/login/do" method="post" onsubmit="return beforeSubmit() + 1 == 2;">
						<input id="phoneNum" class="login-input top-radius" type="text" name="phoneNum" value="" placeholder="手机号码"/>
						<input id="username" style="display:none;" class="login-input top-radius" type="text" name="username" value="" placeholder="Email账户"/>
						<input id="password" class="login-input bottom-radius" type="password" name="password" placeholder="密码"/>
						<div id= "error-msg" style="margin:3px auto; width:100%; text-align: center; color:#ec3627; font-size: 12px;">
							<%
								String error = (String)request.getAttribute("error");
								out.println(error==null? "": error);
							%>
						</div>
						<input id="login-btn" class="login-btn login-input" type="submit" value="登陆"/>
					</form>
					<div class="sign-up-btn" onclick="document.location.href='register.jsp'">创建我的DotaMax账号</div>
					<div style="color:#aaa; font-size:12px; margin: 10px 0px 10px 30px;  cursor:pointer;"onclick="document.location.href='http://dotamax.com/accounts/find_password/input/'">忘记密码？</div>
					<div class="foot-img"> 
						<img style="width:40px; height:100%" src="./images/logo_01.png"/>
						<a style="position: absolute; right: 20px;bottom:-10px; font-size:12px; color:#999;text-decoration:none; cursor:pointer;" href="home.html">返回</a>
					</div>
				</div>
			</div>
		</div>
		<div class="nav-foot"></div>
	</body>
</html>