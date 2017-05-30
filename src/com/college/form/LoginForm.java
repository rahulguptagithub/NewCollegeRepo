package com.college.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

public class LoginForm extends ValidatorForm{
	/**
	 * @author Ramesh
	 */
	private static final long serialVersionUID = 1L;
	private String password;
	private String username;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.username = null;
		this.password = null;
	}
	
	

}
