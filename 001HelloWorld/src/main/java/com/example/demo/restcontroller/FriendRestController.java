package com.example.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Friend;
import com.example.demo.service.FriendService;

@RestController
public class FriendRestController {
	
	@Autowired
	private FriendService friendService;
	

	//@RequestMapping("/")
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	@GetMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot Version 2.4.0";
	}
	
	@RequestMapping("/welcome")
	public String welcome2() {
		return "Creating REST API's with Spring Boot!!!!";
	}
	
	
	@GetMapping("/friends/all")
	public List<Friend> getAllFriends() {
		return friendService.getAllFriends();
	}
	
	@PostMapping("/friends/add")
	public List<Friend> addFriend(@RequestBody Friend f){
		return friendService.addFriend(f);	
	}
	
	
	
	
}
