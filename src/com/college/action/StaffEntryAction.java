package com.college.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.college.dto.StaffEntryTO;
import com.college.form.StaffEntrySubmitValidationForm;
import com.college.student.impl.StaffEntryService;
import com.college.student.impl.StaffEntryServiceImpl;


public class StaffEntryAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ActionForward af = addStaffEnquiry(mapping,form,request,response);
		return af;
	}

	public ActionForward addStaffEnquiry(ActionMapping am, ActionForm af,
			HttpServletRequest req, HttpServletResponse res) {
		String result ="fail";
		StaffEntryService staffEntryService= new StaffEntryServiceImpl();
		System.out.println("action class method called");
		StaffEntrySubmitValidationForm staffEntrySubmitValidationForm = (StaffEntrySubmitValidationForm) af;
		StaffEntryTO staffEntryTO = new StaffEntryTO(
				staffEntrySubmitValidationForm.getName(),
				staffEntrySubmitValidationForm.getEmail(),
				staffEntrySubmitValidationForm.getPhonenumber(),
				staffEntrySubmitValidationForm.getGender(),
				staffEntrySubmitValidationForm.getDob(),
				staffEntrySubmitValidationForm.getDoj(),
				staffEntrySubmitValidationForm.getAddress(),
				staffEntrySubmitValidationForm.getType(),
				staffEntrySubmitValidationForm.getExperties());
		boolean isAdded = staffEntryService.addStaffEnquiry(staffEntryTO);
		if(isAdded){
			result ="success";
			req.setAttribute("message", "Staff record added successfully!!");
		}
		System.out.println("Record submitted");
		return am.findForward(result);

	}

}
