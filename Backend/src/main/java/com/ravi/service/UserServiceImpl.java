package com.ravi.service;

import java.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ravi.dto.UserDTO;
import com.ravi.entity.User;
import com.ravi.exception.UserException;
import com.ravi.repository.UserRepository;

@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public String postUserData(UserDTO userDto) throws UserException {
	
		User user =  new User();
		
		user.setEmail(userDto.getEmail());
		user.setName(userDto.getName());
		user.setPhone(userDto.getPhone());
		user.setPassword(userDto.getPassword());
		
		userRepository.save(user);
		return "Success";
	}
	
//	// To Encrypt password 
//	private static String encryptPassword(String pwd) {
//		return Base64.getEncoder().encodeToString(pwd.getBytes());
//	}
//	
//	
//	//To Decrypt Password
//	private static String decryptPassword(String pwd) {
//		return new String(Base64.getMimeDecoder().decode(pwd));
//	}


}
