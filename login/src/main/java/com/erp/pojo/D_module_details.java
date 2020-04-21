package com.erp.pojo;
//产品物料组成明细
public class D_module_details {
private int  id               ;// 	 '序号',
private  int parent_id        ;// '父级序号',	
private  int details_number   ;// '物料序号',	
private  String product_id       ;// '物料编号',	
private  String product_name     ;// 	'物料名称'
private  String type             ;// 用途类型',	
private  String product_describe ;//'描叙', 	
private  String amount_unit      ;// '单位'	
private  double amount           ;// '数量',	
private  double residual_amount  ;// 	'可用数量',
private  double cost_price       ;// 	 '单价',
private  double subtotal         ;// 	'小计'

public D_module_details() {
	super();
}
public D_module_details(int id, int parent_id, int details_number, String product_id, String product_name, String type,
		String product_describe, String amount_unit, double amount, double residual_amount, double cost_price,
		double subtotal) {
	super();
	this.id = id;
	this.parent_id = parent_id;
	this.details_number = details_number;
	this.product_id = product_id;
	this.product_name = product_name;
	this.type = type;
	this.product_describe = product_describe;
	this.amount_unit = amount_unit;
	this.amount = amount;
	this.residual_amount = residual_amount;
	this.cost_price = cost_price;
	this.subtotal = subtotal;
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
public String getType() {
	return type;
}
public void setTYPE(String type) {
	this.type = type;
}
public String getProduct_describe() {
	return product_describe;
}
public void setProduct_describe(String product_describe) {
	this.product_describe = product_describe;
}
public String getAmount_unit() {
	return amount_unit;
}
public void setAmount_unit(String amount_unit) {
	this.amount_unit = amount_unit;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public double getResidual_amount() {
	return residual_amount;
}
public void setResidual_amount(double residual_amount) {
	this.residual_amount = residual_amount;
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
@Override
public String toString() {
	return "D_module_details [id=" + id + ", parent_id=" + parent_id + ", details_number=" + details_number
			+ ", product_id=" + product_id + ", product_name=" + product_name + ", type=" + type + ", product_describe="
			+ product_describe + ", amount_unit=" + amount_unit + ", amount=" + amount + ", residual_amount="
			+ residual_amount + ", cost_price=" + cost_price + ", subtotal=" + subtotal + "]";
}
    	
	
}
