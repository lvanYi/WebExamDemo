<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
<link rel="stylesheet" type="text/css" href="css/my.css">

<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>


<body>
	<center>
		<table>
			<td>
				<form action="<%=basePath%>CheckstudentSvl" method="post">
					<input type="text" name="no" />
					<button type="submit" class="button white">��ѯѧ����Ϣ</button>
					<a href="<%=basePath%>AddstudentSvl" class="button white">����ѧ���˻�</a>
				</form>
			</td>
		</table>
	</center>
	<table class="altrowstable" width="100%" id="qwer">
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

		<tbody>
		</tbody>
	</table>
	<table id="tblTurnPage" cellSpacing="0" cellPadding="1" width="100%"
		border="0" style="font-family:arial;color:black;font-size:12px;">
		<tr>
			<td>�ܼ�¼����${RecordAllCount}</td>
			<td>��ҳ����${PageAllCount}</td>
			<td>��ǰҳ��${CurrentPageNo}</td>
			<td><a href="StudentinfoSvl?page=1">��ҳ|</a> <a
				href="StudentinfoSvl?page=${CurrentPageNo-1}">��ǰҳ|</a> <a
				href="StudentinfoSvl?page=${CurrentPageNo+1}">��ҳ��|</a> <a
				href="StudentinfoSvl?page=${PageAllCount}">ĩҳ</a></td>
			<form action="StudentinfoSvl" method="get">
				<td>��ת��:��<input type="text" size="3" name="page">ҳ <input
					type="submit" value="go" class="button white"></td>
			</form>
		</tr>
	</table>
</body>
<script type="text/javascript">

	$(function() {
		var url = "<%=basePath%>StudentinfoSvl";
		$.ajax({
			type : "post",
			url : url,
			dataType : "json",
			success : function(data) {
				appendHTML(data);
			}
		});
	});
	function appendHTML(data) {
		var html = "";
		$.each(data, function(i, s) {
			html += "<tr>";
			html += "<td><a href='EditstudentSvl?sno=" + s.sno + "' class='button white' >�༭</a><a href='RemoveStudentSvl?sno=" + s.sno + "' class='button red'>ɾ��</a></td>";
			html += "<td>" + s.sno + "</td>";
			html += "<td>" + s.classno + "</td>";
			html += "<td>" + s.sname + "</td>";
			html += "<td>" + s.sgender + "</td>";
			html += "<td>" + s.sage + "</td>";
			html += "<td>" + s.scontact + "</td>";
			html += "<td>" + s.semail + "</td>";
			html += "<td>" + s.saddress + "</td>";
			html += "<td>" + s.sschool + "</td>";
			html += "<td>" + s.sgrade + "</td>";
			html += "</tr>";
		});
		$("#qwer").append(html);

	}
</script>
</html>
