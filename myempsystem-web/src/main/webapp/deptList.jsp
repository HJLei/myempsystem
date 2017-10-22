<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>部门信息列表</h2>
	
	<table border="1" width="350">
	<tr>
	<td>编号</td><td>部门名称</td>
	
	</tr>
	<s:iterator value="#request.deptList" var="dept" status="ids">
	<tr>
	<td>${ids.count }</td><td>${dept.dname}</td>
	</tr>
	</s:iterator>
	</table>
	<a href="index.jsp">返回首页</a>
</body>
</html>