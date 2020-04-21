package com.erp.pojo;
//产品物料组成表
public class D_module {
private int id;//序号
private String  design_id     ;//'设计编号'
private String  product_id    ;//产品编号
private String  product_name  ;//'产品名称',       
private String  first_kind_id ;//'产品I级分类编号',   
private String  first_kind_name ;//'产品I级分类名称',   
private String  second_kind_id ;//'产品II级分类编号',  
private String  second_kind_name ;//'产品II级分类名称',  
private String  third_kind_id ;//'产品III级分类编号', 
private String  third_kind_name ;//'产品III级分类名称', 
private String  designer      ;//'设计人',        
private String  module_descri ;//'设计要求',
private double  cost_price_sum ;//'物料总成本'
private String  register      ;//'登记人',
private String  register_time ;//'登记时间',
private String  checker       ;//'复核人',
private String  check_time    ;//'复核时间',
private String  changer       ;//'变更人',
private String  change_time   ;//'变更时间',
private String  check_tag     ;//'审核标志 S001-0：等待审核 S001-1：审核通过 S001-2：审核不通过',
private String  change_tag    ;//'变更标志 B002-0：未变更 B002-1：已变更'

public D_module() {
	super();
}
public D_module(int id, String design_id, String product_id, String product_name, String first_kind_id,
		String first_kind_name, String second_kind_id, String second_kind_name, String third_kind_id,
		String third_kind_name, String designer, String module_descri, double cost_price_sum, String register,
		String register_time, String checker, String check_time, String changer, String change_time, String check_tag,
		String change_tag) {
	super();
	this.id = id;
	this.design_id = design_id;
	this.product_id = product_id;
	this.product_name = product_name;
	this.first_kind_id = first_kind_id;
	this.first_kind_name = first_kind_name;
	this.second_kind_id = second_kind_id;
	this.second_kind_name = second_kind_name;
	this.third_kind_id = third_kind_id;
	this.third_kind_name = third_kind_name;
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
public String getFirst_kind_id() {
	return first_kind_id;
}
public void setFirst_kind_id(String first_kind_id) {
	this.first_kind_id = first_kind_id;
}
public String getFirst_kind_name() {
	return first_kind_name;
}
public void setFirst_kind_name(String first_kind_name) {
	this.first_kind_name = first_kind_name;
}
public String getSecond_kind_id() {
	return second_kind_id;
}
public void setSecond_kind_id(String second_kind_id) {
	this.second_kind_id = second_kind_id;
}
public String getSecond_kind_name() {
	return second_kind_name;
}
public void setSecond_kind_name(String second_kind_name) {
	this.second_kind_name = second_kind_name;
}
public String getThird_kind_id() {
	return third_kind_id;
}
public void setThird_kind_id(String third_kind_id) {
	this.third_kind_id = third_kind_id;
}
public String getThird_kind_name() {
	return third_kind_name;
}
public void setThird_kind_name(String third_kind_name) {
	this.third_kind_name = third_kind_name;
}
public String getDesigner() {
	return designer;
}
public void setDesigner(String designer) {
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
public String getCheck_time() {
	return check_time;
}
public void setCheck_time(String check_time) {
	this.check_time = check_time;
}
public String getChanger() {
	return changer;
}
public void setChanger(String changer) {
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
			+ product_name + ", first_kind_id=" + first_kind_id + ", first_kind_name=" + first_kind_name
			+ ", second_kind_id=" + second_kind_id + ", second_kind_name=" + second_kind_name + ", third_kind_id="
			+ third_kind_id + ", third_kind_name=" + third_kind_name + ", designer=" + designer + ", module_descri="
			+ module_descri + ", cost_price_sum=" + cost_price_sum + ", register=" + register + ", register_time="
			+ register_time + ", checker=" + checker + ", check_time=" + check_time + ", changer=" + changer
			+ ", change_time=" + change_time + ", check_tag=" + check_tag + ", change_tag=" + change_tag + "]";
}

}
