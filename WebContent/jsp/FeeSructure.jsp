<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:form action="/feeStructureSubmit">
	<div class="panel panel-danger">
		<div class="panel-heading">
			<b>Fee Structure Setting Window</b>
		</div>
		<div class="panel-body">
			<div class="col-md-6">
				<div class="form-group">
					<div>
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
						</html:select>
					</div>
					<div>
						<font size="3" color="red"><html:errors property="session" /></font>
					</div>
				</div>
				<div class="form-group">
					<div>
						<label>Select trade</label>
						<html:select property="trade" styleClass="form-control">
							<html:option value="Select"></html:option>
							<html:option value="Fitter"></html:option>
							<html:option value="Electrical"></html:option>
						</html:select>
					</div>
					<div>
						<font size="3" color="red"><html:errors property="trade" /></font>
					</div>
				</div>
				<div class="form-group">
					<div>
						<label>Select Duration</label>
						<html:select styleClass="form-control" property="duration">
							<html:option value="Select"></html:option>
							<html:option value="1 year"></html:option>
							<html:option value="2 year"></html:option>
							<html:option value="3 year"></html:option>
							<html:option value="4 year"></html:option>
						</html:select>
					</div>
					<div>
						<font size="3" color="red"><html:errors property="duration" /></font>
					</div>
				</div>
				<div class="form-group">
					<div>
						<label>Enter Admission Fee</label>
						<html:text styleClass="form-control" property="admission_fee"></html:text>
					</div>
					<div>
						<font size="3" color="red"><html:errors
								property="admission_fee" /></font>
					</div>
				</div>
				<div class="form-group">
					<div>
						<label>Enter Examination Fee</label>
						<html:text styleClass="form-control" property="exam_fee"></html:text>
					</div>
					<div>
						<font size="3" color="red"><html:errors property="exam_fee" /></font>
					</div>
				</div>
			</div>
			<div class="col-md-6">

				<div class="form-group">
					<div>
						<label>Enter Full Course/Tuition Fee</label>
						<html:text styleClass="form-control" property="tution_fee"></html:text>
					</div>
					<div>
						<font size="3" color="red"><html:errors
								property="tution_fee" /></font>
					</div>
				</div>

				<div class="form-group">

					<div>
						<label>Enter Development Charge</label>
						<html:text styleClass="form-control" property="development_fee"></html:text>
					</div>
					<div>
						<font size="3" color="red"><html:errors
								property="development_fee" /></font>
					</div>
				</div>
				<div class="form-group">
					<div>
						<label>Enter Caution Money</label>
						<html:text styleClass="form-control" property="caution_money"></html:text>
					</div>
					<div>
						<font size="3" color="red"><html:errors
								property="caution_money" /></font>
					</div>
				</div>

				<div class="form-group">

					<div>
						<label>Enter Miscellaneous Charge</label>
						<html:text styleClass="form-control" property="misc_fee"></html:text>
					</div>
					<div>
						<font size="3" color="red"><html:errors property="misc_fee" /></font>
					</div>
				</div>
				<div class="form-group">

					<div>
						<label>Enter Poor Boy fund</label>
						<html:text styleClass="form-control" property="poor_boy_fund"></html:text>
					</div>
					<div>
						<font size="3" color="red"><html:errors
								property="poor_boy_fund" /></font>
					</div>
				</div>
				<div class="form-group">
					<div>
						<html:submit styleClass="btn btn-primary" value="Submit"></html:submit>
					</div>
				</div>
			</div>

		</div>
	</div>
</html:form>
