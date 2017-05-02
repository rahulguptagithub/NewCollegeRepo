<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<%-- <html>
<head>

<style>
input[type=text], select {
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


</head>


<body>
 --%>

<html:form action="/feePaymentSubmit" method="post"
	enctype="multipart/form-data">
	<div class="panel panel-danger">
		<div class="panel-heading"><b>Fee Payment Window</b></div>
		<div class="panel-body">


			<div class="form-group">
			<label for="fname">Choose Trade</label>
				<label class="radio-inline"><html:radio property="trade" value="fitter">Fitter</html:radio></label> 
				<label class="radio-inline"><html:radio property="trade" value="electrical">Electrical</html:radio></label>
			</div>
			<div class="form-group">
				<label for="fname">Select Session</label>
				<html:select property="session" styleClass="form-control">
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
				</html:select>
			</div>

			<div class="form-group">
				<label for="fname">Student ID I.E (MTPJPL-)</label>
				<html:text styleClass="form-control" property="sid"></html:text>
			</div>

			<div class="form-group">
				<label for="fname">Enter Fee Amount (Rs.)</label>
				<html:text styleClass="form-control" property="fee"></html:text>
			</div>

			<div class="form-group">
				<label for="fname">Note If Any </label>
				<html:text styleClass="form-control" property="note"></html:text>
			</div>

			<div class="form-group">
				<html:submit styleClass="btn btn-primary" value="Submit"></html:submit>
			</div>
		</div>
	</div>
</html:form>
<%-- </body>

</html> --%>