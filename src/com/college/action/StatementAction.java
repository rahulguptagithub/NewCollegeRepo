package com.college.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.college.dao.CLGDao;
import com.college.dao.CLGDaoImpl;
import com.college.dto.AccountDto;
import com.college.form.DisplayTransactionForm;
import com.college.form.TransactionForm;

public class StatementAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String result = "fail";
		TransactionForm transactionForm = (TransactionForm)form;
		String startDate = transactionForm.getFromDate();
		String endDate = transactionForm.getToDate();
		System.out.println("startDate"+ startDate);
		System.out.println("endDate"+ endDate);
		String accountHolder = transactionForm.getAccountHolder();
		CLGDao cLGDao = new CLGDaoImpl();
		List<AccountDto> accountDtoList =cLGDao.showTransaction(accountHolder ,  startDate , endDate);
		if(accountDtoList !=null){
			result="success";
			request.getSession().setAttribute("ADLR", accountDtoList);
			request.getSession().setAttribute("FROM_DATE", startDate);
			request.getSession().setAttribute("TO_DATE", endDate);
		}
		
		System.out.println("returning with "+ result);
		return mapping.findForward(result);

	}

}
