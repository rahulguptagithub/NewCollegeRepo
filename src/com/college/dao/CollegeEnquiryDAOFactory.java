package com.college.dao;


public class CollegeEnquiryDAOFactory {
	static CollegeDAO collegeDAO;
	
	
	static{
		collegeDAO = new StudentEnquiryDAO();
	}
	
	public static CollegeDAO getCollegeDAO(){
		return collegeDAO;
	}
	
}
