package com.erp.mapper.s_gathermapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.erp.pojo.s_gather;
import com.erp.pojo.s_gather_details;


@Mapper
public interface s_gathermapper {
	//入库申请单
	int rksqd(s_gather sg);
	//入库申请单详细
	int rksqdxx(s_gather_details sgd);
	//入库申请登记审核查询
	List<s_gather> s_gatherAll();
	//入库申请登记审核(审核)
	int upds_gather(String gather_id);
}
