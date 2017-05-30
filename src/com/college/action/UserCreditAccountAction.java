package com.college.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.college.dao.CLGDao;
import com.college.dao.CLGDaoImpl;
import com.college.dto.AccountDto;
import com.college.form.DisplayTransactionForm;
import com.college.util.CollegeUtil;

public class UserCreditAccountAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String result = "fail";
		HttpSession session = request.getSession();
		if(CollegeUtil.isUserLoggedIn(session)){
		DisplayTransactionForm displayTransactionForm = (DisplayTransactionForm)form;
		String startDate = displayTransactionForm.getFromDate();
		String endDate = displayTransactionForm.getToDate();
		System.out.println("startDate"+ startDate);
		System.out.println("endDate"+ endDate);
		String accountHolder = displayTransactionForm.getAccountHolder();
		CLGDao cLGDao = new CLGDaoImpl();
		List<AccountDto> accountDtoList =cLGDao.showUserCreditAccountByDate(accountHolder ,  startDate , endDate);
		if(accountDtoList !=null){
			result="success";
			request.getSession().setAttribute("ADL", accountDtoList);
		}
		System.out.println("returning with "+ result);
			return mapping.findForward(result);
		}else{
			return mapping.findForward(result);	
		}
	}

}
