package com.erp.pojo;

import java.util.List;

//产品生产工序
public class m_design_procedure {
	private int id; //序号
	private String design_id; //设计编号
	private D_CONFIG_FILE_KIND first_kind; //产品I级分类
	private D_CONFIG_FILE_KIND second_kind; //产品II级分类
	private D_CONFIG_FILE_KIND third_kind; //产品III级分类
	   private int first_kind_id;
	   private String first_kind_name;
	   private int second_kind_id;
	   private String second_kind_name;
	   private int third_kind_id;
	   private String third_kind_name;
	private String product_id; //产品编号
	private String product_name; //产品名称
	private String procedure_describe; //设计要求
	private double cost_price_sum; //工时总成本
	private double module_cost_price_sum; //物料总成本
	private String designer; //设计人
	private String register; //登记人
	private String register_time; //登记时间
	private String checker; //复核人
	private String check_time; //审核时间
	private String check_suggestion; //审核意见
	private String check_tag; //审核标志S001-0: 等待审核S001-1: 审核通过S001-2: 审核不通过
	private String changer; //变更人
	private String change_time; //变更时间
	private String change_tag; //变更标志B002-0: 未变更B002-1: 已变更
	private String design_module_tag; //工序物料设计标志 G002-0: 未设计G002-1: 已提交G002-2: 已审核
	private String design_module_change_tag; //工序物料变更标志G003-0: 未变更G003-1: 已变更
	private List<m_design_procedure_details> procedure_details;
	public m_design_procedure(int id, String design, D_CONFIG_FILE_KIND first_kind, D_CONFIG_FILE_KIND second_kind,
			D_CONFIG_FILE_KIND third_kind, String product_id, String product_name, String procedure_describe,
			double cost_price_sum, double module_cost_price_sum, String designer, String register, String register_time,
			String checker, String check_time, String check_suggestion, String check_tag, String changer,
			String change_time, String design_module_tag, String design_module_change_tag) {
		super();
		this.id = id;
		this.design_id = design;
		this.first_kind = first_kind;
		this.second_kind = second_kind;
		this.third_kind = third_kind;
		this.product_id = product_id;
		this.product_name = product_name;
		this.procedure_describe = procedure_describe;
		this.cost_price_sum = cost_price_sum;
		this.module_cost_price_sum = module_cost_price_sum;
		this.designer = designer;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_time = check_time;
		this.check_suggestion = check_suggestion;
		this.check_tag = check_tag;
		this.changer = changer;
		this.change_time = change_time;
		this.design_module_tag = design_module_tag;
		this.design_module_change_tag = design_module_change_tag;
	}
	
	public m_design_procedure(int id, String design_id, D_CONFIG_FILE_KIND first_kind, D_CONFIG_FILE_KIND second_kind,
			D_CONFIG_FILE_KIND third_kind, int first_kind_id, String first_kind_name, int second_kind_id,
			String second_kind_name, int third_kind_id, String third_kind_name, String product_id, String product_name,
			String procedure_describe, double cost_price_sum, double module_cost_price_sum, String designer,
			String register, String register_time, String checker, String check_time, String check_suggestion,
			String check_tag, String changer, String change_time, String change_tag, String design_module_tag,
			String design_module_change_tag, List<m_design_procedure_details> procedure_details) {
		super();
		this.id = id;
		this.design_id = design_id;
		this.first_kind = first_kind;
		this.second_kind = second_kind;
		this.third_kind = third_kind;
		this.first_kind_id = first_kind_id;
		this.first_kind_name = first_kind_name;
		this.second_kind_id = second_kind_id;
		this.second_kind_name = second_kind_name;
		this.third_kind_id = third_kind_id;
		this.third_kind_name = third_kind_name;
		this.product_id = product_id;
		this.product_name = product_name;
		this.procedure_describe = procedure_describe;
		this.cost_price_sum = cost_price_sum;
		this.module_cost_price_sum = module_cost_price_sum;
		this.designer = designer;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_time = check_time;
		this.check_suggestion = check_suggestion;
		this.check_tag = check_tag;
		this.changer = changer;
		this.change_time = change_time;
		this.change_tag = change_tag;
		this.design_module_tag = design_module_tag;
		this.design_module_change_tag = design_module_change_tag;
		this.procedure_details = procedure_details;
	}

	public String getDesign_id() {
		return design_id;
	}

