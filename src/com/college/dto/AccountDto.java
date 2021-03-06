package com.college.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class AccountDto implements Serializable,Comparable{
	
	/**
	 * @author Ramesh
	 */
	private static final long serialVersionUID = 1L;
	private int txId;
	private String acHolder;
	private double debitAmount;
	private double creditAmount;
	private String noteAgainst;
	private String txDate;
	private String updated_by;
	private String updated_date;
	private String collegeName;
	public int getTxId() {
		return txId;
	}
	public void setTxId(int txId) {
		this.txId = txId;
	}
	public String getAcHolder() {
		return acHolder;
	}
	public void setAcHolder(String acHolder) {
		this.acHolder = acHolder;
	}
	public double getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}
	public double getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}
	public String getNoteAgainst() {
		return noteAgainst;
	}
	public void setNoteAgainst(String noteAgainst) {
		this.noteAgainst = noteAgainst;
	}
	public String getTxDate() {
		return txDate;
	}
	public void setTxDate(String txDate) {
		this.txDate = txDate;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public String getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public AccountDto(){}
	public AccountDto(int txId, String acHolder, double debitAmount,
			double creditAmount, String noteAgainst, String txDate,
			String updated_by, String updated_date, String collegeName) {
		this.txId = txId;
		this.acHolder = acHolder;
		this.debitAmount = debitAmount;
		this.creditAmount = creditAmount;
		this.noteAgainst = noteAgainst;
		this.txDate = txDate;
		this.updated_by = updated_by;
		this.updated_date = updated_date;
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return this.acHolder;
	}
	@Override
	public int compareTo(Object obj) {
		AccountDto accountDto = (AccountDto)obj;
		return this.acHolder.compareTo(accountDto.acHolder);
	}
	/*public static void main(String[] args) {
		ArrayList<AccountDto> accountDtolist = new ArrayList<AccountDto>();
		AccountDto accountDto1 =new AccountDto ();
		accountDto1.setAcHolder("ramesh");
		AccountDto accountDto2 =new AccountDto ();
		accountDto2.setAcHolder("kishore");
		AccountDto accountDto3 =new AccountDto ();
		accountDto3.setAcHolder("ramesh");
		AccountDto accountDto4 =new AccountDto ();
		accountDto4.setAcHolder("dulhawa");
		accountDtolist.add(accountDto1);
		accountDtolist.add(accountDto2);
		accountDtolist.add(accountDto3);
		accountDtolist.add(accountDto4);
		Collections.sort(accountDtolist);
		System.out.println(accountDtolist);
	}*/
}
