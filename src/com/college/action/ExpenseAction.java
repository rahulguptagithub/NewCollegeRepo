package com.college.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.college.dao.CLGDao;
import com.college.dao.CLGDaoImpl;
import com.college.exception.InvalidAmountException;
import com.college.exception.NotSufficientBalanceException;
import com.college.form.CreditForm;
import com.college.form.ExpenseForm;
import com.college.util.CollegeUtil;

public class ExpenseAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String result =  "fail";
		HttpSession session = request.getSession();
		if(CollegeUtil.isUserLoggedIn(session)){
		ExpenseForm ef = (ExpenseForm) form;
		if(ef.getExpense() > 0){
		String userName =(String) session.getAttribute("userName");
		CLGDao cLGDao = new CLGDaoImpl();
		boolean isDebited = cLGDao.debitAccount(ef, userName);
		if(isDebited){
			result	="success";
			request.setAttribute("message", "Account Debited successfully!!");
		}
		}else{
			throw new InvalidAmountException();
		}
		return mapping.findForward(result);
		}else{
			return mapping.findForward(result);
		}
	}

}
