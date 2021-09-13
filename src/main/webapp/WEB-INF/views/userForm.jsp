<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Name Form</title>
</head>
<body>
<h1 align ="center">Please register here</h1>

 <form:form action="${pageContext.request.contextPath}/users/add" modelAttribute="user">
   
   <div align="center">
         Name: <form:input path="name" /><br></br>
         Age: <form:input path="age" /><br><br/> 
         Mobile: <form:input path="mobNum" /><br><br/>
         DOB: <form:input type="date" path="dob" /><br><br/>
         Email: <form:input path="email" /><br><br/> 
         Password: <form:password path="password" /><br><br/> 
         District:<form:select path="district" items="${districtList}"><!-- districtList create on RegRormController class -->
         
         <!--  or-->
         	<%-- <form:option value="Dhaka" label="Dhaka"> </form:option>
         	<form:option value="Gazipur" label="Gazipur"> </form:option> 
         	<form:option value="Rajshahi" label="Rajshahi"> </form:option> 
         	<form:option value="Barishal" label="Barishal"> </form:option> 
         	<form:option value="Noakhali" label="Noakhali"> </form:option> 
         	<form:option value="Cox Bazar" label="Coxbazar"> </form:option> 
         	<form:option value="Rangamati" label="Rangamati"> </form:option>   
         	 --%>
         	</form:select><br><br/> 
         Salutation:
         			Mr:<form:checkbox path="salutation" value= "Mr"/>
         			Mrs:<form:checkbox path="salutation" value= "Mrs"/>
         			Dr:<form:checkbox path="salutation" value= "Dr"/>
         			Engr:<form:checkbox path="salutation" value= "Engr"/>	
             <br><br/>  
             
          Gender:
          	Male<form:radiobutton path="gender" value="male"/>
          	Female<form:radiobutton path="gender" value="female"/>
        <br><br>  
        <%-- Last name: <form:input path="lastName" />  --%> 
          
        <input type="submit" value="Submit" />
        
        </div>      
    </form:form>  
</body>
</html>