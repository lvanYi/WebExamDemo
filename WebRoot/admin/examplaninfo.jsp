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
 <form action="<%=basePath%>CheckexamplanSvl" method="post">
 <table>
 <tr>
  <td>
 </td>
 <td>
 <input type="text" name="examid" value="�����뿼�Ա��"></input>
 <button type="submit" class="button white" >��ѯ</button>
  </td>
  </tr>
  </table>
  </form>
  </center>
 
<table class="altrowstable" width="100%" id="qwer" >   
    <thead>   
        <tr>   
         <th>�Ծ���</th> 
         <th>���Ա��</th>
         <th>��������</th>  
         <th>��������</th>  
         <th>����ʱ��</th> 
          <th>�Ƿ��ľ�</th> 
          <th>����״̬</th>     
           <th>����</th>
        </tr>   
    </thead>   
   
			<tr>

				<td>${e.pid}</td>
				<td>${e.examid}</td>
				<td>${e.examtitle}</td>		
				 <td><c:if test="${e.examtype==1}">
					����
				</c:if> <c:if test="${e.examtype==2}">
					�վ�
				</c:if></td>	
				<td>${e.stime}��${e.etime}</td>
                  <td><c:if test="${e.ischeck==1}">
						����
				</c:if> <c:if test="${e.ischeck==2}">
						δ��
				</c:if></td>
               <td><c:if test="${e.examstate==1}">
						�ѿ�
				</c:if> <c:if test="${e.examstate==2}">
						δ��
				</c:if></td>
					<td><a href="<%=basePath%>EditplanSvl?examid=${e.examid}" class="button white">�༭</a>
					    <a href="<%=basePath%>RemoveplanSvl?examid=${e.examid}" class="button red">ɾ��</a>
					
					</td>
			
			</tr>
	

    </table>

 </body>
 
</html>
