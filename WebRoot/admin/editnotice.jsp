<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  
<form action="<%=basePath%>EditnoticeSvl" method="post" class="definewidth m20" >
<table  class="altrowstable" width="100%">
    <tr>
        <td>��ţ�</td><td>${n.nid}</td>
        <td>�����ˣ�</td><td>${n.acc_id}</td>
	   
	</tr>
 
        
       <tr>
      <td>�������ݣ�</td><td><textarea name="ncont"  style= "width:300px;height:150px;">${n.ncont}</textarea></td>
	   <td>���ڣ�</td><td>${n.time}</td>
      
        </tr>
      
       <tr>     
   <td><button type="submit" class="button white">�ύ</button></td><td>   <button type="reset" class="button white">����</button> </td>
   <td>  <button type="button" onclick="location.href='NoticeinfoSvl'" class="button white">����</button></td><td><a href="RemovenoticeSvl"  class="button red">ɾ��</a></td>
	</tr>
   
</table>
    
  </body>
</html>
