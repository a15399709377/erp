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
import com.erp.pojo.D_module;
import com.erp.pojo.D_module_details;
import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.pojo.gx;
import com.erp.productFilesService.productFilesService;
import com.erp.loginservice.LoginService;
import com.erp.mapper.productFilesMapper.*;

@Controller
public class productFilesController {
	@Autowired
	productFilesService productFilesService;
	
	@Autowired
	productFilesMapper productFilesMapper;
	
	@RequestMapping("/addProductFilesService")
	@ResponseBody
	public int addProductFilesService(d_file file,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		D_CONFIG_FILE_KIND first_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(file.getFirst_kind_id());
		D_CONFIG_FILE_KIND second_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(file.getSecond_kind_id());
		D_CONFIG_FILE_KIND third_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(file.getThird_kind_id());
		if(productFilesMapper.test1()!=null) {
			String idd=productFilesMapper.test1();
			int iddd=Integer.parseInt(idd)+1;
			String pro_id="SJ00"+iddd;		
			file.setProduct_id(pro_id);
			file.setFirst_kind(first_kind);
			file.setSecond_kind(second_kind);
			file.setThird_kind(third_kind);
			file.setRegister(user);
			System.out.println(file);
			int a=productFilesService.addProductFilesService(file);
			System.out.println(a);
			return a;
		}else {
			String pro_id="SJ00"+1;		
			file.setProduct_id(pro_id);
			file.setFirst_kind(first_kind);
			file.setSecond_kind(second_kind);
			file.setThird_kind(third_kind);
			file.setRegister(user);
			System.out.println(file);
			int a=productFilesService.addProductFilesService(file);
			System.out.println(a);
			return a;			
		}
		 
	}
	
	@RequestMapping("/auditProductFiles")
	@ResponseBody
	public int auditProductFiles(int id,int audit,HttpServletRequest request) {
//		int id=3;
//		int audit=1;
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		int list=productFilesService.auditProductFiles(id,audit,user);
		return list;
	}
	
	
	@RequestMapping("/auditProductFilesXX")
	@ResponseBody
	public d_file auditProductFilesXX(int id) {
		//int id=3;
		d_file list=productFilesService.auditProductFilesXX(id);
		return list;
	}
	
	@RequestMapping("/designProductMaterial")
	@ResponseBody
	public List<d_file> designProductMaterial(){
		
		return productFilesService.designProductMaterial();		
	}


	@RequestMapping("/designProductFilesXX")
	@ResponseBody
	public d_file designProductFilesXX(int id) {
		d_file list=productFilesService.designProductFilesXX(id);
		return list;
	}
	
	List<D_module_details> de;
	@RequestMapping("/array")
	@ResponseBody
	public int array(@RequestBody List<D_module_details> details) {
		System.out.println(details);
		de=details;
		return 0;
	}

	
	@RequestMapping("/addD_module")
	@ResponseBody
	public int addD_module(int Dm,HttpServletRequest request) {
		System.out.println("hhhhhh");
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		
		int ddd=0;
		int iddd=0;
		if(productFilesMapper.test()!=null) {
			String idd=productFilesMapper.test();
			iddd=Integer.parseInt(idd)+1;
		}else {
			iddd=1;
		}
		if(productFilesMapper.test1()!=null) {
			String dd=productFilesMapper.test2();
			 ddd=Integer.parseInt(dd)+1;
		}else {
			 ddd=1;
		}
		
		
		int shunxu=0;
		String pro_id="SJ00"+iddd;
		d_file mo=productFilesMapper.designProductFilesXX(Dm);
		D_CONFIG_FILE_KIND first_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(mo.getFirst_kind_id());
		D_CONFIG_FILE_KIND second_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(mo.getSecond_kind_id());
		D_CONFIG_FILE_KIND third_kind=productFilesMapper.D_CONFIG_FILE_KINDByid(mo.getThird_kind_id());
		List<D_module_details> dee=new ArrayList<D_module_details>();
		double cost_price_sum=0;
		for (D_module_details de : de) {
			shunxu++;
			cost_price_sum=cost_price_sum+de.getSubtotal();
			d_file file=productFilesMapper.getdeee(de.getId());
			D_module_details  deee=new D_module_details(ddd, iddd, shunxu, file.getProduct_id(), file.getProduct_name(), file.getType(),file.getProduct_describe(), file.getAmount_unit(), de.getAmount(), de.getAmount(), file.getCost_price(), de.getSubtotal());
			dee.add(deee);
		}
		D_module dm=new D_module(1, pro_id, mo.getProduct_id(), mo.getProduct_name(), first_kind, second_kind, third_kind, user, null, cost_price_sum, user, null, null, null, null, null, null, null, dee);
		int list=productFilesService.addD_module(dm);		
		return list;
	}
	
	@RequestMapping("D_moduleXX")
	@ResponseBody
	public D_module D_moduleXX(int id) {
		D_module list=productFilesService.D_moduleXX(id);
		System.out.println(list.getD_module_details().get(0));
		return list;
	}
	
	
	@RequestMapping("/auditD_module")
	@ResponseBody
	public int auditD_module(int id,int audit,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		int list=productFilesService.auditD_module(id,audit,user);
		return list;
	}
	
	@RequestMapping("/cpdacx")
	public String  cpdacx(Model model) {
		List<d_file> list=productFilesService.cpdacx();
		int count=productFilesService.cpdacxzs();
		model.addAttribute("pageInfo",list);
		model.addAttribute("count", count);
		System.out.println("========================="+list);
		return "cpdacx";
	}
	
	@RequestMapping("/cpdabg")
	public String  cpdabg(Model model) {
		return "cpdabg";
	}
}
