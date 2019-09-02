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
<script type="text/javascript">
function del(id){
	if(confirm("删除？")){
		open("delete?id="+id,'_self');
	}
}
</script>
<form action="index" method="post">
<input name="name">
<button type="submit">查询</button>
<button type="button" onclick="window.open('add','_self')">新增</button>
</form>
<table>
<tr><td>名称</td><td>功能</td></tr>
<c:forEach items="${list}" var="row">
<tr><td>${row.name}</td>
<td>
<a href="javascript:del(${row.id})">删除</a>
<a href="edit?id=${row.id}">修改</a>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>