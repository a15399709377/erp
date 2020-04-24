package com.erp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.pojo.D_CONFIG_FILE_KIND;
import com.erp.pojo.D_module;
import com.erp.pojo.D_module_details;
import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.pojo.gx;
import com.erp.productFilesService.productFilesService;
import com.erp.mapper.productFilesMapper.*;

@Controller
public class productFilesController {
	@Autowired
	productFilesService productFilesService;
	
	@Autowired
	productFilesMapper productFilesMapper;
	
	@RequestMapping("/addProductFilesService")
	public int addProductFilesService(d_file file,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		D_CONFIG_FILE_KIND first_kind=new D_CONFIG_FILE_KIND(1,0,"1","电子",1);
		D_CONFIG_FILE_KIND second_kind=new D_CONFIG_FILE_KIND(2,1,"2","计算机",2);
		D_CONFIG_FILE_KIND third_kind=new D_CONFIG_FILE_KIND(3,2,"3","服务器",3);
		/*d_file file1=new d_file(1,"SP003","神州战神 笔记本电脑",null,first_kind,second_kind,
				third_kind,"神州笔记本","Y001-1","D001-1","台","1",null,"12个月",
				null,null,null,5000.00,3000.00,2000.00,null,"很好用的笔记本",null,user,null,null,null,null,null,null,null,null,
				0,null,null,null,null);
		*/
		d_file file1=new d_file(1,"SP004","因特尔 i9CPU",null,first_kind,second_kind,
				third_kind,"CPU","Y001-2","D001-1","颗","1",null,"12个月",
				null,null,null,1200.00,1000.00,800.00,null,"效率强劲",null,user,null,null,null,null,null,null,null,null,
				0,null,null,null,null);
		d_file file2=new d_file(1,"SP005","海盗船内存条 2900HZ 36GB",null,first_kind,second_kind,
				third_kind,"内存条","Y001-2","D001-1","片","1",null,"12个月",
				null,null,null,400.00,300.00,250.00,null,"容量充足",null,user,null,null,null,null,null,null,null,null,
				0,null,null,null,null);
		d_file file3=new d_file(1,"SP006","七彩虹炫光灯机箱",null,first_kind,second_kind,
				third_kind,"机箱","Y001-2","D001-1","台","1",null,"12个月",
				null,null,null,200.00,150.00,100.00,null,"效率强劲",null,user,null,null,null,null,null,null,null,null,
				0,null,null,null,null);
		int a=productFilesService.addProductFilesService(file3);
		System.out.println(a);
		return 0;
	}
	
	@RequestMapping("/auditAll")
	@ResponseBody
	public List<d_file> auditAll() {
		List<d_file> list=productFilesService.auditAll();
		return list;
	}
	
	@RequestMapping("/auditProductFilesXX")
	@ResponseBody
	public d_file auditProductFilesXX(int id) {
		//int id=3;
		d_file list=productFilesService.auditProductFilesXX(id);
		return list;
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
	
	@RequestMapping("/designProductFiles")
	@ResponseBody
	public List<d_file> designProductFiles() {
		List<d_file> list=productFilesService.designProductFiles();
		return list;
	}


	@RequestMapping("/designProductFilesXX")
	@ResponseBody
	public d_file designProductFilesXX(int id) {
		d_file list=productFilesService.designProductFilesXX(id);
		return list;
	}
	

	@RequestMapping("/designProductMaterial")
	@ResponseBody
	public List<d_file> designProductMaterial() {
		List<d_file> list=productFilesService.designProductMaterial();
		return list;
	}
	
	@RequestMapping("/addD_module")
	@ResponseBody
	public int addD_module(D_module Dm,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		D_CONFIG_FILE_KIND first_kind=new D_CONFIG_FILE_KIND(1,0,"1","电子",1);
		D_CONFIG_FILE_KIND second_kind=new D_CONFIG_FILE_KIND(2,1,"2","计算机",2);
		D_CONFIG_FILE_KIND third_kind=new D_CONFIG_FILE_KIND(3,2,"3","服务器",3);
		D_module_details Md=new D_module_details(1,1,1,"4","因特尔 i9CPU", "Y001-2", "效率强劲", "颗", 1, 1, 800.00, 800.00);
		D_module_details Md1=new D_module_details(2,1,2,"5","海盗船内存条 2900HZ 36GB", "Y001-2", "容量充足", "片", 2, 2, 250.00,500.00);
		D_module_details Md2=new D_module_details(3,1,3,"6","七彩虹炫光灯机箱", "Y001-2", "效率强劲", "台", 1, 1, 100.00, 100.00);
		List<D_module_details> details=new ArrayList<D_module_details>();
		details.add(Md);
		details.add(Md1);
		details.add(Md2);
		D_module Dm1=new D_module(1, "SJ001","3", "神州战神 笔记本电脑", first_kind, second_kind, third_kind, user, "hhhhhh", 1400.00,user, null, null, null, null, null, null, null, details);
		int list=productFilesService.addD_module(Dm1);		
		return list;
	}
}
