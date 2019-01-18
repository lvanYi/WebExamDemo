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
    
    <title>��ѯ����</title>
    
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
 	<form action="<%=basePath%>teacher/QuestionSvl" method="post">
	 	<table>
		 	<tr>
				<td>
					<font color="#33ccff"><strong>���ͣ�</strong></font>
					<select name="qtid"> 
						<c:forEach items="${tqt}" var="tq">
							<option  value="${tq.qtid }">${tq.qtname}</option>
					    </c:forEach>
				    </select>
					<br>
					</td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td><td>
				 	<input type="text" name="qcont"></input>
				 	<button type="submit" class="button white">��ѯ</button>
				</td>
		  	</tr>
	  	</table>
	</form>
</center>
 
<table class="altrowstable" width="100%" id="qwer" >   
    <thead>   
        <tr>   
	         <th>������</th> 
	         <th>��������</th>  
	         <th>��������</th>  
	         <th>�����</th> 
	         <th>�������</th> 
	         <th>����ͼƬ</th>       
	         <th>�Ƿ����</th>   
	         <th>����</th>
        </tr>   
    </thead>   
    <c:forEach items="${ques}" var="que">
			<tr>

				<td>${que.qid}</td>
				<td>${que.qtname}</td>
				<td>${que.qcont}</td>	
				<td>${que.qans}</td>
                <td>${que.qexp}</td>
                <td>${que.qurl}</td>
                <td><c:if test="${que.ispastdue==0}">
						δ����
				</c:if><c:if test="${que.ispastdue==1}">
						����
				</c:if></td>
					<td>
						<a href="<%=basePath%>teacher/EditQuestionSvl?qid=${que.qid}" class="button white">�޸�</a>
					    <a href="<%=basePath%>teacher/RemoveQuestionSvl?qid=${que.qid}" class="button red">ɾ��</a>
					</td>
			
			</tr>
		</c:forEach>

    </table>

 </body>
 
</html>
