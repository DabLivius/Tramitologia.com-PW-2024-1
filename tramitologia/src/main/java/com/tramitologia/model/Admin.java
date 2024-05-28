package com.tramitologia.model;

public class Admin {
	private String adminName;
	private String password;
	private String email;
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + ", password=" + password + ", email=" + email + "]";
	}
	
}
