package com.erp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.pojo.m_apply;
import com.erp.pojo.m_design_procedure_details;
import com.erp.pojo.m_design_procedure_module;
import com.erp.productFilesService.productFilesService;
import com.erp.productionPlanService.productionPlanService;

@Controller
public class productionPlanController {
	@Autowired
	productionPlanService productionPlanService;
	
	@Autowired
	productFilesService productFilesService; 
	
	//生产计划
	@RequestMapping("/xfsscjhdj")
	public String xfsscjhdj(Model model,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		model.addAttribute("username",user.getLogin_id());
		return "xfsscjhdj";
	}
	
	
	//查询所有类型为商品的集合
	@RequestMapping("/d_fileAll")
	@ResponseBody
	public List<d_file> d_fileAll() {
		
		return productionPlanService.d_fileAll();
	}
	
	/*增加选择生产的商品*/	   
   
	@RequestMapping("/addProductionPlan")
	@ResponseBody
	public int addProductionPlan(int id,int amount,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		System.out.println(id);
		System.out.println(amount);
		d_file df=productFilesService.auditProductFilesXX(id);
		df.setAmount(amount);
		return productionPlanService.addProductionPlan(df,user);
	}
	
	//生产计划审核
	@RequestMapping("/scjhsh")
	public String scjhsh(Model model,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		model.addAttribute("username",user.getLogin_id());
		return "scjhsh";
	}
	
	
	
	//生产计划审核
	
	@RequestMapping("/scjhshAll")
	@ResponseBody
	public List<m_apply> scjhshAll() {
		
		return productionPlanService.scjhshAll();
	}
	
	@RequestMapping("scjhshXX")
	@ResponseBody
	public List<m_apply> scjhshXX(int id) {
		
		return productionPlanService.scjhshXX(id);
	}
	
	@RequestMapping("/auditProductionPlan")
	@ResponseBody
	public int auditProductionPlan(int id,int audit,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		m_apply apply1 =new m_apply(id,"",audit);
		return productionPlanService.auditProductionPlan(apply1,user);
	}
	
	//生产计划查询
	@RequestMapping("/scjhcx")
	public String scjhcx(Model model,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		model.addAttribute("username",user.getLogin_id());
		return "scjhcx";
	}
	
	//查询所有生产计划sccxAll
	@RequestMapping("/sccxAll")
	@ResponseBody
	public List<m_apply> sccxAll() {
		
		return productionPlanService.sccxAll();
	}
	
	//制定生产派工单
	
	@RequestMapping("/zdscpgd")
	public String zdscpgd(Model model,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		model.addAttribute("username",user.getLogin_id());
		return "zdscpgd";
	}
	
	@RequestMapping("zdscpgdAll")
	@ResponseBody
	public List<m_apply> zdscpgdAll() {
		
		return productionPlanService.zdscpgdAll();
	}
	
	@RequestMapping("/zdscpgdXX")
	@ResponseBody
    public m_apply zdscpgdXX(int id) {
		m_apply mm=productionPlanService.zdscpgdXX(id);	
		List<m_design_procedure_details> list=mm.getProduct().getM_Design_Procedure().getProcedure_details();
		for (m_design_procedure_details mmmm : list) {
			mmmm.setLabour_hour_amount(mmmm.getLabour_hour_amount()*mm.getAmount());
		    System.out.println(mmmm.getLabour_hour_amount());
			mmmm.setSubtotal(mmmm.getLabour_hour_amount()*mmmm.getCost_price());
			System.out.println(mmmm.getSubtotal());
		}
		return mm;
	}
	
	

	@RequestMapping("/zdscpgdCkwl")
	@ResponseBody
    public List<m_design_procedure_module> zdscpgdCkwl(int id,int amo) {
    	System.out.println(amo);
		List<m_design_procedure_module> list=productionPlanService.zdscpgdCkwl(id);
		for (m_design_procedure_module mmmm : list) {
			mmmm.setAmount(mmmm.getAmount()*amo);
			mmmm.setSubtotal(mmmm.getAmount()*mmmm.getCost_price());
		}
		return list;
	}
    
    
    @RequestMapping("/zdscpgdxx")
	@ResponseBody
    public int zdscpgdxx(@RequestBody m_apply listxx,HttpServletRequest request) {
    	HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		System.out.println(listxx);
		return productionPlanService.zdscpgdxx(listxx,user);
	}
    
    //生产派工单审核
    @RequestMapping("/scpgdsh")
	public String scpgdsh(Model model,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		model.addAttribute("username",user.getLogin_id());
		return "scpgdsh";
	}
}
