package com.erp.mapper.productionPlanMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.erp.pojo.*;
@Mapper
public interface productionPlanMapper {

	int addProductionPlan(d_file df, User user, String sc_id);

	int auditProductionPlan(@Param("app1")m_apply apply1, User user);

	List<d_file> d_fileAll();

	String test();

	List<m_apply> sccxAll();

	List<m_apply> scjhshAll();

	List<m_apply> scjhshXX(int id);

	List<m_apply> zdscpgdAll();

	m_apply zdscpgdXX(int id);
	
	d_file product_id(String product_id);
	
	List<m_design_procedure> m_Design_Procedure(String product_id);

	List<m_design_procedure_module> zdscpgdCkwl(int id);

	String test1();

	int zdscpgdxx(@Param("mm")M_MANUFACTURE mm);

	int xgzt(int id);

	List<M_MANUFACTURE> scpgdshAll();

}
