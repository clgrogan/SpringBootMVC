package com.sbmaster.todoapp.login.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginControllerExample {
	
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	@RequestMapping("log")
	public String login(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		logger.debug("\tRequest param is {}\n", name);
		logger.info("\tRequest param is {}\n", name);
		logger.warn("\tRequest param is {}\n", name);
		return "login";
	}
}
