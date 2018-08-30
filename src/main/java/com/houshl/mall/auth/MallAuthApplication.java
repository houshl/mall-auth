package com.houshl.mall.auth;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@EnableCaching
@EnableRabbit
@MapperScan("com.houshl.mall.auth.mapper")
public class MallAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallAuthApplication.class, args);
	}
}
