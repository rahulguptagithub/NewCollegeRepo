package com.college.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.college.dto.CollegeEnquiryTO;
import com.college.persistence.StudentEnquiry;



public class StudentEnquiryDAO implements CollegeDAO{

	@Override
	public boolean addStudentEnquiry(CollegeEnquiryTO collegeEnquiryTO) {
		boolean isAdded=  false;
		try {
			SessionFactory sessionFactory = ConnectionUtil.getfactory();
			Session session= sessionFactory.openSession();
			session.beginTransaction();
			StudentEnquiry  studentEnquiry = new StudentEnquiry(collegeEnquiryTO.getName(),collegeEnquiryTO.getEmail(),collegeEnquiryTO.getPhonenumber(),collegeEnquiryTO.getStream(),collegeEnquiryTO.getMessage());
			session.save(studentEnquiry);
			session.getTransaction().commit();
			session.close();
			isAdded=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isAdded;
	}

	
	 
	
	}

	


