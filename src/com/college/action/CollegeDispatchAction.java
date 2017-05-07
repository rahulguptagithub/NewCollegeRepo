package com.college.action;

import org.apache.struts.actions.DispatchAction;

import com.college.student.impl.CollegeEnquiryService;
import com.college.student.impl.CollegeEnquiryServiceImpl;

public class CollegeDispatchAction extends DispatchAction{
	static CollegeEnquiryService collegeEnquiryService;
	static{
		collegeEnquiryService= new CollegeEnquiryServiceImpl();
	}

}
