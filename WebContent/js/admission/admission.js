function loadAdmissionPage(){
	var url = "/CollegeProject/admissionSubmit.do?&method=loadAdmissionPage";
	document.forms[0].method = "get";
	document.forms[0].action = url;
	document.forms[0].submit();
}
function submitAdmissionForm(){
	var url = "/CollegeProject/admissionSubmit.do?&method=submitStudentForm";
	document.forms[0].method = "post";
	document.forms[0].enctype="multipart/form-data";
	document.forms[0].action = url;
	document.forms[0].submit();
}
function addRemoveAcademicRecord(callFor,indexId) {
	var url = "/CollegeProject/admissionSubmit.do?&method=addRemoveAcademicRecord&callFor="+callFor+"&indexId="+indexId;
	ajaxDivRefresh(url,'studentAcademicDetailsDivId','studentAcademicDetailsDivId');
}
