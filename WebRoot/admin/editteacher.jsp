<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
 <head>
    <base href="<%=basePath%>">
    
    <title>��ʦ��Ϣ����</title>

 
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
<script type="text/javascript" src="<%=basePath%>js/jquery.min.js"></script>

	 <link rel="stylesheet" type="text/css" href="css/my.css">

	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>
<body>
<font color="#777777" size = 4><strong>����д��ʦ���ϣ�</strong></font>
<form action="<%=basePath%>EditTeacherSvl" method="post" class="definewidth m20" >
<table  class="altrowstable" width="100%">
	<tr>
	</tr>
    <tr>
        <td>��ʦ��ţ�</td><td>${t.tno}</td>
        </tr>
        <tr>
	    <td>������</td><td><input type="text" name="tname" value="${t.tname}"/></td>
		</tr>
		<tr>
       <td>�Ա�</td><td><label>��&nbsp;<input type="radio" name="tgender" value="1"/>Ů&nbsp;<input type="radio" name="tgender" value="2"/></label></td>
 		</tr>
    	  <tr> 
        <td>��ϵ��ʽ��</td><td><input type="text" name="tcontact" value="${t.tcontact}"/></td>
        </tr>
        <tr>
	   <td>�������䣺</td><td><input type="text" name="temail" value="${t.temail}"/></td>
       </tr>
  		<tr>
       <td>�Ƿ���ְ��</td><td><label>��&nbsp;<input type="radio" name="ison" value="1"/>��&nbsp;<input type="radio" name="ison" value="2"/></label></td>
       </tr>
       <tr>
        <td>���룺</td><td><input type="password" name="pwd" value="${a.password}"/></td>
        </tr>
        <tr>
    	<td><button type="submit" class="button white">�ύ</button>    <button type="reset" class="button white">����</button>   </td><td>  <button type="button"  onclick="location.href='TeacherinfoSvl'" class="button white">����</button></td>
	</tr>
</table>	
</form>
 </body>
</html>
