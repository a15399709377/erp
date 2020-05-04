package com.erp.proceduresService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.mapper.procedure.procedureMapper;
import com.erp.pojo.D_module;
import com.erp.pojo.d_file;
import com.erp.pojo.m_design_procedure;
import com.erp.pojo.m_design_procedure_details;
import com.erp.pojo.m_design_procedure_module;
import com.erp.pojo.m_procedure;

@Service
@Transactional
public class procedureServiceImpl implements procedureService{
	
	@Autowired
	procedureMapper mapper;
	
	@Override
	public List<d_file> getAllFile() {
		// TODO Auto-generated method stub
		return mapper.getAllFile();
	}

	@Override
	public d_file getD_FileByProduct_id(String product_id) {
		// TODO Auto-generated method stub
		return mapper.getD_FileByProduct_id(product_id);
	}



	@Override
	public int addProcedureAndProcedure_details(m_design_procedure pro,d_file file) {
		 //TODO Auto-generated method stub
		//给产品生产工序表添加产品级别分类
		pro.setFirst_kind_id(file.getFirst_kind_id());
		pro.setFirst_kind_name(file.getFirst_kind_name());
		pro.setSecond_kind_id(file.getSecond_kind_id());
		pro.setSecond_kind_name(file.getSecond_kind_name());
		pro.setThird_kind_id(file.getThird_kind_id());
		pro.setThird_kind_name(file.getThird_kind_name());
		//获取产品生产工序表的产品名称
		pro.setProduct_name(file.getProduct_name());
		
		//获取产品工序表的产品编号
		pro.setProduct_id(file.getProduct_id());
		//设置产品工序的设计编号
		
		int iid=0;
		if(mapper.getProcedureIdByproduct_id()==null) {
			iid=1;
		}else {
			String id=mapper.getProcedureIdByproduct_id();
			iid=Integer.parseInt(id)+1;
		}		
		String design_id="GX00"+iid;
		pro.setDesign_id(design_id);
		//获取工时总成本
		int cost_price_sum=0;
		for (m_design_procedure_details p : pro.getProcedure_details()) {
			cost_price_sum+=p.getSubtotal();
		}
		pro.setCost_price_sum(cost_price_sum);
		//添加产品生产工序表
		int count=mapper.addProcedure_design(pro);
		//根据产品编号 获取产品的序号
		if(count>0) {
			String parent_id=mapper.getProcedureIdByproduct_id();
			//获取所有的产品工序
			for (m_design_procedure_details p : pro.getProcedure_details()) {
				mapper.addProcedureDetails(new m_design_procedure_details(0, Integer.parseInt(parent_id), p.getDetails_number(), "GXBH"+p.getDetails_number(), p.getProcedure_name(), p.getLabour_hour_amount(), p.getProcedure_describe(), p.getAmount_unit(), p.getCost_price(), p.getSubtotal(), p.getModule_subtotal(), p.getRegister(), p.getRegister_time(), p.getDesign_module_tag(), p.getDesign_module_change_tag()));
			}
			//修改产品档案的工序设计标志为设计完成
			mapper.updateFileBydesign_procedure_tag(file.getId());
		}
		return count;
	}

	@Override
	public int ToExamineDesign_Procedure(int id) {
		// TODO Auto-generated method stub
		return mapper.ToExamineDesign_Procedure(id);
	}

	@Override
	public List<D_module> getAllD_Module() {
		// TODO Auto-generated method stub
		return mapper.getAllD_Module();
	}

	@Override
	public List<m_design_procedure> getAllM_Design_procedure() {
		// TODO Auto-generated method stub
		return mapper.getAllM_Design_procedure();
	}

	@Override
	public m_design_procedure getM_Design_Procedure(int id) {
		// TODO Auto-generated method stub
		return mapper.getM_Design_Procedure(id);
	}

	@Override
	public List<m_design_procedure_details> getDesign_Procedure_details(int id) {
		// TODO Auto-generated method stub
		return mapper.getDesign_Procedure_details(id);
	}

	@Override
	public int getAllFileNum() {
		// TODO Auto-generated method stub
		return mapper.getAllFileNum();
	}

	@Override
	public m_design_procedure getM_Produce(String id) {
		// TODO Auto-generated method stub
		return mapper.getM_Produce(id);
	}

	@Override
	public List<m_design_procedure> getAllesion() {
		// TODO Auto-generated method stub
		return mapper.getAllesion();
	}

	@Override
	public List<m_design_procedure> getAllm_design_procedureBycheck_tag() {
		// TODO Auto-generated method stub
		return mapper.getAllm_design_procedureBycheck_tag();
	}

	@Override
	public D_module D_moduleXX(String id) {
		// TODO Auto-generated method stub
		return mapper.D_moduleXX(id);
	}

	@Override
	public int addM_WL(List<m_design_procedure_module> modul,int pid) {
		// TODO Auto-generated method stub
		//获取产品工序详细表的ID
		int id=0;
		//添加产品工序物料详细表
		System.out.println(modul);
		for (m_design_procedure_module m : modul) {
			//添加产品工序物料详细表
			mapper.addM_DESIGN_PROCEDURE_MODULE(m);
			//修改产品工序详细表
			mapper.updateM_DESIGN_PROCEDURE_DETAILS(m.getSubtotal(), m.getParent_id());
			//修改产品物料组成明细
			mapper.updated_module_details(m.getAmount(), m.getProduct_id(),pid);
			//修改产品生产工序表
			id=m.getParent_id();
		}
		int count=mapper.updateM_DESIGN_PROCEDURE(mapper.getM_DESIGN_PROCEDURE_ID(id));
		return count;
	}

	@Override
	public List<m_design_procedure> getAllm_design_procedureBywlsjwc() {
		// TODO Auto-generated method stub
		return mapper.getAllm_design_procedureBywlsjwc();
	}

	@Override
	public List<m_design_procedure_module> getM_DESIGN_PROCEDURE_MODULEByParent_Id(int id) {
		// TODO Auto-generated method stub
		return mapper.getM_DESIGN_PROCEDURE_MODULEByParent_Id(id);
	}

	@Override
	public int updateProduce(int id) {
		// TODO Auto-generated method stub
		return mapper.updateProduct(id);
	}

	@Override
	public List<m_design_procedure> getAllM_design_procedure() {
		// TODO Auto-generated method stub
		return mapper.getAllM_design_procedure();
	}
}
