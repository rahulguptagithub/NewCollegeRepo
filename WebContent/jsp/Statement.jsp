<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:form action="/statementSubmit" method="post">
	<div class="panel panel-danger">
		<div class="panel-heading">
			<b class="text-primary">Show Statement Window</b>
		</div>
		<div class="panel-body">

			<div class="col-md-12">
				<html:errors />
				<div class="form-group">
					<div>
						<label for="fname" class="text-primary">Select Account Holder</label>
						<html:select property="accountHolder" styleClass="form-control">
							<html:option value="All">All Accounts</html:option>
							<html:optionsCollection name="statementForm"
								property="accountOptions" />
						</html:select>
					</div>
				</div>
				
				
				<div class="form-group">
					<label for="fname" class="text-primary">From Date</label>
					<div class="controls input-append date form_date" data-date=""
						data-date-format="dd MM yyyy" data-link-field="dtp_input1"
						data-link-format="dd-mm-yyyy">
						<html:text property="fromDate" size="16" styleId="dtp_input1"
							styleClass="form-control" readonly="true"></html:text>
						<span class="add-on"><i class="icon-th"></i></span>
					</div>

				</div>
				
				<div class="form-group">
					<label for="fname" class="text-primary">To Date</label>
					<div class="controls input-append date form_date" data-date=""
						data-date-format="dd MM yyyy" data-link-field="dtp_input2"
						data-link-format="dd-mm-yyyy">
						<html:text property="toDate" size="16" styleId="dtp_input2"
							styleClass="form-control" readonly="true"></html:text>
						<span class="add-on"><i class="icon-th"></i></span>
					</div>

				</div>

				<div class="form-group">
					<div>
						<html:submit value="Submit" styleClass="btn btn-primary"></html:submit>
					</div>
				</div>
			</div>
		</div>
	</div>
</html:form>
