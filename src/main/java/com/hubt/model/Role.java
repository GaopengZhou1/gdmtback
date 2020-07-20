package com.hubt.model;

public class Role {
	private String role_uuid;
	private String role_id;
	private String role_name;
	public String getRole_uuid() {
		return role_uuid;
	}
	public void setRole_uuid(String role_uuid) {
		this.role_uuid = role_uuid;
	}
	public String getRole_id() {
		return role_id;
	}
	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public Role(String role_uuid, String role_id, String role_name) {
		super();
		this.role_uuid = role_uuid;
		this.role_id = role_id;
		this.role_name = role_name;
	}
	public Role() {
		super();
	}
	@Override
	public String toString() {
		return "Role [role_uuid=" + role_uuid + ", role_id=" + role_id + ", role_name=" + role_name + "]";
	}

}
