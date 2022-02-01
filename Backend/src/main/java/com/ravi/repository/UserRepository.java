package com.ravi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ravi.entity.User;

public interface UserRepository  extends PagingAndSortingRepository<User, Integer>{
	
}
