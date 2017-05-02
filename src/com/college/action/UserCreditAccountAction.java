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

public class UserCreditAccountAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String result = "fail";
		DisplayTransactionForm displayTransactionForm = (DisplayTransactionForm)form;
		String startDate = displayTransactionForm.getFromDate();
		String endDate = displayTransactionForm.getToDate();
		String accountHolder = displayTransactionForm.getAccountHolder();
		CLGDao cLGDao = new CLGDaoImpl();
		List<AccountDto> accountDtoList =cLGDao.showUserCreditAccountByDate(accountHolder ,  startDate , endDate);
		if(accountDtoList !=null){
			result="success";
		}
		return mapping.findForward(result);
	}

}