	public void setDesign_id(String design_id) {
		this.design_id = design_id;
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

	public m_design_procedure(int id, String design, D_CONFIG_FILE_KIND first_kind, D_CONFIG_FILE_KIND second_kind,
			D_CONFIG_FILE_KIND third_kind, String product_id, String product_name, String procedure_describe,
			double cost_price_sum, double module_cost_price_sum, String designer, String register, String register_time,
			String checker, String check_time, String check_suggestion, String check_tag, String changer,
			String change_time, String change_tag, String design_module_tag, String design_module_change_tag,
			List<m_design_procedure_details> procedure_details) {
		super();
		this.id = id;
		this.design_id = design;
		this.first_kind = first_kind;
		this.second_kind = second_kind;
		this.third_kind = third_kind;
		this.product_id = product_id;
		this.product_name = product_name;
		this.procedure_describe = procedure_describe;
		this.cost_price_sum = cost_price_sum;
		this.module_cost_price_sum = module_cost_price_sum;
		this.designer = designer;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_time = check_time;
		this.check_suggestion = check_suggestion;
		this.check_tag = check_tag;
		this.changer = changer;
		this.change_time = change_time;
		this.change_tag = change_tag;
		this.design_module_tag = design_module_tag;
		this.design_module_change_tag = design_module_change_tag;
		this.procedure_details = procedure_details;
	}

	public String getChange_tag() {
		return change_tag;
	}

	public void setChange_tag(String change_tag) {
		this.change_tag = change_tag;
	}

	public m_design_procedure(int id, String design, D_CONFIG_FILE_KIND first_kind, D_CONFIG_FILE_KIND second_kind,
			D_CONFIG_FILE_KIND third_kind, String product_id, String product_name, String procedure_describe,
			double cost_price_sum, double module_cost_price_sum, String designer, String register, String register_time,
			String checker, String check_time, String check_suggestion, String check_tag, String changer,
			String change_time, String design_module_tag, String design_module_change_tag,
			List<m_design_procedure_details> procedure_details) {
		super();
		this.id = id;
		this.design_id = design;
		this.first_kind = first_kind;
		this.second_kind = second_kind;
		this.third_kind = third_kind;
		this.product_id = product_id;
		this.product_name = product_name;
		this.procedure_describe = procedure_describe;
		this.cost_price_sum = cost_price_sum;
		this.module_cost_price_sum = module_cost_price_sum;
		this.designer = designer;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_time = check_time;
		this.check_suggestion = check_suggestion;
		this.check_tag = check_tag;
		this.changer = changer;
		this.change_time = change_time;
		this.design_module_tag = design_module_tag;
		this.design_module_change_tag = design_module_change_tag;
		this.procedure_details = procedure_details;
	}
	public List<m_design_procedure_details> getProcedure_details() {
		return procedure_details;
	}
	public void setProcedure_details(List<m_design_procedure_details> procedure_details) {
		this.procedure_details = procedure_details;
	}
	public m_design_procedure() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesign() {
		return design_id;
	}
	public void setDesign(String design) {
		this.design_id = design;
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
	public String getProcedure_describe() {
		return procedure_describe;
	}
	public void setProcedure_describe(String procedure_describe) {
		this.procedure_describe = procedure_describe;
	}
	public double getCost_price_sum() {
		return cost_price_sum;
	}
	public void setCost_price_sum(double cost_price_sum) {
		this.cost_price_sum = cost_price_sum;
	}
	public double getModule_cost_price_sum() {
		return module_cost_price_sum;
	}
	public void setModule_cost_price_sum(double module_cost_price_sum) {
		this.module_cost_price_sum = module_cost_price_sum;
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
	public String getCheck_suggestion() {
		return check_suggestion;
	}
	public void setCheck_suggestion(String check_suggestion) {
		this.check_suggestion = check_suggestion;
	}
	public String getCheck_tag() {
		return check_tag;
	}
	public void setCheck_tag(String check_tag) {
		this.check_tag = check_tag;
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
		return "m_design_procedure [id=" + id + ", design_id=" + design_id + ", first_kind=" + first_kind
				+ ", second_kind=" + second_kind + ", third_kind=" + third_kind + ", first_kind_id=" + first_kind_id
				+ ", first_kind_name=" + first_kind_name + ", second_kind_id=" + second_kind_id + ", second_kind_name="
				+ second_kind_name + ", third_kind_id=" + third_kind_id + ", third_kind_name=" + third_kind_name
				+ ", product_id=" + product_id + ", product_name=" + product_name + ", procedure_describe="
				+ procedure_describe + ", cost_price_sum=" + cost_price_sum + ", module_cost_price_sum="
				+ module_cost_price_sum + ", designer=" + designer + ", register=" + register + ", register_time="
				+ register_time + ", checker=" + checker + ", check_time=" + check_time + ", check_suggestion="
				+ check_suggestion + ", check_tag=" + check_tag + ", changer=" + changer + ", change_time="
				+ change_time + ", change_tag=" + change_tag + ", design_module_tag=" + design_module_tag
				+ ", design_module_change_tag=" + design_module_change_tag + ", procedure_details=" + procedure_details
				+ "]";
	}
}
