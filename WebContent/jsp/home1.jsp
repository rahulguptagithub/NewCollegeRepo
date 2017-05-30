<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
 <table>
	<tr>
		<td><h4>
					<html:link forward="creatUser" styleClass="btn btn-primary btn-block"> Create New User </html:link>
			</h4></td>
	<tr>
		<td><h4>
				<html:link styleClass="btn btn-primary btn-block" forward="admission">Admission</html:link>
			</h4></td>
	</tr>

	<tr>
		<td><h4>
				<html:link styleClass="btn btn-primary btn-block" forward="feeStructure">Create Fee Structure</html:link>
			</h4></td>
	<tr>
		<td><h4>
					<html:link forward="feePayment" styleClass="btn btn-primary btn-block">Fee Payment</html:link>
			</h4></td>
	</tr>
	<tr>
		<td><h4>
					<html:link forward="credit" styleClass="btn btn-primary btn-block">Credit Amount</html:link>
			</h4></td>
	</tr>
	<tr>
		<td><h4>
					<html:link styleClass="btn btn-primary btn-block" forward="expense">Expense Amount</html:link>
			</h4></td>
	</tr>

	<tr>
		<td><h4>
					<html:link styleClass="btn btn-primary btn-block" forward="generateAdmissionForm">Generate Admission Form</html:link>
			</h4></td>
	</tr>
	<tr>
		<td><h4>
					<html:link styleClass="btn btn-primary btn-block" forward="transfer">Money Transfer</html:link>
			</h4></td>
	</tr>

	<tr>
		<td><h4>
					<html:link styleClass="btn btn-primary btn-block" forward="generateFeeStructure">Generate Fee Structure</html:link>
			</h4></td>
	</tr>
	
	<tr>
		<td><h4>
					<html:link styleClass="btn btn-primary btn-block" forward="displayTransaction">Debit/Credit Voucher</html:link>
			</h4></td>
	</tr>
	
	<tr>
		<td><h4>
					<html:link styleClass="btn btn-primary btn-block" forward="displayStatement">Statement</html:link>
			</h4></td>
	</tr>


<tr>
		<td><h4>
					<html:link styleClass="btn btn-primary btn-block" forward="staffEntry">Staff Entry</html:link>
			</h4></td>
	</tr>

<tr>
		<td><h4>
					<html:link styleClass="btn btn-primary btn-block" forward="collegeEnquiry">College Enquiry</html:link>
			</h4></td>
	</tr>
	
	<tr>
		<td><h4>
		<html:form action="/logOutSubmit" method="post">
		<html:submit value="Log Out" styleClass="btn btn-primary btn-block"></html:submit>
		</html:form>
		</h4></td>
	</tr>

</table>
