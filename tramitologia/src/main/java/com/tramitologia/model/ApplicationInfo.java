package com.tramitologia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class ApplicationInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@Column
	private String userName;
	@Column(name = "cellphoneNumber")
	private long cellphoneNumber;
	@Column(name = "email")
	private String email;
	@Column(name = "applicationType")
	private String applicationType;
	@Column(name = "applicationDescription")
	private String applicationDescription;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getCellphoneNumber() {
		return cellphoneNumber;
	}

	public void setCellphoneNumber(int cellphoneNumber) {
		this.cellphoneNumber = cellphoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	public String getApplicationDescription() {
		return applicationDescription;
	}

	public void setApplicationDescription(String applicationDescription) {
		this.applicationDescription = applicationDescription;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "ApplicationInfo [Id=" + Id + ", userName=" + userName + ", cellphoneNumber=" + cellphoneNumber
				+ ", email=" + email + ", applicationType=" + applicationType + ", applicationDescription="
				+ applicationDescription + "]";
	}

}
