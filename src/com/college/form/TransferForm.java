package com.college.form;

import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

import org.apache.struts.validator.ValidatorActionForm;

import com.college.dao.CLGDao;
import com.college.dao.CLGDaoImpl;

public class TransferForm extends ValidatorActionForm{
	private String fromAccount ;
	private String toAccount;
	private double trsfrAmount;
	private String note;

	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	public double getTrsfrAmount() {
		return trsfrAmount;
	}
	public void setTrsfrAmount(double trsfrAmount) {
		this.trsfrAmount = trsfrAmount;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public Collection  getAccountOptions(){
		CLGDao cLGDao = new CLGDaoImpl();
		List<String > acHolderList = cLGDao.findDistinctAccountHolder();
		Collection c = new TreeSet(OptionsCollectionElement.SORT_BY_LABEL) ;
		for(String acHolder :acHolderList){
			OptionsCollectionElement oce1 =
	            	new OptionsCollectionElement(acHolder, acHolder) ;
	            c.add(oce1) ;	
		}
	    return c ;
	}
	
	
}
