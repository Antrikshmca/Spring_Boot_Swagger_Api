package com.antriksh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.annotations.SwaggerDefinition;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootSwaggerDocumentationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSwaggerDocumentationApplication.class, args);
		System.out.println("mission sucessful");
	}

}
