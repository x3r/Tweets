package com.x3r.tweets.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.x3r.tweets.model.User;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody User home() {
		User user = new User();
		user.setUserName("Riyadh");
		user.setPassword("iit123");
		user.setUserId(1);
		return user;
	}
}
