package com.lyn.code.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/test")
	public String test() {
		return "web/test";
	}

}
