package com.erp.proceduresService;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.erp.pojo.D_module;
import com.erp.pojo.d_file;
import com.erp.pojo.m_design_procedure;
import com.erp.pojo.m_design_procedure_details;
import com.erp.pojo.m_design_procedure_module;

public interface procedureService {
	//获取所有的档案信息必须是通过的档案信息
		List<d_file> getAllFile();
		//根据编号获取档案信息
		d_file getD_FileByProduct_id(@Param("product_id")String product_id);
		int getAllFileNum();
		int addProcedureAndProcedure_details(m_design_procedure pro,d_file file);
		
		//审核产品工序信息
		int ToExamineDesign_Procedure(@Param("id") int id);
		
		//获取所有的物料信息
		List<D_module> getAllD_Module();
		//查询所有的工序设计完成的产品工序信息
		List<m_design_procedure> getAllM_Design_procedure();
		//根据ID查询产品工序信息
		m_design_procedure getM_Design_Procedure(@Param("id") int id);
		
		//根据父级序号查询产品工序明细表的信息
		List<m_design_procedure_details> getDesign_Procedure_details(@Param("id") int id);
		
		//根据设计编号获取产品工序
		m_design_procedure getM_Produce(String id);
		
		//获取所有的产品工序
		List<m_design_procedure> getAllesion();
		
		//获取所有的完成审核的产品工序
		List<m_design_procedure> getAllm_design_procedureBycheck_tag();
		
		//获取所有的物料组成和它关联的物料组成详细表
		D_module D_moduleXX(String id);
		
		int addM_WL(List<m_design_procedure_module> modul, int id);
		
		//获取通过审核并且工序物料设计已经完成了的产品工序表
		List<m_design_procedure> getAllm_design_procedureBywlsjwc();
		//根据父级编号获取产品工序物料详细组成表
		List<m_design_procedure_module> getM_DESIGN_PROCEDURE_MODULEByParent_Id(@Param("id") int id);
		//修改产品生产工序表的物料组成设计标志
		int updateProduce(int id);
		//获取所有的产品生产工序标的数据
		List<m_design_procedure> getAllM_design_procedure();
}
