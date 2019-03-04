package com.currencyConverter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	public User() {

	}

	public User(String username, Integer age, String userAddress, String userCountry, String userCity) {
		this.userName = username;
		this.userAge = age;
		this.userAddress = userAddress;
		this.userCountry = userCountry;
		this.userCity = userCity;
	}

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;

	@Column
	private String userName;

	@Column
	private Integer userAge;

	@Column
	private String userAddress;

	@Column
	private String userCountry;

	@Column
	private String userCity;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", userAddress="
				+ userAddress + ", userCountry=" + userCountry + ", userCity=" + userCity + "]";
	}

}
