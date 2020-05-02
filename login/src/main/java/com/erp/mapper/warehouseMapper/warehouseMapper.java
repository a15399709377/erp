package com.erp.mapper.warehouseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.erp.pojo.S_GATHER;
import com.erp.pojo.S_GATHER_DETAILS;
import com.erp.pojo.User;
import com.erp.pojo.warehouse;
@Mapper
public interface warehouseMapper {

	int addWarehousing(@Param("gaa")S_GATHER gATHER);

	int addWarehousingXX(@Param("gaaa")S_GATHER_DETAILS s_GATHER_DETAILS, int id);

	List<S_GATHER> auditWarehousingAll();

	S_GATHER auditWarehousingXX(@Param("idd")int id);

	int auditWarehousing(@Param("iddd")int id, int audit, User user);

	List<S_GATHER> dispatchAll();

	
	List<S_GATHER_DETAILS> selectByTid(int id);
	
	User selectNameId(String storer);
	
	int dispatchS_GATHER(int id, int num);
	
	int dispatchS_GATHER2(int id, int num);
	
	int dispatchS_GATHER3(int id, int num);
	
	int getmaxnum(int id);
	
	int getnownum(int id);
	

	S_GATHER_DETAILS gets_G(int id);

	String test();

	List<warehouse> allWoreHouse();

	int dispatchS_GATHERFather(int fid, User user);

	List<S_GATHER> warehousingAll();

	int WarehousingregistrationF(int id,int gathered_amount_sum);

	List<S_GATHER> rkdjfh();

	int auditruku(int id, int audit);

	List<S_GATHER> rkcxAll();

	





	

	


	
}
