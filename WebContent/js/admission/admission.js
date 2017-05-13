function loadAdmissionPage() {
	var url = "/CollegeProject/admissionSubmit.do?&method=loadAdmissionPage";
	document.forms[0].method = "get";
	document.forms[0].action = url;
	document.forms[0].submit();
}
function submitAdmissionForm() {
	var url = "/CollegeProject/admissionSubmit.do?&method=submitStudentForm";
	document.forms[0].method = "post";
	document.forms[0].enctype = "multipart/form-data";
	document.forms[0].action = url;
	document.forms[0].submit();
}
function addAcademicRecord(callType, callFor, indexId) {
	var url = "/CollegeProject/admissionSubmit.do?&method=addRemoveFileRecord&callFor="
			+ callFor + "&indexId=" + indexId + "&callType=" + callType;
	var file_data = $("#uploadFile").prop("files")[0];
	var form_data = new FormData();
	form_data.append("academicRecordDTO.uploadFile", file_data);
	form_data.append("academicRecordDTO.examName", $('#examName')[0].value);
	form_data.append("academicRecordDTO.passedYear", $('#passedYear')[0].value);
	form_data.append("academicRecordDTO.instituteName",
			$('#instituteName')[0].value);
	form_data.append("academicRecordDTO.board", $('#board')[0].value);
	form_data.append("academicRecordDTO.marks", $('#marks')[0].value);
	$.ajax({
		url : url,
		data : form_data,
		type : 'POST',
		async : false,
		success : function(result) {
			divRefreshStateChange(result, 'studentAcademicDetailsDivId');
		},
		cache : false,
		contentType : false,
		processData : false,
		failed : function() {
			alert("Unknown Error Please contact Support");
		}
	});
}
function removeAcademicRecord(callType, callFor, indexId) {
	var url = "/CollegeProject/admissionSubmit.do?&method=addRemoveFileRecord&callFor="
			+ callFor + "&indexId=" + indexId + "&callType=" + callType;
	ajaxDivRefresh(url, 'studentAcademicDetailsDivId',
			'studentAcademicDetailsDivId');
}
function addOtherCertificateRecord(callType, callFor, indexId) {
	var url = "/CollegeProject/admissionSubmit.do?&method=addRemoveFileRecord&callFor="
			+ callFor + "&indexId=" + indexId + "&callType=" + callType;
	var file_data = $("#otherRecordUploadFile").prop("files")[0];
	var form_data = new FormData();
	form_data.append("otherRecordDTO.uploadFile", file_data);
	form_data.append("otherRecordDTO.certificateName", $('#otherRecordCertificateName')[0].value);
	$.ajax({
		url : url,
		data : form_data,
		type : 'POST',
		async : false,
		success : function(result) {
			divRefreshStateChange(result, 'studentOtherCertificateDivId');
		},
		cache : false,
		contentType : false,
		processData : false,
		failed : function() {
			alert("Unknown Error Please contact Support");
		}
	});
}
function removeOtherCertificateRecord(callType, callFor, indexId) {
	var url = "/CollegeProject/admissionSubmit.do?&method=addRemoveFileRecord&callFor="
			+ callFor + "&indexId=" + indexId + "&callType=" + callType;
	ajaxDivRefresh(url, 'studentOtherCertificateDivId',
			'studentOtherCertificateDivId');
}
