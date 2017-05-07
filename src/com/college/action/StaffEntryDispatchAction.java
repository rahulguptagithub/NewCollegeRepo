package com.college.action;

import org.apache.struts.actions.DispatchAction;

import com.college.student.impl.StaffEntryService;
import com.college.student.impl.StaffEntryServiceImpl;

public class StaffEntryDispatchAction extends DispatchAction{
	static StaffEntryService staffEntryService;
	static{
		staffEntryService= new StaffEntryServiceImpl();
	}

}
