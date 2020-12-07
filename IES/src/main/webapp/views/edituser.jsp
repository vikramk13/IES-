<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

	<div align="center">
		<h3>Register</h3>

		<font color='green'>${succMsg}</font>
		<form:form action="/EditUser/{id}" method="POST"
			modelAttribute="userAcc">
			<table>		
			
             	<tr>
					<td>FirstName</td>
					<td><form:input path="firstName" /></td>
				</tr>


				<tr>
					<td>LastName</td>
					<td><form:input path="lastName" /></td>
				</tr>

				<tr>
					<td>Email</td>
					<td><form:input path="email" id="email" /> <font color="red"></font><span
						id="errMsg"></span></td>
				</tr>


				<tr>
					<td>Password</td>
					<td><form:input path="password" /></td>
				</tr>

				<tr>
					<td>DOB</td>
					<td><form:input path="dateOfBirth" /></td>
				</tr>


				<tr>
					<td>Gender</td>
					<td><form:radiobutton path="gender" value="M" />Male <form:radiobutton
							path="gender" value="F" />Female</td>

				</tr>


				<tr>
					<td>SsnNo</td>
					<td><form:input path="ssnno" /></td>
				</tr>
				
				<tr>
					<td>PhoneNumber</td>
					<td><form:input path="phoneNo"/></td>
				</tr>

                <tr>
					<td>role</td>
				<td><select name="role">
					<option value="CaseWorker">CaseWorker</option>
					<option value="Admin">Admin</option>
				</select>

                 <td>
                 </tr>

				<tr>
                    
					<td><input type="submit" value="Edit save" id="submitBtn" /></td>
				</tr>
				
			</table>


		</form:form>


	</div>


</body>
</html>