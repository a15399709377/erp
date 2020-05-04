package com.erp.pojo;
//产品生产计划
public class m_apply {
	private int id; //序号
	private String apply_id; //生产计划编号
	
	private d_file product; //产品编号
	
	private  String product_id  ;// #产品编号
	private  String  product_name     ;// #产品名称
	private  String  product_describe ;// #产品描述
	private  String  TYPE             ;// #用途类型`erpdb``erpdb`
	private  int  amount         ;//# 数量
	
	private String designer; //设计人
	private String remark; //备注
	private String register; //登记人
	private String register_time; //登记时间
	private String checker; //复核人
	private String check_suggestion; //复核意见
	private String check_time; //审核时间
	private String check_tag; //审核标志 S001-0: 等待审核S001-1: 审核通过S001-2: 审核不通过
	private String manufacture_tag; //派工标志P001-0: 未派工 P001-1: 已派工
	private int audit;
	private String panduan;
	public m_apply(int id, String check_suggestion, int audit) {
		super();
		this.id = id;
		this.check_suggestion = check_suggestion;
		this.audit = audit;
	}
	public int getAudit() {
		return audit;
	}
	public void setAudit(int audit) {
		this.audit = audit;
	}
	
	public m_apply(int id, String apply_id, d_file product, String designer, String remark, String register,
			String register_time, String checker, String check_suggestion, String check_time, String check_tag,
			String manufacture_tag) {
		super();
		this.id = id;
		this.apply_id = apply_id;
		this.product = product;
		this.designer = designer;
		this.remark = remark;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_suggestion = check_suggestion;
		this.check_time = check_time;
		this.check_tag = check_tag;
		this.manufacture_tag = manufacture_tag;
	}
	public m_apply(int id, String apply_id, d_file product, String designer, String remark, String register,
			String register_time, String checker, String check_suggestion, String check_time, String check_tag,
			String manufacture_tag, int audit) {
		super();
		this.id = id;
		this.apply_id = apply_id;
		this.product = product;
		this.designer = designer;
		this.remark = remark;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_suggestion = check_suggestion;
		this.check_time = check_time;
		this.check_tag = check_tag;
		this.manufacture_tag = manufacture_tag;
		this.audit = audit;
	}
	@Override
	public String toString() {
		return "m_apply [id=" + id + ", apply_id=" + apply_id + ", product=" + product + ", product_id=" + product_id
				+ ", product_name=" + product_name + ", product_describe=" + product_describe + ", TYPE=" + TYPE
				+ ", amount=" + amount + ", designer=" + designer + ", remark=" + remark + ", register=" + register
				+ ", register_time=" + register_time + ", checker=" + checker + ", check_suggestion=" + check_suggestion
				+ ", check_time=" + check_time + ", check_tag=" + check_tag + ", manufacture_tag=" + manufacture_tag
				+ ", audit=" + audit + ", panduan=" + panduan + "]";
	}
	public m_apply() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApply_id() {
		return apply_id;
	}
	public void setApply_id(String apply_id) {
		this.apply_id = apply_id;
	}
	public d_file getProduct() {
		return product;
	}
	public void setProduct(d_file product) {
		this.product = product;
	}
	public String getDesigner() {
		return designer;
	}
	public void setDesigner(String designer) {
		this.designer = designer;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
	public String getChecker() {
		return checker;
	}
	public void setChecker(String checker) {
		this.checker = checker;
	}
	public String getCheck_suggestion() {
		return check_suggestion;
	}
	public void setCheck_suggestion(String check_suggestion) {
		this.check_suggestion = check_suggestion;
	}
	public String getCheck_time() {
		return check_time;
	}
	public void setCheck_time(String check_time) {
		this.check_time = check_time;
	}
	public String getCheck_tag() {
		return check_tag;
	}
	public void setCheck_tag(String check_tag) {
		this.check_tag = check_tag;
	}
	public String getManufacture_tag() {
		return manufacture_tag;
	}
	public void setManufacture_tag(String manufacture_tag) {
		this.manufacture_tag = manufacture_tag;
	}
	public m_apply(int id, String apply_id, d_file product, String designer, String remark, String register,
			String register_time, String checker, String check_suggestion, String check_time, String check_tag,
			String manufacture_tag, int audit, String panduan) {
		super();
		this.id = id;
		this.apply_id = apply_id;
		this.product = product;
		this.designer = designer;
		this.remark = remark;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_suggestion = check_suggestion;
		this.check_time = check_time;
		this.check_tag = check_tag;
		this.manufacture_tag = manufacture_tag;
		this.audit = audit;
		this.panduan = panduan;
	}
	public String getPanduan() {
		return panduan;
	}
	public void setPanduan(String panduan) {
		this.panduan = panduan;
	}
	public m_apply(int id, String apply_id, d_file product, String product_id, String product_name,
			String product_describe, String tYPE, int amount, String designer, String remark, String register,
			String register_time, String checker, String check_suggestion, String check_time, String check_tag,
			String manufacture_tag, int audit, String panduan) {
		super();
		this.id = id;
		this.apply_id = apply_id;
		this.product = product;
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_describe = product_describe;
		TYPE = tYPE;
		this.amount = amount;
		this.designer = designer;
		this.remark = remark;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_suggestion = check_suggestion;
		this.check_time = check_time;
		this.check_tag = check_tag;
		this.manufacture_tag = manufacture_tag;
		this.audit = audit;
		this.panduan = panduan;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_describe() {
		return product_describe;
	}
	public void setProduct_describe(String product_describe) {
		this.product_describe = product_describe;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
