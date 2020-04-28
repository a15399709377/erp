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
import com.erp.pojo.d_file;
import com.erp.pojo.gx;
import com.erp.pojo.m_design_procedure;
import com.erp.pojo.m_design_procedure_details;
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
		
		//根据产品档案的序号获取产品档案
		@RequestMapping("/zdsjd")
		public String cxda(String id,HttpServletRequest request,Model model) {
			HttpSession session=request.getSession();
			session.setAttribute("pro", service.getD_FileByProduct_id(id));
			model.addAttribute("pr", service.getD_FileByProduct_id(id));
			return "ADDF";
		}
		//添加产品工序明细表和产品工序表
		@RequestMapping("/tjcpgxb")
		@ResponseBody
		public int tjcpgxb(HttpServletRequest request,@RequestBody m_design_procedure pro) {
			//创建一个方法添加数据到产品工序表和产品工序明细表中
			//获取之前的存入进的file
			HttpSession session=request.getSession();
			d_file file=(d_file)session.getAttribute("pro");
			System.out.println(pro);
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
		//获取指定的产品工序
		@RequestMapping("/zxwlsjd")
		public String zxwlsjd(int id,Model model) {
			m_design_procedure pr=service.getM_Design_Procedure(id);
			model.addAttribute("pr",pr);
			model.addAttribute("p", service.getDesign_Procedure_details(id));
			return "zxwlsjd";
		}
}
