package com.controller;

import javax.management.loading.PrivateClassLoader;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.User;
import com.service.UserService;

@Controller
public class AppController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="home",method=RequestMethod.GET)
	public String getBody() {
		return "home";
	}
	@RequestMapping(value="userRegistration", method=RequestMethod.GET)
	public String getRegistryForm() {
		return "registry";
	}
	@RequestMapping(value = "addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user")User user, Model model, HttpServletRequest request) {
        User regUser=userService.registerUser(user);
        if(regUser != null)
        {
        	return "success";
        }
        return "error";
    }
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String handleGetRequestLogin() {
		return "user-login";
		
	}

}
