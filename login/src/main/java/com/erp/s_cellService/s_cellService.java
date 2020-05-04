package com.erp.s_cellService;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.pojo.s_cell;
import com.erp.pojo.warehouse;


public interface s_cellService {
		//查询产品档案登记审核通过的,库存分配标志未设计的
		List<d_file> cxByshbz_kcfpbz();
		User cxuser(String string);
		//查询需要安全库存配置的商品的信息
		d_file cxByproduct_id(int product_id);

		//查询产品档案登记审核通过的所有安全库存配置单
		List<d_file> cxByshbz();
		
		//制定安全库存配置单
		int inserts_cell(s_cell s);
		
		//查询所有需要审核的 安全库存配置单
		List<d_file> seles_cell();
		
		//修改s_cell的
		int upds_cell(s_cell se);
		
		//查询所有 可以 变更 的 安全库存配置单
		List<d_file> aqkcpzdbgcx();
		//查询仓库
		warehouse cxck();
		//根据产品编号 查询该产品的信息
		d_file cxByproduct_id2(String productid);
		// 查询需要审核的 安全配置单的 详细信息
		s_cell aqkcpzdfhcx(String id);
//////////////////////////////////////////////////////////////		
		 //产品档案登记审核  查询（某个）
		d_file cpdadjshcx(int id);
		//产品档案登记审核 提交 
		int updD_file(d_file d);
		//产品档案变更查询
		List<d_file> cpdabgcx();
		
		
}
