package com.erp.pojo;

import java.util.List;

public class Permissions {
	  private int id ;
	  private int parent_id;
	  private String name;
	  private String descn;
	  private String link_url;
	  private String img_url;
	  private String target;
	  private String status;
	  private List<Permissions> Permissions;
	@Override
	public String toString() {
		return "Permissions [id=" + id + ", parent_id=" + parent_id + ", name=" + name + ", descn=" + descn
				+ ", link_url=" + link_url + ", img_url=" + img_url + ", target=" + target + ", status=" + status
				+ ", Permissions=" + Permissions + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescn() {
		return descn;
	}
	public void setDescn(String descn) {
		this.descn = descn;
	}
	public String getLink_url() {
		return link_url;
	}
	public void setLink_url(String link_url) {
		this.link_url = link_url;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Permissions> getPermissions() {
		return Permissions;
	}
	public void setPermissions(List<Permissions> permissions) {
		Permissions = permissions;
	}
	public Permissions(int id, int parent_id, String name, String descn, String link_url, String img_url, String target,
			String status, List<Permissions> permissions) {
		super();
		this.id = id;
		this.parent_id = parent_id;
		this.name = name;
		this.descn = descn;
		this.link_url = link_url;
		this.img_url = img_url;
		this.target = target;
		this.status = status;
		Permissions = permissions;
	}
	public Permissions() {
		super();
	}
	  
	  
}
