package com.college.dto;

import javax.persistence.Column;

public class StudentPaymentDto {

	private String date;
	private double paidFee;
	private String received_by;


	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getPaidFee() {
		return paidFee;
	}
	public void setPaidFee(double paidFee) {
		this.paidFee = paidFee;
	}
	
	public String getReceived_by() {
		return received_by;
	}
	public void setReceived_by(String received_by) {
		this.received_by = received_by;
	}
	public StudentPaymentDto(String date, double paidFee, String received_by) {
		super();
		this.date = date;
		this.paidFee = paidFee;
		this.received_by = received_by;
	}
	
	
}
