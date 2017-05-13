<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!--id="studentOtherCertificateDivId"-->
<div id="studentOtherCertificateDivId">
	<table class="borderTable" style="width: 100%;">
		<thead>
			<tr>
				<th>Miscellaneous Certificate</th>
				<th>Upload File</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><html:select styleId="otherRecordCertificateName"
						styleClass="textbox_normal width135"
						property="otherRecordDTO.certificateName">
						<html:option value="">Select</html:option>
						<html:option value="Income Certificate"></html:option>
						<html:option value="Cast Certificate"></html:option>
					</html:select></td>
				<td><html:file property="otherRecordDTO.uploadFile"
						styleId="otherRecordUploadFile" styleClass="textbox_normal width135"></html:file></td>
				<td><a> <img alt="Add Record"
						src="images/button_plus_green.png"
						style="width: 15px; height: 15px;"
						onclick="addOtherCertificateRecord('otherRecord','add');"></a></td>
			</tr>
			<logic:notEmpty name="admissionForm" property="otherRecordDTOList">
				<logic:iterate id="otherRecordDTO" name="admissionForm"
					property="otherRecordDTOList" indexId="index">
					<tr>
						<td>${otherRecordDTO.certificateName}</td>
						<td>${otherRecordDTO.uploadFile}</td>
						<td><a> <img alt="Add Record" src="images/remove.png"
								style="width: 15px; height: 15px;"
								onclick="removeOtherCertificateRecord('otherRecord','remove',${index});"></a></td>
					</tr>
				</logic:iterate>
			</logic:notEmpty>
		</tbody>
	</table>
</div>
<!--id="studentOtherCertificateDivId"-->