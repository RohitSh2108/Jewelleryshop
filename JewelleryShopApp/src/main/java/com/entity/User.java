package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private int userId;

	@NotNull
	@NotEmpty(message="Name can not be empty")
    private String userName;
    private String password;
    private String role;
    private String firstName;
    private String lastName;
    private String address;
    private long mobileNumber;
    private long panCardNo;

    @OneToMany(cascade=CascadeType.ALL)
    Category category;

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public long getPanCardNo() {
		return panCardNo;
	}
	public void setPanCardNo(long panCardNo) {
		this.panCardNo = panCardNo;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", role=" + role
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", mobileNumber="
				+ mobileNumber + ", panCardNo=" + panCardNo + "]";
	}

}
