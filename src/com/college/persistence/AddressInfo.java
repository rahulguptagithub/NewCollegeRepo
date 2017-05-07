package com.college.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address_Info")
public class AddressInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pAddressId")
	private int pAddressId;
	@Column(name="pCo")
	private String pCo;
	@Column(name="pVillage")
	private String pVillage;
	@Column(name="pPo")
	private String pPo;
	@Column(name="pPs")
	private String pPs;
	@Column(name="address_type")
	private String address_type;
	@Column(name="pDistrict")
	private String pDistrict;
	@Column(name="pPhone")
	private String pPhone;
	@ManyToOne
	@JoinColumn(name="sid",referencedColumnName="sid")
	private Student student;
	public AddressInfo(){}
	
	public AddressInfo(String pCo, String pVillage,
			String pPo, String pPs, String address_type, String pDistrict,
			String pPhone) {
		super();
		this.pCo = pCo;
		this.pVillage = pVillage;
		this.pPo = pPo;
		this.pPs = pPs;
		this.address_type = address_type;
		this.pDistrict = pDistrict;
		this.pPhone = pPhone;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getpAddressId() {
		return pAddressId;
	}

	public void setpAddressId(int pAddressId) {
		this.pAddressId = pAddressId;
	}

	public String getAddress_type() {
		return address_type;
	}
	public void setAddress_type(String address_type) {
		this.address_type = address_type;
	}
	public String getpCo() {
		return pCo;
	}
	public void setpCo(String pCo) {
		this.pCo = pCo;
	}
	public String getpVillage() {
		return pVillage;
	}
	public void setpVillage(String pVillage) {
		this.pVillage = pVillage;
	}
	public String getpPo() {
		return pPo;
	}
	public void setpPo(String pPo) {
		this.pPo = pPo;
	}
	public String getpPs() {
		return pPs;
	}
	public void setpPs(String pPs) {
		this.pPs = pPs;
	}
	public String getpDistrict() {
		return pDistrict;
	}
	public void setpDistrict(String pDistrict) {
		this.pDistrict = pDistrict;
	}
	public String getpPhone() {
		return pPhone;
	}
	public void setpPhone(String pPhone) {
		this.pPhone = pPhone;
	}
	
}
