package com.xworkz.dto.passport;

import java.time.LocalDate;
import com.xworkz.Enum.passporttype.PassPortType;

public class PassPortDTO {

	private Integer id;
	private String passportNumber;
	private String issuedBy;
	private LocalDate issuedDate;
	private LocalDate expiryDate;
	private PassPortType passPortType;

	public PassPortDTO() {
	}

	public PassPortDTO(Integer id, String passportNumber, LocalDate issuedDate, String issuedBy, LocalDate expiryDate,
			PassPortType passPortType) {
		this.id = id;
		this.passportNumber = passportNumber;
		this.issuedBy = issuedBy;
		this.issuedDate = issuedDate;
		this.expiryDate = expiryDate;
		this.passPortType = passPortType;
	}

	public Integer getId() {
		return id;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public String getIssuedBy() {
		return issuedBy;
	}

	public LocalDate getIssuedDate() {
		return issuedDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public PassPortType getPassPortType() {
		return passPortType;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}

	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public void setPassPortType(PassPortType passPortType) {
		this.passPortType = passPortType;
	}

	@Override
	public String toString() {
		return "id=" + id + ", passportNumber=" + passportNumber + ", issuedBy=" + issuedBy + ", issuedDate="
				+ issuedDate + ", expiryDate=" + expiryDate + ", passPortType=" + passPortType;
	}

	
	
}
