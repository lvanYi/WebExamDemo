<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>�޸�ѧ������</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body> 
  
  <form action="<%=basePath%>student/EditPwdSvl" method="post" class="definewidth m20" >
  <center>
  <table>
  <tr>
  <td>�����룺</td><td><input type="text" name="password" onblur="checkAccount()" id="sname" /><a id="a"></a></td>
    </tr>
    <tr>
     <td>�����룺</td><td><input type="text" name="newpwd"  id="newname" /><a id="b"></a></td>
     </tr>
     <tr>
     <td>ȷ�����룺</td><td><input type="text" name="newpwdAgain"  id="newname" /><a id="b"></a></td>
      </tr>
      <tr>
      <td>  <button type="submit" class="button white">ȷ��</button> </td>
      <td>
      <button type="button" onclick="location.href='student/PersonInfoSvl'" class="button white">ȡ��</button>
      </td>
      </tr>
      </table>
      </center>
   </form>
  </body>
  
   <script type="text/javascript">

   function checkAccount(){
      var password= document.getElementById("sname").value;
      var url = "<%=basePath%>student/CheckPwdSvl?password=" + password;
      createXmlHttp(url);
   }


    var xmlhttp;
	function createXmlHttp(url) {
	    
		if (window.XMLHttpRequest) {
			xmlhttp = new XMLHttpRequest();
		}else{
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.onreadystatechange = getReturnValue;   //ע��ص������������ؽ��
		xmlhttp.open("GET",url,true);
        xmlhttp.send(null);
	}
	
	
	function getReturnValue(){
		if (xmlhttp.readyState==4 && xmlhttp.status==200){
	    	//д��Ҫ����߼�
	    	
	    	var text = xmlhttp.responseText;
	    	var aNode = document.getElementById("a");

	    	if( "�������"==text){  
	    	    aNode.style.color = "red";
	    	}else{
	    	    aNode.style.color = "green";
	    	}
	    	 aNode.innerHTML = text;
	    	
	    	 
	    }
	}
</script>
</html>
