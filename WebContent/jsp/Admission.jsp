<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:form action="/admissionSubmit" method="post"
	enctype="multipart/form-data">

	<div class="container">
		<table>
			<caption>
				<h1>Student Admission Window</h1>
			</caption>
			<tr>
				<td colspan="8"><hr color="#ff9933"></td>
			</tr>
			<tr>
				<td colspan="8" align="center">Basic Information</td>
			</tr>
			<tr>
				<td colspan="8"><hr color="green"></td>
			</tr>
			<tr>
				<td style="width: 100%;" colspan="8"><jsp:include
						page="admission/studentBasicInfo.jsp"></jsp:include></td>
			</tr>
			<tr>
				<td colspan="8"><hr color="green"></td>
			</tr>
			<tr>
				<td style="width: 100%;" colspan="8"><jsp:include
						page="admission/studentAddressInfo.jsp"></jsp:include></td>
			</tr>
			<tr>
				<td colspan="8"><hr color="green"></td>
			</tr>
			<tr>
				<td colspan="8" align="center">Academic Qualifications</td>
			</tr>
			<tr>
				<td colspan="8"><hr color="green"></td>
			</tr>
			<tr>
				<td style="width: 100%;" colspan="8"><jsp:include
						page="admission/studentAcademicInfo.jsp"></jsp:include></td>
			</tr>
			<tr>
				<td colspan="8"><hr color="green"></td>
			</tr>
			<tr>
				<td colspan="4" align="center"><input type="button"
					value="Submit" onclick="submitAdmissionForm();"></td>
			</tr>
		</table>
	</div>
</html:form>