package com.logistics.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistics.bean.UserGroup;

public interface IGroupDao extends JpaRepository<UserGroup, Long> {
	
	public UserGroup findByGroupName(String groupName);
	
	public UserGroup findById(int id);
	
}
