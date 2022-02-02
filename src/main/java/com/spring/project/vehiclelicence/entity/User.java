package com.spring.project.vehiclelicence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="user_name")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userId")
	private int userId;
	
	
	
	@NotNull(message="email address is mandatory")
	@Email(message="invalid email")
	@Column(name="email")
	private String email;
	
	@NotNull(message="password  is  very mandatory")
	@Pattern(regexp="^[A-Za-z0-9@*#!]{6,}z$",message="password should contain min 6 chars")
	@Column(name="password")
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}
	
	
	

}
