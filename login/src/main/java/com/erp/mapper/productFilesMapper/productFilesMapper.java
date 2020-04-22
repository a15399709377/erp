package com.erp.mapper.productFilesMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.pojo.m_design_procedure_details;
import com.erp.pojo.m_procedure;

@Mapper
public interface productFilesMapper {

	int addProductFilesService(@Param("file")d_file file);


	int auditProductFiles(@Param("id")int id,@Param("audit")int audit, @Param("user") User user);


	List<d_file> auditAll();


	d_file auditProductFilesXX(int id);


	List<d_file> designProductFiles();


	d_file designProductFilesXX(int id);

	//获取所有的档案信息必须是通过的档案信息
	List<d_file> getAllFile();
	
	//根据编号获取档案信息
	d_file getD_FileByProduct_id(@Param("product_id")String product_id);

	
	//添加工序产品表
	int addProcedure(m_procedure m);
	
	//添加工序明细产品表
	int addProcedureDetails(m_design_procedure_details m);
	
}


