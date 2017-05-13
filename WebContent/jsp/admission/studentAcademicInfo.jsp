<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!--id="studentAcademicDetailsDivId"-->
<div id="studentAcademicDetailsDivId">
	<table class="borderTable" style="width: 100%;">
		<thead>
			<tr>
				<th>Exam Passed</th>
				<th>Passing Year</th>
				<th>School/College Name</th>
				<th>Board</th>
				<th>Marks(%)</th>
				<th>Upload Doc</th>
				<th><a> <img alt="Add Record" src="images/button_plus_green.png"
						style="width: 15px; height: 15px;" onclick="addRemoveAcademicRecord('add');"></a></th>
			</tr>
		</thead>
		<tbody>
			<logic:notEmpty name="admissionForm" property="academicRecordsList">
				<logic:iterate id="academicRecord" name="admissionForm"
					property="academicRecordsList" indexId="index">
					<tr>
						<td><html:select styleId="examName${index}"  styleClass="textbox_normal width135"
								property="academicRecordsList[${index}].examName">
								<html:option value="">Select</html:option>
								<html:option value="Matric"></html:option>
								<html:option value="I.A/I.sc/10+2"></html:option>
								<html:option value="Diploma"></html:option>
								<html:option value="Graduation"></html:option>
								<html:option value="Master"></html:option>
							</html:select></td>
						<td><html:text
								property="academicRecordsList[${index}].passedYear"
								styleId="passedYear${index }" styleClass="textbox_normal width135"></html:text></td>
						<td><html:text
								property="academicRecordsList[${index}].instituteName"
								styleId="instituteName${index }"  styleClass="textbox_normal width135"></html:text></td>
						<td><html:text property="academicRecordsList[${index}].board"
								styleId="board${index }" styleClass="textbox_normal width135"></html:text></td>
						<td><html:text property="academicRecordsList[${index}].marks"
								styleId="marks${index }" styleClass="textbox_normal width135"></html:text></td>
						<td><html:file
								property="academicRecordsList[${index}].uploadFile"
								styleId="file_data[${index}" styleClass="textbox_normal width135"></html:file></td>
						<td><a> <img alt="Add Record" src="images/remove.png"
						style="width: 15px; height: 15px;" onclick="addRemoveAcademicRecord('remove',${index});"></a></td>
					</tr>
				</logic:iterate>
			</logic:notEmpty>
		</tbody>
	</table>
</div>
<!--id="studentAcademicDetailsDivId"-->