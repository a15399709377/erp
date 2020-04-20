package com.erp.mapper.usermapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.erp.pojo.Permissions;
import com.erp.pojo.User;

@Mapper
public interface usermapper {
	List<Permissions> findMenuByName(@Param("name")String name);

	User getMapByName(@Param("userName")String userName, @Param("pwd")String pwd);
}
