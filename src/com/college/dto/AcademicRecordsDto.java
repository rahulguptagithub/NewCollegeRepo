package com.college.dto;

import java.io.Serializable;

import org.apache.struts.upload.FormFile;

public class AcademicRecordsDto implements Serializable{

	
	private String examName;
	private String passedYear;
	private String instituteName;
	private String board;
	private float marks;
	private FormFile uploadFile;
	public AcademicRecordsDto(){}
	public AcademicRecordsDto(String examName,
			String passedYear, String instituteName, String board, float marks) {
		super();
		
		this.examName = examName;
		this.passedYear = passedYear;
		this.instituteName = instituteName;
		this.board = board;
		this.marks = marks;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getPassedYear() {
		return passedYear;
	}
	public void setPassedYear(String passedYear) {
		this.passedYear = passedYear;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public FormFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(FormFile uploadFile) {
		this.uploadFile = uploadFile;
	}
		
}
