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
	<h2>添加员工</h2>
	<div>
		<s:if test="msg==1">
			<p style="color:green">添加员工成功!</p>
		</s:if>
		<s:elseif test="msg==-1">
			<p style="color:red">添加员工失败!</p>
		</s:elseif>
	</div>
	<s:form method="post" action="empAction_addEmp">
		员工姓名:<s:textfield name="emp.ename"/><br/>
		员工年龄:<s:textfield name="emp.eage"/><br/>
		员工性别:<s:radio list="{'男','女'}" value="%{'男'}" name="emp.esex"/><br/>
		加入部门:<s:select list="#request.deptList" name="emp.dept.dno" listKey="dno" listValue="dname" headerKey="" headerValue="请选择部门"/><br/>
		<s:submit value="添加员工"/>
	</s:form>
	<a href="index.jsp">主页</a>
</body>
</html>







