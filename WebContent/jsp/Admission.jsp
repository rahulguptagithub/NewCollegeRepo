<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

	<html:form action="/admissionSubmit" method="post"
		enctype="multipart/form-data">

		<div class="container">
			<div>
				<caption>
					<h1>Student Admission Window</h1>
				</caption>
				<div>
					<div colspan="8"><hr color="#ff9933"></div>
				</div>
				<div>
					<div colspan="8" align="center">Basic Information</div>
				</div>
				<div>
					<div colspan="8"><hr color="green"></div>
				</div>
				<div>
					<div><label for="fname">Preferred trade</label></div>
					<div><html:radio property="trade" value="fitter">Fitter</html:radio></div>
					<div><html:radio property="trade" value="elecdivical">Elecdivical</html:radio></div>
					<div><label for="fname">Form No.</label></div>
					<div>
					<div><html:text property="formNo"></html:text></div>
				</div>

				<div>
					<div><label for="fname">Select Session</label></div>
					<div><html:select property="session">
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
						</html:select></div>

					<div align="center"><label for="fname">Select Gender</label></div>
					<div><html:radio property="gender" value="Male">Male</html:radio>
						<html:radio property="gender" value="Female">Female</html:radio></div>
				</div>



				<div>
					<div><label for="fname">Student Name</label></div>
					<div colspan="2"><html:text property="student_name"></html:text></div>
				</div>

				<div>
					<div><label for="fname">Father's/Guardian Name(Please
							Specify)</label></div>
					<div><html:radio property="guardian_type" value="father">Father</html:radio></div>
					<div><html:radio property="guardian_type" value="guardian">Guardian</html:radio></div>

				</div>

				<div>
					<div><label for="fname">Father's/Guardian Name</label></div>
					<div colspan="2"><html:text property="guardian_name"></html:text></div>
				</div>

				<div>
					<div><label for="fname">Occupation of Guardian</label></div>
					<div><html:select property="occupation">
							<html:option value="Select"></html:option>
							<html:option value="Farmer"></html:option>
							<html:option value="Business"></html:option>
							<html:option value="Service"></html:option>
							<html:option value="Student"></html:option>
							<html:option value="Self Employed"></html:option>
						</html:select></div>
					<div align="right"><label for="fname">Upload Student
							Image</label></div>
					<div colspan="2"><html:file property="photo"></html:file></div>

				</div>

				<div>
					<div><label for="fname">Candidate Date Of
							Birth(DD/MM/YYYY)</label></div>
					<div><html:text property="dob" styleId="datepicker"></html:text></div>
					<div align="center"><label for="fname">Category</label></div>
					<div colspan="2"><html:radio property="category" value="Gen">
							<label for="fname">GEN</label>
						</html:radio> <html:radio property="category" value="OBC">
							<label for="fname">OBC</label>
						</html:radio> <html:radio property="category" value="SC">
							<label for="fname">SC</label>
						</html:radio> <html:radio property="category" value="ST">
							<label for="fname">ST</label>
						</html:radio></div>

				</div>
				
				<div class="container">
				 <button type="button" class="btn btn-info" data-toggle="collapse" data-target="#demo">Simple collapsible</button>
				<div id="demo" class="collapse">
				<div>
					<div colspan="8"><hr color="#ff9933"></div>
				</div>
				<div>
					<div colspan="8" align="center"><label for="fname">Correspondence
							Address</label></div>
				</div>
				<div>
					<div colspan="8"><hr color="green"></div>
				</div>

				<div>
					<div><label for="fname">Name/CO</label></div>
					<div><html:text property="co"></html:text></div>
					<div><label for="fname">Village</label></div>
					<div><html:text property="village"></html:text></div>
				</div>



				<div>
					<div><label for="fname">Post Office</label></div>
					<div><html:text property="po"></html:text></div>
					<div><label for="fname">Police Station</label></div>
					<div><html:text property="ps"></html:text></div>
				</div>

				<div>
					<div><label for="fname">District</label></div>
					<div><html:text property="district"></html:text></div>
					<div><label for="fname">Phone</label></div>
					<div><html:text property="phone"></html:text></div>
				</div>


  </div>
