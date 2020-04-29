package com.erp.s_cellService;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.pojo.s_cell;


public interface s_cellService {

		//制定安全库存配置单
		int inserts_cell(s_cell s);
		//查询所有需要审核的 安全库存配置单
		List<s_cell> seles_cell();
		//修改s_cell的
		int upds_cell(s_cell se);
}
