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
  <center>
   <form action="<%=basePath%>teacher/ChecktestSvl" method="post" class="definewidth m20" >
  <input type="text" name="ptitle" value="�������Ծ����"></input>
 <button type="submit" class="button white" >��ѯ</button>
    </form>
    </center>
    <table class="altrowstable" width="100%" id="qwer" >   
    <thead>   
        <tr>   
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

				<td>${p.pid}</td>
				<td>${p.tno}</td>
                <td>${p.cname}</td>            
				<td>${p.ctime}</td>
				<td>${p.ptitle}</td>
                <td>${p.pstate}</td>
                <td>${p.score}</td>
           
			<td><a href="<%=basePath%>teacher/EditpaperSvl?pid=${p.pid}" class="button white">�༭</a>
			<a href="<%=basePath%>teacher/EdittestSvl?ptitle=${p.ptitle}&pid=${p.pid}" class="button white">�������</a>
					<a href="<%=basePath%>teacher/RemovetestSvl?pid=${p.pid}" class="button red">ɾ��</a></td>
			</tr>
		</c:forEach>
    </table>
  
    
  </body>
  
</html>
