package com.erp.mapper.usermapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.erp.pojo.D_CONFIG_FILE_KIND;
import com.erp.pojo.Permissions;
import com.erp.pojo.User;

@Mapper
public interface usermapper {
	List<Permissions> findMenuByName(@Param("name")String name);

	User getMapByName(@Param("userName")String userName, @Param("pwd")String pwd);

	List<D_CONFIG_FILE_KIND> first_kind();

	List<D_CONFIG_FILE_KIND> second_kind();

	List<D_CONFIG_FILE_KIND> third_kind();
}
