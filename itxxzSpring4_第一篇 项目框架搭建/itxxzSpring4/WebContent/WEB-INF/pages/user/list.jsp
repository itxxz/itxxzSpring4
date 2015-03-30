<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="<c:url value='/styles/tablecloth/tablecloth.css' />" rel="stylesheet" type="text/css" media="screen" />

<title>用户列表</title>

<style type="text/css">
	table{
		margin: 0 auto;
	}
 body,.firstd{
	 background-color: rgb(209, 236, 237);
 }
.button {  
    margin: 0 2px;  
    text-align: center;  
    text-decoration: none;  
    font: 14px/100% Arial, Helvetica, sans-serif;  
    padding: .5em 2em .55em;  
}  
 
.white {
	color: #fff;
	background:#6932A4;
	border: solid 0px #b7b7b7;
}
</style>
</head>
<body>
<table>
	<thead>
		<th>id</th>
		<th>用户名</th>
		<th>邮箱</th>
		<th>描述</th>
	</thead>
	<tbody>
		<c:forEach items="${userList }" var="user">
			<tr>
				<td>${user.id }</td>
				<td>${user.userName }</td>
				<td>${user.email }</td>
				<td>${user.desc }</td>
			</tr>
		</c:forEach>
		
	</tbody>
</table>
		<script type="text/javascript" src="<c:url value='/styles/jquery/jquery-1.9.1.min.js' />" />
<script src="<c:url value='/styles/tablecloth/tablecloth.js' />" type="text/javascript" />
</body>
</html>