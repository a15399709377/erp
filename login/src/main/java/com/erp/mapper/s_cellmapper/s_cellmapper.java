package com.erp.mapper.s_cellmapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.erp.pojo.s_cell;


@Mapper
public interface s_cellmapper {
	//制定安全库存配置单
	int inserts_cell(s_cell s);
	//查询所有需要审核的 安全库存配置单
	List<s_cell> seles_cell();
	//修改产品档案d_file 表的 库存分配标志 design_cell_tag字段
	int updd_file_design_cell_tag(@Param("id")int id,@Param("did")String did);
	int upds_cell_check_tag(@Param("id") int id );

}
