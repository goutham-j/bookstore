package com.webapp.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	//Display Home Page
	@GetMapping("/")
	public String displayHome() {
		return "home";
	}

}
