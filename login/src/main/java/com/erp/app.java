package com.erp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//在spring boot启动时扫描Servlet组件注解，创建该类实例 
@ServletComponentScan
public class app {
	public static void main(String[] args) {
		SpringApplication.run(app.class, args);
	}	
}
