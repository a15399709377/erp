package com.erp.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.s_cellService.s_cellService;
import com.erp.loginservice.LoginService;
import com.erp.mapper.productFilesMapper.productFilesMapper;
import com.erp.mapper.s_cellmapper.s_cellmapper;
import com.erp.pojo.D_CONFIG_FILE_KIND;
import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.pojo.s_cell;
import com.erp.pojo.warehouse;


@Controller
public class s_cellController {
	@Autowired
	s_cellService service;
	@Autowired
	s_cellmapper mapper;
	@Autowired
	productFilesMapper productFilesMapper;
	
	 //查询需要 添加安全库存配置单
	@RequestMapping("/zdaqkcpzd")
	public String zdaqkcpzd(Model model,HttpServletRequest request) {
		List<d_file> list=service.cxByshbz_kcfpbz();
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		model.addAttribute("username", user.getLogin_id());
		model.addAttribute("list", list);
		return "zdaqkcpzd";
	}
	//添加安全库存配置单
		@RequestMapping("/aqkcpzd")
		@ResponseBody
		public int aqkcpzd(s_cell s,HttpServletRequest request) {
			HttpSession session=request.getSession();
			User user=(User) session.getAttribute("user");
			System.out.println(s.getProduct_id());
			d_file d=service.cxByproduct_id2(s.getProduct_id());
			D_CONFIG_FILE_KIND first_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getFirst_kind_id());
			D_CONFIG_FILE_KIND second_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getSecond_kind_id());
			D_CONFIG_FILE_KIND third_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getThird_kind_id());
			System.out.println("=============dsgsadfssssssadffefffffffffff"+d);
			int num=mapper.cxzhid()+1;
			String store_id="s_cell0000"+num;
			s.setStore_id(store_id);
			s.setProduct_name(d.getProduct_name());
			s.setFirst_kind(first_kind);
			s.setSecond_kind(second_kind);
			s.setThird_kind(third_kind);
			s.setAmount(0);
			s.setRegister(user.getLogin_id());
			s.setCheck_tag("S001-0");
			int num1=mapper.updd_file_design_cell_tag(d.getId(),d.getDesign_cell_tag());		  
			int num2=service.inserts_cell(s);
			if(num1>0&&num2>0) {
				return 1;
			}else {
				return 0;
			}
			
		}
	
	//需要制定安全库存配置单的商品信息
	@RequestMapping("/zdaqkcpzdx")
	@ResponseBody
	public d_file zdaqkcpzdx(int id,HttpServletRequest request) {
		d_file file=service.cxByproduct_id(id);
		return file;
	}
	
	//查询仓库
	@RequestMapping("/cxkcbxx")
	@ResponseBody
	public warehouse cxkcb() {
		warehouse w=service.cxck();
		System.out.println("=========hhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+w);
		return w;
	}	
	
	//查询所有 需要审核的 安全库存配置单
	@RequestMapping("/aqkcpzdfh")
	public String aqkcpzdfh(Model model,HttpServletRequest request) {
		List<d_file> list=service.seles_cell();
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		model.addAttribute("username", user.getLogin_id());
		model.addAttribute("list", list);
		return "aqkcpzdfh";
	}
	//查询 某个 安全库存配置单的信息
	@RequestMapping("/aqkcpzdfhcx")
	@ResponseBody
	public s_cell aqkcpzdfhcx(String id,HttpServletRequest request) {
		s_cell s=service.aqkcpzdfhcx(id);
		return s;
	}
	//审核 安全库存配置
	@RequestMapping("/aqkcpzdfhtj")
	@ResponseBody
	public int aqkcpzdfhtj(s_cell se,HttpServletRequest request) {
		System.out.println("================"+se);
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		se.setChecker(user.getLogin_id());
		int num=service.upds_cell(se);
		System.out.println(num);
		return num;
	}
	
	//查询所有安全库存配置单
	@RequestMapping("/aqkcpzdcx")
	public String aqkcpzdcx(Model model) {
		List<d_file> list=service.cxByshbz();
		System.out.println("所有配置单"+list);
		model.addAttribute("list", list);
		return "aqkcpzdcx";
	}		
	
    //查询所有可以  变更  的 安全库存配置单
    @RequestMapping("/aqkcpzdbg")
	public String aqkcpzdbg(Model model,HttpServletRequest request) {
		List<d_file> list=service.aqkcpzdbgcx();
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		model.addAttribute("username", user.getLogin_id());
		model.addAttribute("list", list);
		return "aqkcpzdbg";
	}	
  //查询 某个 安全库存配置单的信息
  	@RequestMapping("/aqkcpzdbgcx")
  	@ResponseBody
  	public s_cell aqkcpzdbgcx(String id) {
  		s_cell s=service.aqkcpzdfhcx(id);
  		return s;
  	}
	// 变更 安全库存配置单
    @RequestMapping("/aqkcpzdbgtj")
    @ResponseBody
	public int aqkcpzdbgtj(s_cell se,HttpServletRequest request) {
		int num=service.upds_cell(se);
		return num;
	}	
///////////////////////////////////////////////////////////////////////////////////////////////////////	
    //产品档案登记审核  查询（某个）
    @RequestMapping("/cpdadjshcx")
    @ResponseBody
	public d_file cpdadjshcx(int id) {
    	System.out.println("============================"+id);
		d_file d=service.cpdadjshcx(id);
		D_CONFIG_FILE_KIND first_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getFirst_kind_id());
		D_CONFIG_FILE_KIND second_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getSecond_kind_id());
		D_CONFIG_FILE_KIND third_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getThird_kind_id());
		d.setFirst_kind(first_kind);
		d.setSecond_kind(second_kind);
		d.setThird_kind(third_kind);
		System.out.println("============================"+d);
		return d;
	}
	//产品档案登记审核 提交 
    @RequestMapping("/cpdadjshtj")
    @ResponseBody
	public int cpdadjshtj(d_file d,HttpServletRequest request) {
    	System.out.println(d);
    	HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		D_CONFIG_FILE_KIND first_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getFirst_kind_id());
		D_CONFIG_FILE_KIND second_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getSecond_kind_id());
		D_CONFIG_FILE_KIND third_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getThird_kind_id());
		d.setRegister(user);
		d.setRegister_time("h");
		d.setFirst_kind(first_kind);
		d.setSecond_kind(second_kind);
		d.setThird_kind(third_kind);
		System.out.println(d);
		int num=service.updD_file(d);
