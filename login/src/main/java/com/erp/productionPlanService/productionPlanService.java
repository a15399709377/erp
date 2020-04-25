package com.erp.productionPlanService;

import com.erp.pojo.User;
import com.erp.pojo.m_apply;

public interface productionPlanService {

	int addProductionPlan(m_apply apply);

	int auditProductionPlan(m_apply apply1, User user);
	
}
