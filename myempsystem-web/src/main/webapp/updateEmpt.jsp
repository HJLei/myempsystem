<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>修改员工</h2>
	<s:form method="post" action="empAction_doUpdateEmp">
		<s:hidden name="emp.eno" />
			员工姓名:<s:textfield name="emp.ename" />
		<br />
		员工年龄:<s:textfield name="emp.eage" />
		<br />
		员工性别:<s:radio list="{'男','女'}" value="%{'男'}" name="emp.esex" />
		<br />
		选择部门:<s:select name="emp.dept.dno" list="#request.deptList" listKey="dno" listValue="dname" headerKey="" headerValue="请选择部门"/><br/>
		<s:submit value="修改员工" />

	</s:form>
	<a href="">员工信息列表</a>
</body>
</html>