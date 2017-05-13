package com.college.dto;

import org.apache.struts.upload.FormFile;

public class OtherRecordDTO {

	private String certificateName;
	private FormFile uploadFile;

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public FormFile getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(FormFile uploadFile) {
		this.uploadFile = uploadFile;
	}

}
