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
	public int addProcedureAndProcedure_details(m_design_procedure pro, d_file file) {
		// TODO Auto-generated method stub
		return 0;
	}

	//@Override
	//public int addProcedureAndProcedure_details(m_design_procedure pro,d_file file) {
		// TODO Auto-generated method stub
		//给产品生产工序表添加产品级别分类
		//pro.setFirst_kind(file.getFirst_kind());
		//pro.setSecond_kind(file.getSecond_kind());
		//pro.setThird_kind(file.getThird_kind());
		//添加产品生产工序表
		//int count=mapper.addProcedure_design(pro);
		//根据产品编号 获取产品的序号
		//if(count>0) {
			//int parent_id=mapper.getProcedureIdByproduct_id();
			//获取所有的产品工序
			//for (m_design_procedure_details p : pro.getProcedure_details()) {
				//mapper.addProcedureDetails(new m_design_procedure_details(0, parent_id, p.getDetails_number(), p.getProcedure_id(), p.getProcedure_name(), p.getLabour_hour_amount(), p.getProcedure_describe(), p.getAmount_unit(), p.getCost_price(), p.getSubtotal(), p.getModule_subtotal(), p.getRegister(), p.getRegister_time(), p.getDesign_module_tag(), p.getDesign_module_change_tag()));
			//}
		//}
		
		//return count;
	//}
}
