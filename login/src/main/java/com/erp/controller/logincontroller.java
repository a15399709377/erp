package com.erp.controller;

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

import com.erp.loginservice.LoginService;
import com.erp.loginservice.loginserviceimpl;
import com.erp.pojo.User;

@Controller
public class logincontroller {
	
	@Autowired
	LoginService LoginService;
	
	@RequestMapping("/log")
	 public String log() {
		return "login";
	}
	
	@RequestMapping("/cpdadj")
	 public String cpdadj() {
		return "cpdadj";
	}
	
	@RequestMapping("/login")
    public String login(User user,Model model) {
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
        System.out.println("xxd");
        model.addAttribute("list",LoginService.findByName(user.getLogin_id()));
        return "index";
    }
   
}
