package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.FriendEntity;
import com.example.demo.pojo.Friend;
import com.example.demo.repository.FriendRepository;
import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

@Repository
public class FriendDao {
	
	private List<Friend> friends = new ArrayList<Friend>();
	
	@Autowired
	private FriendRepository friendRepository;
	
	public FriendDao() {
		Friend f1 = new Friend(1, "OBB", "Chennai");
		Friend f2 = new Friend(2, "CAS", "Bengaluru");
		Friend f3 = new Friend(3, "OWIOH", "Japan");
		Friend f4 = new Friend(4, "Garage", "Chennai");
		
		friends.add(f1);
		friends.add(f2);
		friends.add(f3);
		friends.add(f4);
	}

	public List<FriendEntity> getAllFriends() {
		// TODO Auto-generated method stub
		return friendRepository.findAll();
	}
	
	public List<FriendEntity> addFriend(Friend f){
		
		FriendEntity fe = new FriendEntity();
		fe.setName(f.getName());
		fe.setLocation(f.getLocation());
		
		friendRepository.save(fe);
		
		return friendRepository.findAll();
	}

	public Friend getFriendById(int id) {
		// TODO Auto-generated method stub
		for (Friend friend : friends) {
			if(friend.getId() == id) {
				return friend;
			}
		}
		return new Friend();
	}

	public List<Friend> updateFriendById(int id, Friend f) {
		// TODO Auto-generated method stub
		for (Friend friend : friends) {
			if(friend.getId() == id) {
				friend.setName(f.getName());
				friend.setLocation(f.getLocation());
				return friends;
			}
		}
		
		return new ArrayList<Friend>();
		
		
	}

}
