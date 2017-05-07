package com.college.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

@Entity
@Table(name="staff_entry")
public class StaffEntry {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="empId")
	private int empId;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="phonenumber")
	private String phoneNumber;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="doj")
	private String doj;
	
	@Column(name="address")
	private String address;
	
	@Column(name="type")
	private String type;
	
	@Column(name="experties")
	private String experties;
	
	public StaffEntry(){
		System.out.println("Default");
		
	}
		
	
	public StaffEntry(String name, String email, String phoneNumber,
			String gender, String dob, String doj, String address, String type,
			String experties) {  
		
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
