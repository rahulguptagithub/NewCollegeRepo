package com.college.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.college.dao.CLGDao;
import com.college.dao.CLGDaoImpl;
import com.college.form.TransferForm;
import com.college.util.CollegeUtil;

public class TransferAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String result = "fail";
		HttpSession session = request.getSession();
		if(CollegeUtil.isUserLoggedIn(session)){
		ActionErrors actnErrs = new ActionErrors();
		TransferForm transferForm =(TransferForm)form;
		String userName =(String) session.getAttribute("userName");
		if(transferForm.getFromAccount().equalsIgnoreCase(transferForm.getToAccount())){
			System.out.println("----both account equal------");
			actnErrs.add("fromAndToEqual", new ActionError("error.both.account.equal"));
			saveErrors(request, actnErrs);
		}
		else{
			CLGDao cLGDao = new CLGDaoImpl();
			cLGDao.transferFund(transferForm, userName);
			result="success";
			request.setAttribute("message", "Amount Transfered Successfully!!");
		}
		return mapping.findForward(result);
		}else{
			return mapping.findForward(result);
		}
	}

}
