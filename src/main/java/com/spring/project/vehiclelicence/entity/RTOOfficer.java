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
import javax.validation.constraints.Size;

@Entity
@Table(name="RtoOfficer")
public class RTOOfficer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rtoofficer")
	private int rtoofficer;
	
	@NotNull(message="user name is mandatory")
	@Size(min=2,max=20)
	@Column(name="username")
	private String username;
	
	@NotNull(message="password  is very mandatory")
	@Pattern(regexp="^[A-Za-z0-9@*#!]{6,}$",message="password should contain min 6 chars")
	@Column(name="password")
	private String password;
	
	@NotNull(message="email address is mandatory")
    @Email(message="invalid email")
	@Column(name="email")
	private String email;
	public RTOOfficer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RTOOfficer(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "RTOOfficer [username=" + username + ", password=" + password + ", email=" + email + "]";
	}
	

}
