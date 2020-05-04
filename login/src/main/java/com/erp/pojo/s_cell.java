package com.erp.pojo;
/**
 * #库存单元(S_CELL)
 */
public class s_cell {
private int   	 id                 ;//#序号
private String 	 store_id           ;//#库存编号
private String 	 product_id         ;//产品编号
private String 	 product_name       ;//产品名称      
private int 	 first_kind_id      ;//产品I级分类编号  
private String 	 first_kind_name    ;// #产品I级分类名称  
private int 	 second_kind_id     ;// #产品II级分类编号 
private String 	 second_kind_name   ;// #产品II级分类名称 
private int 	 third_kind_id      ;// #产品III级分类编号
private String 	 third_kind_name    ;// #产品III级分类名称
private double 	 min_amount         ;// #库存报警下限数 
private double 	 max_amount         ;// #库存报警上限数 
private double 	 max_capacity_amount;// #最大存储量   
private double 	 amount             ;// #当前存储量   
private String 	 config             ;//#配置要求
private String 	 register           ;//#登记人
private String 	 register_time      ;//#登记时间
private String 	 checker            ;//#复核人
private String 	 check_time         ;//复核时间
private String 	 check_tag          ;//审核标志
private D_CONFIG_FILE_KIND first_kind; // '产品I级分类编号',

private D_CONFIG_FILE_KIND second_kind;//  '产品II级分类编号',

private D_CONFIG_FILE_KIND third_kind;//  '产品III级分类编号',
public s_cell() {
	super();
}
public s_cell(int id, String store_id, String product_id, String product_name, int first_kind_id,
		String first_kind_name, int second_kind_id, String second_kind_name, int third_kind_id, String third_kind_name,
		double min_amount, double max_amount, double max_capacity_amount, double amount, String config, String register,
		String register_time, String checker, String check_time, String check_tag, D_CONFIG_FILE_KIND first_kind,
		D_CONFIG_FILE_KIND second_kind, D_CONFIG_FILE_KIND third_kind) {
	super();
	this.id = id;
	this.store_id = store_id;
	this.product_id = product_id;
	this.product_name = product_name;
	this.first_kind_id = first_kind_id;
	this.first_kind_name = first_kind_name;
	this.second_kind_id = second_kind_id;
	this.second_kind_name = second_kind_name;
	this.third_kind_id = third_kind_id;
	this.third_kind_name = third_kind_name;
	this.min_amount = min_amount;
	this.max_amount = max_amount;
	this.max_capacity_amount = max_capacity_amount;
	this.amount = amount;
	this.config = config;
	this.register = register;
	this.register_time = register_time;
	this.checker = checker;
	this.check_time = check_time;
	this.check_tag = check_tag;
	this.first_kind = first_kind;
	this.second_kind = second_kind;
	this.third_kind = third_kind;
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
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStore_id() {
	return store_id;
}
public void setStore_id(String store_id) {
	this.store_id = store_id;
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
public int getFirst_kind_id() {
	return first_kind_id;
}
public void setFirst_kind_id(int first_kind_id) {
	this.first_kind_id = first_kind_id;
}
public String getFirst_kind_name() {
	return first_kind_name;
}
public void setFirst_kind_name(String first_kind_name) {
	this.first_kind_name = first_kind_name;
}
public int getSecond_kind_id() {
	return second_kind_id;
}
public void setSecond_kind_id(int second_kind_id) {
	this.second_kind_id = second_kind_id;
}
public String getSecond_kind_name() {
	return second_kind_name;
}
public void setSecond_kind_name(String second_kind_name) {
	this.second_kind_name = second_kind_name;
}
public int getThird_kind_id() {
	return third_kind_id;
}
public void setThird_kind_id(int third_kind_id) {
	this.third_kind_id = third_kind_id;
}
public String getThird_kind_name() {
	return third_kind_name;
}
public void setThird_kind_name(String third_kind_name) {
	this.third_kind_name = third_kind_name;
}
public double getMin_amount() {
	return min_amount;
}
public void setMin_amount(double min_amount) {
	this.min_amount = min_amount;
}
public double getMax_amount() {
	return max_amount;
}
public void setMax_amount(double max_amount) {
	this.max_amount = max_amount;
}
public double getMax_capacity_amount() {
	return max_capacity_amount;
}
public void setMax_capacity_amount(double max_capacity_amount) {
	this.max_capacity_amount = max_capacity_amount;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public String getConfig() {
	return config;
}
public void setConfig(String config) {
	this.config = config;
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
public String getCheck_tag() {
	return check_tag;
}
public void setCheck_tag(String check_tag) {
	this.check_tag = check_tag;
}
@Override
public String toString() {
	return "s_cell [id=" + id + ", store_id=" + store_id + ", product_id=" + product_id + ", product_name="
			+ product_name + ", first_kind_id=" + first_kind_id + ", first_kind_name=" + first_kind_name
			+ ", second_kind_id=" + second_kind_id + ", second_kind_name=" + second_kind_name + ", third_kind_id="
			+ third_kind_id + ", third_kind_name=" + third_kind_name + ", min_amount=" + min_amount + ", max_amount="
			+ max_amount + ", max_capacity_amount=" + max_capacity_amount + ", amount=" + amount + ", config=" + config
			+ ", register=" + register + ", register_time=" + register_time + ", checker=" + checker + ", check_time="
			+ check_time +", check_tag=" + check_tag
			+ ", first_kind=" + first_kind + ", second_kind=" + second_kind + ", third_kind=" + third_kind + "]";
}

}