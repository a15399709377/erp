package com.erp.s_cellService;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.pojo.s_cell;
import com.erp.pojo.s_gather;
import com.erp.pojo.s_gather_details;

public interface s_cellService {

		//制定安全库存配置单
		int inserts_cell(s_cell s);
		//查询所有需要审核的 安全库存配置单
		List<s_cell> seles_cell();
		//修改s_cell的
		int upds_cell(s_cell se);
		//入库申请单
		int rksqd(s_gather sg);
		//入库申请单详细
		int rksqdxx(s_gather_details sgd);
		//入库申请登记审核查询
		List<s_gather> s_gatherAll();
		//入库申请登记审核(审核)
		int upds_gather(String gather_id);
}
