package com.boot.zhiyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//mapper 接口类扫描包配置
@MapperScan("com.boot.zhiyi.mapper")
public class SbWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(SbWebApplication.class, args);
	}
}
