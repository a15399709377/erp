package com.erp.productFilesService;

import java.util.List;

import com.erp.pojo.User;
import com.erp.pojo.d_file;

public interface productFilesService {

	int addProductFilesService(d_file file);

	int auditProductFiles(int i, int audit,User user);

	List<d_file> auditAll();

	d_file auditProductFilesXX(int id);

}
