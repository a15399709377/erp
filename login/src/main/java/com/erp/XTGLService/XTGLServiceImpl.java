package com.erp.XTGLService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.mapper.XTGLMapper.XTGLMapper;
import com.erp.pojo.Permissions;
import com.erp.pojo.Role;
import com.erp.pojo.User;

@Service
public class XTGLServiceImpl implements XTGLService{

	@Autowired
	XTGLMapper mapper;
	
	@Override
	public List<User> selectAll() {
		return mapper.selectAll();
	}

	@Override
	public List<Role> selectRole(int id) {
		return mapper.selectRole(id);
	}

	@Override
	public int addUser(User u) {
		return mapper.addUser(u);
	}

	@Override
	public int delUser(int id) {
		return mapper.delUser(id);
	}

	@Override
	public int deluser_role(int id) {
		return mapper.deluser_role(id);
	}

	@Override
	public User UserById(int id) {
		return mapper.UserById(id);
	}

	@Override
	public int updUser(User u) {
		return mapper.updUser(u);
	}

	@Override
	public List<Role> RoleAll() {
		return mapper.RoleAll();
	}

	@Override
	public int ins_user_role(int uid, String rid) {
		return mapper.ins_user_role(uid, rid);
	}

	@Override
	public List<Permissions> selPermissions() {
		return mapper.selPermissions();
	}

	@Override
	public int selStatus(int id) {
		int state =mapper.selStatus(id);
		if(state==1) {
			mapper.updUser(new User(id,"2"));
		}else {
			mapper.updUser(new User(id,"1"));
		}
		return 1;
	}

	@Override
	public List<String> selRoleId(int id) {
		return mapper.selRoleId(id);
	}

	

	@Override
	public List<Permissions> selMenusByRoleId(int id) {
		return mapper.selMenusByRoleId(id);
	}

	

	

	

}
