package com.erp.mapper.productFilesMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.erp.pojo.D_CONFIG_FILE_KIND;
import com.erp.pojo.D_module;
import com.erp.pojo.D_module_details;
import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.pojo.m_design_procedure_details;
import com.erp.pojo.m_procedure;

@Mapper
public interface productFilesMapper {

	int addProductFilesService(@Param("file")d_file file);


	int auditProductFiles(@Param("id")int id,@Param("audit")int audit,@Param("user") User user);


	List<d_file> auditAll();


	d_file auditProductFilesXX(int id);


	List<d_file> designProductFiles();


	d_file designProductFilesXX(int id);


	List<d_file> designProductMaterial();


	int addD_module(@Param("dm")D_module dm);


	int addDetails(@Param("de")D_module_details de);

	String test();


	int auditD_module(int id, int audit, User user);


	int auditD_moduleFile(int pid);


	D_CONFIG_FILE_KIND D_CONFIG_FILE_KINDByid(int id);


	String test1();
	
	String test2();

	d_file getdeee(int id);


	int addD_moduledeSign_module_tag(String id);


	List<D_module> D_moduleAll();


	D_module D_moduleXX(int id);

	List<D_module_details> selectByTid(int id);

	User selectNameId(String id);


	List<d_file> cpdacx();


	int cpdacxzs();
	
}

