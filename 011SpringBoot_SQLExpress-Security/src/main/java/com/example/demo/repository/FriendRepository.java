package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.FriendEntity;

public interface FriendRepository extends JpaRepository<FriendEntity, Integer>{
	
	List<FriendEntity> findByLocation(String location);
	
	
	@Query(value = "select * from friend_table where friend_name = :name", nativeQuery = true)
	
	List<FriendEntity> findByName(@Param(value = "name") String name);
	
	

}
