package com.college.dao;


public class StaffEntryDAOFactory {
	static StaffEntryPartDAO staffEntryDAO;
	
	
	static{
		staffEntryDAO = new StaffEntryDAO();
	}
	
	public static StaffEntryPartDAO getStaffEntryDAO(){
		return staffEntryDAO;
	}
	
}
