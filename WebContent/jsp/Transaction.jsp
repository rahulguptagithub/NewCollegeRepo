<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>


<html:form action="/reportSubmit" method="post">

	<div class="panel panel-danger">
		<div class="panel-heading">
			<div>
				<b class="text-primary">Voucher Creation Window</b>
			</div>
		</div>
		<div class="panel-body">
			<!-- <div class="col-md-12"> -->
				<html:errors />
				
				<div class="row">
				<div class="col-md-1"><label for="fname" class="text-primary">SL No.</label></div>
				<div class="col-md-1"><label for="fname" class="text-primary">Select</label></div>
				<div class="col-md-2"><label for="fname" class="text-primary">Credit Amount</label></div>
				<div class="col-md-2"><label for="fname" class="text-primary">Debit Amount</label></div>
				<div class="col-md-4"><label for="fname" class="text-primary">Description </label></div>
				<div class="col-md-2"><label for="fname" class="text-primary">Transaction Date</label></div>
				</div>
				<%int slNo=1; %>
<logic:iterate id="adto" name="ADL" scope="session"
					type="com.college.dto.AccountDto">

<div class="row" >
  <div class="col-md-1"><label for="fname" class="text-primary" ><%=slNo++ %></label></div>
  <div class="col-md-1"><html:checkbox property="mTxId" value="${adto.txId}"
							styleClass="form-control" /></div>
  <div class="col-md-2"><html:text property="mCreditAmount" value="${adto.creditAmount}"
							readonly="true" styleClass="form-control" /></div>
  <div class="col-md-2"><html:text property="mDebitAmount" value="${adto.debitAmount}"
							readonly="true" styleClass="form-control" /></div>
  <div class="col-md-4"><html:text property="mNoteAgainst" value="${adto.noteAgainst}"
							readonly="true"  styleClass="form-control" /></div>
  <div class="col-md-2"><html:text property="mTxDate" value="${adto.txDate}"
							readonly="true"  styleClass="form-control" /></div>

</div>
</logic:iterate>
	<div class="form-group">
					<div>
						<html:submit value="Generate Vaoucher" styleClass="btn btn-primary"></html:submit>
					</div>
				</div>		
			</div>
</div>
</html:form>

