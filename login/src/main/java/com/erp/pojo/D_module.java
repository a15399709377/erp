package com.erp.pojo;

import java.util.List;

//产品物料组成表
public class D_module {
private int id;//序号
private String  design_id     ;//'设计编号'
private String  product_id    ;//产品编号
private String  product_name  ;//'产品名称',       
private D_CONFIG_FILE_KIND first_kind; // '产品I级分类编号',

private D_CONFIG_FILE_KIND second_kind;//  '产品II级分类编号',

private D_CONFIG_FILE_KIND third_kind;//  '产品III级分类编号',
private User  designer      ;//'设计人',        
private String  module_descri ;//'设计要求',
private double  cost_price_sum ;//'物料总成本'
private User  register      ;//'登记人',
private String  register_time ;//'登记时间',
private User  checker       ;//'复核人',
private String  check_time    ;//'复核时间',
private User  changer       ;//'变更人',
private String  change_time   ;//'变更时间',
private String  check_tag     ;//'审核标志 S001-0：等待审核 S001-1：审核通过 S001-2：审核不通过',
private String  change_tag    ;//'变更标志 B002-0：未变更 B002-1：已变更'
private List<D_module_details> D_module_details;

public List<D_module_details> getD_module_details() {
	return D_module_details;
}
public void setD_module_details(List<D_module_details> d_module_details) {
	D_module_details = d_module_details;
}
public D_module(int id, String design_id, String product_id, String product_name, D_CONFIG_FILE_KIND first_kind,
		D_CONFIG_FILE_KIND second_kind, D_CONFIG_FILE_KIND third_kind, User designer, String module_descri,
		double cost_price_sum, User register, String register_time, User checker, String check_time, User changer,
		String change_time, String check_tag, String change_tag, List<com.erp.pojo.D_module_details> d_module_details) {
	super();
	this.id = id;
	this.design_id = design_id;
	this.product_id = product_id;
	this.product_name = product_name;
	this.first_kind = first_kind;
	this.second_kind = second_kind;
	this.third_kind = third_kind;
	this.designer = designer;
	this.module_descri = module_descri;
	this.cost_price_sum = cost_price_sum;
	this.register = register;
	this.register_time = register_time;
	this.checker = checker;
	this.check_time = check_time;
	this.changer = changer;
	this.change_time = change_time;
	this.check_tag = check_tag;
	this.change_tag = change_tag;
	D_module_details = d_module_details;
}
public D_module(int id, String design_id, String product_id, String product_name, D_CONFIG_FILE_KIND first_kind,
		D_CONFIG_FILE_KIND second_kind, D_CONFIG_FILE_KIND third_kind, User designer, String module_descri,
		double cost_price_sum, User register, String register_time, User checker, String check_time, User changer,
		String change_time, String check_tag, String change_tag) {
	super();
	this.id = id;
	this.design_id = design_id;
	this.product_id = product_id;
	this.product_name = product_name;
	this.first_kind = first_kind;
	this.second_kind = second_kind;
	this.third_kind = third_kind;
	this.designer = designer;
	this.module_descri = module_descri;
	this.cost_price_sum = cost_price_sum;
	this.register = register;
	this.register_time = register_time;
	this.checker = checker;
	this.check_time = check_time;
	this.changer = changer;
	this.change_time = change_time;
	this.check_tag = check_tag;
	this.change_tag = change_tag;
}
public D_module() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDesign_id() {
	return design_id;
}
public void setDesign_id(String design_id) {
	this.design_id = design_id;
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
public D_CONFIG_FILE_KIND getFirst_kind() {
	return first_kind;
}
public void setFirst_kind(D_CONFIG_FILE_KIND first_kind) {
	this.first_kind = first_kind;
}
public D_CONFIG_FILE_KIND getSecond_kind() {
	return second_kind;
}
public void setSecond_kind(D_CONFIG_FILE_KIND second_kind) {
	this.second_kind = second_kind;
}
public D_CONFIG_FILE_KIND getThird_kind() {
	return third_kind;
}
public void setThird_kind(D_CONFIG_FILE_KIND third_kind) {
	this.third_kind = third_kind;
}
public User getDesigner() {
	return designer;
}
public void setDesigner(User designer) {
	this.designer = designer;
}
public String getModule_descri() {
	return module_descri;
}
public void setModule_descri(String module_descri) {
	this.module_descri = module_descri;
}
public double getCost_price_sum() {
	return cost_price_sum;
}
public void setCost_price_sum(double cost_price_sum) {
	this.cost_price_sum = cost_price_sum;
}
public User getRegister() {
	return register;
}
public void setRegister(User register) {
	this.register = register;
}
public String getRegister_time() {
	return register_time;
}
public void setRegister_time(String register_time) {
	this.register_time = register_time;
}
public User getChecker() {
	return checker;
}
public void setChecker(User checker) {
	this.checker = checker;
}
public String getCheck_time() {
	return check_time;
}
public void setCheck_time(String check_time) {
	this.check_time = check_time;
}
public User getChanger() {
	return changer;
}
public void setChanger(User changer) {
	this.changer = changer;
}
public String getChange_time() {
	return change_time;
}
public void setChange_time(String change_time) {
	this.change_time = change_time;
}
public String getCheck_tag() {
	return check_tag;
}
public void setCheck_tag(String check_tag) {
	this.check_tag = check_tag;
}
public String getChange_tag() {
	return change_tag;
}
public void setChange_tag(String change_tag) {
	this.change_tag = change_tag;
}
@Override
public String toString() {
	return "D_module [id=" + id + ", design_id=" + design_id + ", product_id=" + product_id + ", product_name="
			+ product_name + ", first_kind=" + first_kind + ", second_kind=" + second_kind + ", third_kind="
			+ third_kind + ", designer=" + designer + ", module_descri=" + module_descri + ", cost_price_sum="
			+ cost_price_sum + ", register=" + register + ", register_time=" + register_time + ", checker=" + checker
			+ ", check_time=" + check_time + ", changer=" + changer + ", change_time=" + change_time + ", check_tag="
			+ check_tag + ", change_tag=" + change_tag + ", getId()=" + getId() + ", getDesign_id()=" + getDesign_id()
			+ ", getProduct_id()=" + getProduct_id() + ", getProduct_name()=" + getProduct_name() + ", getFirst_kind()="
			+ getFirst_kind() + ", getSecond_kind()=" + getSecond_kind() + ", getThird_kind()=" + getThird_kind()
			+ ", getDesigner()=" + getDesigner() + ", getModule_descri()=" + getModule_descri()
			+ ", getCost_price_sum()=" + getCost_price_sum() + ", getRegister()=" + getRegister()
			+ ", getRegister_time()=" + getRegister_time() + ", getChecker()=" + getChecker() + ", getCheck_time()="
			+ getCheck_time() + ", getChanger()=" + getChanger() + ", getChange_time()=" + getChange_time()
			+ ", getCheck_tag()=" + getCheck_tag() + ", getChange_tag()=" + getChange_tag() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}


}
