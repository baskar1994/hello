<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.entity.Customer" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table{
border: 1px solid black;
padding: 25px;
position:fixed;
margin-top: 200px;
margin-left: 250px;
}
</style>
</head>
<body>
<%Customer c=(Customer)request.getAttribute("c"); %>
<form action="UpdateServlet" method="post">
<table >
<tr>
<td><input type="text" name="cif" value="${c.cif}" ></td>
<td><select name="title" >
  <option <%if(c.getTitle().equals("Mr")) out.print("selected=\"selected\""); %> value="Mr" >Mr</option>
  <option <%if(c.getTitle().equals("Ms")) out.print("selected=\"selected\""); %> value="Ms">Ms</option>
  <option <%if(c.getTitle().equals("Mrs")) out.print("selected=\"selected\""); %> value="Mrs">Mrs</option>
</select>
<input type="text" value="${ c.firstName}" name="fname" placeholder="First Name"></td>
<td><input type="text" value="${c.lastName }" name="lname" placeholder="Last Name"></td>
</tr>
<tr>
<td><input type="text" value="${c.dateOfBirth }" name="date" placeholder="eg: 25-JAN-1990"></td>
<td><input type="text" value="${ c.email}" name="email" placeholder="Email Address"></td>
<td><input type="text" value="${c.phone }" name="phone" placeholder="Phone Number"></td>
</tr>
<tr>
<td></td>
<td colspan="2"><input type="radio" name="gender" value="M" <%if(c.getGender().equals("M")) out.print("checked=\"chceked\""); %>)> Male
  <input type="radio" name="gender" value="F" <%if(c.getGender().equals("F")) out.print("checked=\"checked\""); %>)> Female
  </td>
</tr>
<tr>
<td></td>
<td>Communication Address</td>
</tr>
<tr>
<td><input type="text" name="add1" value="${ c.address}"placeholder="Address Line 1"></td>
<td>
 
 <input type="text" name="add2" placeholder="Address Line 2"></td>
<td> <input type="text" name="add3" placeholder="Address Line 3"></td>
</tr>
<tr>
<td><input type="text" name="city" value="${ c.city }" c.city placeholder="City"></td>
<td> <input type="text" name="state" value="${c.state }" placeholder="State"></td>
<td> <input type="text" name="zipcode" value="${c.zipcode }" placeholder="Zipcode"></td>
</tr>
<tr>
<td> <select name="idType" ">
 <option  > value="">ID proof type</option>
  <option <%if(c.getIdType()==1) out.print("selected=\"selected\"");%>value="1">Pan Card</option>
  <option <%if(c.getIdType()==2) out.print("selected=\"selected\"");%>value="2">Aaadhar Card</option>
  <option <%if(c.getIdType()==3) out.print("selected=\"selected\"");%>value="3">Driving License</option>
</select></td>
<td><input type="text" value="${ c.idNo }" name="idNo" placeholder="ID proof number"></td>
</tr>
<tr>
<td> <select name="addType">
 <option value="">Address proof Type</option>
  <option <%if(c.getAddressType()==1) out.print("selected=\"selected\"");%>value="1">Pan Card</option>
  <option <%if(c.getAddressType()==2) out.print("selected=\"selected\"");%>value="2">Aaadhar Card</option>
  <option <%if(c.getAddressType()==3) out.print("selected=\"selected\"");%>value="3">Driving License</option>
</select></td>
<td><input type="text" value="${c.addressNo}" name="addNo" placeholder="Address proof number"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="register"></td>
</tr>
</table>

</form>

</body>
</html>