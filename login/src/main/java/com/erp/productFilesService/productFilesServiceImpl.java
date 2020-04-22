package com.erp.productFilesService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.mapper.productFilesMapper.productFilesMapper;
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
	public List<d_file> getAllFile() {
		// TODO Auto-generated method stub
		return productFilesMapper.getAllFile();
	}

	@Override
	public d_file getD_FileByProduct_id(String product_id) {
		// TODO Auto-generated method stub
		return productFilesMapper.getD_FileByProduct_id(product_id);
	}

	@Override
	public int addProcedureAndProcedure_details(d_file file) {
		// TODO Auto-generated method stub
		
		return 0;
	}
}
