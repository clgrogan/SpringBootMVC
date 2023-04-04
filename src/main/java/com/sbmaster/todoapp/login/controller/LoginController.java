package com.sbmaster.todoapp.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private AuthenticationService authenticate;
	
	

	public LoginController(AuthenticationService authenticate) {
		super();
		this.authenticate = authenticate;
	}

	@RequestMapping(value = {"login", "/"}, method = RequestMethod.GET)
	public String goToLoginPage() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap map) {

		if (authenticate.authenticate(name, password)) {
			map.put("name", name);
			return "welcome";
		} else {
			map.put("error", "Invalid Credentials Provided<br>Please try again." );
			return "login";
		}

	}
}
