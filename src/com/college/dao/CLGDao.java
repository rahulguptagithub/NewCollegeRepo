package com.college.dao;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.validator.DynaValidatorForm;

import com.college.dto.FeeStructureDto;
import com.college.dto.ForgotPasswordDto;
import com.college.dto.LoginDto;
import com.college.dto.StudentDto;
import com.college.exception.NotSufficientBalanceException;
import com.college.exception.UserExistException;
import com.college.form.CreditForm;
import com.college.form.ExpenseForm;
import com.college.form.FeePaymentForm;
import com.college.form.TransferForm;
import com.college.form.UserForm;

public interface CLGDao {
	public boolean verifyloginCredential(LoginDto loginDto ,HttpServletRequest request);
	public boolean createUser(UserForm userForm ,String userName) throws UserExistException;
	public String recoverPassword(ForgotPasswordDto frgtPwdDto);
	public String saveStudent(StudentDto studentDto );
	public boolean saveFeeStructure(FeeStructureDto feeStructureDto );
	public boolean updateStudentFee(FeePaymentForm feePaymentForm ,String userName );
	public boolean creditAccount(CreditForm cf ,String userName );
	public boolean debitAccount(ExpenseForm ef ,String userName )throws NotSufficientBalanceException;
	public  List<String> findDistinctAccountHolder();
	public boolean transferFund(TransferForm transferForm ,String userName )throws NotSufficientBalanceException;
	public int  generateAdmissionForm(String userName);
	public List<FeeStructureDto> fetchFeeStructureDetail(String trade, String session , ServletContext ctx );
}
