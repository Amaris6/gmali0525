package com.xiangmu.gmli.gmliuser;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages ="com.xiangmu.gmli.gmliuser.mapper" )
public class GmliUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmliUserApplication.class, args);
	}

}
