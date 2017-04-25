package com.college.form;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.util.LabelValueBean;
import org.apache.struts.validator.ValidatorActionForm;

import com.college.dao.CLGDao;
import com.college.dao.CLGDaoImpl;

public class ExpenseForm extends ValidatorActionForm{

	private String fromAccount;
	private double expense;
	private String note;
	private String date;

	//This method is use to fetch data from database and bind with select tag in jsp
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
	
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public double getExpense() {
		return expense;
	}
	public void setExpense(double expense) {
		this.expense = expense;
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
		 this.date=null;
		 this.expense =0.0;
		 this.fromAccount = null;
		 this.note = null;
	}
}

