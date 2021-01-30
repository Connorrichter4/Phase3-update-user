package com.hcl.updateuser.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.updateuser.model.User;
import com.hcl.updateuser.model.UserRepository;

@Service
public class UserService {

	Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	UserRepository userRepository;

	public Optional<User> findUser(Long id) {
		logger.info("id: " + id);
		Optional<User> user = userRepository.findById(id);
		logger.info("optional user: " + user);
		return user;
	}
	
	public void updatingUser(User user) {
		User oldUser = userRepository.findById(user.getId()).get();
		oldUser.setName(user.getName());
		oldUser.setPassword(user.getPassword());
		userRepository.save(oldUser);
	}

}
