package com.college.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_enquiry")
public class StudentEnquiry {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="enquiryId")
	private int enquiryId;
	
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="phonenumber")
	private String phoneNumber;
	
	@Column(name="trade")
	private String stream;
	
	@Column(name="Message")
	private String message;
	
	public StudentEnquiry(){}
		
	public StudentEnquiry(String name, String email, String phoneNumber, String stream,
			String message) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.stream = stream;
		this.message = message;
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
	public String getSubject() {
		return stream;
	}
	public void setSubject(String stream) {
		this.stream = stream;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public int getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
	}
	
}
