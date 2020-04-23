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

	
}


