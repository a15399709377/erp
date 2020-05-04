package com.erp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.loginservice.LoginService;
import com.erp.loginservice.loginserviceimpl;
import com.erp.pojo.Permissions;
import com.erp.pojo.User;
import com.erp.productFilesService.productFilesService;

@Controller
public class logincontroller {
	
	@Autowired
	LoginService LoginService;
	
	@Autowired
	productFilesService productFilesService;
	
	@RequestMapping("/log")
	 public String log() {
		return "login";
	}
	
	@RequestMapping("/cpdadj")
	 public String cpdadj(Model model,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		model.addAttribute("username",user.getLogin_id());
		model.addAttribute("first_kind",LoginService.first_kind());
		model.addAttribute("second_kind",LoginService.second_kind());
		model.addAttribute("third_kind",LoginService.third_kind());
		return "Addc";
	}
	@RequestMapping("/zdwlzcsjd")
	public String zdwlzcsjd(Model model,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		model.addAttribute("username",user.getLogin_id());
		model.addAttribute("list",productFilesService.designProductFiles());
		model.addAttribute("list1",productFilesService.designProductMaterial());
		return "zdwlzcsjd";
	}
	
	@RequestMapping("/cpdadjsh")
	 public String cpdadjsh(Model model,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		model.addAttribute("username",user.getLogin_id());
		model.addAttribute("list",productFilesService.auditAll());
		model.addAttribute("first_kind",LoginService.first_kind());
		model.addAttribute("second_kind",LoginService.second_kind());
		model.addAttribute("third_kind",LoginService.third_kind());
		return "cpdadjsh";
	}
	
	
	@RequestMapping("/wlzcsjdsh")
	public String wlzcsjdsh(Model model,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		model.addAttribute("username",user.getLogin_id());
		model.addAttribute("list",productFilesService.D_moduleAll());
		return "wlzcsjdsh";
	}
	
	
	@RequestMapping("/rksqdj")
	public String rksqdj(Model model,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		model.addAttribute("username",user.getLogin_id());
		
		return "rksqdj";
	}
	
	@RequestMapping("/login")
    public String login(User user,Model model,HttpServletRequest request) {
		System.out.println(user);
        //添加用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
                user.getLogin_id(),
                user.getPassword()
        );
        try {
            //进行验证，这里可以捕获异常，然后返回对应信息
            subject.login(usernamePasswordToken);
//            subject.checkRole("admin");
//            subject.checkPermissions("query", "add");
        } catch (AuthenticationException e) {
            e.printStackTrace();
            model.addAttribute("msg","用戶名密碼錯誤！");
            return "login";
        } catch (AuthorizationException e) {
            e.printStackTrace();
            model.addAttribute("msg","用戶名密碼錯誤！");
            return "login";
        }
        System.out.println("hhhh");
        model.addAttribute("list",LoginService.findByName(user.getLogin_id()));
        HttpSession session=request.getSession();
        session.setAttribute("user",user);
        model.addAttribute("username",user.getLogin_id());
        return "index";
    }
   
}
