package com.college.student.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.college.dto.AcademicRecordsDto;
import com.college.dto.AddressInfoDto;
import com.college.dto.StudentDto;
import com.college.dto.StudentPaymentDto;
import com.college.form.AdmissionForm;

public class StudentImpl implements StudentInterface {
	public StudentDto populateStudentDetails(AdmissionForm admissionForm, String userName) {
		Set<AcademicRecordsDto> academicRecordsSet = new HashSet<AcademicRecordsDto>();
		// AcademicRecordsDto matricRecords = new
		// AcademicRecordsDto(admissionForm.getExamName1(),
		// admissionForm.getPassedYear1(), admissionForm.getInstituteName1(),
		// admissionForm.getBoard1(), admissionForm.getMarks1());
		// AcademicRecordsDto intermediateRecords = new
		// AcademicRecordsDto(admissionForm.getExamName2(),
		// admissionForm.getPassedYear2(), admissionForm.getInstituteName2(),
		// admissionForm.getBoard2(), admissionForm.getMarks2());
		// AcademicRecordsDto graduationnRecords = new
		// AcademicRecordsDto(admissionForm.getExamName3(),
		// admissionForm.getPassedYear3(), admissionForm.getInstituteName3(),
		// admissionForm.getBoard3(), admissionForm.getMarks3());
		academicRecordsSet.addAll(admissionForm.getAcademicRecordsList());
		Set<AddressInfoDto> permanentAddressSet = new HashSet<AddressInfoDto>();
		AddressInfoDto permanentAddress = new AddressInfoDto(admissionForm.getpCo(), admissionForm.getpVillage(),
				admissionForm.getpPo(), admissionForm.getpPs(), "permanent", admissionForm.getpDistrict(),
				admissionForm.getpPhone());
		AddressInfoDto correspondanceAddress = new AddressInfoDto(admissionForm.getCo(), admissionForm.getVillage(),
				admissionForm.getPo(), admissionForm.getPs(), "correspondance", admissionForm.getDistrict(),
				admissionForm.getPhone());
		permanentAddressSet.add(permanentAddress);
		permanentAddressSet.add(correspondanceAddress);
		StudentDto studentDto = new StudentDto(admissionForm.getTrade(), admissionForm.getStudent_name(),
				admissionForm.getGuardian_type(), admissionForm.getGuardian_name(), admissionForm.getOccupation(),
				admissionForm.getDob(), admissionForm.getCategory(), admissionForm.getFee(), userName,
				(new java.sql.Date(new Date().getTime())).toString(), admissionForm.getSession(),
				admissionForm.getGender(), admissionForm.getDue_date(), academicRecordsSet, permanentAddressSet,
				admissionForm.getFormNo());
		return studentDto;
	}
}
