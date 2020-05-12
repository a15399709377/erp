package com.erp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.s_cellService.s_cellService;
import com.erp.loginservice.LoginService;
import com.erp.mapper.productFilesMapper.productFilesMapper;
import com.erp.mapper.s_cellmapper.s_cellmapper;
import com.erp.pojo.D_CONFIG_FILE_KIND;
import com.erp.pojo.D_module;
import com.erp.pojo.D_module_details;
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
			String store_id="AQKCPZD2020"+num;
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
		se.setCheck_time("hh");
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
	public d_file cpdadjshcx(int id,HttpServletRequest request) {
    	System.out.println("============================"+id);
		d_file d=service.cpdadjshcx(id);
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		D_CONFIG_FILE_KIND first_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getFirst_kind_id());
		D_CONFIG_FILE_KIND second_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getSecond_kind_id());
		D_CONFIG_FILE_KIND third_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getThird_kind_id());
		d.setFirst_kind(first_kind);
		d.setSecond_kind(second_kind);
		d.setThird_kind(third_kind);
		d.setRegister(user);
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
		return d;
	}
    
  //产品档案变更 提交 
    @RequestMapping("/cpdabgtj")
    @ResponseBody
	public int cpdabgtj(d_file d,HttpServletRequest request) {
    	HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		D_CONFIG_FILE_KIND first_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getFirst_kind_id());
		D_CONFIG_FILE_KIND second_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getSecond_kind_id());
		D_CONFIG_FILE_KIND third_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(d.getThird_kind_id());
		d.setChecker(user);
		d.setCheck_time("2000");
		d.setFirst_kind(first_kind);
		d.setSecond_kind(second_kind);
		d.setThird_kind(third_kind);
		d.setFile_change_amount(1);
		d.setChange_tag("D002-1");
		System.out.println(d);
		int num=service.updD_file(d);
		return num;
	}
    //产品档案删除管理(查询)
    @RequestMapping("/cpdascgl")
	public String cpdascgl(Model model,HttpServletRequest request) {
    	List<d_file> list=service.cpdabgcx();
    	model.addAttribute("first_kind",LoginService.first_kind());
		model.addAttribute("second_kind",LoginService.second_kind());
		model.addAttribute("third_kind",LoginService.third_kind());
		//查询可以恢复的(档案删除恢复)
		List<d_file> khfd=service.cpdaschf();
		//查询可以永久删除的(产品档案永久删除)
		List<d_file> yjsc=service.cpdaschf();
    	model.addAttribute("list", list);
    	model.addAttribute("khfd", khfd);
    	model.addAttribute("yjsc", yjsc);
    	return "cpdascgl";
    }
    
    //产品档案删除管理(删除)
    @RequestMapping("/cpdascglsc")
    @ResponseBody
	public String  cpdascglsc(d_file d) {
    	d.setDelete_tag("C001-1");
    	int num=service.updD_file(d);
    	if(num>0) {
    		return "删除成功";
    	}else {
    		return "删除失败";
    	}
    }
    
    //cpdaschf
    //产品档案删除恢复(恢复)
    @RequestMapping("/cpdaschf")
    @ResponseBody
	public String  cpdaschf(d_file d) {
    	d.setDelete_tag("C001-0");
    	int num=service.updD_file(d);
    	if(num>0) {
    		return "恢复成功";
    	}else {
    		return "恢复失败";
    	}
    }
  //产品档案删除恢复(恢复)
    @RequestMapping("/cpdayjsc")
    @ResponseBody
	public String  cpdayjsc(d_file d) {
    	int num=service.deletecp(d.getId());
    	int num2=service.deleteaqkc(d.getProduct_id());
    	if(num>0) {
    		return "删除成功";
    	}else {
    		return "删除失败";
    	}
    }
    
