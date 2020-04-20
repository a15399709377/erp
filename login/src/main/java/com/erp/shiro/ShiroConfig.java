package com.erp.shiro;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfig {
	//創建shiro觸發器工廠
	@Bean
	public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager")DefaultWebSecurityManager securityManager) {
		ShiroFilterFactoryBean FactoryBean=new ShiroFilterFactoryBean();
		
		FactoryBean.setSecurityManager(securityManager);
		
		Map<String, String> fitermap=new LinkedHashMap<String, String>();
		fitermap.put("/static/**", "anon");
		fitermap.put("/images/**", "anon");//img
		fitermap.put("/css/**", "anon");//css
		fitermap.put("/js/**", "anon");//js
		fitermap.put("/assets/**", "anon");//js
		fitermap.put("/log", "anon");		
		fitermap.put("/login", "anon");
		fitermap.put("/**", "authc");
		FactoryBean.setFilterChainDefinitionMap(fitermap);
		FactoryBean.setLoginUrl("/log");
		return FactoryBean;
	}
	//創建defaultwebsecuritymanager
	@Bean(name="securityManager")
	public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("realm")UserRealm realm) {
		DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
		securityManager.setRealm(realm);
		return securityManager;
	}
	/*創建realm*/
	@Bean(name="realm")
	public UserRealm getRealm() {
		return new UserRealm();
	}
}
