package com.college.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorActionForm;

public class DownloadForm extends ValidatorActionForm{
/**
	 * @author Ramesh
	 */
	private static final long serialVersionUID = 1L;
private String filename;



	public String getFilename() {
	return filename;
}



public void setFilename(String filename) {
	this.filename = filename;
}



public void reset(ActionMapping mapping, HttpServletRequest request) {
	filename = null;
	}
}
