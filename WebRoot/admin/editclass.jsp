<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
 <head>
    <base href="<%=basePath%>">
    
    <title>�༶��Ϣ����</title>

 
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
<font color="#777777" size = 4><strong>����д�༶��Ϣ��</strong></font>

<form  action="<%=basePath%>EditClassSvl" method="post" class="definewidth m20" >
 <table class="altrowstable" width="100%" >
	<tr>
	</tr>
    <tr>
        <td> �༶��ţ�</td><td>${c.classno}</td>
        </tr>
        <tr>
	     <td> �༶����</td><td><input type="text" name="classname" value="${c.classname}"/></td>
		</tr>
  		<tr>
       <td> �Ƿ��ҵ��</td><td><label>��&nbsp;<input type="radio" name="isgraduate" value="1"/>��&nbsp;<input type="radio" name="isgraduate" value="2"/></label></td>
       </tr>
       <tr>
<td><button type="submit" class="button white">�ύ</button>  <button type="reset" class="button white">����</button></td><td>  <button   onclick="location.href='ClassinfoSvl'" class="button white">����</button></td>
	</tr>
</table>


	
</form>
 </body>
</html>
