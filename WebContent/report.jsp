<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.entity.Customer" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- Customer customer=(Customer) request.getAttribute("customer"); --%>
<%--
out.println(customer.getDateOfBirth());
--%>
<%@include file="footer.jsp" %>
<table>
	<tr>
	<td>Customer ID</td>
	<td>${customer.cif}</td>
	</tr>
	<tr>
	<td>Customer Title</td>
	<td>${customer.title }</td>
	</tr>
	<tr>
	<td>First Name</td>
	<td>${customer.firstName }</td>
	</tr>
	<tr>
	<td>Last Name</td>
	<td>${customer.lastName }</td>
	</tr>
	<tr>
	<td>Date of Birth</td>
	<td>${customer.dateOfBirth}</td>
	</tr>
	<tr>
	<td>Email</td>
	<td>${customer.email }</td>
	</tr>
	<tr>
	<td>Phone Number</td>
	<td>${customer.phone }</td>
	</tr>
	<tr>
	<td>Gender</td>
	<td>${customer.gender }</td>
	</tr>
	<tr>
	<td>Address</td>
	<td>${ customer.address}</td>
	</tr>
	<tr>
	<td>City</td>
	<td>${customer.city }</td>
	</tr>
	<tr>
	<td>State</td>
	<td>${customer.state }</td>
	</tr>
	<tr>
	<td>Zipcode</td>
	<td>${customer.zipcode }</td>
	</tr>
	<tr>
	<td>Id proof type</td>
	<td>${customer.idType }</td>
	</tr>
	<tr>
	<td>Address Proof type</td>
	<td>${customer.addressType }</td>
	</tr>
	<tr>
	<td>Id proof no</td>
	<td>${customer.idNo }</td>
	</tr>
	<tr>
	<td>Address proof no</td>
	<td>${customer.addressNo }</td>
	</tr>
	
	

	
</table>
</body>
</html>