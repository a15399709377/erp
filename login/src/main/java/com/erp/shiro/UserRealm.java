package com.erp.shiro;

import java.util.ArrayList;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.erp.loginservice.LoginService;
import com.erp.pojo.User;

public class UserRealm extends AuthorizingRealm{

	@Autowired
	LoginService loginservice;
	//授權
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		
		System.out.println("進入授權");
		return null;
	}

	//認證
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		UsernamePasswordToken to=(UsernamePasswordToken) token;
		Md5Hash md=new Md5Hash(to.getPassword(),"xxd",2);
		String pwd=md.toString();
		System.out.println(pwd);
		User user=loginservice.getMapByName(to.getUsername(),pwd);
		if(!to.getUsername().equals(user.getLogin_id())) {
			return null;
		}
		System.out.println(user.getLogin_id());
		System.out.println(user.getPassword());
		return new SimpleAuthenticationInfo("",to.getPassword(),"");
	}
	
}
