package com.erp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.pojo.d_file;
import com.erp.pojo.gx;
import com.erp.proceduresService.procedureService;

@Controller
public class procedureController {
	
	@Autowired
	procedureService service;
	
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
		//添加产品工序明细表和产品工序表
		@RequestMapping("/tjcpgxb")
		@ResponseBody
		public int tjcpgxb(d_file file) {
			//创建一个方法添加数据到产品工序表和产品工序明细表中
			return service.addProcedureAndProcedure_details(file);
		}
}
