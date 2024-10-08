package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity(debug = true)
@SpringBootApplication
public class SpringJwtSecurity3XApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtSecurity3XApplication.class, args);
	}

}
