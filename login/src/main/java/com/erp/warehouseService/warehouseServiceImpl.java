package com.erp.warehouseService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.mapper.warehouseMapper.warehouseMapper;
import com.erp.pojo.S_GATHER;
import com.erp.pojo.S_GATHER_DETAILS;
import com.erp.pojo.User;
import com.erp.pojo.warehouse;

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
		}
		return b;
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
	public int dispatchS_GATHER(int id,int num) {
		
			int b=warehouseMapper.dispatchS_GATHER(id,num);
		
		
		return b;
	}
	/*@Override
	public int dispatchS_GATHER(int id,int num) {
		int maxnum=warehouseMapper.getmaxnum(id);
		int nownum=warehouseMapper.getnownum(id);
		int nownum2=nownum+num;
		int b=0;
		if(num==maxnum||nownum2==maxnum) {
			b=warehouseMapper.dispatchS_GATHER(id,num);
		}else {
			b=warehouseMapper.dispatchS_GATHER2(id,num);
		}
		
		return b;
	}*/

	@Override
	public int Warehousingregistration(List<S_GATHER_DETAILS> dede) {
		int b=0;
		
		for (S_GATHER_DETAILS de : dede) {
			if(de.getId()!=0) {
				int maxnum=warehouseMapper.getmaxnum(de.getId());
				int nownum=warehouseMapper.getnownum(de.getId());
				int nownum2=nownum+de.getNowamount();
				if(de.getNowamount()==maxnum||nownum2==maxnum) {
					b=warehouseMapper.dispatchS_GATHER3(de.getId(),de.getNowamount());
				}else {
					b=warehouseMapper.dispatchS_GATHER2(de.getId(),de.getNowamount());
				}
			}			
		}
		return b;
	}

	@Override
	public List<warehouse> allWoreHouse() {
		// TODO Auto-generated method stub
		return warehouseMapper.allWoreHouse();
	}

	@Override
	public int dispatchS_GATHERFather(int fid,User user) {
		// TODO Auto-generated method stub
		return warehouseMapper.dispatchS_GATHERFather(fid,user);
	}

	@Override
	public List<S_GATHER> warehousingAll() {
		// TODO Auto-generated method stub
		return warehouseMapper.warehousingAll();
	}

	@Override
	public List<S_GATHER> rkdjfh() {
		// TODO Auto-generated method stub
		return warehouseMapper.rkdjfh();
	}

	@Override
	public int WarehousingregistrationF(int id,int gathered_amount_sum) {
		// TODO Auto-generated method stub
		return warehouseMapper.WarehousingregistrationF(id,gathered_amount_sum);
	}

	@Override
	public int auditruku(int id, int audit, User user) {
		// TODO Auto-generated method stub
		return warehouseMapper.auditruku(id,audit);
	}

	@Override
	public List<S_GATHER> rkcxAll() {
		// TODO Auto-generated method stub
		return warehouseMapper.rkcxAll();
	}
	
	
}
