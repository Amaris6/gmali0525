package com.xiangmu.gmli.gmliuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages ="com.xiangmu.gmli.gmliuser.mapper" )
public class GmliUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmliUserApplication.class, args);
	}

}
