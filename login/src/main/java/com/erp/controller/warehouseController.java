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

import com.erp.mapper.warehouseMapper.warehouseMapper;
import com.erp.pojo.S_GATHER;
import com.erp.pojo.S_GATHER_DETAILS;
import com.erp.pojo.User;
import com.erp.pojo.d_file;
import com.erp.pojo.warehouse;
import com.erp.warehouseService.warehouseService;

@Controller
public class warehouseController {
	@Autowired
	warehouseService warehouseService;
	//所有的物料入库
	@Autowired
	warehouseMapper warehouseMapper;
	
    List<S_GATHER_DETAILS> deTAILS;
	@RequestMapping("/AllS_GATHER_DETAILS")
	@ResponseBody
	public int AllS_GATHER_DETAILS(@RequestBody List<S_GATHER_DETAILS> DETAILS ) {
		deTAILS=DETAILS;
		System.out.println(DETAILS);
		return 0;
	}
	
	//入库申请管理（采购原材料）
	@RequestMapping("/addWarehousing")
	@ResponseBody
	public int addWarehousing(String reason,String reasonexact,int amount_sum, double cost_price_sum,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		System.out.println(reason);
		System.out.println(reasonexact);
		System.out.println(amount_sum);
		System.out.println(cost_price_sum);
		int iddd=0;
		if(warehouseMapper.test()!=null) {
			String idd=warehouseMapper.test();
			iddd=Integer.parseInt(idd)+1;
		}else {
			iddd=1;
		}
		
	    String gather_id="RK00"+iddd;
		List<S_GATHER_DETAILS> de=new ArrayList<S_GATHER_DETAILS>();
		for (S_GATHER_DETAILS s_G : deTAILS) {
			S_GATHER_DETAILS dee=warehouseMapper.gets_G(s_G.getId());
			dee.setId(s_G.getId());
			dee.setAmount(s_G.getAmount());
			dee.setCost_price(s_G.getCost_price());
			dee.setSubtotal(s_G.getSubtotal());
			de.add(dee);
		}
       System.out.println(de);
		S_GATHER ga=new S_GATHER(iddd, gather_id, user, reason, reasonexact, amount_sum, cost_price_sum, 0, null, user, null, null, null, null, null, null, null, de);
        return warehouseService.addWarehousing(ga);
	}

	
	//入库申请单完成后查询需要审批的单号
	@RequestMapping("/auditWarehousingXX")
	@ResponseBody
	public S_GATHER  auditWarehousingXX(int id){
		System.out.println(id);
		return warehouseService.auditWarehousingXX(id);
	}
	
	//入库申请单完成后进入审批环节
	@RequestMapping("/auditWarehousing")
	@ResponseBody
	public int auditWarehousing(int id,int audit,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		System.out.println(audit);
		System.out.println("hhhhhhhhh");
        return warehouseService.auditWarehousing(id,audit,user);
	}
	
	//出入库调度管理
	@RequestMapping("/dispatchAll")
	@ResponseBody
	public List<S_GATHER> dispatchAll(){
		
		return warehouseService.dispatchAll();
	}
	

	@RequestMapping("allWoreHouse")
	@ResponseBody
    public List<warehouse> allWoreHouse(){
		
		return warehouseService.allWoreHouse();
	}
	
	//制定入库调度单
	@RequestMapping("/dispatchS_GATHERFather")
	@ResponseBody
	public int dispatchS_GATHERFather(int fid,HttpServletRequest request){
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		return warehouseService.dispatchS_GATHERFather(fid,user);
	}
	
	//制定入库调度单
	@RequestMapping("/dispatchS_GATHER")
	@ResponseBody
	public int dispatchS_GATHER(int id,int num){
					
		return warehouseService.dispatchS_GATHER(id,num);
	}
	
	
	
	
	//入库登记	
	
	
	@RequestMapping("/rkdj")
	public String rkdj(Model model,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		model.addAttribute("username",user.getLogin_id());
		model.addAttribute("list",warehouseService.warehousingAll());
		return "rkdj";
	}
	
	@RequestMapping("/Warehousingregistration")
	@ResponseBody
	public int Warehousingregistration(@RequestBody List<S_GATHER_DETAILS> ga){
		System.out.println(ga);
		return warehouseService.Warehousingregistration(ga);
	}
	
	@RequestMapping("/WarehousingregistrationF")
	@ResponseBody
	public int WarehousingregistrationF(int id,int gathered_amount_sum){
		System.out.println(id);
		return warehouseService.WarehousingregistrationF(id,gathered_amount_sum);
	}
	
	
	
	//入库登记复核
	
	@RequestMapping("/rkdjfh")
	public String rkdjfh(Model model,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		model.addAttribute("username",user.getLogin_id());
		return "rkdjfh";
	}
	
	
	@RequestMapping("/rkdjfhAll")
	@ResponseBody
	public List<S_GATHER> rkdjfh() {		
		return warehouseService.rkdjfh();
	}
	
	@RequestMapping("auditruku")
	@ResponseBody
	public int auditruku(int id,int audit,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		
		return warehouseService.auditruku(id,audit,user);
	}
	/*入库查询*/
	@RequestMapping("/rkcx")
	public String rkcx(Model model,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		model.addAttribute("username",user.getLogin_id());
		return "rkcx";
	}
	//查询所有已完成的入库单
	
	@RequestMapping("/rkcxAll")
	@ResponseBody
	public  List<S_GATHER>  rkcxAll() {
	
		return warehouseService.rkcxAll();
	}
}
