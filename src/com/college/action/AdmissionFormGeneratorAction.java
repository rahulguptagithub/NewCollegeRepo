package com.college.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.college.dao.CLGDao;
import com.college.dao.CLGDaoImpl;
import com.college.pdf.generator.PDFGenerator;

public class AdmissionFormGeneratorAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String result = "fail";
		ServletContext ctx =request.getSession().getServletContext();
		String userName =(String) request.getSession().getAttribute("userName");
		//PDFGenerator pdfGeneretor = new PDFGenerator();
		CLGDao cLGDao = new CLGDaoImpl();
		int formNo = cLGDao.generateAdmissionForm(userName);
		if(formNo !=0){
			String formName = PDFGenerator.createPDFAdmissionForm(ctx , formNo);
			request.setAttribute("message","Admission Form Generated Successfully Click Below button to Download");
			request.setAttribute("formName",formName);
			result ="success";
		}
		return mapping.findForward(result);
	}

}
