package com.erp.warehouseService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.mapper.warehouseMapper.warehouseMapper;
import com.erp.pojo.S_GATHER;
import com.erp.pojo.S_GATHER_DETAILS;
import com.erp.pojo.User;

@Service
@Transactional
public class warehouseServiceImpl implements warehouseService {
	@Autowired
	warehouseMapper warehouseMapper;

	@Override
	public int addWarehousing(S_GATHER gATHER) {
		int a=warehouseMapper.addWarehousing(gATHER);
		int b=0;
		if(a>0) {
			for (S_GATHER_DETAILS S_GATHER_DETAILS : gATHER.getS_GATHER_DETAILS()) {
				b=warehouseMapper.addWarehousingXX(S_GATHER_DETAILS,gATHER.getId());
			}	
			if(b>0) {
				return b;
			}
		}
		return 0;
	}

	@Override
	public List<S_GATHER> auditWarehousingAll() {
		// TODO Auto-generated method stub
		return warehouseMapper.auditWarehousingAll();
	}

	@Override
	public S_GATHER auditWarehousingXX(int id) {
		// TODO Auto-generated method stub
		return warehouseMapper.auditWarehousingXX(id);
	}

	@Override
	public int auditWarehousing(int id, int audit, User user) {
		// TODO Auto-generated method stub
		return warehouseMapper.auditWarehousing(id,audit,user);
	}

	@Override
	public List<S_GATHER> dispatchAll() {
		// TODO Auto-generated method stub
		return warehouseMapper.dispatchAll();
	}

	@Override
	public S_GATHER dispatchS_GATHERXX(int id) {
		// TODO Auto-generated method stub
		return warehouseMapper.dispatchS_GATHERXX(id);
	}
}
