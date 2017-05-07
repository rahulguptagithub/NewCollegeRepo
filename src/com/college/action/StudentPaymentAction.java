package com.college.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.college.dao.CLGDao;
import com.college.dao.CLGDaoImpl;
import com.college.form.FeePaymentForm;

public class StudentPaymentAction extends Action{
@Override
public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	String result = "fail";
	
	FeePaymentForm feePaymentForm =(FeePaymentForm )form;
	
	CLGDao  CLGDao = new CLGDaoImpl();
	boolean isUpdated = CLGDao.updateStudentFee(feePaymentForm ,(String) request.getSession().getAttribute("userName") );
	if(isUpdated){
		result = "success";
		request.setAttribute("message", "Payment done Successfully!!!!!");
	}
	
	return mapping.findForward(result);
}
}
