package com.college.dao;

import org.apache.struts.action.ActionServlet;

import com.college.dto.StaffEntryTO;

public interface StaffEntryPartDAO {
	

	public boolean addStaffEnquiry(StaffEntryTO staffEntryTO);
}
