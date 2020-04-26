package com.erp.pojo;

public class S_GATHER_DETAILS {
	/* id               INT(6) AUTO_INCREMENT PRIMARY KEY NOT NULL,序号
	  parent_id        INT(6) NOT NULL,父级序号
	  product_id       VARCHAR(50) NOT NULL,产品编号
	  product_name     VARCHAR(50),产品名称
	  product_describe VARCHAR(400),描述
	  amount           DOUBLE(12,2) NOT NULL,数量
	  amount_unit      VARCHAR(20),单位
	  cost_price       DOUBLE(12,2),单价
	  subtotal         DOUBLE(12,2),小计
	  gathered_amount  DOUBLE(12,2),确认出库件数
	  gather_tag       VARCHAR(20) NOT NULL 出库标志  K002-0:啥也没干 K002-1: 已登记K002-2: 已调度*/
	private int id;
	private int parent_id;
	private String product_id;
	private String product_name;
	private String product_describe;
	private int amount;
	private String amount_unit;
	private double cost_price;
	private double subtotal;
	private int gathered_amount;
	private String gather_tag;
	public S_GATHER_DETAILS(int id, int parent_id, String product_id, String product_name, String product_describe,
			int amount, String amount_unit, double cost_price, double subtotal, int gathered_amount,
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
	public S_GATHER_DETAILS() {
		super();
	}
	@Override
	public String toString() {
		return "S_GATHER_DETAILS [id=" + id + ", parent_id=" + parent_id + ", product_id=" + product_id
				+ ", product_name=" + product_name + ", product_describe=" + product_describe + ", amount=" + amount
				+ ", amount_unit=" + amount_unit + ", cost_price=" + cost_price + ", subtotal=" + subtotal
				+ ", gathered_amount=" + gathered_amount + ", gather_tag=" + gather_tag + "]";
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
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
	public int getGathered_amount() {
		return gathered_amount;
	}
	public void setGathered_amount(int gathered_amount) {
		this.gathered_amount = gathered_amount;
	}
	public String getGather_tag() {
		return gather_tag;
	}
	public void setGather_tag(String gather_tag) {
		this.gather_tag = gather_tag;
	}
	
}
