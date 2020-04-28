package com.erp.productFilesService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.mapper.productFilesMapper.productFilesMapper;
import com.erp.pojo.D_module;
import com.erp.pojo.D_module_details;
import com.erp.pojo.User;
import com.erp.pojo.d_file;

@Service
@Transactional
public class productFilesServiceImpl implements productFilesService {
	@Autowired
	productFilesMapper productFilesMapper;
	
	@Override
	public int addProductFilesService(d_file file) {
		
		return productFilesMapper.addProductFilesService(file);
	}

	

	@Override
	public int auditProductFiles(int id,int audit,User user) {
		// TODO Auto-generated method stub
			return productFilesMapper.auditProductFiles(id,audit,user);
		
	}



	@Override
	public List<d_file> auditAll() {
		// TODO Auto-generated method stub
		return productFilesMapper.auditAll();
	}



	@Override
	public d_file auditProductFilesXX(int id) {
		// TODO Auto-generated method stub
		return productFilesMapper.auditProductFilesXX(id);
	}



	@Override
	public List<d_file> designProductFiles() {
		// TODO Auto-generated method stub
		return productFilesMapper.designProductFiles();
	}



	@Override
	public d_file designProductFilesXX(int id) {
		// TODO Auto-generated method stub
		return productFilesMapper.designProductFilesXX(id);
	}



	@Override
	public List<d_file> designProductMaterial() {
		// TODO Auto-generated method stub
		return productFilesMapper.designProductMaterial();
	}



	@Override
	public int addD_module(D_module dm) {
		int aa=0;
		int a=productFilesMapper.addD_module(dm);
		if(a>0) {
			List<D_module_details> details=dm.getD_module_details();
			for (D_module_details de : details) {
				int b=productFilesMapper.addDetails(de);
				if(b>0) {
					aa=1;
				}else {
					aa=0;
				}
			}
		}
		return aa;
	}



	@Override
	public int auditD_module(int id, int pid, int audit, User user) {
		if(audit==1) {
			int a=productFilesMapper.auditD_module(id, audit, user);
			if(a>0) {
				int b=productFilesMapper.auditD_moduleFile(pid);
				return b;
			}
		}else {
			int a=productFilesMapper.auditD_module(id, audit, user);
			return a;
		}		
		
		return 0;
	}



	@Override
	public List<d_file> cpdacx() {
		return productFilesMapper.cpdacx();
	}



	@Override
	public int cpdacxzs() {
		// TODO Auto-generated method stub
		return productFilesMapper.cpdacxzs();
	}



	




}
