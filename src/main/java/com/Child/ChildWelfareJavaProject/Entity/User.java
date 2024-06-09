package com.Child.ChildWelfareJavaProject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "app_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String mobilenumber;
    private String password;
    private Short role;
    private Boolean status;
    private String useremail;
    private String username;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Short getRole() {
		return role;
	}
	public void setRole(Short role) {
		this.role = role;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public User(Long userId, String mobilenumber, String password, Short role, Boolean status, String useremail,
			String username) {
		super();
		this.userId = userId;
		this.mobilenumber = mobilenumber;
		this.password = password;
		this.role = role;
		this.status = status;
		this.useremail = useremail;
		this.username = username;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", mobilenumber=" + mobilenumber + ", password=" + password + ", role=" + role
				+ ", status=" + status + ", useremail=" + useremail + ", username=" + username + "]";
	}
    
    
    
    
	}
