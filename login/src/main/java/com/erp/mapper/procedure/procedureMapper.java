package com.erp.mapper.procedure;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.erp.pojo.D_module;
import com.erp.pojo.d_file;
import com.erp.pojo.m_design_procedure;
import com.erp.pojo.m_design_procedure_details;
import com.erp.pojo.m_design_procedure_module;
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

		String getProcedureIdByproduct_id();
		
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
		
		//获取所有的物料组成和它关联的物料组成详细表
		D_module D_moduleXX(@Param("id") String id);
		
		//添加产品工序物料表
		int addM_DESIGN_PROCEDURE_MODULE(@Param("m")m_design_procedure_module m);
		
		//修改产品生产工序明细
		int updateM_DESIGN_PROCEDURE_DETAILS(@Param("module_subtotal")double module_subtotal,@Param("id") int id);
		
		//修改产品物料组成明细
		int updated_module_details(@Param("residual_amount") double residual_amount,@Param("product_id") String product_id,@Param("parent_id") int parent_id);
		
		//修改产品生产工序表
		int updateM_DESIGN_PROCEDURE(@Param("id") int id);
		
		//获取产品生产工序详细表的父级ID
		int getM_DESIGN_PROCEDURE_ID(@Param("id") int id);
		
		//获取通过审核并且工序物料设计已经完成了的产品工序表
		List<m_design_procedure> getAllm_design_procedureBywlsjwc();
		
		//根据父级编号获取产品工序物料详细组成表
		List<m_design_procedure_module> getM_DESIGN_PROCEDURE_MODULEByParent_Id(@Param("id") int id);
		//修改产品工序表的物料组成设计标志
		int updateProduct(@Param("id")int id);
		//获取所有的产品生产工序标的数据
		List<m_design_procedure> getAllM_design_procedure();
}
