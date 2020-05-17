package com.erp.mapper.XTGLMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.erp.pojo.Permissions;
import com.erp.pojo.Role;
import com.erp.pojo.User;

@Mapper
public interface XTGLMapper {

	List<User> selectAll();

	List<Role> selectRole(int id);

	int addUser(User u);

	int delUser(int id);

	int deluser_role(int id);

	User UserById(int id);

	int updUser(User u);

	List<Role> RoleAll();

	int ins_user_role(int uid, String rid);

	List<Permissions> selPermissions();

	int selStatus(int id);

	List<String> selRoleId(int id);

	List<Permissions> selMenusByRoleId(int id);



}
