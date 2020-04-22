package com.erp.pojo;
//生产工序表
public class m_procedure {
	private int id; //序号
	private int parent_id; //父级编号
	private int details_number; //工序序号
	private String procedure_id; //工序编号
	private String procedure_name; //工序名称
	private double labour_hour_amount; //设计工时数
	private double real_labour_hour_amount; //实际工时数
	private double subtotal; //设计工时成本
	private double real_subtotal; //实际工时成本
	private double module_subtotal; //设计物料成本
	private double real_module_subtotal;  //实际物料成本
	private double cost_price; //单位工时成本
	private double demand_amount; //工序投产数量
	private double real_amount; //工序合格数量
	private String procedure_finish_tag; //工序完成标志G004-0: 未开始G004-1: 已完成G004-2: 未完成G004-3: 已审核
	private String procedure_transfer_tag;//工序交接标志G005-0: 未交接G005-1: 已交接G005-2: 已审核
	public m_procedure(int id, int parent_id, int details_number, String procedure_id, String procedure_name,
			double labour_hour_amount, double real_labour_hour_amount, double subtotal, double real_subtotal,
			double module_subtotal, double real_module_subtotal, double cost_price, double demand_amount,
			double real_amount, String procedure_finish_tag, String procedure_transfer_tag) {
		super();
		this.id = id;
		this.parent_id = parent_id;
		this.details_number = details_number;
		this.procedure_id = procedure_id;
		this.procedure_name = procedure_name;
		this.labour_hour_amount = labour_hour_amount;
		this.real_labour_hour_amount = real_labour_hour_amount;
		this.subtotal = subtotal;
		this.real_subtotal = real_subtotal;
		this.module_subtotal = module_subtotal;
		this.real_module_subtotal = real_module_subtotal;
		this.cost_price = cost_price;
		this.demand_amount = demand_amount;
		this.real_amount = real_amount;
		this.procedure_finish_tag = procedure_finish_tag;
		this.procedure_transfer_tag = procedure_transfer_tag;
	}
	public m_procedure() {
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
	public double getReal_labour_hour_amount() {
		return real_labour_hour_amount;
	}
	public void setReal_labour_hour_amount(double real_labour_hour_amount) {
		this.real_labour_hour_amount = real_labour_hour_amount;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getReal_subtotal() {
		return real_subtotal;
	}
	public void setReal_subtotal(double real_subtotal) {
		this.real_subtotal = real_subtotal;
	}
	public double getModule_subtotal() {
		return module_subtotal;
	}
	public void setModule_subtotal(double module_subtotal) {
		this.module_subtotal = module_subtotal;
	}
	public double getReal_module_subtotal() {
		return real_module_subtotal;
	}
	public void setReal_module_subtotal(double real_module_subtotal) {
		this.real_module_subtotal = real_module_subtotal;
	}
	public double getCost_price() {
		return cost_price;
	}
	public void setCost_price(double cost_price) {
		this.cost_price = cost_price;
	}
	public double getDemand_amount() {
		return demand_amount;
	}
	public void setDemand_amount(double demand_amount) {
		this.demand_amount = demand_amount;
	}
	public double getReal_amount() {
		return real_amount;
	}
	public void setReal_amount(double real_amount) {
		this.real_amount = real_amount;
	}
	public String getProcedure_finish_tag() {
		return procedure_finish_tag;
	}
	public void setProcedure_finish_tag(String procedure_finish_tag) {
		this.procedure_finish_tag = procedure_finish_tag;
	}
	public String getProcedure_transfer_tag() {
		return procedure_transfer_tag;
	}
	public void setProcedure_transfer_tag(String procedure_transfer_tag) {
		this.procedure_transfer_tag = procedure_transfer_tag;
	}
	@Override
	public String toString() {
		return "m_procedure [id=" + id + ", parent_id=" + parent_id + ", details_number=" + details_number
				+ ", procedure_id=" + procedure_id + ", procedure_name=" + procedure_name + ", labour_hour_amount="
				+ labour_hour_amount + ", real_labour_hour_amount=" + real_labour_hour_amount + ", subtotal=" + subtotal
				+ ", real_subtotal=" + real_subtotal + ", module_subtotal=" + module_subtotal
				+ ", real_module_subtotal=" + real_module_subtotal + ", cost_price=" + cost_price + ", demand_amount="
				+ demand_amount + ", real_amount=" + real_amount + ", procedure_finish_tag=" + procedure_finish_tag
				+ ", procedure_transfer_tag=" + procedure_transfer_tag + "]";
	}
	
}	
