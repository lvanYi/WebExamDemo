<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
 <head>
    <base href="<%=basePath%>">
    
    <title>֪ʶ�����</title>

 
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
<font color="#777777" size = 4><strong>����д֪ʶ����Ϣ��</strong></font>
<form action="<%=basePath%>teacher/EditknowledgeSvl" method="post" class="definewidth m20" >
<table  class="altrowstable" width="100%">
	<tr>
	</tr>
        <tr>
	    <td>֪ʶ��ID��</td><td>${k.kid}</td></td>
		</tr>
		<tr>
	    <td>�γ�ID��</td>	<td><select name="cno"> 
		<c:forEach items="${cour}" var="tq">
				<option  value="${tq.cno}">${tq.cname}</option>
		    </c:forEach>
		    </select></td>
		</tr>
		
		<tr>
	    <td>֪ʶ�����ƣ�</td><td><input type="text" name="kname" value="${k.kname}"/></td>
		</tr>
		<tr>
	    <td>�����Ŀ(������ID)��</td><td><input type="text" name="qid" /></td>
		</tr>
    	<td><button type="submit" class="button white">�ύ</button>    <button type="reset" class="button white">����</button>   </td><td>  <button type="button"  onclick="location.href='KnowledgeSvl'" class="button white">����</button></td>
	</tr>
</table>	
</form>
 </body>
</html>
