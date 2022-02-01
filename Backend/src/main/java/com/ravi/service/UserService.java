package com.ravi.service;

import com.ravi.dto.UserDTO;
import com.ravi.exception.UserException;

public interface UserService {

	// to Post user 
	public String postUserData(UserDTO user) throws UserException;
	
}
