package com.college.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Academic_Records")
public class AcademicRecords {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="academicRecordsID")
	private int academicRecordsID;
	@Column(name="examName")
	private String examName;
	@Column(name="passedYear")
	private String passedYear;
	@Column(name="instituteName")
	private String instituteName;
	@Column(name="board")
	private String board;
	@Column(name="marks")
	private float marks;
	
	@ManyToOne
	@JoinColumn(name="sid",referencedColumnName="sid")
	private Student student;
	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public  AcademicRecords(){}
	
	
	public AcademicRecords(String examName,
			String passedYear, String instituteName, String board, float marks) {
		super();
		this.examName = examName;
		this.passedYear = passedYear;
		this.instituteName = instituteName;
		this.board = board;
		this.marks = marks;
	}

	public int getAcademicRecordsID() {
		return academicRecordsID;
	}


	public void setAcademicRecordsID(int academicRecordsID) {
		this.academicRecordsID = academicRecordsID;
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

}
