package com.erp.mapper.productionPlanMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.erp.pojo.User;
import com.erp.pojo.m_apply;
@Mapper
public interface productionPlanMapper {

	int addProductionPlan(@Param("app")m_apply apply);

	int auditProductionPlan(@Param("app1")m_apply apply1, User user);

}
