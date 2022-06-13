package com.GH.controller;

import com.GH.entity.User;
import com.GH.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value="/user")
public class UserRestController {
	
	@Autowired
	UserService userService;

	@RequestMapping(value="/signUp", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Object> saveUser(@RequestBody User user) {
		
		try {
			userService.saveUser(user);
			return new ResponseEntity<Object>(user, HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<Object>(e, HttpStatus.BAD_REQUEST);
		}
	}
	// TIME STAMP 2:30 5/27    AND 2:43 
	@RequestMapping(value="/signIn", method=RequestMethod.GET)
	@ResponseBody
	public User getUser(@RequestBody User user) {
		try {
			User loggedInUser = userService.signInUser(user.getEmail(), user.getPassword());
			return loggedInUser;

		} catch(Exception e) {
			return null;
		}
	}
	

}
