package com.erp.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.erp.s_cellService.s_cellService;
import com.erp.mapper.productFilesMapper.*;
import com.erp.mapper.s_cellmapper.s_cellmapper;
import com.erp.pojo.D_CONFIG_FILE_KIND;
import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.pojo.gx;
import com.erp.pojo.s_cell;
import com.erp.pojo.s_gather;
import com.erp.pojo.s_gather_details;

@Controller
public class s_cellController {
	@Autowired
	s_cellService service;
	@Autowired
	s_cellmapper mapper;
	
	//添加安全库存配置单
//		@RequestMapping("/zdaqkcpzd")
//		public String zdaqkcpzd(ModelAndView model) {
//			List<d_file> list=service.seleD_file();
//			model.addObject("list", list);
//			return "zdaqkcpzd";
//		}
	
	//添加安全库存配置单
	@RequestMapping("/aqkcpzd")
	@ResponseBody
	public int aqkcpzd(s_cell se) {
		//s_cell se =new s_cell(0, "S001", "SP001", "华硕y7000p 笔记本电脑", "1", "电子", "2", "计算机", "3", "服务器", 50, 500, 1000, 0, null, null, null, null, null, null);
		int num=service.inserts_cell(se);
		return num;
	}
	//查询所有需要审核的 安全库存配置单
	@RequestMapping("/seles_sell")
	@ResponseBody
	public List<s_cell> seles_sell() {
		List<s_cell> list=service.seles_cell();
		return list;
	}
	//审核 安全库存配置
	@RequestMapping("/shaqkcpz")
	@ResponseBody
	public int shaqkcpz(s_cell se,d_file d,HttpServletRequest request) {
//		HttpSession session=request.getSession();
//		User user=(User) session.getAttribute("user");
//		D_CONFIG_FILE_KIND first_kind=new D_CONFIG_FILE_KIND(1,0,"1","电子",1);
//		D_CONFIG_FILE_KIND second_kind=new D_CONFIG_FILE_KIND(2,1,"2","计算机",2);
//		D_CONFIG_FILE_KIND third_kind=new D_CONFIG_FILE_KIND(3,2,"3","服务器",3);
//		d=new d_file(1,"SP003","神州战神 笔记本电脑",null,first_kind,second_kind,
//				third_kind,"神州笔记本","Y001-1","D001-1","台","1",null,"12个月",
//				null,null,null,5000.00,3000.00,2000.00,null,"很好用的笔记本",null,user,null,null,null,null,null,null,null,null,
//				0,null,null,null,null);
//		se =new s_cell(1, "S001", "SP001", "华硕y7000p 笔记本电脑", "1", "电子", "2", "计算机", "3", "服务器", 50, 500, 1000, 0, null, null, null, null, null, null);
		int num=mapper.updd_file_design_cell_tag(d.getId(),d.getDesign_cell_tag());
		int num2=service.upds_cell(se);
		System.out.println("==========================="+num);
		System.out.println(num2);
		if(num>0&&num2>0){
			return 1;
		}else {
			return 0;
		}
	}
	//入库申请单
	@RequestMapping("/rksqd")
	@ResponseBody
	public int rksqd(s_gather sg ) {
		//sg=new s_gather(0, "SP001SP001","xxd","R001-3" , "", 400, 85050, gathered_amount_sum, remark, register, register_time, checker, check_time, check_tag, attemper, attemper_time, store_tag);
		int num=service.rksqd(sg);
		return num;
	}
	//入库申请单详细
	@RequestMapping("/rksqdxx")
	@ResponseBody
	public int  rksqdxx(s_gather_details sgd) {
		int num=service.rksqdxx(sgd);
		return num;
	}
	//入库申请登记审核查询
	@RequestMapping("/rksqdAll")
	@ResponseBody
	public  String s_gatherAll(ModelAndView model) {
		List<s_gather> list=service.s_gatherAll();
		model.addObject("list", list);
		return "rksqdAll";
	}	
	//入库申请登记审核(审核)
	@RequestMapping("/rksqdjsh")
	@ResponseBody
	public  int upds_gather(String gather_id) {
		int num=service.upds_gather(gather_id);
		return num;
	}		
		
	
}
