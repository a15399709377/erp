package com.erp.proceduresService;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.erp.pojo.d_file;
import com.erp.pojo.m_design_procedure;

public interface procedureService {
	//获取所有的档案信息必须是通过的档案信息
		List<d_file> getAllFile();
		//根据编号获取档案信息
		d_file getD_FileByProduct_id(@Param("product_id")String product_id);

		int addProcedureAndProcedure_details(m_design_procedure pro,d_file file);
}
