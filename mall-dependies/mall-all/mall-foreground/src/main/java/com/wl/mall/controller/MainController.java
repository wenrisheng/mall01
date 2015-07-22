package com.wl.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	/**
	 * 首页
	 * 
	 * @return
	 */
	@RequestMapping(value = { "/", "/index.html" }, method = RequestMethod.GET)
	public String toIndex() {
		return "index";
	}
}
