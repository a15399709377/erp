package com.erp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.pojo.D_CONFIG_FILE_KIND;
import com.erp.pojo.D_module_details;
import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.pojo.gx;
import com.erp.pojo.m_design_procedure;
import com.erp.pojo.m_design_procedure_details;
import com.erp.pojo.m_design_procedure_module;
import com.erp.proceduresService.procedureService;

@Controller
public class procedureController {
	
	@Autowired
	procedureService service;
	
	//获取所有的通过审核的档案
	@RequestMapping("/zdcpscgxsjd")
	public String zdcpscgxsjd(Model model) {
		model.addAttribute("procedureList",service.getAllFile());
		model.addAttribute("num", service.getAllFileNum());
		return "zdcpscgxsjd";
	}
	
	//显示工序
		@RequestMapping("/xsgx")
		@ResponseBody
		public List<gx> getM_PROCEDURE() {
			gx g=new gx(01, "组装", "对于产品的组装");
			gx g2=new gx(02, "测试", "对于产品的测试");
			gx g3=new gx(03, "包装", "对于产品的包装");
			List<gx> gxList=new ArrayList<gx>();
			gxList.add(g);
			gxList.add(g2);
			gxList.add(g3);
			return gxList;
		}
		//添加工序
		@RequestMapping("/tjgx")
		@ResponseBody
		public gx getgx(gx g) {
			return g;
		}
		d_file file;
		//根据产品档案的序号获取产品档案
		@RequestMapping("/zdsjd")
		public String cxda(String id,Model model) {
			model.addAttribute("pr", service.getD_FileByProduct_id(id));
			file=service.getD_FileByProduct_id(id);
			return "ADDF";
		}
		//添加产品工序明细表和产品工序表
		@RequestMapping("/tjcpgxb")
		@ResponseBody
		public int tjcpgxb(HttpServletRequest request,@RequestBody m_design_procedure pro) {
			//创建一个方法添加数据到产品工序表和产品工序明细表中
			//获取之前的存入进的file
			int count=service.addProcedureAndProcedure_details(pro, file);
			return count;	
		}
		//审批产品工序
		@RequestMapping("spcpgx")
		@ResponseBody
		public int  spcpgx(int id) {
			int count=service.ToExamineDesign_Procedure(id);
			//审批成功后跳到审批成功的页面
			return count;
		}
		//获取需要审核的产品工序
		@RequestMapping("/cpscgxsjdsh")
		public String cpscgxsjdsh(Model model) {
			model.addAttribute("proList", service.getAllM_Design_procedure());
			return "cpscgxsjdsh";
		}
		
		//通过设计单编号查询这个产品工序
		@RequestMapping("/shcpgxsjd")
		public String shcpgxsjd(String id,Model model) {
			m_design_procedure pr=service.getM_Produce(id);
			List<m_design_procedure_details> pro=service.getDesign_Procedure_details(pr.getId());
			model.addAttribute("p", pro);
			model.addAttribute("pr", pr);
			return "shcpgxsjd";
		}
		
		
		//指定设计那个产品工序
		@RequestMapping("/zdwl")
		@ResponseBody
		public m_design_procedure zdwl(int id,Model model) {
			//获取指定的产品工序
			m_design_procedure m_design_proced=service.getM_Design_Procedure(id);
			//获取指定的订单详细
			m_design_proced.setProcedure_details(service.getDesign_Procedure_details(id));
			return m_design_proced;
		}
		//获取所有的产品工序
		@RequestMapping("/cpscgxsjdcx")
		public String cpscgxsjdcx(Model model) {
			//获取所有的产品工序
			model.addAttribute("proList", service.getAllesion());
			return "cpscgxsjdcx";
		}
		//根据ID获取产品工序设计单
		@RequestMapping("/ckgxsjd")
		public String ckgxsjd(int id,Model model) {
			//获取产品工序
			m_design_procedure pr=service.getM_Design_Procedure(id);
			model.addAttribute("pr",pr);
			model.addAttribute("p", service.getDesign_Procedure_details(id));
			return "ckgxsjd";
		}
		//获取所有的完成审核的产品工序
		@RequestMapping("/zdgxwlsjd")
		public String zdgxwlsjd(Model model) {
			model.addAttribute("proList", service.getAllm_design_procedureBycheck_tag());
			return "zdgxwlsjd";
		}
		int id=0;
		//获取指定的产品工序
		@RequestMapping("/zxwlsjd")
		public String zxwlsjd(int id,Model model) {
			m_design_procedure pr=service.getM_Design_Procedure(id);
			model.addAttribute("pr",pr);
			model.addAttribute("p", service.getDesign_Procedure_details(id));
			//获取产品制定的物料信息
			model.addAttribute("dom", service.D_moduleXX(pr.getProduct_id()));
			//获取物料信息的父级ID
			for (D_module_details m : service.D_moduleXX(pr.getProduct_id()).getD_module_details()) {
				id=m.getParent_id();
			}
			return "zxwlsjd";
		}
		//获取页面的物料详细表
		@RequestMapping("/wlxxb")
		@ResponseBody
		public int wlxxb(@RequestBody List<m_design_procedure_module> modul) {
			 int count=service.addM_WL(modul,id);
			return count;
		}
		//工序物料详细单审核
		@RequestMapping("/gxwlsjdsh")
		public String gxwlsjdsh(Model model) {
			model.addAttribute("pro", service.getAllm_design_procedureBywlsjwc());
			return "cpgxwlsjdsh";
		}
		
		@RequestMapping("/cpscgxwl")
		public String cpscgxwl(int id,Model model,HttpServletRequest request) {
			model.addAttribute("pr", service.getM_Design_Procedure(id));
			model.addAttribute("p", service.getDesign_Procedure_details(id));
			HttpSession session=request.getSession();
			User user=(User)session.getAttribute("user");
			model.addAttribute("username", user.getLogin_id());
			return "cpgxwsjdsh";
		}
		//根据父级编号获取所有的产品工序物料组成详细表
		@RequestMapping("/cpwlzcxxbById")
		@ResponseBody
		public List<m_design_procedure_module> cpwlzcxxbById(int id) {
			return service.getM_DESIGN_PROCEDURE_MODULEByParent_Id(id);
		}
		
		//获取产品生产工序表的ID
		@RequestMapping("/cpgxwlxxsjdsh")
		@ResponseBody
		public int cpgxwlxxsjdsh(int id) {
			return service.updateProduce(id);
		}
		
		//审核成功了 跳转页面
		@RequestMapping("/shcgl")
		public String shcgl() {
			return "shcg";
		}
		
		//查询所有的工序物料组成详细表
		@RequestMapping("/gxwlsjdcx")
		public String gxwlsjdcx(Model model) {
			model.addAttribute("pro", service.getAllM_design_procedure());
			return "gxwlsjdcx";
		}
		//查询单个工序物料组成详细表
		@RequestMapping("/cpgxwlxxsjdcx")
		public String cpgxwlxxsjdcx(int id,Model model) {
			model.addAttribute("pr", service.getM_Design_Procedure(id));
			model.addAttribute("p", service.getDesign_Procedure_details(id));
			return "cpgxwlxxsjdcx";
		}
}
