package com.college.form;

import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorActionForm;

import com.college.dao.CLGDao;
import com.college.dao.CLGDaoImpl;

public class CreditForm extends ValidatorActionForm{

	private String inAccount;
	private double amount;
	private String note;
	private String date;
	
	
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
	
	public String getInAccount() {
		return inAccount;
	}
	public void setInAccount(String inAccount) {
		this.inAccount = inAccount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.amount = 0.0;
		this.date = null;
		this.inAccount = null;
		this.note = null;
		
	}
}
