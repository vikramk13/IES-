<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="stag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 60%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
</style>
</head>
<body style="background-color: #FFFFE0;">

<div style="margin-top:50px; margin-left:200px; height:50px;"><h2>User List</h2></div>
   <table style="margin-top: 0px;margin-left: 100px; ">
       <tr>
           <th>firstName</th>
           <th>lastName</th>
           <th>email</th>
           <th>password</th>
           <th>dateOfBirth</th>
           <th>gender</th>
           <th>ssnno</th>
           <th>phoneNo</th>
           <th>role</th>
           <th></th>
           <th></th>
       </tr>
       <c:forEach items="${User}" var="user">
       <tr>
          
           <td>${user.firstName}</td>
           <td>${user.lastName}</td>
           <td>${user.email}</td>
           <td>${user.password}</td>
           <td>${user.dateOfBirth}</td>
           <td>${user.gender}</td>
           <td>${user.ssnno}</td>
           <td>${user.phoneNo}</td>
            <td>${user.role}</td>
    
          <td><a href="/EditUser?id= ${user.id}">EDIT</a>
|<a href="/deleteContact?contact_id= ${user.id}" onclick="return deleteConfirm()">DELETE</a>
</td>
       </tr>
       </c:forEach>
 </table>
</body>
</html>