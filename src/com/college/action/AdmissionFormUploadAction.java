package com.college.action;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import com.college.dao.CLGDao;
import com.college.dao.CLGDaoImpl;
import com.college.dto.StudentDto;
import com.college.form.AdmissionForm;
import com.college.pdf.generator.PDFGenerator;
import com.college.student.impl.StudentImpl;
import com.college.student.impl.StudentInterface;

public class AdmissionFormUploadAction extends Action{
	StudentInterface studentInterface = null;
	CLGDao cLGDao = null;
	String result;
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		result = "fail";
		System.out.println("entering to execute method of AdmissionFormUploadAction");
		AdmissionForm admissionForm = (AdmissionForm)form;
		FormFile image = (FormFile)admissionForm.getPhoto();
		ServletContext ctx =request.getSession().getServletContext();
		String filePath = ctx.getRealPath("/")+"photo";
		String fileName = image.getFileName();
		System.out.println("filePath\t"+ filePath);
		File folder = new File(filePath);
	    if(!folder.exists()){
		folder.mkdir();
		}
       if(!("").equals(fileName)){
		   String userName =(String) request.getSession().getAttribute("userName");
		   studentInterface = new StudentImpl();
		   StudentDto studentDto = studentInterface.populateStudentDetails(admissionForm ,userName);
		   cLGDao = new CLGDaoImpl();
		   String sid =  cLGDao.saveStudent(studentDto);
		   if(sid !=null){
		   request.setAttribute("message","Form Submitted successfully against Student Id\t"+ sid+"\tDownload Fee Receipt");
		   //request.setAttribute("file","Student"+"MTPJPL-001.pdf");
		   String fileNewName = sid+".jpeg";
		   File newFile = new File(filePath,fileNewName );
		   if(!newFile.exists()){
			   	FileOutputStream fos = new FileOutputStream(newFile);
			   	fos.write(image.getFileData());
			   	fos.flush();
			   	fos.close();
		   }
	   	PDFGenerator pdfGeneretor = new PDFGenerator();
	   	String receiptName = pdfGeneretor.generatoFeeReceipt(studentDto, sid, ctx);
	   	request.setAttribute("file",receiptName);
	   
	  // pdfGeneretor.generatoFeeReceipt(studentDto , sid , fileNewName ,ctx);
	   result = "success";
	   }
	}
   
    
	return mapping.findForward(result);
	}
	
}
