package com.lyn.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChartsController {

	@RequestMapping("web/common/nav") 
	public String nav() {
		return "web/common/nav";
	}
	
	@RequestMapping("web/charts/line")
	public String line() {
		return "web/charts/line";
	}
	
	@RequestMapping("web/charts/pie")
	public String pie() {
		return "web/charts/pie";
	}
	

}