</div>



				<div>
					<div colspan="8"><hr color="#ff9933"></div>
				</div>
				<div>
					<div colspan="3" align="center"><label for="fname">Permanent
							Address</label></div>
					<div align="center"><html:checkbox property="permanentAdd"
							value="same" styleId="permanentAddId"></html:checkbox></div>
				</div>

				<div>
					<div colspan="8"><hr color="green"></div>
				</div>

				<div>
					<div><label for="fname">Name/CO</label></div>
					<div><html:text property="pCo" styleId="pCoId"></html:text></div>
					<div><label for="fname">Village</label></div>
					<div><html:text property="pVillage" styleId="pVillageId"></html:text></div>
				</div>

				<div>
					<div><label for="fname">Post Office</label></div>
					<div><html:text property="pPo" styleId="pPoId"></html:text></div>
					<div><label for="fname">Police Station</label></div>
					<div><html:text property="pPs" styleId="pPsId"></html:text></div>
				</div>

				<div>
					<div><label for="fname">District</label></div>
					<div><html:text property="pDistrict" styleId="pDistrictId"></html:text></div>
					<div><label for="fname">Phone</label></div>
					<div><html:text property="pPhone" styleId="pPhoneId"></html:text></div>
				</div>

				<div>
					<div colspan="8"><hr color="#ff9933"></div>
				</div>
				<div>
					<div colspan="8" align="center"><label for="fname">Academic
							Qualifications</label></div>
				</div>
				<div>
					<div colspan="8"><hr color="green"></div>
				</div>

				<div>
					<div><label for="fname">Exam Passed</label></div>
					<div><label for="fname">Passing Year</label></div>
					<div><label for="fname">School/College Name</label></div>
					<div><label for="fname">Board</label></div>
					<div><label for="fname">Marks(%)</label></div>
				</div>
				<div>
					<div><html:select property="examName1">
							<html:option value="Select"></html:option>
							<html:option value="Madivic"></html:option>
							<html:option value="I.A/I.sc/10+2"></html:option>
							<html:option value="Diploma"></html:option>
							<html:option value="Graduation"></html:option>
							<html:option value="Master"></html:option>
						</html:select></div>
					<div><html:text property="passedYear1"></html:text></div>
					<div><html:text property="instituteName1"></html:text></div>
					<div><html:text property="board1"></html:text></div>
					<div><html:text property="marks1"></html:text></div>
				</div>
				<div>
				<div>
					<div><html:select property="examName2">
							<html:option value="Select"></html:option>
							<html:option value="Madivic"></html:option>
							<html:option value="I.A/I.sc/10+2"></html:option>
							<html:option value="Diploma"></html:option>
							<html:option value="Graduation"></html:option>
							<html:option value="Master"></html:option>
						</html:select></div>
					<div><html:text property="passedYear2"></html:text></div>
					<div><html:text property="instituteName2"></html:text></div>
					<div><html:text property="board2"></html:text></div>
					<div><html:text property="marks2"></html:text></div>
				</div>

				<div>
					<div><html:select property="examName3">
							<html:option value="Select"></html:option>
							<html:option value="Madivic"></html:option>
							<html:option value="I.A/I.sc/10+2"></html:option>
							<html:option value="Diploma"></html:option>
							<html:option value="Graduation"></html:option>
							<html:option value="Master"></html:option>
						</html:select></div>
					<div><html:text property="passedYear3"></html:text></div>
					<div><html:text property="instituteName3"></html:text></div>
					<div><html:text property="board3"></html:text></div>
					<div><html:text property="marks3"></html:text></div>
				</div>

				<div>
					<div><label for="fname">Name of Documents
							Submitted(Seperate by coma(,))</label></div>
					<div><html:text property="documents"></html:text></div>
					<div><label for="fname">Amount Received Rs.</label></div>
					<div><html:text property="fee"></html:text></div>
				</div>

				<div>
					<div><label for="fname">Next Due Date</label></div>
					<div><html:text property="due_date" styleId="datepicker1"></html:text></div>
					<div colspan="3">
				</div>

				<div>
					<div colspan="4" align="center"><html:submit value="Submit"></html:submit></div>
				</div>
			</div>
		</div>

	</html:form>
<%-- </body>
</html> --%>