package com.example.springboot;

import com.example.api.ProviderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@SpringBootApplication
@ImportResource(value = {"classpath:providers.xml"})
public class SpringbootApplication {
	@Value("${name}")
	private String name;
	@Resource
	private ProviderService providerService;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}


	@RequestMapping("hello")
	public String helloworld(){
		return "hello world,世界,I AM "+name;
	}
}
