package com.spring.project.vehiclelicence.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="Applicant_tb")
public class Applicant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="applicantId")
	private int applicantId;
	
	@Enumerated(value=EnumType.STRING)
	private Gender gender;
	
	
	@NotNull(message="first name should be mandatory")
	@Column(name="firstname")
	private String firstname;
	
	@NotNull(message="middle name should be mandatory")
	@Column(name="middletname")
	private String middlename;
	
	@NotNull(message="last name should be mandatory")
	@Column(name="lastname")
	private String lastname;
	
	@Temporal(value=TemporalType.DATE)
	@Column(name="dateofbirth")
	private Date dateofbirth;
	
	@NotNull(message="place of birth should be mandatory")
	@Column(name="placeofbirth")
	private String placeofbirth;
	
	@NotNull(message="qualification should be mandatory")
	@Size(min=2,max=10)
	@Column(name="qualification")
	private String qualification;
	
	@NotNull(message="mobile number is  mandatory")
	@Pattern(regexp="^[0-9]{10}$",message="mobile number only contain digits")
	@Column(name="mobile")
	private String mobile;
	
	@NotNull(message="email address is  mandatory")
	@Email(message="valid mail")
	@Column(name="email")
	private String email;
	
	@NotNull(message="nationality should be mandatory")
	@Column(name="nationality")
	private String nationality;
	
	@NotNull(message="vehicle type must be given")
	@Column(name="vehicletype")
	private String vehicletype;
	
	@NotNull(message="vehicle number must be given")
	@Column(name="vehiclenumber")
	@Pattern(regexp="^[A-Z]{2}[0-9]{2}[A-Z]{1,2}[0-9]{4}$",message="vehicle number must be valid")
	private String vehiclenumber;
	
	
	public Applicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Applicant(String firstname, String middlename, String lastname, Date dateofbirth, String placeofbirth,
			String qualification, String mobile, String email, String nationality, String vehicletype,
			String vehiclenumber) {
		super();
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.dateofbirth = dateofbirth;
		this.placeofbirth = placeofbirth;
		this.qualification = qualification;
		this.mobile = mobile;
		this.email = email;
		this.nationality = nationality;
		this.vehicletype = vehicletype;
		this.vehiclenumber = vehiclenumber;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getPlaceofbirth() {
		return placeofbirth;
	}
	public void setPlaceofbirth(String placeofbirth) {
		this.placeofbirth = placeofbirth;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getVehicletype() {
		return vehicletype;
	}
	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}
	public String getVehiclenumber() {
		return vehiclenumber;
	}
	public void setVehiclenumber(String vehiclenumber) {
		this.vehiclenumber = vehiclenumber;
	}
	@Override
	public String toString() {
		return "Applicant [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname
				+ ", dateofbirth=" + dateofbirth + ", placeofbirth=" + placeofbirth + ", qualification=" + qualification
				+ ", mobile=" + mobile + ", email=" + email + ", nationality=" + nationality + ", vehicletype="
				+ vehicletype + ", vehiclenumber=" + vehiclenumber + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
