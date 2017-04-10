<%@page pageEncoding="utf-8" contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<style type="text/css">
			* {
				margin:0px;
				padding:0px;
			}
			body {
				background-image: url("../../images/p_02.jpg");
			}
			.text-box {
				width: 100%;
				height: 150px;
				background-color:rgba(50, 50, 50, 0.5);
				padding: 10px 0px 10px 30px;
				position:relative;
			}
			.success-text {
				width: 200px;
				height: 30px;
				margin : 50px auto;
				text-align: center;
				color:#5DF30D;
			}
			.text-p {
				color: #aaa;
				width: 250px;
				height: 30px;
				position: absolute;
				top: 100px;
				right: 100px;
			}
		</style>
		<script type="text/javascript" src="../../js/jquery.js"></script>
		<script type="text/javascript">
			var time = 3;
			$(function() {
				setInterval(function() {
					$(".text-p").html(time + "秒后自动跳转到登陆页面.....");
					time--;
				}, 1000);
				setTimeout(function(){
					window.location.href="../../login.jsp";
				}, 3000);
			});
		</script>
	</head>
	<body>
		<div class="text-box">
			<div class="success-text">
				<%
					String success = (String)request.getAttribute("success");
					out.println(success == null? "":success);
				%>
			</div>
			<p class="text-p"></p>
		</div>
	</body>
</html>