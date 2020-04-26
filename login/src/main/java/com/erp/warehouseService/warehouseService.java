package com.erp.warehouseService;

import java.util.List;

import com.erp.pojo.S_GATHER;
import com.erp.pojo.User;

public interface warehouseService {

	int addWarehousing(S_GATHER gATHER);

	List<S_GATHER> auditWarehousingAll();

	S_GATHER auditWarehousingXX(int id);

	int auditWarehousing(int id, int audit, User user);

	List<S_GATHER> dispatchAll();

	S_GATHER dispatchS_GATHERXX(int id);
	
}
