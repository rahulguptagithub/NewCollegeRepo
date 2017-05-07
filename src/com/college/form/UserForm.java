package com.college.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

public class UserForm extends ValidatorForm{
	/**
	 * @author Ramesh
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String  password;
	private String  cpassword;
	private String  role;
	private String  status;
	private String  mobileno;
	private String  email;
	
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.cpassword = null;
		this.username = null;
		this.password = null;
		this.mobileno = null;
		this.role = null;
		this.status = null;
		this.email = null;
	}
	/*public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors actionError = new ActionErrors();
		if (username == null || username.length() == 0) {
			actionError.add("username", new ActionError("error.uname.required"));
		}
		if (password == null || password.length() == 0) {
			actionError.add("password", new ActionError("error.psw.required"));
		}
		if (cpassword == null || cpassword.length() == 0) {
			actionError.add("cpassword", new ActionError("error.psw.required"));
		}
		if(password != null && cpassword !=null && !cpassword.equals(password)){
			actionError.add("cpassword", new ActionError("error.psw.equal"));
		}
		if(mobileno == null || mobileno.length()==0){
			actionError.add("mobileno", new ActionError("error.mobileno.required"));
		}else if(mobileno.length() !=10){
			actionError.add("mobileno", new ActionError("error.length.required"));
		}
		if(role.equalsIgnoreCase("--Select--")){
			actionError.add("role", new ActionError("error.select.role"));	
		}
		if(status.equalsIgnoreCase("--Select--")){
			actionError.add("status", new ActionError("error.select.status"));	
		}
		return actionError;
	}
*/}
