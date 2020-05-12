package com.erp.productionPlanService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.mapper.productionPlanMapper.productionPlanMapper;
import com.erp.pojo.M_MANUFACTURE;
import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.pojo.m_apply;
import com.erp.pojo.m_design_procedure_details;
import com.erp.pojo.m_design_procedure_module;
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





	@Override
	public List<m_apply> scjhshAll() {
		// TODO Auto-generated method stub
		return productionPlanMapper.scjhshAll();
	}





	@Override
	public List<m_apply> scjhshXX(int id) {
		// TODO Auto-generated method stub
		return productionPlanMapper.scjhshXX(id);
	}





	@Override
	public List<m_apply> zdscpgdAll() {
		// TODO Auto-generated method stub
		return productionPlanMapper.zdscpgdAll();
	}





	@Override
	public m_apply zdscpgdXX(int id) {
		// TODO Auto-generated method stub
		return productionPlanMapper.zdscpgdXX(id);
	}





	@Override
	public List<m_design_procedure_module> zdscpgdCkwl(int id) {
		// TODO Auto-generated method stub
		return productionPlanMapper.zdscpgdCkwl(id);
	}





	@Override
	public int zdscpgdxx(m_apply listxx,User user) {
		M_MANUFACTURE mm=new M_MANUFACTURE();
		String m_id="";
		String id="";
		if(productionPlanMapper.test1()!=null) {
			id=productionPlanMapper.test1();
			m_id="PGD00"+Integer.parseInt(id)+1;
		}else {
			id="1";
			m_id="PGD00"+id;
		}
		mm.setManufacture_id(m_id);
		mm.setProduct_id(listxx.getProduct().getProduct_id());
		mm.setProduct_name(listxx.getProduct().getProduct_name());
		mm.setAmount(listxx.getAmount());
		mm.setApply_id_group(listxx.getId()+"");
		int aa=productionPlanMapper.xgzt(listxx.getId());
		if(aa>0) {
			mm.setProduct_describe(listxx.getProduct_describe());
			double module_cost_price_sum=0;
			double labour_cost_price_sum=0;
			List<m_design_procedure_details> list=listxx.getProduct().getM_Design_Procedure().getProcedure_details();
			for (m_design_procedure_details mmmm : list) {
				labour_cost_price_sum=labour_cost_price_sum+mmmm.getSubtotal();
				List<m_design_procedure_module> list1=this.zdscpgdCkwl(mmmm.getId());
				for (m_design_procedure_module mmm : list1) {
					mmm.setAmount(mmm.getAmount()*listxx.getAmount());
					mmm.setSubtotal(mmm.getAmount()*mmm.getCost_price());
					module_cost_price_sum=module_cost_price_sum+mmm.getSubtotal();
				}
			}
			
			
			mm.setModule_cost_price_sum(module_cost_price_sum);
			mm.setLabour_cost_price_sum(labour_cost_price_sum);
			mm.setDesigner(user.getLogin_id());
			mm.setRegister(user.getLogin_id());
			System.out.println(mm);
		}
		
		return productionPlanMapper.zdscpgdxx(mm);
	}





	@Override
	public List<M_MANUFACTURE> scpgdshAll() {
		// TODO Auto-generated method stub
		return productionPlanMapper.scpgdshAll();
	}






	
}
