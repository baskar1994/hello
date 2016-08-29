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
<div ng-app="mymod" ng-controller="mycontroller">
Select a customer:
<select ng-model="cid" ng-change="getobj($event)">
<option  ng-repeat="x in k"  value={{x.cid}}>({{x.cid}}){{x.fname}}</option>
</select>

<form action="UpdateServlet" method="post">
<table >
<tr>
<td><input type="text" name="cif" value={{c.cif}} ></td>
<td><select name="title" >
  <option  value="Mr" >Mr</option>
  <option value="Ms">Ms</option>
  <option   value="Mrs">Mrs</option>
</select>
<input type="text" value={{c.fname}} name="fname" placeholder="First Name"></td>
<td><input type="text" value={{c.lname}} name="lname" placeholder="Last Name"></td>
</tr>
<tr>
<td><input type="text" value={{c.dob}} name="date" placeholder="eg: 25-JAN-1990"></td>
<td><input type="text" value={{c.email}} name="email" placeholder="Email Address"></td>
<td><input type="text" value={{c.phone}} name="phone" placeholder="Phone Number"></td>
</tr>
<tr>
<td></td>
<td colspan="2"><input type="radio" name="gender" value="M" > Male
  <input type="radio" name="gender" value="F" > Female
  </td>
</tr>
<tr>
<td></td>
<td>Communication Address</td>
</tr>
<tr>
<td><input type="text" name="add1" value={{c.address}} placeholder="Address Line 1"></td>
<td>
 
 <input type="text" name="add2" placeholder="Address Line 2"></td>
<td> <input type="text" name="add3" placeholder="Address Line 3"></td>
</tr>
<tr>
<td><input type="text" name="city" value={{c.city}}  placeholder="City"></td>
<td> <input type="text" name="state" value={{c.state}} placeholder="State"></td>
<td> <input type="text" name="zipcode" value={{c.zipcode}} placeholder="Zipcode"></td>
</tr>
<tr>
<td> <select name="idType" >
 <option   value="">ID proof type</option>
  <option value="1">Pan Card</option>
  <option value="2">Aaadhar Card</option>
  <option value="3">Driving License</option>
</select></td>
<td><input type="text" value={{c.idno}} name="idNo" placeholder="ID proof number"></td>
</tr>
<tr>
<td> <select name="addType">
 <option value="">Address proof Type</option>
  <option value="1">Pan Card</option>
  <option value="2">Aaadhar Card</option>
  <option value="3">Driving License</option>
</select></td>
<td><input type="text" value={{c.addressno}} name="addNo" placeholder="Address proof number"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="register"></td>
</tr>
</table>

</form>
</div>
<script src="script/angular.js"></script>
<script src="script/module.js"></script>
</body>
</html>