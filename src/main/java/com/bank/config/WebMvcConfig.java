package com.bank.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.bank")
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer{
    
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
	         	registry.jsp("/WEB-INF/views/",".jsp");
	}
}
//login --> /WEB-INF/Views/login.jsp 