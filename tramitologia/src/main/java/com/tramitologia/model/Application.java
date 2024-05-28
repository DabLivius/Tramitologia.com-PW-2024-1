package com.tramitologia.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Application {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long applicationid;
	@Column(name = "applicationDate")
	private Date applicationDate;
	@Column(name = "applicatioStatus")
	private String applicationStatus;
	
	public long getApplicationid() {
		return applicationid;
	}
	public void setApplicationid(long applicationid) {
		this.applicationid = applicationid;
	}
	public Date getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	@Override
	public String toString() {
		return "Application [applicationid=" + applicationid + ", applicationDate=" + applicationDate
				+ ", applicationStatus=" + applicationStatus + "]";
	}
	
	
}
