<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:form action="/creditSubmit" method="post">

	<div class="panel panel-danger">

		<div class="panel-heading">
			<div>
				<b class="text-primary">Credit Window</b>
			</div>
		</div>

		<div class="panel-body">

			<div class="col-md-12">
				<html:errors />
				<div class="form-group">
					<div>
						<label for="fname" class="text-primary">To Account</label>
						<html:select property="inAccount" styleClass="form-control">
							<html:option value="0">Select Account</html:option>
							<html:optionsCollection name="creditForm"
								property="accountOptions" />
						</html:select>
					</div>
				</div>


				<div class="form-group">
					<div>
						<label for="fname" class="text-primary">Enter Credit
							Amount (Rs.)</label>
						<html:text property="amount" styleClass="form-control"></html:text>
					</div>
				</div>

				<div class="form-group">
					<div>
						<label for="fname" class="text-primary">Credit Against</label>
						<html:text property="note" styleClass="form-control"></html:text>
					</div>
				</div>

				<div class="form-group">
					<label for="fname" class="text-primary">Credit Date</label>
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
						<html:submit value="Credit" styleClass="btn btn-primary"></html:submit>
					</div>
				</div>
			</div>


		</div>
	</div>


</html:form>

<%-- </body>
<<
</html> --%>