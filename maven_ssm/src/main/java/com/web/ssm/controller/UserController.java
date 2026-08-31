package com.web.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.web.ssm.pojo.User;
import com.web.ssm.service.UserService;


@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
	public String getUserAll(){
		
		List<User> list = userService.getUserAll();
		for(User u : list){
			System.err.println(u);
		}
		String s="你好！";	
		System.out.println(s );
		return s;
		
	}
	
	
	

}
