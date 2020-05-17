package com.erp.s_cellService;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.erp.pojo.D_module;
import com.erp.pojo.D_module_details;
import com.erp.pojo.Role;
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
/////////////////////////////////////////////////////////////////////////////////////		
		 //产品档案登记审核  查询（某个）
		d_file cpdadjshcx(int id);
		//产品档案登记审核 提交 
		int updD_file(d_file d);
		//产品档案变更查询
		List<d_file> cpdabgcx();
		//产品档案永久删除(永久)
		int deletecp(int id);
		int deleteaqkc(String product_id);//要把安全库存里面关于这个产品的信息删掉
		//产品档案删除恢复(查询)
		List<d_file> cpdaschf();
/////////////////////////////////////////////////////////////////////////////////////		
		//物料组成设计单查询
		List<D_module> wlzcsjdcx();
		List<D_module_details> wlzcsjdcxxx(int id);//物料组成设计单详细
		//物料组成设计单查询(查询某个)
		D_module wlzcsjcxid(String id);
		//添加物料查询
		List<d_file> tjwlcx(String id);
		//添加物料详细
		int addD_module_details(D_module_details d);
		//查询产品信息
		d_file d_fileProduct_id(String product_id);
		//删除物料详细
		int delwlxx(int parent_id);
		//修改物料表的字段
		int updated_module(int id);
		//物料组成设计单查询(所有)
		List<D_module> wlzcsjdbgcx();
		//删除
		int delwlxx2(String id, int parent_id);
		
		List<Role> selectRole(String name);
		
		
		
		
}
