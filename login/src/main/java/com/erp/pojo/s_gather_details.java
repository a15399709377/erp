package com.erp.pojo;
/*#入库明细(S_GATHER_DETAILS)
CREATE TABLE S_GATHER_DETAILS
(
  id               INT(6) AUTO_INCREMENT PRIMARY KEY NOT NULL,#序号
  parent_id        INT(6) NOT NULL,#父级序号
  product_id       VARCHAR(50) NOT NULL,#产品编号
  product_name     VARCHAR(50),#产品名称
  product_describe VARCHAR(400),#描述
  amount           DOUBLE(12,2) NOT NULL,#数量
  amount_unit      VARCHAR(20),#单位
  cost_price       DOUBLE(12,2),#单价
  subtotal         DOUBLE(12,2),#小计
  gathered_amount  DOUBLE(12,2),#确认出库件数
  gather_tag       VARCHAR(20) NOT NULL #出库标志K002-1: 已登记K002-2: 已调度

 */
public class s_gather_details {
private String  id              ;//序号
private String  parent_id       ;//父级序号
private String  product_id      ;//产品编号
private String  product_name    ;//产品名称
private String  product_describe;//描述
private String  amount          ;//数量
private String  amount_unit     ;//单位
private String  cost_price      ;//单价
private String  subtotal        ;//小计
private String  gathered_amount ;//确认入库件数
private String  gather_tag      ;//入库标志  K002-1: 已登记  K002-2: 已调度
public s_gather_details() {
	super();
}
public s_gather_details(String id, String parent_id, String product_id, String product_name, String product_describe,
		String amount, String amount_unit, String cost_price, String subtotal, String gathered_amount,
		String gather_tag) {
	super();
	this.id = id;
	this.parent_id = parent_id;
	this.product_id = product_id;
	this.product_name = product_name;
	this.product_describe = product_describe;
	this.amount = amount;
	this.amount_unit = amount_unit;
	this.cost_price = cost_price;
	this.subtotal = subtotal;
	this.gathered_amount = gathered_amount;
	this.gather_tag = gather_tag;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getParent_id() {
	return parent_id;
}
public void setParent_id(String parent_id) {
	this.parent_id = parent_id;
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
public String getAmount() {
	return amount;
}
public void setAmount(String amount) {
	this.amount = amount;
}
public String getAmount_unit() {
	return amount_unit;
}
public void setAmount_unit(String amount_unit) {
	this.amount_unit = amount_unit;
}
public String getCost_price() {
	return cost_price;
}
public void setCost_price(String cost_price) {
	this.cost_price = cost_price;
}
public String getSubtotal() {
	return subtotal;
}
public void setSubtotal(String subtotal) {
	this.subtotal = subtotal;
}
public String getGathered_amount() {
	return gathered_amount;
}
public void setGathered_amount(String gathered_amount) {
	this.gathered_amount = gathered_amount;
}
public String getGather_tag() {
	return gather_tag;
}
public void setGather_tag(String gather_tag) {
	this.gather_tag = gather_tag;
}
@Override
public String toString() {
	return "s_gather_details [id=" + id + ", parent_id=" + parent_id + ", product_id=" + product_id + ", product_name="
			+ product_name + ", product_describe=" + product_describe + ", amount=" + amount + ", amount_unit="
			+ amount_unit + ", cost_price=" + cost_price + ", subtotal=" + subtotal + ", gathered_amount="
			+ gathered_amount + ", gather_tag=" + gather_tag + "]";
}
}
