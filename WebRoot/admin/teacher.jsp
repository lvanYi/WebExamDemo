<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>��ʦ��Ϣ����</title>

 
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
<script type="text/javascript" src="<%=basePath%>js/jquery.min.js"></script>

	 <link rel="stylesheet" type="text/css" href="css/my.css">

	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>

 <body>
 <center>
 <table>
 <tr>
  <td>
   <form action="<%=basePath%>CheckTeacherSvl" method="post">
  <input type="text" name="no"  /><button  type="submit" class="button white" >��ѯ��ʦ��Ϣ</button>
    <a href="<%=basePath%>AddTeacherSvl" class="button white">���ӽ�ʦ�˻�</a>  
    </form>
  </td>
  </table>
  </center>
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

<tbody id="qwe">  



</tbody> 
    </table>
 </body> 
 <script type="text/javascript">
    $(function  (){
        var url = "<%=basePath%>TeacherinfoSvl";
        $.ajax({
            type: "POST",
            url: url,
            dataType: "json",
            success: function(data){
 
        appendHTML(data);
        },
        
       });
    });
       function appendHTML(data){
  
       var html="";     
       $.each(data, function(i,t){
    html+="<tr>";
       html += "<td><a href='EditTeacherSvl?tno="+t.tno+"'class='button white'>�༭</a>&nbsp;&nbsp;<a href='RemoveTeacherSvl?tno="+t.tno+"'class='button red'>ɾ��</a></td>";
       html += "<td>" + t.tno + "</td>";
			html += "<td>" + t.tname + "</td>";
			html += "<td>" + t.tgender + "</td>";
			html += "<td>" + t.tcontact + "</td>";
			html += "<td>" + t.temail + "</td>";
			html += "<td>" + t.ison + "</td>";		
			 html+="</tr>";
      });  
      $("#qwer").append(html);
  
    }
    
    
</script>
</html>
