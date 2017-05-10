<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:form action="/SubmitStudentEnquiry.do?method=addStudentEnquiry">

	<div class="panel panel-danger">
		<div class="panel-heading">
			<div>
				<b class="text-primary">Student Enquiry Window</b>
			</div>
		</div>

		<div class="panel-body">

			<div class="col-md-12">


				<html:errors />

				<div class="form-group">
					<div>
						<label for="fname" class="text-primary">Enter Name</label>
						<html:text property="name" styleClass="form-control"></html:text>
						<html:errors property="name" />
					</div>
				</div>

				<div class="form-group">
					<div>
						<label for="fname" class="text-primary">Enter Email Id</label>
						<html:text property="email" styleClass="form-control" />
						<html:errors property="email" />
					</div>
				</div>
				<div class="form-group">
					<div>
						<label for="fname" class="text-primary">Enter Phone No.</label>
						<div>
							<html:text property="phonenumber" styleClass="form-control" />
							<div>
								<html:errors property="phonenumber" />
							</div>
						</div>


						<div class="form-group">
							<div>
								<label for="fname" class="text-primary">Enter Staff Type</label>
								<html:errors property="stream" />
								<html:select property="stream" styleClass="form-control">
									<html:option value="">Select Trade</html:option>
									<html:option value="Electrical">Electrical</html:option>
									<html:option value="Fitter">Fitter</html:option>
								</html:select>

							</div>
						</div>


						<div class="form-group">
							<div>
								<label for="fname" class="text-primary">Enter Message</label>
								<html:textarea property="message" styleClass="form-control" rows="5"/>
								<html:errors property="message" />
							</div>
						</div>

						<div class="form-group">
							<div>
								<html:submit value="Submit"></html:submit>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>

</html:form>
