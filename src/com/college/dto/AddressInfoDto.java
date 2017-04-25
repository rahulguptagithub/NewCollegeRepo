package com.college.dto;

public class AddressInfoDto {
	private String pCo;
	private String pVillage;
	private String pPo;
	private String pPs;
	private String address_type;
	private String pDistrict;
	private String pPhone;
	public AddressInfoDto(){}
	public AddressInfoDto(String pCo, String pVillage, String pPo,
			String pPs, String address_type, String pDistrict, String pPhone) {
		super();
		this.pCo = pCo;
		this.pVillage = pVillage;
		this.pPo = pPo;
		this.pPs = pPs;
		this.address_type = address_type;
		this.pDistrict = pDistrict;
		this.pPhone = pPhone;
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
	public String getAddress_type() {
		return address_type;
	}
	public void setAddress_type(String address_type) {
		this.address_type = address_type;
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
