<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>�༶��Ϣ</title>
    
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
            <th data-options="field:'no'">�༶���</th>            
            <th data-options="field:'name'">�༶����</th>  
             <th data-options="field:'isgraduate'">�Ƿ��ҵ</th> 
           
        </tr>  
    </thead>   

<tbody > 
<tr>
<td><a href="EditClassSvl?classno=${c.classno}"class="button white">�༭</a></td><td>${c.classno}</td><td>${c.classname}</td><td>${c.isgraduate}</td>
</tr> 
</tbody> 
</table>
<center>
<button onclick="location.href='ClassinfoSvl'" class="button white">����</button>
</center>
</body>


</html>
