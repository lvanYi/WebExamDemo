<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>���Թ���ϵͳ</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/login.css" rel="stylesheet" rev="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/Validform_v5.3.2_min.js"></script>
<script type="text/javascript" src="js/jQuery1.7.js"></script>

<script type="text/javascript">
$(function(){
	var width = $(window).width();
	$(".screenbg ul img").css("width",width+"px");
});
</script>

</head>

	<body >

	<div id="tab">
		<div class="tab_box">
		<center>
		<form action="<%=basePath%>LoginSvl" method="post">
		<table>
		<tr><td></td><td>${msg}</td></tr>
		      <tr>
			<td>�û���:</td>
						<td><input type="text" name="account"  id="username" placeholder="�������˺�"/></td>
					</tr>
					<tr>
						<td>����:</td>
						<td><input type="password" name="pwd" id="userpassword" placeholder="����������"/>
						</td>
					</tr>
					
    <tr>
    <td></td>
    <td>
    <div  style="margin-left: 15px">
    <label><input name="role" type="radio" value="1" />����Ա </label>
    <label><input name="role" type="radio" value="2"/>��ʦ</label>
    <label><input name="role" type="radio" value="3"/>ѧ�� </label> 
    </div>
    </td>
    </tr>
   
	<tr>
	
	<td></td>
	<td>
	<div  style="margin-top: 20px">
	<input  type="submit" value="��¼" />
	</div>
	</td>
	
	</tr>
	</table>	
		</form>
		</center>
	</div>
	</div>
	<div class="screenbg">
  <ul>

    
    
  </ul>
</div>
</body>
</html>
