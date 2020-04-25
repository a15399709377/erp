package com.erp.productionPlanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.mapper.productionPlanMapper.productionPlanMapper;
import com.erp.pojo.User;
import com.erp.pojo.m_apply;
@Service
public class productionPlanServiceImpl implements productionPlanService {

	@Autowired
	productionPlanMapper productionPlanMapper;
	@Override
	public int addProductionPlan(m_apply apply) {
		// TODO Auto-generated method stub
		return productionPlanMapper.addProductionPlan(apply);
	}

	@Override
	public int auditProductionPlan(m_apply apply1, User user) {
		// TODO Auto-generated method stub
		return productionPlanMapper.auditProductionPlan(apply1,user);
	}
	
}
