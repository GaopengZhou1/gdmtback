package com.hubt.model;

public class UsersPageList extends Page {
	private String user_uuid;
	private String username;
	private String password;
	private String email;
	private String mobile;
	private String organ_uuid;
	private String nice_name;
	private String pwdque;
	private String pwdans;
	private String remark;
	private String organ_name;
	
	
	
	
	public String getUser_uuid() {
		return user_uuid;
	}
	
	public void setUser_uuid(String user_uuid) {
		this.user_uuid = user_uuid;
	}

	public void setOrgan_uuid(String organ_uuid) {
		this.organ_uuid = organ_uuid;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getOrgan_uuid() {
		return organ_uuid;
	}
	public void setOrgan_uuuid(String organ_uuuid) {
		this.organ_uuid = organ_uuuid;
	}
	public String getNice_name() {
		return nice_name;
	}
	public void setNice_name(String nice_name) {
		this.nice_name = nice_name;
	}
	public String getPwdque() {
		return pwdque;
	}
	public void setPwdque(String pwdque) {
		this.pwdque = pwdque;
	}
	public String getPwdans() {
		return pwdans;
	}
	public void setPwdans(String pwdans) {
		this.pwdans = pwdans;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOrgan_name() {
		return organ_name;
	}

	public void setOrgan_name(String organ_name) {
		this.organ_name = organ_name;
	}
}
