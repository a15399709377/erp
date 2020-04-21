package com.erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.pojo.d_file;
import com.erp.productFilesService.productFilesService;

@Controller
public class productFilesController {
	@Autowired
	productFilesService productFilesService;
	
	@RequestMapping("/addProductFilesService")
	public int addProductFilesService(d_file file) {
		int a=productFilesService.addProductFilesService(file);
		return 0;
	}
}
