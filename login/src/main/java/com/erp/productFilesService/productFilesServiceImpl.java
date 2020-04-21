package com.erp.productFilesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.mapper.productFilesMapper.productFilesMapper;
import com.erp.pojo.d_file;

@Service
public class productFilesServiceImpl implements productFilesService {
	@Autowired
	productFilesMapper productFilesMapper;
	
	@Override
	public int addProductFilesService(d_file file) {

		return productFilesMapper.addProductFilesService(file);
	}
	
}
