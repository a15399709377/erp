package com.erp.mapper.productFilesMapper;

import org.apache.ibatis.annotations.Mapper;

import com.erp.pojo.d_file;

@Mapper
public interface productFilesMapper {

	int addProductFilesService(d_file file);

}