System.out.println("================================"+num);
		return num;
	}
    @Autowired
	LoginService LoginService;
	
  //产品档案变更
    @RequestMapping("/cpdabg")
	public String cpdabg(Model model,HttpServletRequest request) {
    	HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
    	List<d_file> list=service.cpdabgcx();
    	model.addAttribute("first_kind",LoginService.first_kind());
		model.addAttribute("second_kind",LoginService.second_kind());
		model.addAttribute("third_kind",LoginService.third_kind());
    	model.addAttribute("list", list);
    	System.out.println(list);
    	model.addAttribute("username", user.getLogin_id());
    	return "cpdabg";
    }
    //产品档案变更(查询某个)
    @RequestMapping("/cpdabgcx")
    @ResponseBody
	public d_file cpdabgcx(int id) {
		d_file d=service.cpdadjshcx(id);
		D_CONFIG_FILE_KIND first_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getFirst_kind_id());
		D_CONFIG_FILE_KIND second_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getSecond_kind_id());
		D_CONFIG_FILE_KIND third_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getThird_kind_id());
		d.setFirst_kind(first_kind);
		d.setSecond_kind(second_kind);
		d.setThird_kind(third_kind);
		System.out.println("============================"+d);
		return d;
	}
    
  //产品档案变更 提交 
    @RequestMapping("/cpdabgtj")
    @ResponseBody
	public int cpdabgtj(d_file d,HttpServletRequest request) {
    	System.out.println(d);
    	HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		D_CONFIG_FILE_KIND first_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getFirst_kind_id());
		D_CONFIG_FILE_KIND second_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getSecond_kind_id());
		D_CONFIG_FILE_KIND third_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getThird_kind_id());
		d.setChecker(user);
		d.setCheck_time("h");
		d.setFirst_kind(first_kind);
		d.setSecond_kind(second_kind);
		d.setThird_kind(third_kind);
		d.setFile_change_amount(1);
		System.out.println(d);
		int num=service.updD_file(d);
System.out.println("================================"+num);
		return num;
	}
}
