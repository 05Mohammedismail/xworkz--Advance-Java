package com.xworkz.dto.person;

public class PersonDTO {

	private Integer id;
	private String name;
	private String emailID;
	private Long mobileNo;

	public PersonDTO() {

	}

	public PersonDTO(Integer id, String name, String emailID, Long mobileNo) {
		this.id = id;
		this.name = name;
		this.emailID = emailID;
		this.mobileNo = mobileNo;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmailID() {
		return emailID;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", emailID=" + emailID + ", mobileNo=" + mobileNo;
	}

}
