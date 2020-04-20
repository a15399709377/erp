package com.erp.loginservice;

import java.util.List;

import com.erp.pojo.Permissions;
import com.erp.pojo.User;

public interface LoginService {

	User getMapByName(String userName, String pwd);

	List<Permissions> findByName(String username);
	
}
