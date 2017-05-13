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
				<th></th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><html:select styleId="examName"
						styleClass="textbox_normal width135"
						property="academicRecordDTO.examName">
						<html:option value="">Select</html:option>
						<html:option value="Matric"></html:option>
						<html:option value="I.A/I.sc/10+2"></html:option>
						<html:option value="Diploma"></html:option>
						<html:option value="Graduation"></html:option>
						<html:option value="Master"></html:option>
					</html:select></td>
				<td><html:text property="academicRecordDTO.passedYear"
						styleId="passedYear" styleClass="textbox_normal width135"></html:text></td>
				<td><html:text property="academicRecordDTO.instituteName"
						styleId="instituteName" styleClass="textbox_normal width135"></html:text></td>
				<td><html:text property="academicRecordDTO.board"
						styleId="board" styleClass="textbox_normal width135"></html:text></td>
				<td><html:text property="academicRecordDTO.marks"
						styleId="marks" styleClass="textbox_normal width135"></html:text></td>
				<td><html:file property="academicRecordDTO.uploadFile"
						styleId="uploadFile" styleClass="textbox_normal width135"></html:file></td>
				<td><a> <img alt="Add Record"
						src="images/button_plus_green.png"
						style="width: 15px; height: 15px;"
						onclick="addAcademicRecord('academicRecord','add');"></a></td>
			</tr>
			<logic:notEmpty name="admissionForm" property="academicRecordsList">
				<logic:iterate id="academicRecord" name="admissionForm"
					property="academicRecordsList" indexId="index">
					<tr>
						<td><%-- <html:select styleId="examName${index}"
								styleClass="textbox_normal width135"
								property="academicRecordsList[${index}].examName">
								<html:option value="">Select</html:option>
								<html:option value="Matric"></html:option>
								<html:option value="I.A/I.sc/10+2"></html:option>
								<html:option value="Diploma"></html:option>
								<html:option value="Graduation"></html:option>
								<html:option value="Master"></html:option>
							</html:select> --%>
							${academicRecord.examName}
							</td>
						<td><%-- <html:text
								property="academicRecordsList[${index}].passedYear"
								styleId="passedYear${index }"
								styleClass="textbox_normal width135"></html:text> --%>${academicRecord.passedYear}</td>
						<td><%-- <html:text
								property="academicRecordsList[${index}].instituteName"
								styleId="instituteName${index }"
								styleClass="textbox_normal width135"></html:text> --%>${academicRecord.instituteName}</td>
						<td><%-- <html:text property="academicRecordsList[${index}].board"
								styleId="board${index }" styleClass="textbox_normal width135"></html:text> --%>${academicRecord.board}</td>
						<td><%-- <html:text property="academicRecordsList[${index}].marks"
								styleId="marks${index }" styleClass="textbox_normal width135"></html:text> --%>${academicRecord.marks}</td>
						<td><%-- <html:file
								property="academicRecordsList[${index}].uploadFile"
								styleId="file_data${index}" styleClass="textbox_normal width135"></html:file> --%>${academicRecord.uploadFile}</td>
						<td><a> <img alt="Add Record" src="images/remove.png"
								style="width: 15px; height: 15px;"
								onclick="removeAcademicRecord('academicRecord','remove',${index});"></a></td>
					</tr>
				</logic:iterate>
			</logic:notEmpty>
		</tbody>
	</table>
</div>
<!--id="studentAcademicDetailsDivId"-->