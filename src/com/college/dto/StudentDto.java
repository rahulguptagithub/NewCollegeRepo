package com.college.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import org.apache.struts.upload.FormFile;

import com.college.persistence.AcademicRecords;
import com.college.persistence.AddressInfo;

public class StudentDto {

	private static final long serialVersionUID = 1L;
	
	private String trade;

	private String student_name;

	private String guardian_type;

	private String guardian_name;

	private String occupation;

	private String dob;

	private String category;
	private double fee;
	
	private String session;
	private String gender;
	private String due_date;
	private String formNo;
	
	private String admittedBy;

	private String admision_Date;

	
	private Set<AcademicRecordsDto> academicRecordsSet;

	private Set<AddressInfoDto> permanentAddressSet;

	/*private Set<StudentPaymentDto> StudentPaymentSet;*/
	
	
	public String getSession() {
		return session;
	}

	public String getFormNo() {
		return formNo;
	}

	public void setFormNo(String formNo) {
		this.formNo = formNo;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDue_date() {
		return due_date;
	}

	public void setDue_date(String due_date) {
		this.due_date = due_date;
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

	

	public Set<AcademicRecordsDto> getAcademicRecordsSet() {
		return academicRecordsSet;
	}

	public void setAcademicRecordsSet(Set<AcademicRecordsDto> academicRecordsSet) {
		this.academicRecordsSet = academicRecordsSet;
	}

	public Set<AddressInfoDto> getPermanentAddressSet() {
		return permanentAddressSet;
	}

	public void setPermanentAddressSet(Set<AddressInfoDto> permanentAddressSet) {
		this.permanentAddressSet = permanentAddressSet;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	
	/*public Set<StudentPaymentDto> getStudentPaymentSet() {
		return StudentPaymentSet;
	}

	public void setStudentPaymentSet(Set<StudentPaymentDto> studentPaymentSet) {
		StudentPaymentSet = studentPaymentSet;
	}
*/
	public StudentDto(String trade, String student_name, String guardian_type,
			String guardian_name, String occupation, String dob,
			String category, double fee, String admittedBy,
			String admision_Date,String session ,String gender,String due_date ,Set<AcademicRecordsDto> academicRecordsSet,
			Set<AddressInfoDto> permanentAddressSet ,String formNo/*, Set<StudentPaymentDto> studentPaymentSet*/) {
		super();
		this.trade = trade;
		this.student_name = student_name;
		this.guardian_type = guardian_type;
		this.guardian_name = guardian_name;
		this.occupation = occupation;
		this.dob = dob;
		this.category = category;
		this.fee = fee;
		this.admittedBy = admittedBy;
		this.admision_Date = admision_Date;
		this.due_date = due_date;
		this.gender = gender;
		this.session = session;
		this.academicRecordsSet = academicRecordsSet;
		this.permanentAddressSet = permanentAddressSet;
		this.formNo = formNo;
		//this.StudentPaymentSet = studentPaymentSet;
	}

	public StudentDto(){}
		
}
