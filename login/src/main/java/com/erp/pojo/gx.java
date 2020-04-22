package com.erp.pojo;

public class gx {
	private int id; //工序编号
	private String procedure_name; //工序名称
	private String procedure_mx; //工序描述
	public gx(int id, String procedure_name, String procedure_mx) {
		super();
		this.id = id;
		this.procedure_name = procedure_name;
		this.procedure_mx = procedure_mx;
	}
	public gx() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProcedure_name() {
		return procedure_name;
	}
	public void setProcedure_name(String procedure_name) {
		this.procedure_name = procedure_name;
	}
	public String getProcedure_mx() {
		return procedure_mx;
	}
	public void setProcedure_mx(String procedure_mx) {
		this.procedure_mx = procedure_mx;
	}
	@Override
	public String toString() {
		return "gx [id=" + id + ", procedure_name=" + procedure_name + ", procedure_mx=" + procedure_mx + "]";
	}
	
}
