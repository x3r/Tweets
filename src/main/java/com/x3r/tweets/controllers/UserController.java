package com.x3r.tweets.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.x3r.tweets.model.User;

@Controller
public class UserController {
	private List<User> users = new ArrayList<User>();
	public UserController() {
		users.add(new User(0, "Rashed", "iit123"));
		users.add(new User(1, "Rubby", "123456"));
		users.add(new User(2, "Riyadh", "xyz123"));
	}
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public @ResponseBody List<User> getAllUsers(){
		return users;
	}
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	public @ResponseBody User getUser(@PathVariable("id") int id){
		return users.get(id);
	}
	
}
