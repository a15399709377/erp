package com.erp.pojo;
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


}
