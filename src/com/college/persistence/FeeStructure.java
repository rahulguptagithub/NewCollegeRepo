package com.college.persistence;

import javax.persistence.*;

@Entity
@Table(name="fee_structure_table")
public class FeeStructure {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="feeId")
	private int feeId;
	@Column(name="session")
	private String session;
	@Column(name="trade")
	private String trade;
	@Column(name="duration")
	private int duration;
	@Column(name="admission_fee")
	private double admission_fee;
	@Column(name="exam_fee")
	private double exam_fee;
	@Column(name="tution_fee")
	private double tution_fee;
	@Column(name="development_fee")
	private double development_fee;
	@Column(name="caution_money")
	private double caution_money;
	@Column(name="misc_fee")
	private double misc_fee;
	@Column(name="poor_boy_fund")
	private double poor_boy_fund;
	@Column(name="updated_by")
	private String updated_by;
	@Column(name="updated_date")
	private String updated_date;
	@Column(name="total_fee")
	private double total_fee;
	
	@Column(name="status")
	private String status;
	@Column(name="collegeName")
	private String collegeName;
	
	

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getFeeId() {
		return feeId;
	}
	public void setFeeId(int feeId) {
		this.feeId = feeId;
	}
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
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public String getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}
	public double getTotal_fee() {
		return total_fee;
	}
	public void setTotal_fee(double total_fee) {
		this.total_fee = total_fee;
	}
	
	public FeeStructure(){}
	public FeeStructure(String session, String trade, int duration,
			double admission_fee, double exam_fee, double tution_fee,
			double development_fee, double caution_money, double misc_fee,
			double poor_boy_fund, String updated_by, String updated_date,
			double total_fee ,String collegeName ,String status) {
		super();
		this.session = session;
		this.trade = trade;
		this.duration = duration;
		this.admission_fee = admission_fee;
		this.exam_fee = exam_fee;
		this.tution_fee = tution_fee;
		this.development_fee = development_fee;
		this.caution_money = caution_money;
		this.misc_fee = misc_fee;
		this.poor_boy_fund = poor_boy_fund;
		this.updated_by = updated_by;
		this.updated_date = updated_date;
		this.total_fee = total_fee;
		this.status = status;
		this.collegeName = collegeName;
	}
	
	
	
}