/////////////////////////////////////////////////////////////////////////////////////
  //物料组成设计的查询(查询)
    @RequestMapping("/wlzcsjdcx")
	public String wlzcsjdcx(Model model,HttpServletRequest request) {
    	HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
    	List<D_module> list=service.wlzcsjdcx();
    	
    	for (int i = 0; i < list.size(); i++) {
    		D_CONFIG_FILE_KIND first_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(list.get(i).getFirst_kind_id());
    		D_CONFIG_FILE_KIND second_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(list.get(i).getSecond_kind_id());
    		D_CONFIG_FILE_KIND third_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(list.get(i).getThird_kind_id());
			int id=list.get(i).getId();
			List<D_module_details> dm=service.wlzcsjdcxxx(id);
			list.get(i).setD_module_details(dm);
			list.get(i).setFirst_kind(first_kind);
			list.get(i).setSecond_kind(second_kind);
			list.get(i).setThird_kind(third_kind);
			list.get(i).setDesigner(user);
			System.out.println("hhhhhhh"+list.get(i));
		}
    	
    	model.addAttribute("list", list);
    	return "wlzcsjdcx";
    }
    
    //物料组成设计的查询(查询某个)
    @RequestMapping("/wlzcsjcxid")
    @ResponseBody
	public D_module wlzcsjcxid(String id) {
    	D_module d=service.wlzcsjcxid(id);
    	List<D_module_details> dm=service.wlzcsjdcxxx(d.getId());
    	System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+dm);
		d.setD_module_details(dm);
		System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhgggggggggggggggggggggg"+d);
		return d;
	}
    
    //物料组成设计单变更(查询)
    @RequestMapping("/wlzcsjdbg")
   	public String wlzcsjdbg(Model model,HttpServletRequest request) {
       	HttpSession session=request.getSession();
   		User user=(User) session.getAttribute("user");
       	List<D_module> list=service.wlzcsjdbgcx();
       	for (int i = 0; i < list.size(); i++) {
   			list.get(i).setDesigner(user);
   			System.out.println("hhhhhhh"+list.get(i));
   		}
       	model.addAttribute("list", list);
       	return "wlzcsjdbg";
       }
    
    //物料组成设计单(查询单个)wlzcsjdbgcx
    @RequestMapping("/wlzcsjdbgcx")
    @ResponseBody
	public D_module wlzcsjdbgcx(String id,HttpServletRequest request) {
    	HttpSession session=request.getSession();
   		User user=(User) session.getAttribute("user");
    	D_module d=service.wlzcsjcxid(id);
    	List<D_module_details> dm=service.wlzcsjdcxxx(d.getId());
		d.setD_module_details(dm);
		d.setDesigner(user);
		session.setAttribute("id", d.getId());
		System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhgggggggggggggggggggggg"+d);
		return d;
	}
    
    //添加物料(查询)
    @RequestMapping("/tjwlcx")
    @ResponseBody
	public List<d_file> tjwlcx(String id,HttpServletRequest request) {
    	List<d_file> d=service.tjwlcx(id);
		return d;
	}
	
	 //删除
    @RequestMapping("/scid")
    @ResponseBody
	public int scid(String id,HttpServletRequest request) {
    	HttpSession session=request.getSession();
		int parent_id=(int)session.getAttribute("id");
		System.out.println("parent_id=========hhhhhhhhhhhhhhhhhhhhhh====================="+parent_id);
    	int num=service.delwlxx2(id,parent_id);
		return num;
	}
    
	//添加物料(添加)
	@RequestMapping("/tjwladd")
    @ResponseBody
	public int tjwladd(@RequestBody List<D_module_details> list,HttpServletRequest request) {
		System.out.println("======================================================"+list);
		HttpSession session=request.getSession();
		int parent_id=(int)session.getAttribute("id");
		int num=service.delwlxx(parent_id);
		int num2 = 0;
			int shunxu=0;
			for(D_module_details d : list) {
				shunxu++;
				d_file d_file=service.d_fileProduct_id(d.getProduct_id());
				System.out.println("ddddddddddddddddddddddddddddddddd"+d_file);
				D_module_details dd=new D_module_details(0, parent_id, shunxu,d_file.getProduct_id(), d_file.getProduct_name(), d_file.getType(), d.getProduct_describe(),d.getAmount_unit(), d.getAmount(),d.getResidual_amount() , d.getCost_price(), d.getSubtotal());
			    num2=service.addD_module_details(dd);
			}
		int num3=service.updated_module(parent_id);
		if(num2>0&&num3>0) {
			return 1;
		}else {
			return 0;
		}
	}
	
}
