var xmlHttp;
var tagId;
var isRefreshParent;
var isParentFormParamsSubmit;
/**
 * gets the contents of the form as a URL encoded String suitable for appending
 * to a url
 * 
 * @param formName
 *            to encode
 * @return string with encoded form values , beings with &
 */
function getFormElementsInMultipleForms(formId) {

	// alert("formId : "+formId);

	// Setup the return String
	returnString = "";
	// Get the form values
	// alert("formElements1 :"+document.getElementById(formId).elements);
	if (isParentFormParamsSubmit == true) {
		formElements = window.opener.document.getElementById(formId).elements;
	} else {
		formElements = document.getElementById(formId).elements;
	}
	// alert("formElements2 :"+formElements);
	// loop through the array , building up the url
	// in the form /strutsaction.do&name=value

	for (var i = 0; i < formElements.length; i++) {
		if (formElements[i].type != "file") {
			// we encodeURIComponent (encode) each value
			if (i == 0) {
				returnString = returnString
						+ encodeURIComponent(formElements[i].name) + "="
						+ encodeURIComponent(formElements[i].value);
			} else {
				returnString = returnString + "&"
						+ encodeURIComponent(formElements[i].name) + "="
						+ encodeURIComponent(formElements[i].value);
			}
		} else {
			// alert(" Element type : "+formElements[i].name);
		}
	}
	// return the values
	return returnString;
}

function getFormAsString(formName) {

	// alert(formName);

	// Setup the return String
	returnString = "";
	// alert(document.forms[formName]);
	// Get the form values
	formElements = document.forms[formName].elements;

	// loop through the array , building up the url
	// in the form /strutsaction.do&name=value

	for (var i = 0; i < formElements.length; i++) {

		if (formElements[i].type != "file") {
			// we encodeURIComponent (encode) each value
			if (i == 0) {
				returnString = returnString
						+ encodeURIComponent(formElements[i].name) + "="
						+ encodeURIComponent(formElements[i].value);
			} else {
				returnString = returnString + "&"
						+ encodeURIComponent(formElements[i].name) + "="
						+ encodeURIComponent(formElements[i].value);
			}
		} else {
			// alert(" Element type : "+formElements[i].name);
		}
	}

	// return the values
	return returnString;
}

function getChildFormAsString(formName, childFormName, formId) {

	// Setup the return String
	returnString = "";
	// alert(document.forms[formName]);
	// alert("formName"+formName);
	// Get the form values
	formElements = document.getElementById(formId).elements;
	// alert("formElements::"+formElements.length+"
	// "+document.getElementById(formId).elements[2].value);
	returnString = "parentFormName=" + encodeURIComponent(formName);
	// loop through the array , building up the url
	// in the form /strutsaction.do&name=value
	// alert("formElements.length"+formElements.length);
	// var j=0;
	for (var i = 0; i < formElements.length; i++) {
		var name = formElements[i].name;
		var value = formElements[i].value;
		if (name.indexOf(childFormName) >= 0) {
			name = name.substring(name.lastIndexOf(".") + 1);
			// we encodeURIComponent (encode) each value
			// if(j == 0){
			// returnString=returnString+encodeURIComponent(name)+"="+encodeURIComponent(value);
			// }else{
			returnString = returnString + "&" + encodeURIComponent(name) + "="
					+ encodeURIComponent(value);
			// }
			// j++;
		}
		if (name.indexOf(childFormName) >= 0) {
			name = name.substring(name.lastIndexOf(".") + 1);
			// we encodeURIComponent (encode) each value
			// if(j == 0){
			// returnString=returnString+encodeURIComponent(name)+"="+encodeURIComponent(value);
			// }else{
			returnString = returnString + "&" + encodeURIComponent(name) + "="
					+ encodeURIComponent(value);
			// }
			// j++;
		}
	}
	// return the values
	// alert("return string="+returnString);
	return returnString;
}

function getFormElementsFromDivId(divId, parentDivId) {

	// alert("divId : "+divId);

	// Setup the return String
	returnString = "";
	// Get the form values
	// alert("formElements1 :"+document.getElementById(divId).elements);

	formElements = document.getElementById(divId).getElementsByTagName("*");
	// alert("formElements2 :"+formElements);
	// loop through the array , building up the url
	// in the form /strutsaction.do&name=value

	for (var i = 0; i < formElements.length; i++) {
		// we encodeURIComponent (encode) each value
		if (i == 0) {
			returnString = returnString
					+ encodeURIComponent(formElements[i].name) + "="
					+ encodeURIComponent(formElements[i].value);
		} else {
			returnString = returnString + "&"
					+ encodeURIComponent(formElements[i].name) + "="
					+ encodeURIComponent(formElements[i].value);
		}
	}

	if (parentDivId != null) {
		var parentFormElements = document.getElementById(parentDivId)
				.getElementsByTagName("*");

		for (varj = 0; j < parentFormElements.length; j++) {
			// we encodeURIComponent (encode) each value
			returnString = returnString + "&"
					+ encodeURIComponent(parentFormElements[j].name) + "="
					+ encodeURIComponent(parentFormElements[j].value);
		}

	}
	// return the values
	return returnString;
}

