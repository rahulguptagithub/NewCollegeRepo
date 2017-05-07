package com.college.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

public class ForgotPasswordForm extends ValidatorForm{

	/**
	 * @author Ramesh
	 * @
	 */
	private static final long serialVersionUID = 1L;
	private String email=null;
	private String mobileno =null;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.email = null;
		this.mobileno=null;
	}
}
