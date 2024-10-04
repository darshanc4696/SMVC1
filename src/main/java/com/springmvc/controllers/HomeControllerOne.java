package com.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllerOne {
	
	@RequestMapping("/")
	String firstRequest()
	{
		return "test.html";
	}

}
