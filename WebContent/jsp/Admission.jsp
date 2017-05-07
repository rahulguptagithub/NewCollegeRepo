<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%> --%>
<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Admission Form</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- http://jqueryui.com/datepicker/ -->
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(function() {
		$("#datepicker").datepicker({
			dateFormat : "dd-mm-yy"
		});
		$("#datepicker1").datepicker({
			dateFormat : "dd-mm-yy"
		});
	});
</script>

<style>
input[type=text],select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=submit] {
	width: 100%;
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #45a049;
}

div {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}
</style>


<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		alert("Please enter username.");
		$('#permanentAddId').onblur(function() {
			alert("heloooo");
			$("#pCoId").hide();
			/* $("pVillageId").hide();
			$("pPoId").hide();
			$("pPsId").hide();
			$("pDistrictId").hide();
			$("pPhoneId").hide(); */
			//pCoId pVillageId pPoId pPsId pDistrictId pPhoneId
		});
	});
</script>
</head>
<body>
 --%>

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
					<td><label for="fname">Preferred Trade</label></td>
					<td><html:radio property="trade" value="fitter">Fitter</html:radio></td>
					<td><html:radio property="trade" value="electrical">Electrical</html:radio></td>
					<td><label for="fname">Form No.</label></td>
					<td>
					<td><html:text property="formNo"></html:text></td>
				</tr>

				<tr>
					<td><label for="fname">Select Session</label></td>
					<td><html:select property="session">
							<html:option value="Select"></html:option>
							<html:option value="2017-2019"></html:option>
							<html:option value="2019-2021"></html:option>
							<html:option value="2021-2023"></html:option>
							<html:option value="2023-2025"></html:option>
							<html:option value="2025-2027"></html:option>
							<html:option value="2027-2029"></html:option>
							<html:option value="2029-2031"></html:option>
							<html:option value="2031-2033"></html:option>
							<html:option value="2033-2035"></html:option>
							<html:option value="2035-2037"></html:option>
							<html:option value="2037-2039"></html:option>
							<html:option value="2039-2041"></html:option>
							<html:option value="2041-2043"></html:option>
							<html:option value="2043-2045"></html:option>
						</html:select></td>

					<td align="center"><label for="fname">Select Gender</label></td>
					<td><html:radio property="gender" value="Male">Male</html:radio>
						<html:radio property="gender" value="Female">Female</html:radio></td>
				</tr>



				<tr>
					<td><label for="fname">Student Name</label></td>
					<td colspan="2"><html:text property="student_name"></html:text></td>
				</tr>

				<tr>
					<td><label for="fname">Father's/Guardian Name(Please
							Specify)</label></td>
					<td><html:radio property="guardian_type" value="father">Father</html:radio></td>
					<td><html:radio property="guardian_type" value="guardian">Guardian</html:radio></td>

				</tr>

				<tr>
					<td><label for="fname">Father's/Guardian Name</label></td>
					<td colspan="2"><html:text property="guardian_name"></html:text></td>
				</tr>

				<tr>
					<td><label for="fname">Occupation of Guardian</label></td>
					<td><html:select property="occupation">
							<html:option value="Select"></html:option>
							<html:option value="Farmer"></html:option>
							<html:option value="Business"></html:option>
							<html:option value="Service"></html:option>
							<html:option value="Student"></html:option>
							<html:option value="Self Employed"></html:option>
						</html:select></td>
					<td align="right"><label for="fname">Upload Student
							Image</label></td>
					<td colspan="2"><html:file property="photo"></html:file></td>

				</tr>

				<tr>
					<td><label for="fname">Candidate Date Of
							Birth(DD/MM/YYYY)</label></td>
					<td><html:text property="dob" styleId="datepicker"></html:text></td>
					<td align="center"><label for="fname">Category</label></td>
					<td colspan="2"><html:radio property="category" value="Gen">
							<label for="fname">GEN</label>
						</html:radio> <html:radio property="category" value="OBC">
							<label for="fname">OBC</label>
						</html:radio> <html:radio property="category" value="SC">
							<label for="fname">SC</label>
						</html:radio> <html:radio property="category" value="ST">
							<label for="fname">ST</label>
						</html:radio></td>

				</tr>
				<tr>
					<td colspan="8"><hr color="#ff9933"></td>
				</tr>
				<tr>
					<td colspan="8" align="center"><label for="fname">Correspondence
							Address</label></td>
				</tr>
				<tr>
					<td colspan="8"><hr color="green"></td>
				</tr>

				<tr>
					<td><label for="fname">Name/CO</label></td>
					<td><html:text property="co"></html:text></td>
					<td><label for="fname">Village</label></td>
					<td><html:text property="village"></html:text></td>
				</tr>



				<tr>
					<td><label for="fname">Post Office</label></td>
					<td><html:text property="po"></html:text></td>
					<td><label for="fname">Police Station</label></td>
					<td><html:text property="ps"></html:text></td>
				</tr>

				<tr>
					<td><label for="fname">District</label></td>
					<td><html:text property="district"></html:text></td>
					<td><label for="fname">Phone</label></td>
					<td><html:text property="phone"></html:text></td>
				</tr>

				<tr>
					<td colspan="8"><hr color="#ff9933"></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><label for="fname">Permanent
							Address</label></td>
					<td align="center"><html:checkbox property="permanentAdd"
							value="same" styleId="permanentAddId"></html:checkbox></td>
				</tr>

				<tr>
					<td colspan="8"><hr color="green"></td>
				</tr>

				<tr>
					<td><label for="fname">Name/CO</label></td>
					<td><html:text property="pCo" styleId="pCoId"></html:text></td>
					<td><label for="fname">Village</label></td>
					<td><html:text property="pVillage" styleId="pVillageId"></html:text></td>
				</tr>

				<tr>
					<td><label for="fname">Post Office</label></td>
					<td><html:text property="pPo" styleId="pPoId"></html:text></td>
					<td><label for="fname">Police Station</label></td>
					<td><html:text property="pPs" styleId="pPsId"></html:text></td>
				</tr>

				<tr>
					<td><label for="fname">District</label></td>
					<td><html:text property="pDistrict" styleId="pDistrictId"></html:text></td>
					<td><label for="fname">Phone</label></td>
					<td><html:text property="pPhone" styleId="pPhoneId"></html:text></td>
				</tr>

				<tr>
					<td colspan="8"><hr color="#ff9933"></td>
				</tr>
				<tr>
					<td colspan="8" align="center"><label for="fname">Academic
							Qualifications</label></td>
				</tr>
				<tr>
					<td colspan="8"><hr color="green"></td>
				</tr>

				<tr>
					<td><label for="fname">Exam Passed</label></td>
					<td><label for="fname">Passing Year</label></td>
					<td><label for="fname">School/College Name</label></td>
					<td><label for="fname">Board</label></td>
					<td><label for="fname">Marks(%)</label></td>
				</tr>
				<tr>
					<td><html:select property="examName1">
							<html:option value="Select"></html:option>
							<html:option value="Matric"></html:option>
							<html:option value="I.A/I.sc/10+2"></html:option>
							<html:option value="Diploma"></html:option>
							<html:option value="Graduation"></html:option>
							<html:option value="Master"></html:option>
						</html:select></td>
					<td><html:text property="passedYear1"></html:text></td>
					<td><html:text property="instituteName1"></html:text></td>
					<td><html:text property="board1"></html:text></td>
					<td><html:text property="marks1"></html:text></td>
				</tr>
				<tr>
				<tr>
					<td><html:select property="examName2">
							<html:option value="Select"></html:option>
							<html:option value="Matric"></html:option>
							<html:option value="I.A/I.sc/10+2"></html:option>
							<html:option value="Diploma"></html:option>
							<html:option value="Graduation"></html:option>
							<html:option value="Master"></html:option>
						</html:select></td>
					<td><html:text property="passedYear2"></html:text></td>
					<td><html:text property="instituteName2"></html:text></td>
					<td><html:text property="board2"></html:text></td>
					<td><html:text property="marks2"></html:text></td>
				</tr>

				<tr>
					<td><html:select property="examName3">
							<html:option value="Select"></html:option>
							<html:option value="Matric"></html:option>
							<html:option value="I.A/I.sc/10+2"></html:option>
							<html:option value="Diploma"></html:option>
							<html:option value="Graduation"></html:option>
							<html:option value="Master"></html:option>
						</html:select></td>
					<td><html:text property="passedYear3"></html:text></td>
					<td><html:text property="instituteName3"></html:text></td>
					<td><html:text property="board3"></html:text></td>
					<td><html:text property="marks3"></html:text></td>
				</tr>

				<tr>
					<td><label for="fname">Name of Documents
							Submitted(Seperate by coma(,))</label></td>
					<td><html:text property="documents"></html:text></td>
					<td><label for="fname">Amount Received Rs.</label></td>
					<td><html:text property="fee"></html:text></td>
				</tr>

				<tr>
					<td><label for="fname">Next Due Date</label></td>
					<td><html:text property="due_date" styleId="datepicker1"></html:text></td>
					<td colspan="3">
				</tr>

				<tr>
					<td colspan="4" align="center"><html:submit value="Submit"></html:submit></td>
				</tr>
			</table>
		</div>

	</html:form>
<%-- </body>
</html> --%>