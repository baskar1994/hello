<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Customer</title>
<script>
	function display()
	{
		window.location="RegisterServlet";
	}
</script>
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
<%@include file="footer.jsp" %>
<input type="button" value=" view customer"onclick="display()">
<form action="RegisterServlet" method="post">
<table >
<tr>
<td><input type="text" name="cif" placeholder="Customer IF"></td>
<td><select name="title">
  <option value="Mr">Mr</option>
  <option value="Ms">Ms</option>
  <option value="Mrs">Mrs</option>
</select>
<input type="text" name="fname" placeholder="First Name"></td>
<td><input type="text" name="lname" placeholder="Last Name"></td>
</tr>
<tr>
<td><input type="text" name="date" placeholder="eg: 25-JAN-1990"></td>
<td><input type="text" name="email" placeholder="Email Address"></td>
<td><input type="text" name="phone" placeholder="Phone Number"></td>
</tr>
<tr>
<td></td>
<td colspan="2"><input type="radio" name="gender" value="M" checked> Male
  <input type="radio" name="gender" value="F"> Female
  </td>
</tr>
<tr>
<td></td>
<td>Communication Address</td>
</tr>
<tr>
<td><input type="text" name="add1" placeholder="Address Line 1"></td>
<td>
 
 <input type="text" name="add2" placeholder="Address Line 2"></td>
<td> <input type="text" name="add3" placeholder="Address Line 3"></td>
</tr>
<tr>
<td><input type="text" name="city" placeholder="City"></td>
<td> <input type="text" name="state" placeholder="State"></td>
<td> <input type="text" name="zipcode" placeholder="Zipcode"></td>
</tr>
<tr>
<td> <select name="idType">
 <option value="">ID proof type</option>
  <option value="1">Pan Card</option>
  <option value="2">Aaadhar Card</option>
  <option value="3">Driving License</option>
</select></td>
<td><input type="text" name="idNo" placeholder="ID proof number"></td>
</tr>
<tr>
<td> <select name="addType">
 <option value="">Address proof Type</option>
  <option value="1">Pan Card</option>
  <option value="2">Aaadhar Card</option>
  <option value="3">Driving License</option>
</select></td>
<td><input type="text" name="addNo" placeholder="Address proof number"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="register"></td>
</tr>
</table>

</form>

</body>
</html>