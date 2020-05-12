package com.erp.pojo;

public class M_MANUFACTURE {
	/*id                         INT(6) AUTO_INCREMENT PRIMARY KEY NOT NULL,# 序号
  manufacture_id             VARCHAR(50) NOT NULL,# 派工单编号
  product_id                 VARCHAR(50) NOT NULL,# 产品编号
  product_name               VARCHAR(50), #产品名称
  amount                     DOUBLE(12,2) NOT NULL,# 投产数量
  tested_amount              DOUBLE(12,2), #合格数量
  apply_id_group             VARCHAR(400) NOT NULL,# 生产计划序号组
  product_describe           VARCHAR(400),# 产品描述
  module_cost_price_sum      DOUBLE(12,2),#设计物料总成本
  real_module_cost_price_sum DOUBLE(12,2), #实际物料总成本
  labour_cost_price_sum      DOUBLE(12,2), #设计工时总成本
  real_labour_cost_price_sum DOUBLE(12,2), #实际工时总成本
  designer                   VARCHAR(50), #工单指定人
  register                   VARCHAR(50), #登记人
  register_time              DATE, #登记时间
  checker                    VARCHAR(50),# 审核人
  check_time                 DATE, #审核时间
  remark                     VARCHAR(400), #备注
  check_tag                  VARCHAR(20) NOT NULL,#审核标志S001-0: 等待审核S001-1: 审核通过S001-2: 审核不通过
  manufacture_procedure_tag  VARCHAR(20) NOT NULL #生产过程标志S002-0: 待登记S002-1: 未审核S002-2: 已完工
)*/
	
	private int id;
	private String manufacture_id;
	private String product_id;
	private String product_name;
	private int amount;
	private int tested_amount;
	private String apply_id_group;
	private String product_describe;
	private double module_cost_price_sum;
	private double labour_cost_price_sum;
	private double real_labour_cost_price_sum;
	private String designer;
	private String register;
	private String register_time;
	private String checker;
	private String check_time;
	private String remark;
	private String check_tag;
	private String manufacture_procedure_tag;
	@Override
	public String toString() {
		return "M_MANUFACTURE [id=" + id + ", manufacture_id=" + manufacture_id + ", product_id=" + product_id
				+ ", product_name=" + product_name + ", amount=" + amount + ", tested_amount=" + tested_amount
				+ ", apply_id_group=" + apply_id_group + ", product_describe=" + product_describe
				+ ", module_cost_price_sum=" + module_cost_price_sum + ", labour_cost_price_sum="
				+ labour_cost_price_sum + ", real_labour_cost_price_sum=" + real_labour_cost_price_sum + ", designer="
				+ designer + ", register=" + register + ", register_time=" + register_time + ", checker=" + checker
				+ ", check_time=" + check_time + ", remark=" + remark + ", check_tag=" + check_tag
				+ ", manufacture_procedure_tag=" + manufacture_procedure_tag + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManufacture_id() {
		return manufacture_id;
	}
	public void setManufacture_id(String manufacture_id) {
		this.manufacture_id = manufacture_id;
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getTested_amount() {
		return tested_amount;
	}
	public void setTested_amount(int tested_amount) {
		this.tested_amount = tested_amount;
	}
	public String getApply_id_group() {
		return apply_id_group;
	}
	public void setApply_id_group(String apply_id_group) {
		this.apply_id_group = apply_id_group;
	}
	public String getProduct_describe() {
		return product_describe;
	}
	public void setProduct_describe(String product_describe) {
		this.product_describe = product_describe;
	}
	public double getModule_cost_price_sum() {
		return module_cost_price_sum;
	}
	public void setModule_cost_price_sum(double module_cost_price_sum) {
		this.module_cost_price_sum = module_cost_price_sum;
	}
	public double getLabour_cost_price_sum() {
		return labour_cost_price_sum;
	}
	public void setLabour_cost_price_sum(double labour_cost_price_sum) {
		this.labour_cost_price_sum = labour_cost_price_sum;
	}
	public double getReal_labour_cost_price_sum() {
		return real_labour_cost_price_sum;
	}
	public void setReal_labour_cost_price_sum(double real_labour_cost_price_sum) {
		this.real_labour_cost_price_sum = real_labour_cost_price_sum;
	}
	public String getDesigner() {
		return designer;
	}
	public void setDesigner(String designer) {
		this.designer = designer;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCheck_tag() {
		return check_tag;
	}
	public void setCheck_tag(String check_tag) {
		this.check_tag = check_tag;
	}
	public String getManufacture_procedure_tag() {
		return manufacture_procedure_tag;
	}
	public void setManufacture_procedure_tag(String manufacture_procedure_tag) {
		this.manufacture_procedure_tag = manufacture_procedure_tag;
	}
	public M_MANUFACTURE(int id, String manufacture_id, String product_id, String product_name, int amount,
			int tested_amount, String apply_id_group, String product_describe, double module_cost_price_sum,
			double labour_cost_price_sum, double real_labour_cost_price_sum, String designer, String register,
			String register_time, String checker, String check_time, String remark, String check_tag,
			String manufacture_procedure_tag) {
		super();
		this.id = id;
		this.manufacture_id = manufacture_id;
		this.product_id = product_id;
		this.product_name = product_name;
		this.amount = amount;
		this.tested_amount = tested_amount;
		this.apply_id_group = apply_id_group;
		this.product_describe = product_describe;
		this.module_cost_price_sum = module_cost_price_sum;
		this.labour_cost_price_sum = labour_cost_price_sum;
		this.real_labour_cost_price_sum = real_labour_cost_price_sum;
		this.designer = designer;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_time = check_time;
		this.remark = remark;
		this.check_tag = check_tag;
		this.manufacture_procedure_tag = manufacture_procedure_tag;
	}
	public M_MANUFACTURE() {
		super();
	}
	
}
