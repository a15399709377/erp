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

	
}
