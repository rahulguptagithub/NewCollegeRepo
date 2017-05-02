
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<%-- <html>
<style>
form {
    border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

button:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}
</style>
<body> --%>

<%-- <html:form action="/feeReceiptSubmit">
<html:submit value="Create"></html:submit>
</html:form> --%>





<html:form action="/createSubmit">
	<div class="panel panel-danger">
		<div class="panel-heading">
			<b>New User Creation Window</b>
		</div>
		<div class="panel-body">
			<div class="col-md-12">
				<div class="col-md-6">
					<div class="form-group">
						<div>
							<label>Enter User Name</label>
							<html:text property="username" styleClass="form-control"></html:text>
						</div>
						<div>
							<font size="3" color="red"><html:errors
									property="username" /></font>
						</div>
					</div>

					<div class="form-group">
						<div>
							<label>Enter Password</label>
							<html:password property="password" styleClass="form-control"></html:password>
						</div>
						<div>
							<font size="3" color="red"><html:errors
									property="password" /></font>
						</div>
					</div>
					<div class="form-group">
						<div>
							<label>Enter Confirm Password</label>
							<html:text property="cpassword" styleClass="form-control"></html:text>
						</div>
						<div>
							<font size="3" color="red"><html:errors
									property="cpassword" /></font>
						</div>
					</div>
					<div class="form-group">
						<div>
							<label>Status</label>
							<html:select property="status" styleClass="form-control">
								<html:option value="Select"></html:option>
								<html:option value="Active"></html:option>
								<html:option value="Inactive"></html:option>
							</html:select>
						</div>
						<div>
							<font size="3" color="red"><html:errors property="status" /></font>
						</div>
					</div>

				</div>
				<div class="col-md-6">
					<div class="form-group">
						<div>
							<label>Enter Email Id</label>
							<html:text property="email" styleClass="form-control"></html:text>
						</div>
						<div>
							<font size="3" color="red"><html:errors property="email" /></font>
						</div>
					</div>
					<div class="form-group">
						<div>
							<label>Enter Mobile No.</label>
							<html:text property="mobileno" styleClass="form-control"></html:text>
						</div>
						<div>
							<font size="3" color="red"><html:errors
									property="mobileno" /></font>
						</div>
					</div>
					<div class="form-group">
						<div>
							<label>User Role</label>
							<html:select property="role" styleClass="form-control">
								<html:option value="Select"></html:option>
								<html:option value="Admin"></html:option>
								<html:option value="User"></html:option>
							</html:select>
						</div>
						<div>
							<font><html:errors property="role" /> </font>
						</div>
					</div>
					<div class="form-group">
					<label></label>
						<div>
						
							<html:submit styleClass="btn btn-primary btn-block" value="Create"></html:submit>
						</div>
					</div>
				</div>


			</div>

		</div>
	</div>
</html:form>
<%--  </body>
</html> --%>
