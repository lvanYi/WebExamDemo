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
    
    <title>֪ʶ�����</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css"  href="css/my.css" >
  </head>
  
  <body>
   <br>
 <font color="#33ccff" size=4;><strong>�������Ŀ��</strong></font>
<form action="<%=basePath%>teacher/QuestionAddSvl" method="post" class="definewidth m20" >

<table  class="altrowstable" width="100%">
    <tr>
        <td><font color="#33ccff" size=2;><strong >�����ţ�</strong></font><input type="number" name="qid" id="tt"/></td>
        </tr>
        <tr>
        <td><font color="#33ccff" size=2;><strong >�������ͣ�</strong></font>
        <select name="qtid" >
			<c:forEach items="${tqt}" var="tq">
				<option value="${tq.qtid}">${tq.qtname}</option>
		    </c:forEach>
		    </select>
		    </td>
    </tr>
      <tr>
       <td><font color="#33ccff" size=2;><strong >�������ݣ�</strong></font><textarea name="qcont" id="tt" style= "width:300px;height:150px;"></textarea></td>
       
    </tr>
     <tr>
       <td><font color="#33ccff" size=2;><strong >����𰸣�</strong></font><textarea  name="qans" id="tt" style= "width:300px;height:100px;"></textarea></td>
       
    </tr>
     <tr>
       <td><font color="#33ccff" size=2;><strong >���������</strong></font><textarea name="qexp" id="tt" style= "width:300px;height:50px;"></textarea></td>
       
    </tr>
     <tr>
       <td><font color="#33ccff" size=2;><strong >����ͼƬ��</strong></font><input type="text"  name="qurl" id="tt"/></td>
       
    </tr>
     <tr>
       <td><font color="#33ccff" size=2;><strong >�Ƿ���ڣ�</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><font color=red size=2;><strong >��</strong>&nbsp;<input type="radio" name="ispastdue" value="1"  />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=red size=2;><strong >��</strong>&nbsp;<input type="radio" name="ispastdue" value="0" checked="checked"/></label></td>
       </tr>
    <tr>
    <td>
    <button type="submit" class="button red">�ύ</button> <button type="reset"  class="button white">����</button>     <button type="button"  onclick="location.href='QuestionSvl'" class="button white" >����</button></td>
	</tr>
	</table>
	

	</form>
  </body>
</html>
