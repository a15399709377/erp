package com.erp.pojo;

import java.util.List;
import java.util.Set;

public class User {
	private int id ;
	private String login_id ;
	private String password;
	private String status;
	private String photo_path;
	private List<Role> role;
	private List<String> roleId;
	
	public List<Role> getRole() {
		return role;
	}
	public void setRole(List<Role> role) {
		this.role = role;
	}
	
	public User(int id, String login_id, String password, String status, String photo_path, List<Role> role) {
		super();
		this.id = id;
		this.login_id = login_id;
		this.password = password;
		this.status = status;
		this.photo_path = photo_path;
		this.role = role;
	}
	public User(String login_id, String password) {
		super();
		this.login_id = login_id;
		this.password = password;
	}
	public User(int id, String login_id, String password, String status, String photo_path) {
		super();
		this.id = id;
		this.login_id = login_id;
		this.password = password;
		this.status = status;
		this.photo_path = photo_path;
	}
	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPhoto_path() {
		return photo_path;
	}
	public void setPhoto_path(String photo_path) {
		this.photo_path = photo_path;
	}
	public List<String> getRoleId() {
		return roleId;
	}
	public void setRoleId(List<String> roleId) {
		this.roleId = roleId;
	}
	public User(int id, String login_id, String password, String status, String photo_path, List<Role> role,
			List<String> roleId) {
		super();
		this.id = id;
		this.login_id = login_id;
		this.password = password;
		this.status = status;
		this.photo_path = photo_path;
		this.role = role;
		this.roleId = roleId;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", login_id=" + login_id + ", password=" + password + ", status=" + status
				+ ", photo_path=" + photo_path + ", role=" + role + ", roleId=" + roleId + "]";
	}
	
	
	public User(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}
	
	
	
	
	    
}
