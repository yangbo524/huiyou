package com.huiyou.sup;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(exclude={FreeMarkerAutoConfiguration.class,RedisAutoConfiguration.class})
@MapperScan("com.huiyou.sup.dao")
@EnableAsync
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(WebApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}
}
