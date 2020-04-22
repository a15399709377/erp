package com.erp.pojo;

public class D_CONFIG_FILE_KIND {
	private int id;//'序号'
	private int p_id;//'父级序号'
	private String kind_id;//'分类编号',
	private String kind_name;//'分类名称',
	private int kind_level;//'级别'
	@Override
	public String toString() {
		return "D_CONFIG_FILE_KIND [id=" + id + ", p_id=" + p_id + ", kind_id=" + kind_id + ", kind_name=" + kind_name
				+ ", kind_level=" + kind_level + "]";
	}
	public D_CONFIG_FILE_KIND(int id, int p_id, String kind_id, String kind_name, int kind_level) {
		super();
		this.id = id;
		this.p_id = p_id;
		this.kind_id = kind_id;
		this.kind_name = kind_name;
		this.kind_level = kind_level;
	}
	public D_CONFIG_FILE_KIND() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getKind_id() {
		return kind_id;
	}
	public void setKind_id(String kind_id) {
		this.kind_id = kind_id;
	}
	public String getKind_name() {
		return kind_name;
	}
	public void setKind_name(String kind_name) {
		this.kind_name = kind_name;
	}
	public int getKind_level() {
		return kind_level;
	}
	public void setKind_level(int kind_level) {
		this.kind_level = kind_level;
	}
	

}
