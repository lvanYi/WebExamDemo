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
            <th data-options="field:'no'">��ʦ���</th>            
            <th data-options="field:'name'">����</th>   
             <th data-options="field:'gender'">�Ա�</th>     
            <th data-options="field:'contact'">��ϵ��ʽ</th> 
             <th data-options="field:'email'">����</th> 
             <th data-options="field:'ison'">�Ƿ���ְ</th> 
           
        </tr> 
    </thead>   

<tbody > 
<tr>
<td><a href="EditTeacherSvl?sno=${t.tno}"class="button white">�༭</a>&nbsp;&nbsp;<a href="RemoveTeacherSvl?sno=${t.tno}"class="button white">ɾ��</a></td><td>${t.tno}</td><td>${t.tname}</td><td>${t.tgender}</td><td>${t.tcontact}</td><td>${t.temail}</td><td>${t.ison}</td>
</tr> 
</tbody> 
</table>
<center>
<button onclick="location.href='TeacherinfoSvl'" class="button white">����</button>
</center>
</body>


</html>
