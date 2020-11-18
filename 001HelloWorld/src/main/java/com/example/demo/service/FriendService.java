package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FriendDao;
import com.example.demo.pojo.Friend;

@Service
public class FriendService {
	
	@Autowired
	private FriendDao friendDao;

	public List<Friend> getAllFriends() {
		// TODO Auto-generated method stub
		return friendDao.getAllFriends();
	}

	public List<Friend> addFriend(Friend f) {
		// TODO Auto-generated method stub
		return friendDao.addFriend(f);
	}
	
}
