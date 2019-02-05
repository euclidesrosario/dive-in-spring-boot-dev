package com.imooc.diveinspringboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
@SpringBootApplication
//@ComponentScan(basePackages="com.imooc.diveinspringboot.jl.spring.controller")
public class DiveInSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiveInSpringBootApplication.class, args);
		//SpringApplication.run(com.imooc.diveinspringboot.jl.spring.controller.TextRestController.class, args);
	}
}
