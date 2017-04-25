package com.college.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import org.apache.struts.validator.ValidatorActionForm;

public class AdmissionForm extends ValidatorActionForm{
	
	/**
	 * @author Ramesh
	 */
	private static final long serialVersionUID = 1L;
	private String trade;
	private String student_name;
	private String guardian_type;
	private String guardian_name;
	private String occupation;
	private String dob;
	private String category;
	private FormFile photo;
	
	
	private String co;
	private String village;
	private String po;
	private String ps;
	private String district;
	private String phone;
	
	
	private String pCo;
	private String pVillage;
	private String pPo;
	private String pPs;
	private String pDistrict;
	private String pPhone;
	
	
	
	private String examName1;
	private String passedYear1;
	private String instituteName1;
	private String board1;
	private float marks1;
	
	private String examName2;
	private String passedYear2;
	private String instituteName2;
	private String board2;
	private float marks2;
	
	private String examName3;
	private String passedYear3;
	private String instituteName3;
	private String board3;
	private float marks3;
	
	private String documents;
	private double fee;
	
	private String session;
	private String gender;
	private String due_date;
	private String permanentAdd[];
	
	private String  formNo;


	
	public String getFormNo() {
		return formNo;
	}

	public void setFormNo(String formNo) {
		this.formNo = formNo;
	}

	public String[] getPermanentAdd() {
		return permanentAdd;
	}

	public void setPermanentAdd(String[] permanentAdd) {
		this.permanentAdd = permanentAdd;
	}

	public String getDocuments() {
		return documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

	

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	public String getExamName1() {
		return examName1;
	}

	public void setExamName1(String examName1) {
		this.examName1 = examName1;
	}

	public String getPassedYear1() {
		return passedYear1;
	}

	public void setPassedYear1(String passedYear1) {
		this.passedYear1 = passedYear1;
	}

	public String getInstituteName1() {
		return instituteName1;
	}

	public void setInstituteName1(String instituteName1) {
		this.instituteName1 = instituteName1;
	}

	public String getBoard1() {
		return board1;
	}

	public void setBoard1(String board1) {
		this.board1 = board1;
	}

	public float getMarks1() {
		return marks1;
	}

	public void setMarks1(float marks1) {
		this.marks1 = marks1;
	}

	public String getExamName2() {
		return examName2;
	}

	public void setExamName2(String examName2) {
		this.examName2 = examName2;
	}

	public String getPassedYear2() {
		return passedYear2;
	}

	public void setPassedYear2(String passedYear2) {
		this.passedYear2 = passedYear2;
	}

	public String getInstituteName2() {
		return instituteName2;
	}

	public void setInstituteName2(String instituteName2) {
		this.instituteName2 = instituteName2;
	}

	public String getBoard2() {
		return board2;
	}

	public void setBoard2(String board2) {
		this.board2 = board2;
	}

	public float getMarks2() {
		return marks2;
	}

	public void setMarks2(float marks2) {
		this.marks2 = marks2;
	}

	public String getExamName3() {
		return examName3;
	}

	public void setExamName3(String examName3) {
		this.examName3 = examName3;
	}

	public String getPassedYear3() {
		return passedYear3;
	}

	public void setPassedYear3(String passedYear3) {
		this.passedYear3 = passedYear3;
	}

	public String getInstituteName3() {
		return instituteName3;
	}

	public void setInstituteName3(String instituteName3) {
		this.instituteName3 = instituteName3;
	}

	public String getBoard3() {
		return board3;
	}

	public void setBoard3(String board3) {
		this.board3 = board3;
	}

	public float getMarks3() {
		return marks3;
	}

	public void setMarks3(float marks3) {
		this.marks3 = marks3;
	}

	public FormFile getPhoto() {
		return photo;
	}

	public void setPhoto(FormFile photo) {
		this.photo = photo;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
	}
	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getGuardian_type() {
		return guardian_type;
	}

	public void setGuardian_type(String guardian_type) {
		this.guardian_type = guardian_type;
	}

	public String getGuardian_name() {
		return guardian_name;
	}

	public void setGuardian_name(String guardian_name) {
		this.guardian_name = guardian_name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCo() {
		return co;
	}

	public void setCo(String co) {
		this.co = co;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getPo() {
		return po;
	}

	public void setPo(String po) {
		this.po = po;
	}

	public String getPs() {
		return ps;
	}

	public void setPs(String ps) {
		this.ps = ps;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getpCo() {
		return pCo;
	}

	public void setpCo(String pCo) {
		this.pCo = pCo;
	}

	public String getpVillage() {
		return pVillage;
	}

	public void setpVillage(String pVillage) {
		this.pVillage = pVillage;
	}

	public String getpPo() {
		return pPo;
	}

	public void setpPo(String pPo) {
		this.pPo = pPo;
	}


	public String getpPs() {
		return pPs;
	}

	public void setpPs(String pPs) {
		this.pPs = pPs;
	}

	public String getpDistrict() {
		return pDistrict;
	}

	public void setpDistrict(String pDistrict) {
		this.pDistrict = pDistrict;
	}

	public String getpPhone() {
		return pPhone;
	}

	public void setpPhone(String pPhone) {
		this.pPhone = pPhone;
	}

	
	
	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDue_date() {
		return due_date;
	}

	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
	
		  trade = null;
		  student_name = null;
		  guardian_type = null;
		  guardian_name = null;
		  occupation = null;
		  dob = null;
		  category = null;
		  co = null;
		  village = null;
		  po = null;
		  ps = null;
		  district = null;
		  phone = null;
		  pCo = null;
		  pVillage = null;
		  pPo = null;
		  pPs = null;
		  pDistrict = null;
		  pPhone = null;
		  fee=0.0; 
		  permanentAdd=null;
	}

}
