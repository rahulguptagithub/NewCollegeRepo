package com.college.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AdmissionForm {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="formId")
	private int formId;
@Column(name="created_date")
	private String created_date;
@Column(name="created_by")
	private String created_by ;
@Column(name="status")
	private String status;
@Column(name="collegeName")
private String collegeName;

public int getFormId() {
	return formId;
}
public void setFormId(int formId) {
	this.formId = formId;
}
public String getCreated_date() {
	return created_date;
}
public void setCreated_date(String created_date) {
	this.created_date = created_date;
}
public String getCreated_by() {
	return created_by;
}
public void setCreated_by(String created_by) {
	this.created_by = created_by;
}
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
public AdmissionForm(String created_date, String created_by, String status,String collegeName) {
	super();
	this.created_date = created_date;
	this.created_by = created_by;
	this.status = status;
	this.collegeName=collegeName;
}
public AdmissionForm(){}
}
