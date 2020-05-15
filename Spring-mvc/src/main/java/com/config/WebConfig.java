package com.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.controller.AppController;
import com.service.UserService;
import com.service.UserServiceImpl;
@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter{
@Bean
public AppController appController() {
	return new AppController();
}
@Bean
public UserService userService(){
	return new UserServiceImpl();
}
@Bean
public ViewResolver viewResolver() {
	InternalResourceViewResolver view = new InternalResourceViewResolver();
	view.setPrefix("/WEB-INF/views/");
	view.setPrefix(".jsp");
	return view;
}
}
