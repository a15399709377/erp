package com.erp.warehouseService;

import java.util.List;

import com.erp.pojo.S_GATHER;
import com.erp.pojo.S_GATHER_DETAILS;
import com.erp.pojo.User;
import com.erp.pojo.warehouse;

public interface warehouseService {

	int addWarehousing(S_GATHER gATHER);

	List<S_GATHER> auditWarehousingAll();

	S_GATHER auditWarehousingXX(int id);

	int auditWarehousing(int id, int audit, User user);

	List<S_GATHER> dispatchAll();

	int dispatchS_GATHER(int id, int num);

	int Warehousingregistration(List<S_GATHER_DETAILS> dede);

	List<warehouse> allWoreHouse();

	int dispatchS_GATHERFather(int fid, User user);

	List<S_GATHER> warehousingAll();

	List<S_GATHER> rkdjfh();

	int WarehousingregistrationF(int id,int gathered_amount_sum);

	int auditruku(int id, int audit, User user);

	List<S_GATHER> rkcxAll();
	
}
