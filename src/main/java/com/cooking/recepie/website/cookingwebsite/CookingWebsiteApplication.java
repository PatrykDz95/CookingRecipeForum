package com.cooking.recepie.website.cookingwebsite;

import com.cooking.recepie.website.cookingwebsite.model.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@SpringBootApplication
@ComponentScan(basePackages={"com.cooking.recepie.website"})
public class CookingWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(CookingWebsiteApplication.class, args);
	}
}
