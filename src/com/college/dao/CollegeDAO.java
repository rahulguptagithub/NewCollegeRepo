package com.college.dao;

import org.apache.struts.action.ActionServlet;

import com.college.dto.CollegeEnquiryTO;


public interface CollegeDAO {
	

	public boolean addStudentEnquiry(CollegeEnquiryTO collegeEnquiryTO);
}
