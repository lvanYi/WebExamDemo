<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>���֪ʶ��</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="<%=basePath%>js/jquery.min.js"></script>
     <link rel="stylesheet" type="text/css"  href="css/my.css" >
  </head>

  
<body>
<br>
 <font color="#33ccff" size=4;><strong>�����֪ʶ�㣺</strong></font>
<form action="<%=basePath%>teacher/KnowledgeAddSvl" method="post" class="definewidth m20" >

<table  class="altrowstable" width="100%">
    <tr>
        <td><font color="#33ccff" size=2;><strong >֪ʶ���ţ�</strong></font><input type="number" name="kid" id="tt"/></td>
        </tr>
        <tr>
        <td><font color="#33ccff" size=2;><strong >�����γ̣�</strong></font>
        <select name="cno" >
			<c:forEach items="${cour}" var="cor">
				<option value="${cor.cno }">${cor.cname}</option>
		    </c:forEach>
		    </select>
    </tr>
      <tr>
       <td><font color="#33ccff" size=2;><strong >֪ʶ�����ƣ�</strong></font><input type="text" name="kname" id="tt"/></td>
       
    </tr>
    <tr>
    <td>
    <button type="submit" class="button red">�ύ</button> <button type="reset"  class="button white">����</button>     <button type="button"  onclick="location.href='KnowledgeSvl'" class="button white" >����</button></td>
	</tr>
	</table>
	

	</form>
	</body>
 
</html>
