package com.college.student.impl;

import com.college.dto.StudentDto;
import com.college.form.AdmissionForm;

public interface StudentInterface {
	public StudentDto populateStudentDetails(AdmissionForm admissionForm , String userName);

}
