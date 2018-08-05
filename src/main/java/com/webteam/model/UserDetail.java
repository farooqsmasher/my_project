	package com.webteam.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;

import javax.persistence.*;

import javax.persistence.Id;

import com.webteam.utility.*;


/**
 * The persistent class for the USER_DETAIL database table.
 * 
 */
@Entity
@Table(name="USER_DETAIL")
public class UserDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_DETAIL_SEQUENCE")
	@SequenceGenerator(name="USER_DETAIL_SEQUENCE", sequenceName="USER_DETAIL_SEQUENCE", allocationSize=1)
	@Column(unique=true, nullable=false, precision=15)
	private Long id;

	@Column(length=50)
	private String designation;

	@Column(length=50)
	private String firstname;

	@Column(length=50)
	private String lastname;
	
	@Column(length=50)
	private String title;
	
	
	@Column(length=50)
	private String loginname;
	

	@Column(length=200)
	private String passwd;

	@Lob
	private byte[] profileimage;

	@Column(length=8)
	private String systempasswd;
	
	
	@Column(name="is_deleted",length=10)
	private String isDeleted;
	
	@Column(name="home_url",length=100)
	private String homeUrl;
	
	@Column(name="client_id")
	private Long clientId;
	
	@Column(name="issuer_id")
	private Long issuerId;
	
	@Column(name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
   	private Date creationDate;
		
	@ManyToOne
	@JoinColumn(name="ADDRESS_ID")
	private Address address;

	@ManyToOne
	@JoinColumn(name="USERTYPE_ID")
	private UserType userType;

	public UserDetail() {
	}

	public UserDetail(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public byte[] getProfileimage() {
		return profileimage;
	}

	public void setProfileimage(byte[] profileimage) {
		this.profileimage = profileimage;
	}

	public String getSystempasswd() {
		return systempasswd;
	}

	public void setSystempasswd(String systempasswd) {
		this.systempasswd = systempasswd;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Long getIssuerId() {
		return issuerId;
	}

	public void setIssuerId(Long issuerId) {
		this.issuerId = issuerId;
	}

	public String getHomeUrl() {
		return homeUrl;
	}

	public void setHomeUrl(String homeUrl) {
		this.homeUrl = homeUrl;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
	@PrePersist
	public void prePersist(){
		this.setCreationDate(new Date());
		this.setIsDeleted(Constants.USER_DELETED_NO);
	}
}