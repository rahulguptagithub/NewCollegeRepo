package com.college.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorActionForm;

public class FeePaymentForm extends ValidatorActionForm{
	
	private String trade; 
	private String session;
	private String sid;
	private double fee;
	private String note;
	public String getTrade() {
		return trade;
	}
	public void setTrade(String trade) {
		this.trade = trade;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		trade = null;
		session= null;
		sid = null;
		note= null;
		fee = 0.0;
	}
	

}
