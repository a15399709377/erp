package com.erp.pojo;

import java.util.List;

public class Role {
	  private int id;
	  private String name;
	  private String code;
	  private String descn;  	  
	  private List<Permissions> permissions;
	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", code=" + code + ", descn=" + descn + ", permissions="
				+ permissions + "]";
	}
	public Role(int id, String name, String code, String descn, List<Permissions> permissions) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.descn = descn;
		this.permissions = permissions;
	}
	public Role() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescn() {
		return descn;
	}
	public void setDescn(String descn) {
		this.descn = descn;
	}
	public List<Permissions> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<Permissions> permissions) {
		this.permissions = permissions;
	}
	  
}
