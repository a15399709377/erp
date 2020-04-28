package com.erp.mapper.procedure;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.erp.pojo.D_module;
import com.erp.pojo.d_file;
import com.erp.pojo.m_design_procedure;
import com.erp.pojo.m_design_procedure_details;
import com.erp.pojo.m_procedure;

@Mapper
public interface procedureMapper {

	//获取所有的档案信息必须是通过的档案信息
		List<d_file> getAllFile();
		
		//获取所有的档案信息必须是通过的档案信息的数量
		int getAllFileNum();
		
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
		
		//获取所有的物料信息
		List<D_module> getAllD_Module();
		
		//产品工序设计完之后，修改产品的工序设计标志
		int updateFileBydesign_procedure_tag(@Param("id")int id);
		
		//查询所有的工序设计完成的产品工序信息
		List<m_design_procedure> getAllM_Design_procedure();
		
		//根据ID查询产品工序信息
		m_design_procedure getM_Design_Procedure(@Param("id") int id);
		
		//根据ID查询产品明细表
		List<m_design_procedure_details> getDesign_Procedure_details(@Param("id") int id);
		
		//根据设计单编号获取这个产品工序
		m_design_procedure getM_Produce(@Param("id")String id);
		//获取所有的产品工序
		List<m_design_procedure> getAllesion();
		
		//获取所有的完成审核的产品工序
		List<m_design_procedure> getAllm_design_procedureBycheck_tag();
		
		
}
