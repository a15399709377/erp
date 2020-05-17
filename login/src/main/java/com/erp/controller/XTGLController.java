package com.erp.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.XTGLService.XTGLService;
import com.erp.loginservice.LoginService;
import com.erp.pojo.Permissions;
import com.erp.pojo.Role;
import com.erp.pojo.User;

@Controller
public class XTGLController {
	
	@Autowired
	XTGLService service;
	
	@RequestMapping("/jbyhxx")
	 public String cpdadj(Model model,HttpServletRequest request) {
		List<User> list=service.selectAll();
		for (int i = 0; i < list.size(); i++) {
			List<Role> roles=service.selectRole(list.get(i).getId());
			list.get(i).setRole(roles);
			System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee"+list.get(i));
		}
		List<Role> roles=service.RoleAll();
		model.addAttribute("list", list);
		model.addAttribute("roles", roles);
		return "jbyhxx";
	}
	
	@RequestMapping("/addUser")
	@ResponseBody
	 public int addUser(@RequestBody User u) {
		System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu"+u);
		Md5Hash md=new Md5Hash(u.getPassword(),"xxd",2);
		System.out.println("ppppppppppppppppppppppppppppppppp"+md.toString());
		u.setPassword(md.toString());
		int num=service.addUser(u);
		for (int i = 0; i < u.getRoleId().size(); i++) {
			int num2=service.ins_user_role(u.getId(),u.getRoleId().get(i));
		}
		return num;
	}
	@RequestMapping("/delUser")
	@ResponseBody
	 public int delUser(int id) {
		System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu"+id);
		int num=service.delUser(id);
		int num2=service.deluser_role(id);
		return num;
	}
	@RequestMapping("/UserById")
	@ResponseBody
	 public User UserById(int id) {
		System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu"+id);
		User u=service.UserById(id);
		List<Role> roles=service.selectRole(u.getId());
		List<String> roleId=service.selRoleId(u.getId());
		u.setRole(roles);
		u.setRoleId(roleId);
		return u;
	}
	
	@RequestMapping("/updUser")
	@ResponseBody
	 public int updUser(@RequestBody User u) {
		Md5Hash md=new Md5Hash(u.getPassword(),"xxd",2);
		System.out.println("ppppppppppppppppppppppppppppppppp"+md.toString());
		u.setPassword(md.toString());
		System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu"+u);
		int num=service.updUser(u);
		int num3=service.deluser_role(u.getId());
		if(num3>0) {
			for (int i = 0; i < u.getRoleId().size(); i++) {
				int num2=service.ins_user_role(u.getId(),u.getRoleId().get(i));
			}
		}
		return num;
	}
 	
	@RequestMapping("/jbqxxx")
	 public String jbqxxx(Model model) {
		List<Permissions> list=service.selPermissions();
		model.addAttribute("list", list);
		return "jbqxxx";
	}
	//
	@RequestMapping("/selStatus")
	@ResponseBody
	 public int selStatus(int id) {
		
		int num=service.selStatus(id);
		return num;
	}
	@RequestMapping("/jbjsxx")
	 public String jbjsxx(Model model,HttpServletRequest request) {
		List<Role> list=service.RoleAll();
		model.addAttribute("list", list);
		return "jbyhxx";
	}
}
