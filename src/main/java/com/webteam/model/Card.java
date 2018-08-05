package com.webteam.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




/**
 * The persistent class for the CARD database table.
 * 
 */
@Entity
@Table(name="CARD")
public class Card implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CARD_SEQUENCE")
	@SequenceGenerator(name="CARD_SEQUENCE", sequenceName="CARD_SEQUENCE", allocationSize=1)
	@Column(unique=true, nullable=false, precision=15)
	private Long id;

	@Column(name="CARD_ALIAS", length=25)
	private String alias;
	
	@Column(length=50)
	private String comments;
	
	
	@Column(name="CARD_NUMBER", length=25)
	private String cardNumber;


	@Column(name="LIMIT_AMOUNT")
	private Double limitAmount;

	@Column(name="USED_AMOUNT")
	private Double usedAmount;


	@Column(name="LIMIT_TYPE", length=25)
	private String limitType;

	@Column(name="NAME_TOBE_EMBOSED", length=25)
	private String nameTobeEmbosed;

	@Column(name="NEED_PHYSICAL_CARD", length=15)
	private String needPhysicalCard;
	


	public Card() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Double getLimitAmount() {
		return limitAmount;
	}

	public void setLimitAmount(Double limitAmount) {
		this.limitAmount = limitAmount;
	}

	public Double getUsedAmount() {
		return usedAmount;
	}

	public void setUsedAmount(Double usedAmount) {
		this.usedAmount = usedAmount;
	}

	public String getLimitType() {
		return this.limitType;
	}

	public void setLimitType(String limitType) {
		this.limitType = limitType;
	}

	public String getNameTobeEmbosed() {
		return this.nameTobeEmbosed;
	}

	public void setNameTobeEmbosed(String nameTobeEmbosed) {
		this.nameTobeEmbosed = nameTobeEmbosed;
	}

	public String getNeedPhysicalCard() {
		return this.needPhysicalCard;
	}

	public void setNeedPhysicalCard(String needPhysicalCard) {
		this.needPhysicalCard = needPhysicalCard;
	}
	
	

}