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
<font color="#777777"><strong>����дѧ�����ϣ�</strong></font>
<form action="<%=basePath%>EditstudentSvl" method="post" class="definewidth m20" >
<table  class="altrowstable" width="100%">
    <tr>
        <td>ѧ�ţ�</td><td>${s.sno}</td>
        <td>�༶��ţ�</td><td><input type="text" name="classno" value="${s.classno}"/></td>
	     <td>������</td><td><input type="text" name="sname" value="${s.sname}"/></td>
	</tr>
 
        
       <tr>
      <td>���䣺</td><td><input type="text" name="sage" value="${s.sage}"/></td>
	   <td>ѧУ��</td><td><input type="text" name="sschool" value="${s.sschool}"/></td>
        <td>�꼶��</td><td><input type="text" name="sgrade" value="${s.sno}"/></td>
        </tr>
      <tr>
         <td>�Ա�</td><td><label>��&nbsp;<input type="radio" name="sgender" value="1" checked="checked"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Ů&nbsp;<input type="radio" name="sgender" value="2"/></label></td>
        <td>��ϵ��ʽ��</td><td><input type="text" name="scontact" value="${s.scontact}"/></td>
	   <td>�������䣺</td><td><input type="text" name="semail" value="${s.semail}"/></td>
       </tr>
       <tr>
        <td>��ַ��</td><td><input type="text" name="saddress" value="${s.saddress}"/></td>
        <td>���룺</td><td><input type="text" name="pwd" value="${a.password}"/></td>
   <td><button type="submit" class="button white">�ύ</button>    <button type="reset" class="button white">����</button>   </td><td>  <button type="button" onclick="location.href='StudentinfoSvl'" class="button white">����</button></td>
	</tr>
   
</table>

</form>
 </body> 
</html>
