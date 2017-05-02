<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%-- 
<html>
<head>
<style>
.button {
	background-color: #4CAF50; /* Green */
	border: none;
	color: white;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
	width: 80%;
}

.button a {
	text-decoration: none;
}

.button2 {
	padding: 12px 28px;
}
</style>

</head>
<body>
 --%>
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
					<html:link styleClass="btn btn-primary btn-block" forward="displayTransaction">Show Transaction</html:link>
			</h4></td>
	</tr>

</table>

<%-- </body>
</html> --%>