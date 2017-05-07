package com.college.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.college.dto.CollegeEnquiryTO;
import com.college.form.StudentSubmitEnquiryValidationForm;


public class CollegeAction extends CollegeDispatchAction {

	public ActionForward addStudentEnquiry(ActionMapping am, ActionForm af,
			HttpServletRequest req, HttpServletResponse res) {
		String result ="fail";
		System.out.println("action class method called");
		StudentSubmitEnquiryValidationForm studentSubmitEnquiryValidationForm = (StudentSubmitEnquiryValidationForm) af;
		CollegeEnquiryTO collegeEnquiryTO = new CollegeEnquiryTO(
				studentSubmitEnquiryValidationForm.getName(),
				studentSubmitEnquiryValidationForm.getEmail(),
				studentSubmitEnquiryValidationForm.getPhonenumber(),
				studentSubmitEnquiryValidationForm.getStream(),
				studentSubmitEnquiryValidationForm.getMessage());
		boolean isAdded = collegeEnquiryService.addStudentEnquiry(collegeEnquiryTO);
		if(isAdded){
			result ="success";
			req.setAttribute("message", "Student Enquiry added successfully!!");
		}
		return am.findForward(result);

	}

}
