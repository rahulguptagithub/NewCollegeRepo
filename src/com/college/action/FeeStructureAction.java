package com.college.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.college.dao.CLGDao;
import com.college.dao.CLGDaoImpl;
import com.college.dto.FeeStructureDto;
import com.college.form.FeeStructureForm;

public class FeeStructureAction extends Action{
	CLGDao cLGDao = null;
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String result="fail";
		FeeStructureForm feeStructureForm = (FeeStructureForm)form;
		double total_fee = feeStructureForm.getAdmission_fee()+feeStructureForm.getExam_fee()+feeStructureForm.getDevelopment_fee()+feeStructureForm.getCaution_money()+feeStructureForm.getMisc_fee()+feeStructureForm.getPoor_boy_fund()+feeStructureForm.getTution_fee();
		String userName =(String) request.getSession().getAttribute("userName");
		System.out.println("feeStructureForm.getDuration()" + feeStructureForm.getDuration());
		FeeStructureDto feeStructureDto = new FeeStructureDto(feeStructureForm.getSession(),feeStructureForm.getTrade(),feeStructureForm.getDuration(),feeStructureForm.getAdmission_fee(),feeStructureForm.getExam_fee(),feeStructureForm.getTution_fee(),feeStructureForm.getDevelopment_fee(),feeStructureForm.getCaution_money(),feeStructureForm.getMisc_fee(),feeStructureForm.getPoor_boy_fund(),userName,(new java.sql.Date(new Date().getTime())).toString(),total_fee ,"Active","MTPJPL");
		cLGDao =new CLGDaoImpl();
		boolean isSaved =cLGDao.saveFeeStructure(feeStructureDto);
		if(isSaved){
			System.out.println("record saved");
			result = "success";	
			request.setAttribute("message", "Fee Breakup Saved Successfully !!!! \n Thank You...");
		}
		return mapping.findForward(result);
	}
}
