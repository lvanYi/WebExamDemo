<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<font color="#777777"><strong>����дѧ�����ϣ�</strong></font>
<form action="<%=basePath%>AddstudentSvl" method="post" class="definewidth m20" >
<table  class="altrowstable" width="100%">
    <tr>
        <td>ѧ�ţ�</td><td><input type="text" name="sno" onblur="checkAccount()" id="sname" /><a id="a"></a></td>
        <td>�༶</td><td>
        <select name="classno">
					<c:forEach items="${tclass}" var="bt">
						<option value="${bt.classno}">${bt.classno}</option>
					</c:forEach>
				</select>
				</td>
	     <td>������</td><td><input type="text" name="sname"/></td>
	</tr>
 
        
       <tr>
      <td>���䣺</td><td><input type="text" name="sage"/></td>
	   <td>ѧУ��</td><td><input type="text" name="sschool"/></td>
        <td>�꼶��</td><td><input type="text" name="sgrade"/></td>
        </tr>
      <tr>
          <td>�Ա�</td><td><label>��&nbsp;<input type="radio" name="sgender" value="1"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Ů&nbsp;<input type="radio" name="sgender" value="2"/></label></td>
        <td>��ϵ��ʽ��</td><td><input type="text" name="scontact"/></td>
	   <td>�������䣺</td><td><input type="text" name="semail"/></td>
       </tr>
       <tr>
        <td>��ַ��</td><td><input type="text" name="saddress"/></td><td class="tableleft">���룺</td><td><input type="password" name="pwd"/></td>
    
<td><button type="submit" class="button white">�ύ</button>    <button type="reset" class="button white"/>����</button> </td>   <td> <button type="button" class="button white" onclick="location.href='StudentinfoSvl'" />����</button></td>
	</tr>
</table>


</form>
 </body>
 <script type="text/javascript">

   function checkAccount(){
      var sno = document.getElementById("sname").value;
      var url = "<%=basePath%>CheckaccountSvl?sno=" + sno;
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

	    	if( "�˺��Ѿ���ע��"==text){  
	    	    aNode.style.color = "red";
	    	}else{
	    	    aNode.style.color = "green";
	    	}
	    	 aNode.innerHTML = text;
	    	
	    	 
	    }
	}
</script>
</html>
