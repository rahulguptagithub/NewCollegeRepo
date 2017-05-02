package com.college.form;

import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

import com.college.dao.CLGDao;
import com.college.dao.CLGDaoImpl;

public class DisplayTransactionForm extends ValidatorForm{

	
	/**
	 * @author Ramesh
	 */
	private static final long serialVersionUID = 1L;
	private String accountHolder;
	private String fromDate;
	private String toDate;
	
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
	
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.accountHolder = null;
		this.fromDate = null;
		this.toDate=null;
	}
}
