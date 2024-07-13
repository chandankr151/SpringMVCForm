package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.entity.User;

@Controller
public class HomeController {

	@RequestMapping("/home")    ///basically used to map request url.
	public String homePage() {
		
		return "home";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		
		return "login";
	}
	
	@RequestMapping("/register")
	public String registerForm() {
		
		return "register";
	}
	
	@RequestMapping(path="/createUser", method=RequestMethod.POST)
	public String registerUser(@ModelAttribute User user, @RequestParam("imgname") String image) {
		System.out.println(user);
		System.out.println("Image Name: "+image);
		System.out.println("Register User Method Call");
		
		return "/success";
	}
}
