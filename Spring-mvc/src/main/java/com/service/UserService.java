package com.service;

import com.bean.User;

public interface UserService {
	User registerUser(User user);
	UserService loginUser(User user);

}
