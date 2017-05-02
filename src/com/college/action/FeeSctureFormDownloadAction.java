package com.college.action;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DownloadAction;
import org.apache.struts.validator.DynaValidatorForm;

public class FeeSctureFormDownloadAction extends DownloadAction{
	
	@Override
	protected StreamInfo getStreamInfo(ActionMapping am, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
		ServletContext ctx =req.getSession().getServletContext();
		DynaValidatorForm df = (DynaValidatorForm) form;
		String filename = df.getString("filename");
		String path = ctx.getRealPath("/")+"FeeStructure";
		File file = new File(path+"/"+filename);
		String contentType = ctx.getMimeType(file.getName());
		if(contentType == null){
			contentType = "application/octet-stream";
		}
		res.setHeader("Content-disposition","attachment;filename="+filename);
		res.setContentLength((int) file.length());
		return new FileStreamInfo(contentType, file);
	}


}
