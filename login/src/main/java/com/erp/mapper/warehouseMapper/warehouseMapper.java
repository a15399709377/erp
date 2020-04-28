package com.erp.mapper.warehouseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.erp.pojo.S_GATHER;
import com.erp.pojo.S_GATHER_DETAILS;
import com.erp.pojo.User;
@Mapper
public interface warehouseMapper {

	int addWarehousing(@Param("gaa")S_GATHER gATHER);

	int addWarehousingXX(@Param("gaaa")S_GATHER_DETAILS s_GATHER_DETAILS, int id);

	List<S_GATHER> auditWarehousingAll();

	S_GATHER auditWarehousingXX(@Param("idd")int id);

	int auditWarehousing(@Param("iddd")int id, int audit, User user);

	List<S_GATHER> dispatchAll();

	S_GATHER dispatchS_GATHERXX(int id);
	
	List<S_GATHER_DETAILS> selectByTid(int id);
	
	User selectNameId(String storer);
	
	int dispatchS_GATHER(int num);

	int Warehousingregistration(S_GATHER_DETAILS de);


	
}