package com.erp.proceduresService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.mapper.procedure.procedureMapper;
import com.erp.pojo.d_file;

@Service
public class procedureServiceImpl implements procedureService{
	
	@Autowired
	procedureMapper mapper;
	
	@Override
	public List<d_file> getAllFile() {
		// TODO Auto-generated method stub
		return mapper.getAllFile();
	}

	@Override
	public d_file getD_FileByProduct_id(String product_id) {
		// TODO Auto-generated method stub
		return mapper.getD_FileByProduct_id(product_id);
	}

	@Override
	public int addProcedureAndProcedure_details(d_file file) {
		// TODO Auto-generated method stub
		System.out.println("弱智xxd");
		return 0;
	}
}
