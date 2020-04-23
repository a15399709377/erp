package com.erp.mapper.procedure;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.erp.pojo.d_file;
import com.erp.pojo.m_design_procedure_details;
import com.erp.pojo.m_procedure;

@Mapper
public interface procedureMapper {

	//获取所有的档案信息必须是通过的档案信息
		List<d_file> getAllFile();
		
		//根据编号获取档案信息
		d_file getD_FileByProduct_id(@Param("product_id")String product_id);

		
		//添加工序产品表
		int addProcedure(m_procedure m);
		
		//添加工序明细产品表
		int addProcedureDetails(m_design_procedure_details m);

}
