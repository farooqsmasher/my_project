package com.webteam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.webteam.model.Card;

public interface CradRepo extends JpaRepository<Card, Long>{


	@Query("SELECT c.cardNumber FROM Card c WHERE c.cardNumber=:cardNumber")
	List<String> findByCardNumber(@Param("cardNumber") String cardNumber);

}
