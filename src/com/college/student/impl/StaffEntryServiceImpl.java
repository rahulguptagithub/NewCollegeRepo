package com.college.student.impl;

import com.college.dao.StaffEntryDAOFactory;
import com.college.dto.StaffEntryTO;

public class StaffEntryServiceImpl implements StaffEntryService {

	@Override
	public boolean addStaffEnquiry(StaffEntryTO staffEntryEnquiry) {
		return StaffEntryDAOFactory.getStaffEntryDAO().addStaffEnquiry(staffEntryEnquiry);
	}

}
