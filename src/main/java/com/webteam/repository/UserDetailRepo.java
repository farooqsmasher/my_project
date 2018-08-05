package com.webteam.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.webteam.model.UserDetail;



public interface UserDetailRepo extends JpaRepository<UserDetail, Long>{

	
	
	@Query("SELECT u FROM UserDetail u WHERE u.loginname=:userName AND u.isDeleted='No'")
	UserDetail findByLoginName(@Param("userName") String userName);
	
	
	
	
	
	
	
	
	
}
