package com.college.dto;

public class CollegeEnquiryTO {
	private String name;
	private String email;
	private String phonenumber;
	private String Stream;
	private String message;
	
	public CollegeEnquiryTO(){}
	
	public CollegeEnquiryTO(String name,String email,String phonenumber,String Stream,String message){
		this.name=name;
		this.email=email;
		this.phonenumber=phonenumber;
		this.Stream=Stream;
		this.message=message;
		
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

	public String getStream() {
		return Stream;
	}

	public void setStream(String stream) {
		Stream = stream;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
