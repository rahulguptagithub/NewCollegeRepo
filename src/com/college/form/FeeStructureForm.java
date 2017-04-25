package com.college.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorActionForm;

public class FeeStructureForm extends ValidatorActionForm{
	
	/**
	 * @author Ramesh
	 */
	private static final long serialVersionUID = 1L;
	private String session;
	private String trade;
	private int duration;
	private double admission_fee;
	private double exam_fee;
	private double tution_fee;
	private double development_fee;
	private double caution_money;
	private double misc_fee;
	private double poor_boy_fund;
	
	
	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
	}

	

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getAdmission_fee() {
		return admission_fee;
	}

	public void setAdmission_fee(double admission_fee) {
		this.admission_fee = admission_fee;
	}

	public double getExam_fee() {
		return exam_fee;
	}

	public void setExam_fee(double exam_fee) {
		this.exam_fee = exam_fee;
	}

	public double getTution_fee() {
		return tution_fee;
	}

	public void setTution_fee(double tution_fee) {
		this.tution_fee = tution_fee;
	}

	public double getDevelopment_fee() {
		return development_fee;
	}

	public void setDevelopment_fee(double development_fee) {
		this.development_fee = development_fee;
	}

	public double getCaution_money() {
		return caution_money;
	}

	public void setCaution_money(double caution_money) {
		this.caution_money = caution_money;
	}

	public double getMisc_fee() {
		return misc_fee;
	}

	public void setMisc_fee(double misc_fee) {
		this.misc_fee = misc_fee;
	}

	public double getPoor_boy_fund() {
		return poor_boy_fund;
	}

	public void setPoor_boy_fund(double poor_boy_fund) {
		this.poor_boy_fund = poor_boy_fund;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
	 this.session = null;
	 this.trade = null;
	 this.duration= 0;
	 this.admission_fee =0.0;
	 this.exam_fee = 0.0;
	 this.tution_fee = 0.0;
	 this.development_fee  = 0.0;
	 this.caution_money = 0.0;
	 this.misc_fee = 0.0;
	 this.poor_boy_fund = 0.0;
}
}
