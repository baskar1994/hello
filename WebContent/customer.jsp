<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
#table{
 position: relative;
      top: 100px;
      left: 75px;
       font-family: agency FB;
       width: 600px;
       border: 3px solid  #85929E;
       border-radius: 3px;
       font-size: 14px;
}
    th{
      background: #85929E;
      color: white;
      width: 150px
      height: 20px;
    }
    
    td{
    background: #ECF0F1;
    color: #85929E;
    width: 150px;
    height: 20px;
    }
</style>
</head>
<body>
<div id="table">
   <table>
      <tr>
         <th>Customer id</th>
         <th> Name </th>
         <th> City </th>
         <th> State </th>
      </tr>
      <c:forEach items="${customerlist}" var="c">
        <tr>
            <td> ${c.cif}</td>
            <td>${c.phone }</td>
            <td>${c.cif}</td>
            <td>${c.cif}</td>
            <td><a href="DeleteServlet?cif=${c.cif }"> Delete</a></td>
            <td><a href="RedirectServlet?cif=${c.cif}">Update</a></td>
        </tr>
      </c:forEach>
   </table>
   </div>
</body>
</html>