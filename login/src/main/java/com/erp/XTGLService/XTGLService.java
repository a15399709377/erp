package com.erp.XTGLService;

import java.util.List;

import com.erp.pojo.Permissions;
import com.erp.pojo.Role;
import com.erp.pojo.User;

public interface XTGLService {

	List<User> selectAll();

	List<Role> selectRole(int id);

	int addUser(User u);

	int delUser(int id);

	int deluser_role(int id);

	User UserById(int id);

	int updUser(User u);

	List<Role> RoleAll();

	int ins_user_role(int id, String string);

	List<Permissions> selPermissions();

	int selStatus(int id);

	List<String> selRoleId(int id);


	List<Permissions> selMenusByRoleId(int id);



}
