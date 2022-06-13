package com.suzy.controller;

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

import com.suzy.entity.User;
import com.suzy.service.UserService;

@CrossOrigin(origin = "http://localhost:3000")
@RestController
@RequestMapping(value="/user")
public class UserRestController {
	
	@Autowired
	UserService userService;

	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}

	@GetMapping("/{userId}")
	public String indexLoggedIn(@PathVariable(name="userId") Integer userId, Model model) {
		User loggedInUser = userService.findUserById(userId);
		model.addAttribute("loggedInUser", loggedInUser);
		return "index";
	}

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

	@PostMapping("/signUp")
	public ModelAndView saveUser(@ModelAttribute User user, Model model) {
		
		User signedUpUser = userService.saveUser(user);
		
		
		return new ModelAndView("profile", "user", signedUpUser);
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
	
	@PostMapping("/signIn")
	public String signInUser(@ModelAttribute User user, Model model) {
		
		User signedInUser = userService.signInUser(user.getEmail(), user.getPassword());
		
		if(signedInUser == null) {
			model.addAttribute("error", "Invalid Username/Password combo");
			model.addAttribute("user", new User());
			return "signIn";
		}
		model.addAttribute("user", signedInUser);
		
		return "profile";
	}

}
