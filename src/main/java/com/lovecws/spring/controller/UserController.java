package com.lovecws.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lovecws.spring.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index() {
		User user = new User();
		user.setUsername("zhangsan");
		user.setPassword("1234");
		List<User> users = new ArrayList<User>();
		users.add(user);
		return new ModelAndView("index", "users", users);
	}
}
