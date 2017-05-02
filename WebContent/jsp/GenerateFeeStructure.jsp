<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:form action="/generateFeeStructureSubmit" method="post"
	enctype="multipart/form-data">

	<div class="panel panel-danger">
		<div class="panel-heading">
			<div>
				<b class="text-primary">Fee Structure Creation Window</b>
			</div>
			</div>
			<div class="panel-body">
				<div class="col-md-12">
					<html:errors />
					<div class="form-group">
						<div>
							<label for="fname" class="text-primary">Select Trade</label>
							<html:select property="trade" styleClass="form-control">
								<html:option value="Select trade"></html:option>
								<html:option value="Fitter"></html:option>
								<html:option value="Electrical"></html:option>
							</html:select>
						</div>
					</div>

					<div class="form-group">
						<div>
						<label for="fname" class="text-primary">Select Session</label>
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
					</div>
					<div class="form-group">
						<div>
							<html:submit value="Generate" styleClass="btn btn-primary"></html:submit>
						</div>
					</div>
				</div>

			</div>
		</div>

</html:form>
