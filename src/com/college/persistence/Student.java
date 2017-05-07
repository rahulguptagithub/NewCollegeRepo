package com.college.persistence;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_table")
public class Student {
	
	@Id
	@Column(name = "sid")
	private String sid;

	@Column(name = "trade")
	private String trade;

	@Column(name = "student_name")
	private String student_name;

	@Column(name = "guardian_type")
	private String guardian_type;

	@Column(name = "guardian_name")
	private String guardian_name;

	@Column(name = "occupation")
	private String occupation;

	@Column(name = "dob")
	private String dob;

	@Column(name = "category")
	private String category;

	
	@Column(name = "fileName")
	private String fileName;

	@Column(name = "admittedBy")
	private String admittedBy;

	@Column(name = "admision_Date")
	private String admision_Date;
	@Column(name = "fee")
	private double fee;
	
	@Column(name = "due_date")
	private String due_date;
	@Column(name = "gender")
	private String gender;
	@Column(name = "session")
	private String session;
	@Column(name = "formNo")
	private String  formNo;
	
	@Column(name = "collegeName")
	private String  collegeName;
	
	@OneToMany(mappedBy="student")
	@JoinColumn(name = "academicRecordsID")
	private Set<AcademicRecords> academicRecords;

	@OneToMany(mappedBy="student")
	@JoinColumn(name = "pAddressId")
	private Set<AddressInfo> permanent_address;
	
	
	public String getFormNo() {
		return formNo;
	}
	public void setFormNo(String formNo) {
		this.formNo = formNo;
	}
	public Set<AcademicRecords> getAcademicRecords() {
		return academicRecords;
	}
	public void setAcademicRecords(Set<AcademicRecords> academicRecords) {
		this.academicRecords = academicRecords;
	}
	public String getSid() {
		return sid;
	}
	

	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Set<AddressInfo> getPermanent_address() {
		return permanent_address;
	}

	public void setPermanent_address(Set<AddressInfo> permanent_address) {
		this.permanent_address = permanent_address;
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
	public String getAdmittedBy() {
		return admittedBy;
	}

	public void setAdmittedBy(String admittedBy) {
		this.admittedBy = admittedBy;
	}

	public String getAdmision_Date() {
		return admision_Date;
	}

	public void setAdmision_Date(String admision_Date) {
		this.admision_Date = admision_Date;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getGuardian_type() {
		return guardian_type;
	}

	public void setGuardian_type(String guardian_type) {
		this.guardian_type = guardian_type;
	}

	public String getGuardian_name() {
		return guardian_name;
	}

	public void setGuardian_name(String guardian_name) {
		this.guardian_name = guardian_name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	
	
	public String getDue_date() {
		return due_date;
	}
	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Student(String sid, String trade, String student_name,
			String guardian_type, String guardian_name, String occupation,
			String dob, String category, String fileName, String admittedBy,
			String admision_Date, double fee ,String due_date,String gender,String session,String formNo , String  collegeName) {
		super();
		this.sid = sid;
		this.trade = trade;
		this.student_name = student_name;
		this.guardian_type = guardian_type;
		this.guardian_name = guardian_name;
		this.occupation = occupation;
		this.dob = dob;
		this.category = category;
		this.fileName = fileName;
		this.admittedBy = admittedBy;
		this.admision_Date = admision_Date;
		this.fee = fee;
		this.due_date = due_date;
		this.gender = gender;
		this.session = session;
		this.formNo = formNo;
		this.collegeName= collegeName;
	}
	public Student() {
		}

}
