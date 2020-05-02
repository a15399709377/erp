package com.erp.productionPlanService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.mapper.productionPlanMapper.productionPlanMapper;
import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.pojo.m_apply;
@Service
@Transactional
public class productionPlanServiceImpl implements productionPlanService {

	@Autowired
	productionPlanMapper productionPlanMapper;
	@Override
	public int addProductionPlan(d_file df,User user) {
		//拿到生产计划表中最后一条数据的id加上1当作下一条数据的生产计划编号
		
		if(productionPlanMapper.test()==null) {
			int id=1;
			String sc_id="PL00"+id;
			return productionPlanMapper.addProductionPlan(df,user,sc_id);
		}else {
			String id=productionPlanMapper.test();
			int idd=Integer.parseInt(id)+1;
			String sc_id="PL00"+idd;
			return productionPlanMapper.addProductionPlan(df,user,sc_id);
		}		
		
	}

	
	
	
	
	@Override
	public int auditProductionPlan(m_apply apply1, User user) {
		// TODO Auto-generated method stub
		return productionPlanMapper.auditProductionPlan(apply1,user);
	}

	@Override
	public List<d_file> d_fileAll() {
		// TODO Auto-generated method stub
		return productionPlanMapper.d_fileAll();
	}





	@Override
	public List<m_apply> sccxAll() {
		// TODO Auto-generated method stub
		return productionPlanMapper.sccxAll();
	}
	
}
