<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
 <head>
    <base href="<%=basePath%>">
    
    <title>ѧ����Ϣ����</title>

 
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
<script type="text/javascript" src="<%=basePath%>js/jquery.min.js"></script>

	 <link rel="stylesheet" type="text/css" href="css/easyui.css">
	 <link rel="stylesheet" type="text/css" href="css/my.css">

	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>
  
  
  <body>
   <form action="<%=basePath%>student/PersonInfoSvl" method="post" class="definewidth m20" >
<table  class="altrowstable" width="100%">
	<tr>
	<td>ѧУ��</td><td>${s.sschool}</td>
	</tr>
	<tr><td>������</td><td>${s.sname}</td></tr>
    <tr>
        <td>ѧ�ţ�</td><td>${s.sno}</td>
	</tr>
       <tr>
        <td>�༶��ţ�</td><td>${s.classno}</td>
   
        </tr>
      <tr>
        <td>��ϵ��ʽ��</td><td><input type="text" name="scontact" value="${s.scontact}"/></td>
        </tr>
        <tr>
	   <td>�������䣺</td><td><input type="text" name="semail" value="${s.semail}"/></td>
       </tr>
       <tr>
        <td>��ַ��</td><td><input type="text" name="saddress" value="${s.saddress}"/></td>
        </tr>
        <tr>
        <td><button type="button" onclick="location.href='student/EditPwdSvl'" class="button red">�޸�����</button></td> 
  	<td>  <button type="submit" class="button white">����</button> </td>

	</tr>

</table>

</form>
</body>
</html>
