<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<div id="studentBasicInfoDivId">
	<table class="commontable" style="width: 100%;">
		<tr>
			<td><label for="fname">Preferred Trade</label></td>
			<td><html:select property="session"
					styleClass="textbox_normal width135">
					<html:option value="">Select</html:option>
					<html:option value="fitter">Fitter</html:option>
					<html:option value="electrical">Electrical</html:option>
				</html:select>
			<td>Form No.</td>
			<td><html:text property="formNo"
					styleClass="textbox_normal width135"></html:text></td>
		</tr>

		<tr>
			<td><label for="fname">Select Session</label></td>
			<td><html:select property="session"
					styleClass="textbox_normal width135">
					<html:option value="">Select</html:option>
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
				</html:select></td>

			<td>Gender</td>
			<td><html:select property="gender"
					styleClass="textbox_normal width135">
					<html:option value="">Select</html:option>
					<html:option value="Male">Male</html:option>
					<html:option value="Female">Female</html:option>
				</html:select>
		</tr>
		<tr>
			<td><label for="fname">Student Name</label></td>
			<td><html:text property="student_name"
					styleClass="textbox_normal width135"></html:text></td>

			<td><label for="fname">Father's/Guardian Name</label></td>
			<td colspan="2"><html:text styleClass="textbox_normal width135"
					property="guardian_name"></html:text></td>
			<%-- <tr>
			<td><label for="fname">Father's/Guardian Name(Please
					Specify)</label></td>
			<td><html:radio property="guardian_type" value="father">Father</html:radio></td>
			<td><html:radio property="guardian_type" value="guardian">Guardian</html:radio></td>
		</tr> --%>
		</tr>

		<tr>
			<td><label for="fname">Occupation of Guardian</label></td>
			<td><html:select property="occupation"
					styleClass="textbox_normal width135">
					<html:option value="">Select</html:option>
					<html:option value="Farmer"></html:option>
					<html:option value="Business"></html:option>
					<html:option value="Service"></html:option>
					<html:option value="Student"></html:option>
					<html:option value="Self Employed"></html:option>
				</html:select></td>
			<td><label for="fname">Upload Student Image</label></td>
			<td colspan="2"><html:file property="photo"></html:file></td>

		</tr>
		<tr>
			<td>Candidate Date Of Birth(DD/MM/YYYY)</td>
			<td><html:text property="dob" styleId="datepicker"
					styleClass="textbox_normal width135"></html:text></td>
			<td><label for="fname">Category</label></td>
			<td><html:select property="category"
					styleClass="textbox_normal width135">
					<html:option value="">Select</html:option>
					<html:option value="GEN">General</html:option>
					<html:option value="OBC">OBC</html:option>
					<html:option value="SC">SC</html:option>
					<html:option value="ST">ST</html:option>
				</html:select></td>

		</tr>
	</table>
</div>