package com.webteam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webteam.model.UserDetail;
import com.webteam.model.UserType;
import com.webteam.repository.UserDetailRepo;

@Service("UserLoginService")
@Transactional(readOnly = true)
public class UserLoginServiceImpl  implements UserLoginService{

	@Autowired
	UserDetailRepo userDetailRepo;
	
	@Override
	public UserDetail findByUserName(String userName) {		
		return userDetailRepo.findByLoginName(userName);
	}
	
	@Override
	public List<UserDetail> listall() {
		// TODO Auto-generated method stub
		return userDetailRepo.findAll();
	}

	
	

}
