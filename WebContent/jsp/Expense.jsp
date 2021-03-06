<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:form action="/expenseSubmit" method="post">
	<div class="panel panel-danger">
		<div class="panel-heading">
			<b class="text-primary">Expense Window</b>
		</div>
		<div class="panel-body">

			<div class="col-md-12">
				<html:errors />
				<div class="form-group">
					<div>
						<label for="fname" class="text-primary">From Account</label>
						<html:select property="fromAccount" styleClass="form-control">
							<html:option value="0">Select Account</html:option>
							<html:optionsCollection name="expenseForm"
								property="accountOptions" />
						</html:select>
					</div>
				</div>
				<div class="form-group">
					<div>
						<label for="fname" class="text-primary">Enter Expense
							Amount (Rs.)</label>
						<html:text property="expense" styleClass="form-control"></html:text>
					</div>
				</div>
				<div class="form-group">
					<label for="fname" class="text-primary">Expense Date</label>
					<div class="controls input-append date form_date" data-date=""
						data-date-format="dd MM yyyy" data-link-field="dtp_input2"
						data-link-format="dd-mm-yyyy">
						<html:text property="date" size="16" styleId="dtp_input2"
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
