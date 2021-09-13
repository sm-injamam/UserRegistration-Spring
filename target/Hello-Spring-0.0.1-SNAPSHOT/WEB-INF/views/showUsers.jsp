<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Spring practice</title>
</head>
<body>
<%-- <h1>Hello ${name}</h1> --%><!--  -->
<c:forEach items = "${users}" var="user">
	
	<h4>Your registration is successfully done</h4>
	<h5>Name:  ${user.name}</h5>
	<h5>Age:  ${user.age}</h5>
	<h5>Mobile:  ${user.mobNum}</h5>
	<h5>DOB:  ${user.dob}</h5>
	<h5>Email:  ${user.email}</h5>
	<h5>Pass:  ${user.password}</h5>
	<h5>District:  ${user.district}</h5>
	<h5>Salutation:  
			<c:forEach var="temp" items=" ${user.salutation}">
			${temp}
			</c:forEach></h5>
			
	<h5>Gender:  ${user.gender}</h5>
	<h4>=================================</h4>
	
	
</c:forEach>

</body>
</html>