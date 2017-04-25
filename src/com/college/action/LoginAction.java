package com.college.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.college.dao.CLGDao;
import com.college.dao.CLGDaoImpl;
import com.college.dto.LoginDto;
import com.college.exception.CredentialException;
import com.college.form.LoginForm;

public class LoginAction extends Action{

public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	String result = "";
	LoginDto loginDto= new LoginDto();
	CLGDao clgDao = new CLGDaoImpl();
	LoginForm loginForm =(LoginForm)form;
	loginDto.setUsername(loginForm.getUsername());
	loginDto.setPassword(loginForm.getPassword());
	if(clgDao.verifyloginCredential(loginDto ,request)){
		result = "home";
	}
	else{
		System.out.println("elsddghdhfhfhf");
		throw new CredentialException();
	}
	System.out.println("session attribute in loginActionn"+request.getSession().getAttribute("role"));
	System.out.println("exitin with result value"+ result);
	return mapping.findForward(result);
}
}
