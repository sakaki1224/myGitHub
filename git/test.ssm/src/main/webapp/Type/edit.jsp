<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


		<c:if test="${info==null}">
			<form action="insert.action" method="post">
		</c:if>
		<c:if test="${info!=null}">
			<form action="update.action" method="post">
			<input name="id" type="hidden" value="${info.id}">
		</c:if>
		
		<input name="name" value="${info.name}">  <input type="submit">
	</form>




</body>
</html>