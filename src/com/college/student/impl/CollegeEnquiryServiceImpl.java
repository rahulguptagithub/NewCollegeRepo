package com.college.student.impl;

import org.apache.struts.action.ActionServlet;

import com.college.dao.CollegeEnquiryDAOFactory;
import com.college.dto.CollegeEnquiryTO;

public class CollegeEnquiryServiceImpl implements CollegeEnquiryService {

	@Override
	public boolean addStudentEnquiry(CollegeEnquiryTO collegeEnquiry) {
		return CollegeEnquiryDAOFactory.getCollegeDAO().addStudentEnquiry(collegeEnquiry);
	}

}
