<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:form action="/staffEntrySubmit" method="post">
	<div class="panel panel-danger">
		<div class="panel-heading">
			<div>
				<b class="text-primary">Staff Entry Window</b>
			</div>
		</div>

		<div class="panel-body">

			<div class="col-md-12">
				<html:errors />
				<div class="form-group">

					<div class="form-group">
						<div>
							<label for="fname" class="text-primary">Enter Name</label>
							<html:text property="name" styleClass="form-control"></html:text>
							<html:errors property="name" />
						</div>
					</div>


					<div class="form-group">
						<div>
							<label for="fname" class="text-primary">Enter Email</label>
							<html:text property="email" styleClass="form-control"></html:text>
							<html:errors property="email" />
						</div>
					</div>



					<div class="form-group">
						<div>
							<label for="fname" class="text-primary">Enter Mobile
								Number</label>
							<html:text property="phonenumber" styleClass="form-control" />
							<html:errors property="phonenumber" />
						</div>
					</div>

					<div class="form-group">
						<div>
							<label for="fname" class="text-primary">Select Gender </label>
							<html:errors property="gender" />
							<html:radio property="gender" value="Male"
								styleClass="radio-inline">
								<label for="fname" class="text-primary">Male</label>
							</html:radio>
							<html:radio property="gender" value="Female"
								styleClass="radio-inline">
								<label for="fname" class="text-primary"> Female</label>
							</html:radio>
						</div>
					</div>
					<div class="form-group">
						<label for="fname" class="text-primary">Date Of Birth</label>
						<div class="controls input-append date form_date" data-date=""
							data-date-format="dd MM yyyy" data-link-field="dtp_input1"
							data-link-format="dd-mm-yyyy">
							<html:text property="dob" size="16" styleId="dtp_input1"
								styleClass="form-control" readonly="true"></html:text>
							<span class="add-on"><i class="icon-th"></i></span>
						</div>
					</div>

					<div class="form-group">
						<label for="fname" class="text-primary">Date Of Joining</label>
						<div class="controls input-append date form_date" data-date=""
							data-date-format="dd MM yyyy" data-link-field="dtp_input2"
							data-link-format="dd-mm-yyyy">
							<html:text property="doj" size="16" styleId="dtp_input2"
								styleClass="form-control" readonly="true"></html:text>
							<span class="add-on"><i class="icon-th"></i></span>
						</div>

					</div>

					<div class="form-group">
						<div>
							<label for="fname" class="text-primary">Enter Address</label>
							<html:textarea property="address" styleClass="form-control"
								rows="5" />
							<html:errors property="address" />
						</div>
					</div>

					<div class="form-group">
						<div>
							<label for="fname" class="text-primary">Enter Staff Type</label>
							<html:errors property="type" />
							<html:select property="type" styleClass="form-control">
								<html:option value="">Select Type</html:option>
								<html:option value="Teaching">Teaching</html:option>
								<html:option value="Non-Teaching">Non-Teaching</html:option>
							</html:select>
						</div>
					</div>

					<div class="form-group">
						<div>
							<label for="fname" class="text-primary">Enter Staff
								Experties</label>
							<html:errors property="experties" />
							<html:select property="experties" styleClass="form-control">
								<html:option value="">Select Experties</html:option>
								<html:option value="Elecdivical Department">Electrical Dept.</html:option>
								<html:option value="Fitter Department">Fitter Dept.</html:option>
								<html:option value="Accountant">Accountant</html:option>
								<html:option value="Cashier">Cashier</html:option>
								<html:option value="Manager">Manager</html:option>
							</html:select>

						</div>
					</div>

					<div class="form-group">
						<html:submit value="Submit" styleClass="btn btn-primary">
						</html:submit>
					</div>

				</div>
			</div>
		</div>
	</div>

</html:form>
