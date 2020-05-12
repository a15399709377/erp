package com.erp.pojo;
//产品生产工序明细
public class m_design_procedure_details {
	private int id; //序号
	private int parent_id; //父级序号
	private int details_number; //工序序号
	private String procedure_id; //工序编号
	private String procedure_name; //工序名称
	private double labour_hour_amount; //工时数
	private String procedure_describe; //工序描述
	private String amount_unit; //单位
	private double cost_price; //单位工时成本
	private double subtotal; //工时成本小计
	private double module_subtotal; //物料成本小计
	private String register; //登记人
	private String register_time; //登记时间
	private String design_module_tag; //当前工序物料标志D002-0: 未设计D002-1: 已设计
	private String design_module_change_tag; //当前工序物料变更标志D003-0: 未变更D003-0: 已变更
	public m_design_procedure_details(int id, int parent_id, int details_number, String procedure_id,
			String procedure_name, double labour_hour_amount, String procedure_describe, String amount_unit,
			double cost_price, double subtotal, double module_subtotal, String register, String register_time,
			String design_module_tag, String design_module_change_tag) {
		super();
		this.id = id;
		this.parent_id = parent_id;
		this.details_number = details_number;
		this.procedure_id = procedure_id;
		this.procedure_name = procedure_name;
		this.labour_hour_amount = labour_hour_amount;
		this.procedure_describe = procedure_describe;
		this.amount_unit = amount_unit;
		this.cost_price = cost_price;
		this.subtotal = subtotal;
		this.module_subtotal = module_subtotal;
		this.register = register;
		this.register_time = register_time;
		this.design_module_tag = design_module_tag;
		this.design_module_change_tag = design_module_change_tag;
	}
	public m_design_procedure_details() {
		super();
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
	public int getDetails_number() {
		return details_number;
	}
	public void setDetails_number(int details_number) {
		this.details_number = details_number;
	}
	public String getProcedure_id() {
		return procedure_id;
	}
	public void setProcedure_id(String procedure_id) {
		this.procedure_id = procedure_id;
	}
	public String getProcedure_name() {
		return procedure_name;
	}
	public void setProcedure_name(String procedure_name) {
		this.procedure_name = procedure_name;
	}
	public double getLabour_hour_amount() {
		return labour_hour_amount;
	}
	public void setLabour_hour_amount(double labour_hour_amount) {
		this.labour_hour_amount = labour_hour_amount;
	}
	public String getProcedure_describe() {
		return procedure_describe;
	}
	public void setProcedure_describe(String procedure_describe) {
		this.procedure_describe = procedure_describe;
	}
	public String getAmount_unit() {
		return amount_unit;
	}
	public void setAmount_unit(String amount_unit) {
		this.amount_unit = amount_unit;
	}
	public double getCost_price() {
		return cost_price;
	}
	public void setCost_price(double cost_price) {
		this.cost_price = cost_price;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getModule_subtotal() {
		return module_subtotal;
	}
	public void setModule_subtotal(double module_subtotal) {
		this.module_subtotal = module_subtotal;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getRegister_time() {
		return register_time;
	}
	public void setRegister_time(String register_time) {
		this.register_time = register_time;
	}
	public String getDesign_module_tag() {
		return design_module_tag;
	}
	public void setDesign_module_tag(String design_module_tag) {
		this.design_module_tag = design_module_tag;
	}
	public String getDesign_module_change_tag() {
		return design_module_change_tag;
	}
	public void setDesign_module_change_tag(String design_module_change_tag) {
		this.design_module_change_tag = design_module_change_tag;
	}
	@Override
	public String toString() {
		return "m_design_procedure_details [id=" + id + ", parent_id=" + parent_id + ", details_number="
				+ details_number + ", procedure_id=" + procedure_id + ", procedure_name=" + procedure_name
				+ ", labour_hour_amount=" + labour_hour_amount + ", procedure_describe=" + procedure_describe
				+ ", amount_unit=" + amount_unit + ", cost_price=" + cost_price + ", subtotal=" + subtotal
				+ ", module_subtotal=" + module_subtotal + ", register=" + register + ", register_time=" + register_time
				+ ", design_module_tag=" + design_module_tag + ", design_module_change_tag=" + design_module_change_tag
				+ "]";
	}
	
}
