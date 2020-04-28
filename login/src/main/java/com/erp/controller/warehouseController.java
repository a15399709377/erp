package com.erp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.pojo.S_GATHER;
import com.erp.pojo.S_GATHER_DETAILS;
import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.warehouseService.warehouseService;

@Controller
public class warehouseController {
	@Autowired
	warehouseService warehouseService;
	//所有的物料入库

	
	//入库申请管理（采购原材料）
	@RequestMapping("/addWarehousing")
	@ResponseBody
	public int addWarehousing(HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		List<S_GATHER_DETAILS> DETAILS =new ArrayList<S_GATHER_DETAILS>();
		S_GATHER_DETAILS de1=new S_GATHER_DETAILS(1,1,"SP004", "因特尔 i9CPU", "效率强劲", 50, "颗", 800.00, 40000.00, 50, null);
		S_GATHER_DETAILS de2=new S_GATHER_DETAILS(2,1,"SP005", "海盗船内存条 2900HZ 36GB", "容量充足", 100, "片", 250.00, 25000.00, 100, null);
		S_GATHER_DETAILS de3=new S_GATHER_DETAILS(3,1,"SP006", "七彩虹炫光灯机箱", "效率强劲", 50, "颗", 100.00, 5000.00, 50, null);
		DETAILS.add(de1);
		DETAILS.add(de2);
		DETAILS.add(de3);
        S_GATHER GATHER=new S_GATHER(1,"RK001",user,"R001-3", null, 200, 70000.00, 200, null, user, null, null, null, null, null, null, null,DETAILS);
		
        return warehouseService.addWarehousing(GATHER);
	}
	//入库申请单完成后查询所有需要审批的单号
	@RequestMapping("/auditWarehousingAll")
	@ResponseBody
	public List<S_GATHER> auditWarehousingAll(){
		
		return warehouseService.auditWarehousingAll();
	}
	
	//入库申请单完成后查询需要审批的单号
	@RequestMapping("/auditWarehousingXX")
	@ResponseBody
	public S_GATHER  auditWarehousingXX(int id){
			
		return warehouseService.auditWarehousingXX(id);
	}
	
	//入库申请单完成后进入审批环节
	@RequestMapping("/auditWarehousing")
	@ResponseBody
	public int auditWarehousing(int id,int audit,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
        return warehouseService.auditWarehousing(id,audit,user);
	}
	
	//出入库调度管理
	@RequestMapping("/dispatchAll")
	@ResponseBody
	public List<S_GATHER> dispatchAll(){
		
		return warehouseService.dispatchAll();
	}
	
	//出入库调度管理
	@RequestMapping("/dispatchS_GATHERXX")
	@ResponseBody
	public S_GATHER dispatchS_GATHERXX(int id){
			
		return warehouseService.dispatchS_GATHERXX(id);
	}
	
	//制定入库调度单
	@RequestMapping("/dispatchS_GATHER")
	@ResponseBody
	public int dispatchS_GATHER(int num){
				
		return warehouseService.dispatchS_GATHER(num);
	}
		
	//入库登记	
	
	@RequestMapping("/Warehousing registration")
	@ResponseBody
	public int Warehousingregistration(List<S_GATHER_DETAILS> ga){
		List<S_GATHER_DETAILS> dede=new ArrayList<S_GATHER_DETAILS>();
		S_GATHER_DETAILS deta=new S_GATHER_DETAILS(1,50);
		S_GATHER_DETAILS deta1=new S_GATHER_DETAILS(2,100);
		S_GATHER_DETAILS deta2=new S_GATHER_DETAILS(3,50);
		dede.add(deta);
		dede.add(deta1);
		dede.add(deta2);
		return warehouseService.Warehousingregistration(dede);
	}
}
