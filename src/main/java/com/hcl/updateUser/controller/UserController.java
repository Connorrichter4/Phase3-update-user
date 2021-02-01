package com.hcl.updateuser.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.updateuser.model.User;
import com.hcl.updateuser.service.UserService;

@Controller
public class UserController {
	
	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService service;

	@GetMapping("/")
	public String userSearchPage(ModelMap model) {
		logger.info("In the Get Mapping");
		return "usersearch";
	}
	
	@PostMapping(value="/", params= {"id"})
	public String searchForUser(Model model, @RequestParam(value = "id") String id) {
		logger.info("In the Post Mapping " + id);
		
		try {
			Long userId = Long.parseLong(id);
			Optional<User> user = service.findUser(userId);
			if(user.isPresent()) {
				logger.info("optional user" + user.get());
				model.addAttribute("user", user.get());
				return "userdetail";
			} else {
				model.addAttribute("error", "The Id Entered Does Not Exist");
			}
			
		} catch (Exception e) {
			model.addAttribute("error", "Invalid Id Entered!");
		}
		return "usersearch";
	}
	
	@PostMapping(value="/update/{id}")
	public String updateUser(Model model, User user, @PathVariable("id") Long id) {
		logger.info("user update: " + user);
		user.setId(id);
		service.updatingUser(user);
		model.addAttribute(user);
		return "success";
	}
	
}
