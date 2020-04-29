package com.erp.productFilesService;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.erp.pojo.D_module;
import com.erp.pojo.User;
import com.erp.pojo.d_file;

public interface productFilesService {

	int addProductFilesService(d_file file);

	int auditProductFiles(int i, int audit,User user);

	List<d_file> auditAll();

	d_file auditProductFilesXX(int id);

	List<d_file> designProductFiles();

	d_file designProductFilesXX(int id);

	List<d_file> designProductMaterial();


	int addD_module(D_module dm);

	int auditD_module(int id, int pid, User user);

	List<D_module> D_moduleAll();

	D_module D_moduleXX(int id);

	List<d_file> cpdacx();

	int cpdacxzs();

	
	
}
