<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>


<html:form action="/transferSubmit" method="post">
<div class="panel panel-danger">
		<div class="panel-heading">
			<b class="text-primary">Money Transfer Window</b>
		</div>
		<div class="panel-body">

			<div class="col-md-12">
				<html:errors />
				<div class="form-group">
					<div>
					<label for="fname" class="text-primary">Source Account</label>
						<html:select property="fromAccount" styleClass="form-control">
							<html:option value="0">Select Account</html:option>
							<html:optionsCollection name="transferForm"
								property="accountOptions" />
						</html:select>
					</div>
				</div>
				
				<div class="form-group">
					<div>
					<label for="fname" class="text-primary">Target Account</label>
						<html:select property="toAccount" styleClass="form-control">
							<html:option value="0">Select Account</html:option>
							<html:optionsCollection name="transferForm"
								property="accountOptions" />
						</html:select>
					</div>
				</div> 
				
				<div class="form-group">
					<div>
						<label for="fname" class="text-primary">Enter Expense Amount (Rs.)</label>
						<html:text property="trsfrAmount" styleClass="form-control"></html:text>
					</div>
				</div>
				
				<div class="form-group">
					<div>
						<label for="fname" class="text-primary">Enter Notes</label>
						<html:text property="note" styleClass="form-control"></html:text>
					</div>
				</div>
				
				<div class="form-group">
					<div>
						<html:submit value="Transfer" styleClass="btn btn-primary"></html:submit>
					</div>
				</div>
			</div>
		</div>
	</div>
</html:form>
	