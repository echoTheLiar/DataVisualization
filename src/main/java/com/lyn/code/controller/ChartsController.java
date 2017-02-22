package com.lyn.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChartsController {

	@RequestMapping("web/charts/line")
	public String line() {
		return "web/charts/line";
	}

}
