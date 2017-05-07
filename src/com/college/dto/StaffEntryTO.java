package com.college.dto;

public class StaffEntryTO {
	
	private int empId;
	private String name;
	private String email;
	private String phonenumber;
	private String gender;
	private String dob;
	private String doj;
	private String address;
	private String type;
	private String experties;
	
	public StaffEntryTO(){}
	
	public StaffEntryTO(String name, String email, String phonenumber,
			String gender, String dob, String doj, String address, String type,
			String experties) {
		super();
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.gender = gender;
		this.dob = dob;
		this.doj = doj;
		this.address = address;
		this.type = type;
		this.experties = experties;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExperties() {
		return experties;
	}

	public void setExperties(String experties) {
		this.experties = experties;
	}
	
	
}
