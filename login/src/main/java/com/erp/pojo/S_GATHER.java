package com.erp.pojo;

import java.util.List;

public class S_GATHER {
	/* id                  INT(6)AUTO_INCREMENT PRIMARY KEY NOT NULL, 序号
	  gather_id           VARCHAR(50) NOT NULL, 入库单编号
	  storer              VARCHAR(50), 入库人
	  reason              VARCHAR(20) NOT NULL, 入库理由 R001-1: 生产入库R001-2: 库存初始R001-3: 赠送R001-4: 内部归还R001-5: 其他归还
	  reasonexact         VARCHAR(50), 入库详细理由
	  amount_sum          DOUBLE(12,2), 总件数
	  cost_price_sum      DOUBLE(12,2), 总金额
	  gathered_amount_sum DOUBLE(12,2), 确认入库总件数
	  remark              VARCHAR(400), 备注
	  register            VARCHAR(50), 登记人
	  register_time       DATE, 登记时间
	  checker             VARCHAR(50), 复核人
	  check_time          DATE, 复核时间
	  check_tag           VARCHAR(20) NOT NULL, 审核标志S001-0: S001-2: 审核不通过
	  attemper            VARCHAR(50), 调度人
	  attemper_time       DATE, 调度时间
	  store_tag           VARCHAR(20) NOT NULL 库存标志  K002-0:啥也没干  K002-1: 已登记K002-2: 已调度
	*/
	private int id;
	private String gather_id;
	private User storer;
	private String reason;
	private String reasonexact;
	private int amount_sum;
	private double cost_price_sum;
	private int gathered_amount_sum;
	private String remark;
	private User register;
	private String register_time;
	private User checker;
	private String check_time;
	private String check_tag;
	private User attemper;
	private String attemper_time;
	private String store_tag;
	private List<S_GATHER_DETAILS> S_GATHER_DETAILS;
	@Override
	public String toString() {
		return "S_GATHER [id=" + id + ", gather_id=" + gather_id + ", storer=" + storer + ", reason=" + reason
				+ ", reasonexact=" + reasonexact + ", amount_sum=" + amount_sum + ", cost_price_sum=" + cost_price_sum
				+ ", gathered_amount_sum=" + gathered_amount_sum + ", remark=" + remark + ", register=" + register
				+ ", register_time=" + register_time + ", checker=" + checker + ", check_time=" + check_time
				+ ", check_tag=" + check_tag + ", attemper=" + attemper + ", attemper_time=" + attemper_time
				+ ", store_tag=" + store_tag + ", S_GATHER_DETAILS=" + S_GATHER_DETAILS + "]";
	}
	public S_GATHER(int id, String gather_id, User storer, String reason, String reasonexact, int amount_sum,
			double cost_price_sum, int gathered_amount_sum, String remark, User register, String register_time,
			User checker, String check_time, String check_tag, User attemper, String attemper_time, String store_tag,
			List<com.erp.pojo.S_GATHER_DETAILS> s_GATHER_DETAILS) {
		super();
		this.id = id;
		this.gather_id = gather_id;
		this.storer = storer;
		this.reason = reason;
		this.reasonexact = reasonexact;
		this.amount_sum = amount_sum;
		this.cost_price_sum = cost_price_sum;
		this.gathered_amount_sum = gathered_amount_sum;
		this.remark = remark;
		this.register = register;
		this.register_time = register_time;
		this.checker = checker;
		this.check_time = check_time;
		this.check_tag = check_tag;
		this.attemper = attemper;
		this.attemper_time = attemper_time;
		this.store_tag = store_tag;
		S_GATHER_DETAILS = s_GATHER_DETAILS;
	}
	public S_GATHER() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGather_id() {
		return gather_id;
	}
	public void setGather_id(String gather_id) {
		this.gather_id = gather_id;
	}
	public User getStorer() {
		return storer;
	}
	public void setStorer(User storer) {
		this.storer = storer;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReasonexact() {
		return reasonexact;
	}
	public void setReasonexact(String reasonexact) {
		this.reasonexact = reasonexact;
	}
	public int getAmount_sum() {
		return amount_sum;
	}
	public void setAmount_sum(int amount_sum) {
		this.amount_sum = amount_sum;
	}
	public double getCost_price_sum() {
		return cost_price_sum;
	}
	public void setCost_price_sum(double cost_price_sum) {
		this.cost_price_sum = cost_price_sum;
	}
	public int getGathered_amount_sum() {
		return gathered_amount_sum;
	}
	public void setGathered_amount_sum(int gathered_amount_sum) {
		this.gathered_amount_sum = gathered_amount_sum;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
	public String getCheck_tag() {
		return check_tag;
	}
	public void setCheck_tag(String check_tag) {
		this.check_tag = check_tag;
	}
	public User getAttemper() {
		return attemper;
	}
	public void setAttemper(User attemper) {
		this.attemper = attemper;
	}
	public String getAttemper_time() {
		return attemper_time;
	}
	public void setAttemper_time(String attemper_time) {
		this.attemper_time = attemper_time;
	}
	public String getStore_tag() {
		return store_tag;
	}
	public void setStore_tag(String store_tag) {
		this.store_tag = store_tag;
	}
	public List<S_GATHER_DETAILS> getS_GATHER_DETAILS() {
		return S_GATHER_DETAILS;
	}
	public void setS_GATHER_DETAILS(List<S_GATHER_DETAILS> s_GATHER_DETAILS) {
		S_GATHER_DETAILS = s_GATHER_DETAILS;
	}
	
	
	
}
