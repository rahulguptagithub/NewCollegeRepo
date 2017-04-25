package com.college.action;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;

import com.college.dao.CLGDao;
import com.college.dao.CLGDaoImpl;
import com.college.dto.FeeStructureDto;
import com.college.pdf.generator.PDFGenerator;

public class GenerateFeeStructuredAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String result ="fail";
		DynaValidatorForm dvf=(DynaValidatorForm) form;
		String trade = dvf.getString("trade");
		String session =dvf.getString("session");
		ServletContext ctx =request.getSession().getServletContext();
		CLGDao cLGDao = new CLGDaoImpl();
		List<FeeStructureDto> feeStructureDtoList = cLGDao.fetchFeeStructureDetail(trade , session ,ctx );
		//PDFGenerator 
		return mapping.findForward(result);
	}
}
