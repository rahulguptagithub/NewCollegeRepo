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
		<html:form action="/SubmitStudentEnquiry.do?method=addStudentEnquiry">
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
					<td>Stream</td>
					<%-- <td><html:text property="stream" /></td> --%>
					<td><html:select property="stream">
						<html:option value="">Select Trade</html:option>
						<html:option value="Electrical">Electrical</html:option>
						<html:option value="Fitter">Fitter</html:option>
					</html:select>
					<td><html:errors property="stream" /></td>
				</tr>

				<tr>
					<td>Message</td>
					<td><html:textarea property="message" /></td>
					<td><html:errors property="message" /></td>
				</tr>

				<tr>
					<td align="center" colspan="2"><html:submit value="Submit"></html:submit></td>
				</tr>

			</table>
		</html:form>
	</center>
</body>
</html>