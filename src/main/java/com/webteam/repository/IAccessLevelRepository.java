package com.webteam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webteam.model.AccessLevel;


public interface IAccessLevelRepository extends JpaRepository<AccessLevel,Long>{
	

}
