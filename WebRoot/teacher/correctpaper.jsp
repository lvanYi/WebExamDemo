<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<center>
<form action="<%=basePath%>teacher/QuerypaperSvl" method="post" class="definewidth m20" >
<table>
<td>���Ŀ����Ծ�</td><td>
        <select name="examid">
					<c:forEach items="${exam}" var="t">
						<option value="${t.examid}">${t.examtitle}</option>
					</c:forEach>
					</select>
<button type="submit" class="button white">ȷ��</button>
</td>
</table>
</center>
</form>

<form action="<%=basePath%>teacher/CorrectpaperSvl" method="post" class="definewidth m20" >
 <table class="altrowstable" width="100%">
	  <tr>   
	     <th>ѧ��</th> 
         <th>��Ŀ��</th>  
         <th>�𰸣�</th>
         <th>���</th>
         <th>���֣�</th>
         <th>��֣�</th>   
        </tr>  
	  
<c:forEach items="${ts}" var="s"  >
			<tr>	
			    <td>${s.sno}</td>	
			   <td>${s.qcont}</td>			
				<td >${s.qans}</td>
				<td >${s.anscont}</td>
				<td>${s.sc}</td>
                <td><input type="text" name="${s.qid}"/></td>	
               
           
			</tr>
			
		</c:forEach>


	</table>  
                    <center><button type="submit" class="button white">�ύ</button></center>
  </body>

</form>
 </body> 
</html>
