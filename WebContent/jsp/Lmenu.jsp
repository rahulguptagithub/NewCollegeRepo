
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:form action="/LoginSubmit">
	<div class="col-md-12">
		<div class="imgcontainer">
			<img src="images/admin.jpg" alt="Admin" class="img-thumbnail">
		</div>
		<h2>Login Form</h2>
		<div class="form-group">
			<label>UserName</label>
			<font color="red" size="3"><html:errors
					property="login.invalid" /></font>
			<html:text property="username" styleClass="form-control" />
			<font color="red" size="3"><html:errors property="username" /></font>
		</div>
		<div class="form-group">
			<label>Password</label>
			<html:password property="password" styleClass="form-control" />
			<font color="red" size="3"> <html:errors property="password" /></font>
		</div>

		<html:submit styleClass="btn btn-warning" value="Login" />
		<div class="checkbox">
			<html:link forward="forgotPassword">Forgot Password</html:link>
		</div>
	</div>
</html:form>
