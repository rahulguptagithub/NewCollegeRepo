package com.college.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.college.dao.CLGDao;
import com.college.dao.CLGDaoImpl;
import com.college.dto.ForgotPasswordDto;
import com.college.form.ForgotPasswordForm;
import com.college.util.CollegeUtil;

public class ForgotPasswordAction extends Action{

@Override
public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	System.out.println("execute method of ForgotPasswordAction called" );
	String result = "fail";
	ForgotPasswordDto frgtPwdDto = new ForgotPasswordDto();
	
	ForgotPasswordForm frgtPwd = (ForgotPasswordForm)form;
	if( frgtPwd.getEmail()==""){
		frgtPwd.setEmail(null);
	}
	if(frgtPwd.getMobileno()==""){
		frgtPwd.setMobileno(null);
	}
	if(frgtPwd.getMobileno() == null && frgtPwd.getEmail() == null){
		//throw exception
	}
	System.out.println("execute method of ForgotPasswordAction with frgtPwdDto" + frgtPwdDto.getEmail() +frgtPwdDto.getMobileno());
	frgtPwdDto.setEmail(frgtPwd.getEmail());
	frgtPwdDto.setMobileno(frgtPwd.getMobileno());
	CLGDao cLGDao = new CLGDaoImpl();
	System.out.println("execute method of ForgotPasswordAction with frgtPwd" + frgtPwd.getEmail() +frgtPwd.getMobileno());
	String pwd = cLGDao.recoverPassword(frgtPwdDto);
	System.out.println("pwd"+pwd);
	if(pwd != null){
	CollegeUtil.sendPassword(pwd, frgtPwdDto);
	request.setAttribute("message", "Password has been sent to your provided source i.e Either mobile or email or both");
	result = "success";
	}
	System.out.println("exiting from ForgotPasswordAction with response\t"+result);
	return mapping.findForward(result);
}
}
