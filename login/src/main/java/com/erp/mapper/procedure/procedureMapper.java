package com.erp.mapper.procedure;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.erp.pojo.d_file;
import com.erp.pojo.m_design_procedure;
import com.erp.pojo.m_design_procedure_details;
import com.erp.pojo.m_procedure;

@Mapper
public interface procedureMapper {

	//获取所有的档案信息必须是通过的档案信息
		List<d_file> getAllFile();
		
		//根据编号获取档案信息
		d_file getD_FileByProduct_id(@Param("product_id")String product_id);

		
		//添加工序产品表
		int addProcedure(@Param("m")m_procedure m);
		
		//添加工序明细产品表
		int addProcedureDetails(@Param("m")m_design_procedure_details m);
		
		//添加产品工序表
		int addProcedure_design(@Param("m")m_design_procedure m);

		int getProcedureIdByproduct_id();
		
		//审批产品工序表
		int ToExamineDesign_Procedure(@Param("id") int id);
		

}
