<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'studentinfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/my.css">

  </head>
  
  <body>
   <table class="altrowstable" width="100%" id="qwer" >   
    <thead>   
        <tr>   
              <th data-options="field:' '">����</th> 
            <th data-options="field:'sno'">ѧ��</th>   
            <th data-options="field:'classno'">�༶���</th>   
            <th data-options="field:'name'">����</th>   
             <th data-options="field:'sex'">�Ա�</th>   
            <th data-options="field:'age'">����</th>   
            <th data-options="field:'tel'">��ϵ��ʽ</th> 
             <th data-options="field:'email'">����</th>   
            <th data-options="field:'address'">��ַ</th>   
            <th data-options="field:'school'">ѧУ</th> 
             <th data-options="field:'class'">�꼶</th>   
           
        </tr>   
    </thead>   

<tbody > 
<tr>
<td><a href="EditstudentSvl?sno=${s.sno}" class="button white">�༭</a>&nbsp;&nbsp;<a href="RemoveStudentSvl?sno=${s.sno}"class="button white">ɾ��</a></td><td>${s.sno}</td><td>${s.classno}</td><td>${s.sname}</td><td>${s.sgender}</td><td>${s.sage}</td><td>${s.scontact}</td><td>${s.semail}</td><td>${s.saddress}</td><td>${s.sschool}</td><td>${s.sgrade}</td>
</tr> 
</tbody> 
</table>
<center>
<button  onclick="location.href='StudentinfoSvl'" class="button white">����</button>
</center>
</body>









</html>
