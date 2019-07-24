package com.shiv.hibernate.annotation.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@Column(name = "USER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "USER_ADDRESS")
	private Address userAddress;
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<Orders> userOrders;

	protected User() {
		super();
	}

	public User(String userName, Address userAddress) {
		super();
		this.userName = userName;
		this.userAddress = userAddress;
	}

	public List<Orders> getUserOrders() {
		return userOrders;
	}

	public void setUserOrders(List<Orders> userOrders) {
		this.userOrders = userOrders;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Address getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
	}

}
