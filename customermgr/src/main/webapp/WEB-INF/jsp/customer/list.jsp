<%--
  Created by IntelliJ IDEA.
  User: wuzejian
  Date: 2017/2/23
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="../../static/css/application.css" rel="stylesheet">
<script src="../../static/js/application.js"></script>
<script src="../../static/js/jquery-1.11.0.js"></script>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="myTag" tagdir="/WEB-INF/tags" %>
<script  type="text/javascript" src="<%=basePath%>static/js/jquery-2.1.1.js"> </script>
<table  width="100%" border="1" cellpadding="0" cellspacing="1" class="tableLine DoubleColorTable" >
	<%=basePath%>
	<tr>
		<td colspan="6">
			<a href="${pageContext.request.contextPath}/customer/toQuery">转到查询</a>
			&nbsp;&nbsp;
			<a href="${pageContext.request.contextPath}/customer/toAdd">转到新增</a>
		</td>
	</tr>
	<tr>
		<td colspan="6" align="center" class="tableLineBg">
			客户列表
		</td>
	</tr>
	<tr>
		<td>客户编号</td>
		<td>显示名称</td>
		<td>真实姓名</td>
		<td>客户密码</td>
		<td>注册时间</td>
		<td>操作</td>
	</tr>
	<c:forEach var="m" items="${page.result}">
	<tr>
		<td>${m.customerId}</td>
		<td>${m.showName}</td>
		<td>${m.trueName}</td>
		<td>${m.pwd}</td>
		<td>${m.registerTime}</td>
		<td>
			<a href="${pageContext.request.contextPath}/customer/toUpdate/${m.uuid}">修改</a> |
			<a href="${pageContext.request.contextPath}/customer/toDelete/${m.uuid}">删除</a>
		</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="6" align="center">
			<input type="hidden" id="queryJsonStr" value='${wm.queryJsonStr}'/>
			<myTag:page page="${page}"></myTag:page>
		</td>
	</tr>
</table>

</body>
</html>