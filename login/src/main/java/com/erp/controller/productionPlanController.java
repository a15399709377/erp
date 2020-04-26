package com.erp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.pojo.m_apply;
import com.erp.productionPlanService.productionPlanService;

@Controller
public class productionPlanController {
	@Autowired
	productionPlanService productionPlanService;
	
	@RequestMapping("/addProductionPlan")
	@ResponseBody
	public int addProductionPlan(d_file file,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		d_file file1=new d_file("SP003","神州战神 笔记本电脑",null,null,50);
		m_apply apply=new m_apply(1,"PL001",file1,user.getLogin_id(),null,user.getLogin_id(),null,null,null,null,null,null);
		return productionPlanService.addProductionPlan(apply);
	}
	
	
	@RequestMapping("/auditProductionPlan")
	@ResponseBody
	public int auditProductionPlan(m_apply apply,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		m_apply apply1 =new m_apply(1,"可以",1);
		return productionPlanService.auditProductionPlan(apply1,user);
	}
	
	
}
