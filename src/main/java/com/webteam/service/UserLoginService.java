package com.webteam.service;

import java.util.List;

import com.webteam.model.UserDetail;
import com.webteam.model.UserType;

public interface UserLoginService {

	
	UserDetail findByUserName(String userName);
	
	List<UserDetail> listall();
	
}
