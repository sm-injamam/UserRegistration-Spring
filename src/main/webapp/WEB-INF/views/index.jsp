<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Spring practice</title>
</head>
<body>
<h1>Hello ${name}</h1><!--  -->
<c:forEach items = "${names}" var="name">
	
	<c:if test="${name=='Y' }">
	<h2>${name}</h2>
	</c:if>
	
	<c:choose>
		<c:when test="${name == 'X' }">
		<p>hi, This is me</p>
		</c:when>
		<c:otherwise>
		<p> This all are my friends</p>
		
		</c:otherwise>
		
	</c:choose>
	
</c:forEach>
<hr>
		<a href="users/add">click here for registration</a>
		

</body>
</html>