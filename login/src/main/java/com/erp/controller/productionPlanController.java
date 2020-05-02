package com.erp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.pojo.m_apply;
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
	
	
	@RequestMapping("/auditProductionPlan")
	@ResponseBody
	public int auditProductionPlan(m_apply apply,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		m_apply apply1 =new m_apply(1,"可以",1);
		return productionPlanService.auditProductionPlan(apply1,user);
	}
	
	//生产查询
	@RequestMapping("/sccx")
	public String sccx(Model model,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		model.addAttribute("username",user.getLogin_id());
		return "sccx";
	}
	//查询所有生产计划sccxAll
	@RequestMapping("/sccxAll")
	@ResponseBody
	public List<m_apply> sccxAll() {
		
		return productionPlanService.sccxAll();
	}
}
