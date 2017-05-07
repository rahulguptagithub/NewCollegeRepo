package com.college.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.college.dto.StaffEntryTO;
import com.college.persistence.StaffEntry;


public class StaffEntryDAO implements StaffEntryPartDAO {

	@Override
	public boolean addStaffEnquiry(StaffEntryTO staffEntryTO) {
		boolean isAdded=  false;
		try {
			SessionFactory sessionFactory = ConnectionUtil.getfactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			StaffEntry studentEnquiry = new StaffEntry(staffEntryTO.getName(),
					staffEntryTO.getEmail(), staffEntryTO.getPhonenumber(),
					staffEntryTO.getGender(), staffEntryTO.getDob(),
					staffEntryTO.getDoj(), staffEntryTO.getAddress(),
					staffEntryTO.getType(), staffEntryTO.getExperties());
			session.save(studentEnquiry);
			
			session.getTransaction().commit();
			session.close();
			isAdded =true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  isAdded;
	}

}
