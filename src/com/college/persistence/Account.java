package com.college.persistence;

import javax.persistence.*;


@Entity
@Table(name="Account")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="txId")
	private int txId;
	@Column(name="acHolder")
	private String acHolder;
	@Column(name="debitAmount")
	private double debitAmount;
	@Column(name="creditAmount")
	private double creditAmount;
	@Column(name="noteAgainst")
	private String noteAgainst;
	@Column(name="txDate")
	private String txDate;
	@Column(name="updated_by")
	private String updated_by;
	@Column(name="updated_date")
	private String updated_date;
	@Column(name="collegeName")
	private String collegeName;
	public Account(){}
	public Account(String acHolder, double debitAmount, double creditAmount,
			String noteAgainst, String txDate , String updated_by, String updated_date , String collegeName) {
		super();
		this.acHolder = acHolder;
		this.debitAmount = debitAmount;
		this.creditAmount = creditAmount;
		this.noteAgainst = noteAgainst;
		this.txDate = txDate;
		this.updated_by = updated_by;
		this.updated_date = updated_date;
		this.collegeName = collegeName;
	}
	
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
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
	
	
}
