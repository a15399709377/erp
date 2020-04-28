package com.erp.loginservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.mapper.usermapper.usermapper;
import com.erp.pojo.D_CONFIG_FILE_KIND;
import com.erp.pojo.Permissions;
import com.erp.pojo.Role;
import com.erp.pojo.User;

@Service
public class loginserviceimpl implements LoginService {
	/**
	 * 模拟数据库查询
	 * 
	 * @param userName
	 * @return
	 */
	@Autowired
	usermapper usermapper;

	public User getMapByName(String userName, String pwd) {
		System.out.println(userName + "              " + pwd);
		return usermapper.getMapByName(userName, pwd);
	}

	@Override
	public List<Permissions> findByName(String username) {
		List<Permissions> list = usermapper.findMenuByName(username);
		List<Permissions> list4 = new ArrayList<Permissions>();
		for (Permissions permissions : list) {
			List<Permissions> list2 = new ArrayList<Permissions>();
			List<Permissions> list3 = new ArrayList<Permissions>();
			if (permissions.getParent_id() == 0) {
				for (Permissions permissions2 : list) {
					if (permissions.getId() == permissions2.getParent_id()) {
						
						list2.add(permissions2);
						permissions.setPermissions(list2);
						
						for (Permissions permissions3 : list) {
							if (permissions2.getId() == permissions3.getParent_id()) {
								
								list3.add(permissions3);
								permissions2.setPermissions(list3);
								
							}
						}
					}
				}
				list4.add(permissions);
				
				
			}
		}
		return list4;
	}

	@Override
	public List<D_CONFIG_FILE_KIND> first_kind() {
		// TODO Auto-generated method stub
		return usermapper.first_kind();
	}

	@Override
	public List<D_CONFIG_FILE_KIND> second_kind() {
		// TODO Auto-generated method stub
		return usermapper.second_kind();
	}

	@Override
	public List<D_CONFIG_FILE_KIND> third_kind() {
		// TODO Auto-generated method stub
		return usermapper.third_kind();
	}

}
