package com.college.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.apache.struts.validator.DynaValidatorForm;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.college.dto.AcademicRecordsDto;
import com.college.dto.AccountDto;
import com.college.dto.AddressInfoDto;
import com.college.dto.FeeStructureDto;
import com.college.dto.ForgotPasswordDto;
import com.college.dto.LoginDto;
import com.college.dto.StudentDto;
import com.college.dto.StudentPaymentDto;
import com.college.exception.NotSufficientBalanceException;
import com.college.exception.RecordNotFountException;
import com.college.exception.UserExistException;
import com.college.form.CreditForm;
import com.college.form.ExpenseForm;
import com.college.form.FeePaymentForm;
import com.college.form.TransferForm;
import com.college.form.UserForm;
import com.college.persistence.AcademicRecords;
import com.college.persistence.Account;
import com.college.persistence.AddressInfo;
import com.college.persistence.AdmissionForm;
import com.college.persistence.FeeStructure;
import com.college.persistence.Student;
import com.college.persistence.StudentPayment;
import com.college.persistence.User;
import com.college.util.DataBaseUtil;
import com.mysql.jdbc.PreparedStatement;
public class CLGDaoImpl implements CLGDao{

	public boolean verifyloginCredential(LoginDto loginDto,
			HttpServletRequest request) {
		boolean isValidUser = false;
		Transaction tx =null;
		try {
			byte[] encodedBytes = Base64.encodeBase64(loginDto.getPassword().getBytes());
			String encodedPwd = new String(encodedBytes);
			SessionFactory sf = ConnectionUtil.getfactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			System.out.println("encodedPwd"+encodedPwd);
			String queryString = "from User user where user.uName=? and user.password=? and user.status=?";
			Query query = session.createQuery(queryString);
			query.setParameter(0,loginDto.getUsername() );
			query.setParameter(1, encodedPwd);
			query.setParameter(2, "Active");
			if(query.list().size() == 1){
				System.out.println("inside of list");
				User user = (User)query.list().get(0);
				request.getSession(true).setAttribute("role",
						user.getRole());
				request.getSession(true).setAttribute("userName",
						user.getuName());
				System.out.println("exitig from verifyloginCredential");
				isValidUser= true;
			}
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isValidUser;
	}
	

	public boolean createUser(UserForm userForm, String userName)
			throws UserExistException {
		boolean flag = false;
		Transaction tx =null;
		try {
			DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
			String date =dateFormat.format(new Date());
			byte[] encodedBytes = Base64.encodeBase64(userForm.getPassword().getBytes());
			SessionFactory sf = ConnectionUtil.getfactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			User user = new User(userForm.getUsername(), new String(encodedBytes), userForm.getRole(), userForm.getStatus(), date, userName, userForm.getMobileno(), userForm.getEmail(),"MTPJPL");
	        session.save(user);
			tx.commit();
			session.close();
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
		}	
	
	private boolean fetchUsers(String userName) {
		boolean isUserExist = false;
		ResultSet resultSet = null;
		Connection connection = DataBaseUtil.getConnection();
		try {
			String query = "select * from login_table where user_name = ?";
			PreparedStatement ps = (PreparedStatement) connection
					.prepareStatement(query);
			ps.setString(1, userName);
			resultSet = ps.executeQuery();
			while (resultSet.next()) {
				isUserExist = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isUserExist;
	}
	
	public String recoverPassword(ForgotPasswordDto frgtPwdDto){
		boolean isExist = false;
		ResultSet resultSet = null;
		String query = null;
		Connection connection = DataBaseUtil.getConnection();
		PreparedStatement ps = null;
		String pwd= null;
		try {
			System.out.println("recoverPassword callesd" + frgtPwdDto.getEmail() + frgtPwdDto.getMobileno());
			if(frgtPwdDto.getEmail() != null && frgtPwdDto.getMobileno()  != null){
				System.out.println("@@@@recoverPassword called ." + frgtPwdDto.getEmail() + frgtPwdDto.getMobileno());
			query = "select * from login_table where mobile = ? and email = ?";
			ps = (PreparedStatement) connection.prepareStatement(query);
			ps.setString(1, frgtPwdDto.getMobileno());
			ps.setString(2,frgtPwdDto.getEmail());
			}else if(frgtPwdDto.getEmail() !=null){
				System.out.println("#####recoverPassword called .." + frgtPwdDto.getEmail() + frgtPwdDto.getMobileno());
		    query = "select * from login_table where email = ?";
		    ps = (PreparedStatement) connection.prepareStatement(query);
		    ps.setString(1,frgtPwdDto.getEmail());
			}else if(frgtPwdDto.getMobileno() !=null){
				System.out.println("!!!!!!!!!!recoverPassword called ..." + frgtPwdDto.getEmail() + frgtPwdDto.getMobileno());
				query = "select * from login_table where mobile = ?";	
				ps = (PreparedStatement) connection.prepareStatement(query);
				ps.setString(1,frgtPwdDto.getMobileno());
			}else{
				System.out.println("&&&&&&&&&&recoverPassword called .else" + frgtPwdDto.getEmail() + frgtPwdDto.getMobileno());
				//throw exception
			}
 			resultSet = ps.executeQuery();
 			System.out.println("recoverPassword called .else" + resultSet);
			while (resultSet.next()) {
				System.out.println("recoverPassword called .while" + resultSet + resultSet.getString(2));	
				pwd = resultSet.getString(2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(!isExist){
			//throw exception
		}
		System.out.println("recoverPassword called .pwd" + pwd);
		return pwd;
		
	}
	
	public String saveStudent(StudentDto studentDto ){
		Transaction tx =null;
		String sid= null;
		try {
			/*String date =(new java.sql.Date(new Date().getTime())).toString();*/
			DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
			String date =dateFormat.format(new Date());
			SessionFactory sf = ConnectionUtil.getfactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			sid = SIDGenerator.getNextSid();
			Student student = new Student( sid, studentDto.getTrade(), studentDto.getStudent_name(), studentDto.getGuardian_type(), studentDto.getGuardian_name(), studentDto.getOccupation(), studentDto.getDob(), studentDto.getCategory(),sid, studentDto.getAdmittedBy(), studentDto.getAdmision_Date(), studentDto.getFee(),studentDto.getDue_date(),studentDto.getGender(),studentDto.getSession(),studentDto.getFormNo(),"MTPJPL");
			session.save(student);
			Set<AddressInfoDto> addressInfoDtoSet = studentDto.getPermanentAddressSet();
			Iterator<AddressInfoDto> addressIterator = addressInfoDtoSet.iterator();
			
			while(addressIterator.hasNext()){
				AddressInfoDto addressInfoDto =addressIterator.next();
				AddressInfo addressInfo	= new AddressInfo(addressInfoDto.getpCo(), addressInfoDto.getpVillage(), addressInfoDto.getpPo(), addressInfoDto.getpPs(), addressInfoDto.getAddress_type(), addressInfoDto.getpDistrict(), addressInfoDto.getpPhone());
				session.save(addressInfo);
				addressInfo.setStudent(student);
			}
			Set<AcademicRecordsDto> academicRecordsSet =studentDto.getAcademicRecordsSet();
			Iterator<AcademicRecordsDto> academicRecordIterator = academicRecordsSet.iterator();
			while(academicRecordIterator.hasNext()){
				AcademicRecordsDto  academicRecordsDto =academicRecordIterator.next();
				AcademicRecords academicRecords = new AcademicRecords(academicRecordsDto.getExamName(), academicRecordsDto.getPassedYear(), academicRecordsDto.getInstituteName(), academicRecordsDto.getBoard(), academicRecordsDto.getMarks());
				session.save(academicRecords);
				academicRecords.setStudent(student);
			}
			StudentPayment studentPayment = new StudentPayment(date, studentDto.getFee(), studentDto.getAdmittedBy(), sid,"MTPJPL");
			session.save(studentPayment);
			Account account = new Account(studentDto.getAdmittedBy(), 0.0, studentDto.getFee(), "Aggainst Admission Of " +sid , date , studentDto.getAdmittedBy() , date ,"MTPJPL");
			session.save(account);
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sid;		
	}
	
	public boolean saveFeeStructure(FeeStructureDto feeStructureDto ){
		boolean flag = false;
		Transaction tx =null;
		try {
			SessionFactory sf = ConnectionUtil.getfactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			System.out.println("duration" + feeStructureDto.getDuration());
			FeeStructure feeStructure = new FeeStructure(feeStructureDto.getSession(),feeStructureDto.getTrade(),feeStructureDto.getDuration(),feeStructureDto.getAdmission_fee(),feeStructureDto.getExam_fee(),feeStructureDto.getTution_fee(),feeStructureDto.getDevelopment_fee(),feeStructureDto.getCaution_money(),feeStructureDto.getMisc_fee(),feeStructureDto.getPoor_boy_fund(),feeStructureDto.getUpdated_by(),feeStructureDto.getUpdated_date(),feeStructureDto.getTotal_fee(),"MTPJPL","Active");
	        session.save(feeStructure);
			tx.commit();
			session.close();
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
		}

	
	public boolean updateStudentFee(FeePaymentForm feePaymentForm ,String userName ){
		boolean flag = false;
		Transaction tx =null;
		try {
			//String date =(new java.sql.Date(new Date().getTime())).toString();
			DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
			String date =dateFormat.format(new Date());
			SessionFactory sf = ConnectionUtil.getfactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			StudentPayment studentPayment = new StudentPayment( date, feePaymentForm.getFee(), userName , feePaymentForm.getSid(),"MTPJPL");
			session.save(studentPayment);
			Account account = new Account(userName, 0.0, feePaymentForm.getFee(), "Received Payment Against " + feePaymentForm.getSid() , date ,userName ,date,"MTPJPL");
			session.save(account);
			tx.commit();
			session.close();
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
		}
	
	
	public boolean creditAccount(CreditForm cf ,String userName ){
		boolean flag = false;
		Transaction tx =null;
		try {
			//String date =(new java.sql.Date(new Date().getTime())).toString();
			DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
			String date =dateFormat.format(new Date());
			SessionFactory sf = ConnectionUtil.getfactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Account account = new Account(cf.getInAccount(), 0.0, cf.getAmount(), cf.getNote() , cf.getDate() ,userName ,date ,"MTPJPL");
			session.save(account);
			tx.commit();
			session.close();
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
		}
	
	public boolean debitAccount(ExpenseForm ef ,String userName )throws NotSufficientBalanceException{
		boolean flag = false;
		Transaction tx =null;
			//String date =(new java.sql.Date(new Date().getTime())).toString();
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		String date =dateFormat.format(new Date());
			SessionFactory sf = ConnectionUtil.getfactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			String queryString = "from Account acc where acc.acHolder=?";
			Query query = session.createQuery(queryString);
			query.setParameter(0, ef.getFromAccount());
			if(query.list().size() > 0){
				System.out.println("inside of list");
				List<Account> accountList = query.list();
				double crAmount =0.0;
				double drAmount =0.0;
				for(Account account : accountList){
					crAmount+=account.getCreditAmount();
					drAmount += account.getDebitAmount();
				}
				System.out.println("crAmount\t"+ crAmount + "drAmount\t"+drAmount);
				if((crAmount-drAmount)> ef.getExpense()){
					Account account = new Account(ef.getFromAccount(), ef.getExpense(), 0.0, ef.getNote() , ef.getDate() ,userName ,date , "MTPJPL");
					session.save(account);
					tx.commit();
					session.close();
					flag=true;
				}else{
					throw new NotSufficientBalanceException();
				}
			}
		return flag;
		}
	public List<String> findDistinctAccountHolder(){
		Transaction tx =null;
		List<String> list = null;
		try {
		SessionFactory sf = ConnectionUtil.getfactory();
		Session session = sf.openSession();
		tx = session.beginTransaction();
		
		//String queryString = "select distinct(acHolder) from Account ac";
		String queryString = "select distinct(uName) from User user where user.status=?";
		Query query = session.createQuery(queryString);
		query.setParameter(0, "Active");
		list = query.list();
		tx.commit();
		}catch(Exception e){
			
		}
		return list;
	}
	
	public boolean transferFund(TransferForm transferForm ,String userName ) throws NotSufficientBalanceException{
		boolean flag=false;
		Transaction tx =null;
		//String date =(new java.sql.Date(new Date().getTime())).toString();
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		String date =dateFormat.format(new Date());
		SessionFactory sf = ConnectionUtil.getfactory();
		Session session = sf.openSession();
		tx = session.beginTransaction();
		String queryString = "from Account acc where acc.acHolder=?";
		Query query = session.createQuery(queryString);
		query.setParameter(0, transferForm.getFromAccount());
		if(query.list().size() > 0){
			System.out.println("inside of list");
			List<Account> accountList = query.list();
			double crAmount =0.0;
			double drAmount =0.0;
			for(Account account : accountList){
				crAmount+=account.getCreditAmount();
				drAmount += account.getDebitAmount();
			}
			System.out.println("crAmount\t"+ crAmount + "drAmount\t"+drAmount);
			if((crAmount-drAmount)>= transferForm.getTrsfrAmount()){
				Account fromAccount = new Account(transferForm.getFromAccount(),transferForm.getTrsfrAmount(), 0.0, transferForm.getNote() , date ,userName ,date,"MTPJPL");
				session.save(fromAccount);
				Account toAccount = new Account(transferForm.getToAccount(),0.0, transferForm.getTrsfrAmount(), transferForm.getNote() , date ,userName ,date,"MTPJPL");
				session.save(toAccount);
				tx.commit();
				session.close();
				flag=true;
			}else{
				throw new NotSufficientBalanceException();
			}
		}else{
			throw new NotSufficientBalanceException();
		}
	
		return flag;
		
	}
	
	public int  generateAdmissionForm(String userName){
		Transaction tx =null;
		int formNo =0;
		try {
			SessionFactory sf = ConnectionUtil.getfactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
			String date =dateFormat.format(new Date());
			//String created_date =(new java.sql.Date(new Date().getTime())).toString();
			AdmissionForm admissionForm = new AdmissionForm(date, userName, "Active","MTPJPL");
			formNo = (Integer) session.save(admissionForm);
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return formNo;
	}
	
	public List<FeeStructureDto> fetchFeeStructureDetail(String trade, String session , ServletContext ctx ) throws RecordNotFountException{
		Transaction tx =null;
		FeeStructureDto feeStructureDto = null;
		
		List<FeeStructureDto> feeStructureDtoList = null;
		
			SessionFactory sf = ConnectionUtil.getfactory();
			Session dbSession = sf.openSession();
			tx = dbSession.beginTransaction();
			
			//String queryString="from FeeStructure fs where fs.session=? and fs.trade=?";
			String queryString = "from FeeStructure fs where fs.status=? and fs.session=? and fs.trade=?";
			Query query = dbSession.createQuery(queryString);
			query.setParameter(0, "Active");
			query.setParameter(1,session );
			query.setParameter(2,trade );
			if(query.list() != null && query.list().size()>0){
				System.out.println("inside of condition");
				List<FeeStructure> feeStructureList = query.list();
				feeStructureDtoList = new ArrayList<FeeStructureDto>();
				for(FeeStructure feeStructure: feeStructureList){
					feeStructureDto = new FeeStructureDto();
					feeStructureDto.setAdmission_fee(feeStructure.getAdmission_fee());
					feeStructureDto.setCaution_money(feeStructure.getCaution_money());
					feeStructureDto.setDevelopment_fee(feeStructure.getDevelopment_fee());
					feeStructureDto.setDuration(feeStructure.getDuration());
					feeStructureDto.setExam_fee(feeStructure.getExam_fee());
					feeStructureDto.setMisc_fee(feeStructure.getMisc_fee());
					feeStructureDto.setPoor_boy_fund(feeStructure.getPoor_boy_fund());
					feeStructureDto.setSession(feeStructure.getSession());
					feeStructureDto.setTotal_fee(feeStructure.getTotal_fee());
					feeStructureDto.setTrade(feeStructure.getTrade());
					feeStructureDto.setTution_fee(feeStructure.getTution_fee());
					feeStructureDtoList.add(feeStructureDto);
				}
			}else{
				throw new RecordNotFountException();
			}
			tx.commit();
			dbSession.close();
		return feeStructureDtoList;
	}
	
	public List<AccountDto> showUserCreditAccountByDate(String userName , String startDate , String endDate) throws RecordNotFountException{
		
		List<AccountDto> accountDtolist =null;
		Transaction tx =null;
		SessionFactory sf = ConnectionUtil.getfactory();
		Session dbSession = sf.openSession();
		tx = dbSession.beginTransaction();
		
		String queryString = "from Account ac where ac.updated_date>=? and ac.updated_date<=?";
		Query query = dbSession.createQuery(queryString);
		query.setParameter(0, startDate);
		query.setParameter(1,endDate );
		
		if(query.list() != null && query.list().size()>0){
			System.out.println("inside of condition........");
			List<Account> accountList = query.list();
			accountDtolist = new ArrayList<AccountDto>();
			for(Account account: accountList){
				AccountDto accontDto = new AccountDto();
				accontDto.setAcHolder(accontDto.getAcHolder());
				accontDto.setCollegeName(account.getCollegeName());
				accontDto.setCreditAmount(account.getCreditAmount());
				accontDto.setDebitAmount(account.getDebitAmount());
				accontDto.setNoteAgainst(account.getNoteAgainst());
				accontDto.setTxDate(account.getTxDate());
				accontDto.setTxId(account.getTxId());
				accontDto.setUpdated_by(account.getUpdated_by());
				accontDto.setUpdated_date(account.getUpdated_date());
				accountDtolist.add(accontDto);
			}
		}else{
			throw new RecordNotFountException();
		}
		tx.commit();
		dbSession.close();

		
		return null;
		
	}
}
