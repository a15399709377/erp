package com.erp.productionPlanService;

import java.util.List;

import com.erp.pojo.M_MANUFACTURE;
import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.pojo.m_apply;
import com.erp.pojo.m_design_procedure_module;

public interface productionPlanService {

	int addProductionPlan(d_file df, User user);

	int auditProductionPlan(m_apply apply1, User user);

	List<d_file> d_fileAll();

	List<m_apply> sccxAll();

	List<m_apply> scjhshAll();

	List<m_apply> scjhshXX(int id);

	List<m_apply> zdscpgdAll();

	m_apply zdscpgdXX(int id);

	List<m_design_procedure_module> zdscpgdCkwl(int id);

	int zdscpgdxx(m_apply listxx, User user);

	List<M_MANUFACTURE> scpgdshAll();

	
}
