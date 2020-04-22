package com.erp.productFilesService;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.erp.pojo.User;
import com.erp.pojo.d_file;

public interface productFilesService {

	int addProductFilesService(d_file file);

	int auditProductFiles(int i, int audit,User user);

	List<d_file> auditAll();

	d_file auditProductFilesXX(int id);

	List<d_file> designProductFiles();

	d_file designProductFilesXX(int id);
	
	//获取所有的档案信息必须是通过的档案信息
	List<d_file> getAllFile();
	//根据编号获取档案信息
	d_file getD_FileByProduct_id(@Param("product_id")String product_id);

	int addProcedureAndProcedure_details(d_file file);
}
