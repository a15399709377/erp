package com.erp.proceduresService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.mapper.procedure.procedureMapper;
import com.erp.pojo.d_file;
import com.erp.pojo.m_design_procedure;
import com.erp.pojo.m_design_procedure_details;
import com.erp.pojo.m_procedure;

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
		//获取产品工序对象
		m_design_procedure designProcedure=file.getM_proceDure();
		//获取工序对象
		List<m_procedure> procedure=designProcedure.getProcedure();
			//添加产品工序表
			mapper.addProcedure_design(designProcedure);
			//根据商品ID查询产品工序表的ID
			int procedure_id=mapper.getProcedureIdByproduct_id(designProcedure.getProduct_id());
			//添加工序详细表
			for (m_procedure pro : procedure) {
				
			}
		return 0;
	}
}
