package com.erp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		return "zdcpscgxsjd";
	}
	
	//显示工序
		@RequestMapping("/xsgx")
		@ResponseBody
		public List<gx> getM_PROCEDURE() {
			gx g=new gx(01, "组装", "对于产品的组装");
			gx g2=new gx(01, "测试", "对于产品的测试");
			gx g3=new gx(01, "包装", "对于产品的包装");
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
		@RequestMapping("/cxda")
		public String cxda(String product_id,HttpServletRequest request) {
			HttpSession session=request.getSession();
			session.setAttribute("pro", service.getD_FileByProduct_id(product_id));
			return "scgxsjd";
		}
		//添加产品工序明细表和产品工序表
		//@RequestMapping("/tjcpgxb")
		//@ResponseBody
		//public String tjcpgxb() {
			//创建一个方法添加数据到产品工序表和产品工序明细表中
			//d_file file=new d_file(new D_CONFIG_FILE_KIND(1, 0, "1", "电子",1), new D_CONFIG_FILE_KIND(2, 1, "2", "计算机",2), new D_CONFIG_FILE_KIND(3, 2, "3","服务器",3));
			//获取之前的存入进的file
			//List<m_design_procedure_details> list=new ArrayList<m_design_procedure_details>();
			//m_design_procedure pro=new m_design_procedure(1, "2", null, null, null, "cp001", "电脑", "起飞", 1.1, 1.1, "李涛", "李涛", "2020/12/10", "李涛", null, null, "S001-1", null, null, "B002-0", "G002-0", "G003-0",list);
			//HttpSession session=request.getSession();

			//return "";
		//}
}
