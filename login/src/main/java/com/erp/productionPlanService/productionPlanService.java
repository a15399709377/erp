package com.erp.productionPlanService;

import java.util.List;

import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.pojo.m_apply;

public interface productionPlanService {

	int addProductionPlan(d_file df, User user);

	int auditProductionPlan(m_apply apply1, User user);

	List<d_file> d_fileAll();

	List<m_apply> sccxAll();
	
}
