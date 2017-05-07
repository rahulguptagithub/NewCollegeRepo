package com.college.persistence;

import javax.persistence.*;

@Entity
@Table(name="StudentPayment")
public class StudentPayment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="paymentId")
	private int paymentId;
	@Column(name="date")
	private String date;
	@Column(name="paidFee")
	private double paidFee;
	@Column(name="received_by")
	private String received_by;
	@Column(name="sid")
	private String sid;
	@Column(name="collegeName")
	private String collegeName;
	
	public String getReceived_by() {
		return received_by;
	}
	public void setReceived_by(String received_by) {
		this.received_by = received_by;
	}
	
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
	
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public StudentPayment(){}
	public StudentPayment(String date, double paidFee,
			String received_by ,String sid , String collegeName) {
		super();
		this.date = date;
		this.paidFee = paidFee;
		this.received_by = received_by;
		this.sid = sid;
		this.collegeName=collegeName;
	}
	

}
