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
    
    <title>My JSP 'testinfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="<%=basePath%>js/jquery.min.js"></script>
<link rel="stylesheet" type="text/css"  href="css/my.css" >
  </head>
  
  <body>
  
    <table class="altrowstable" width="100%" id="qwer" >   
    <thead>   
        <tr>   
            <th><font color="#33ccff" size=2;><strong >����ID</strong></font></th>
         <th><font color="#33ccff" size=2;><strong >�Ծ�ID</strong></font></th> 
         <th><font color="#33ccff" size=2;><strong >�����ʦ</strong></font></th>  
         <th><font color="#33ccff" size=2;><strong >�γ�</strong></font></th>     
        <th><font color="#33ccff" size=2;><strong >����ʱ��</strong></font></th>
         <th><font color="#33ccff" size=2;><strong >�Ծ����</strong></font></th>
          <th><font color="#33ccff" size=2;><strong >�Ƿ����</strong></font></th>
          <th><font color="#33ccff" size=2;><strong >�Ծ��ܷ�</strong></font></th>
          <th><font color="#33ccff" size=2;><strong >����</strong></font></th>
        </tr>   
    </thead>   
    <c:forEach items="${paperinfo}" var="p">
			<tr>
                <td>${p.eid}</td>
				<td>${p.pid}</td>
				<td>${p.tno}</td>
                <td>${p.cname}</td>            
				<td>${p.stime}--${p.etime}</td>
				<td>${p.ptitle}</td>
                <td>${p.pstate}</td>
                <td>${p.score}</td>
           
			<td><a href="<%=basePath%>student/ExamSvl?pid=${p.pid}&examid=${p.eid}" class="button white">ѡ����п���</a>
			</td>
			</tr>
		</c:forEach>
    </table>
  
    
  </body>
  
</html>
