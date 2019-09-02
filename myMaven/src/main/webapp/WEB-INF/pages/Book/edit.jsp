<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${info.id==null}">
<form action="insert" method="post">
</c:if>
<c:if test="${info.id!=null}">
<form action="update" method="post">
<input type="hidden" name="id" value="${info.id}">
</c:if>
<input name="name" value="${info.name}">
<select name="sex">
<c:forEach items="${sexs}" var="r" varStatus="v">
	<c:if test="${info.sex!=v.index}">
		<option value="${v.index }">${r}</option>
	</c:if>
	<c:if test="${info.sex==v.index}">
		<option value="${v.index}" selected="selected">${r}</option>
	</c:if>
</c:forEach>
</select>
<select name="typeid">
<c:forEach items="${typelist}" var="r">
	<c:if test="${info.typeid!=r.id}">
		<option value="${r.id}">${r.name}</option>
	</c:if>
	<c:if test="${info.typeid==r.id}">
		<option value="${r.id}" selected="selected">${r.name}</option>
	</c:if>
</c:forEach>
</select>
<input type="submit">
</form>
</body>
</html>