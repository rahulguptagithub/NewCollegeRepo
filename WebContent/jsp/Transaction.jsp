<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>



<logic:iterate id="adto" name="ADL" scope="session" type="com.college.dto.AccountDto">

<html:form action="/reportSubmit" method="post">
<table>
<tr><td><html:text property="mCreditAmount" value="${adto.creditAmount}"/></td><td><html:text property="mDebitAmount" value="${adto.debitAmount}"/></td>

<td><html:text property="mNoteAgainst" value="${adto.noteAgainst}"/></td><td><html:text property="mTxDate" value="${adto.txDate}"/></td>

</tr>

</table>
</html:form>
</logic:iterate>
