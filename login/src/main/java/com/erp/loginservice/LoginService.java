package com.erp.loginservice;

import java.util.List;

import com.erp.pojo.D_CONFIG_FILE_KIND;
import com.erp.pojo.Permissions;
import com.erp.pojo.User;

public interface LoginService {

	User getMapByName(String userName, String pwd);

	List<Permissions> findByName(String username);

	List<D_CONFIG_FILE_KIND> first_kind();
	
	List<D_CONFIG_FILE_KIND> second_kind();
	
	List<D_CONFIG_FILE_KIND> third_kind();
}