function divRefreshStateChange(result, tagId, callBack) {
	try {

		if (result) {
			completeResponse = result;
			completeHtmlResponseObj = completeResponse;
			var customDelimitor = completeResponse.indexOf('<!--id="' + tagId
					+ '"-->');
			var spanPos = 0;
			var endDivPos = 0;
			var startDivPos = 0;
			if (customDelimitor > 0) {
				spanPos = customDelimitor;
				endDivPos = completeResponse.indexOf('<!--id="' + tagId
						+ '"-->', spanPos + 2);
				startDivPos = spanPos;
			} else {
				spanPos = completeResponse.indexOf('<div id="' + tagId + '"');
				endDivPos = completeResponse.indexOf("</div>", spanPos);
				startDivPos = completeResponse.indexOf('">', spanPos) + 2;
			}

			var content = completeResponse.substring(startDivPos, endDivPos);

			if (isRefreshParent == true) {
				window.opener.document.getElementById(tagId).innerHTML = content;
				calendarRefereshMethod(content, isRefreshParent);
				if (callBack) {
					eval(callBack);
				}
			} else {

				document.getElementById(tagId).innerHTML = content;
				calendarRefereshMethod(content);
				if (callBack) {
					eval(callBack);
				}
			}
		}

	} catch (e) {
		alert("Unknown Error Please contact Support");
	}
}
function ajaxDivRefresh(url, ajaxTagId, formDivName, callBack) {
	tagId = ajaxTagId;
	var params = ""

	if (formDivName) {
		params = $('#' + formDivName + ' :input').serialize();
	}
	$.ajax({
		url : url,
		data : params,
		type : 'POST',
		data : params,
		async : false,
		success : function(result) {
			divRefreshStateChange(result, tagId, callBack);
		},
		cache : false,
		contentType : false,
		processData : false,
		failed : function() {
			alert("Unknown Error Please contact Support");
		}
	});
	/*
	 * new Ajax.Request(url, { method : 'post', parameters : params,
	 * asynchronous : false, onSuccess : function(result) {
	 * divRefreshStateChange(result, tagId, callBack); }, onFailure : function() {
	 * alert("Unknown Error Please contact Support"); } });
	 */
}
function getAjaxRequestObject(url, formDivName) {
	var params = ""
	if (formDivName) {
		params = Form.serialize(formDivName);
	}
	return new Ajax.Request(url, {
		method : 'post',
		parameters : params,
		asynchronous : false,
		onFailure : function() {
			alert("Unknown Error Please contact Support");
			return;
		}
	});
}
function calendarRefereshMethodTagId(content, externalTagId, isRefreshParent) {
	var scriptBegPos = content.indexOf('<script')
	var scriptApplicable = false;
	if (scriptBegPos != -1) {
		scriptApplicable = true;
	}
	while (scriptApplicable) {
		var scriptEndPos = content.indexOf('</script>', scriptBegPos);
		var scriptStartDivPos = content.indexOf('">', scriptBegPos) + 2;
		var scriptContent = content.substring(scriptStartDivPos, scriptEndPos);
		var container = null;
		if (isRefreshParent == true) {
			window.opener.document.getElementById(externalTagId);
		} else {
			container = document.getElementById(externalTagId);
		}
		var script = document.createElement("script");
		script.type = 'text/javascript';
		script.innerHTML = scriptContent;
		container.appendChild(script);

		scriptBegPos = content.indexOf('<script', scriptStartDivPos);
		if (scriptBegPos != -1) {
			scriptApplicable = true;
		} else {
			scriptApplicable = false;
		}
	}
}
function calendarRefereshMethod(content, isRefreshParent) {
	var scriptBegPos = content.indexOf('<script')
	var scriptApplicable = false;
	if (scriptBegPos != -1) {
		scriptApplicable = true;
	}
	while (scriptApplicable) {
		var scriptEndPos = content.indexOf('</script>', scriptBegPos);
		var scriptStartDivPos = content.indexOf('">', scriptBegPos) + 2;
		var scriptContent = content.substring(scriptStartDivPos, scriptEndPos);
		var container = null;
		if (isRefreshParent == true) {
			window.opener.document.getElementById(tagId);
		} else {
			container = document.getElementById(tagId);
		}
		var script = document.createElement("script");
		script.type = 'text/javascript';
		script.innerHTML = scriptContent;
		container.appendChild(script);

		scriptBegPos = content.indexOf('<script', scriptStartDivPos);
		if (scriptBegPos != -1) {
			scriptApplicable = true;
		} else {
			scriptApplicable = false;
		}
	}
}