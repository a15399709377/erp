package com.erp.mapper.productionPlanMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.pojo.m_apply;
@Mapper
public interface productionPlanMapper {

	int addProductionPlan(d_file df, User user, String sc_id);

	int auditProductionPlan(@Param("app1")m_apply apply1, User user);

	List<d_file> d_fileAll();

	String test();

	List<m_apply> sccxAll();

}
