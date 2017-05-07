<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>


<html>
<body>
	<br>
	<br>
	<center>
		<h1>Student Enquiry Window</h1>
		<html:form action="/staffEntrySubmit" method="post">
			<table style="font-size: 25">
				<tr>
					<td>Name</td>
					<td><html:text property="name" /></td>
					
					<td><html:errors property="name" /></td>
				</tr>

				<tr>
					<td>Email</td>
					<td><html:text property="email" /></td>
					<td><html:errors property="email" /></td>
				</tr>

				<tr>
					<td>Phone Number</td>
					<td><html:text property="phonenumber" /></td>
					<td><html:errors property="phonenumber" /></td>
				</tr>
				
				<tr>
					<td>Gender</td>
					<td><html:radio property="gender" value="Male">Male</html:radio>
						<html:radio property="gender" value="Female">Female</html:radio></td>
					<td><html:errors property="gender" /></td>
				</tr>
				
				
				<tr>
					<td>Date Of Birth</td>
					<td><html:text property="dob" /></td>
					<td><html:errors property="dob" /></td>
				</tr>
				
				<tr>
					<td>Date Of Joining</td>
					<td><html:text property="doj" /></td>
					<td><html:errors property="doj" /></td>
				</tr>
				
				<tr>
					<td>Address</td>
					<td><html:textarea property="address" /></td>
					<td><html:errors property="address" /></td>
				</tr>
				
				<tr>
					<td>Type</td>
					<td><html:select property="type">
						<html:option value="">Select Type</html:option>
						<html:option value="Teaching">Teaching</html:option>
						<html:option value="Non-Teaching">Non-Teaching</html:option>
					</html:select>
					<td><html:errors property="type" /></td>
				</tr>
				
				<tr>
					<td>Experties</td>
					<td><html:select property="experties">
						<html:option value="">Select Experties</html:option>
						<html:option value="Electrical Department">Electrical Department</html:option>
						<html:option value="Fitter Department">Fitter Department</html:option>
						<html:option value="Accountant">Accountant</html:option>
						<html:option value="Cashier">Cashier</html:option>
						<html:option value="Manager">Manager</html:option>
					</html:select>
					<td><html:errors property="experties" /></td>
				</tr>
				
				<tr>
					<td align="center" colspan="2"><html:submit value="Submit"></html:submit></td>
				</tr>

			</table>
		</html:form>
	</center>
</body>
</html>