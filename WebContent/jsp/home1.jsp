<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html>
<head>
<style type="text/css">
.header {
    height:50px;
    background:#F0F0F0;
    border:1px solid #CCC;
    width:960px;
    margin:0px auto;
}
</style>
</head>
<body>
<table>
<caption><bean:message key="label.college.name"/></caption>
<tr>
<td><h4> <html:link forward="creatUser"> Create New User </html:link></h4></td><td><h4> <html:link forward="admission">Admission</html:link> </h4></td>
</tr>
<tr>
<td><h4> <html:link forward="feeStructure">Create Fee Breakup</html:link> </h4></td><td><h4> <html:link forward="feePayment">Fee Payment</html:link> </h4></td>
</tr>
<tr>
<td><h4> <html:link forward="credit">Credit Amount</html:link> </h4></td><td><h4> <html:link forward="expense">Expense Amount</html:link> </h4></td>
</tr>

<tr>
<td colspan="2"><h4> <html:link forward="generateAdmissionForm">Generate Admission Form</html:link> </h4></td>
</tr>
<tr><td colspan="2"><h4> <html:link forward="transfer">Money Transfer</html:link> </h4></td></tr>









</table>
</body>
</html>