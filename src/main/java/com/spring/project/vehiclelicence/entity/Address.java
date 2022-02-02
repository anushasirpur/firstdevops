package com.spring.project.vehiclelicence.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;



@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address")
	private int address;
	
	@NotNull(message="state name should be mandatory")
	@Column(name="state")
	private String state;
	
	@NotNull(message="city name should not be null")
	@Column(name="city")
	private String city;
	
	@NotNull(message="state name should be mandatory")
	@Column(name="house")
	private String house;
	
	@NotNull(message="landmark name should be mandatory")
	@Column(name="landmark")
	private String landmark;
	
	@NotNull(message="pincode name should be mandatory")
	@Pattern(regexp="^[1-9]{1}[0-9]{5}$",message="pincode should not be contain letters")
	@Column(name="pincode")
	private String pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String state, String city, String house, String landmark, String pincode) {
		super();
		this.state = state;
		this.city = city;
		this.house = house;
		this.landmark = landmark;
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", house=" + house + ", landmark=" + landmark
				+ ", pincode=" + pincode + "]";
	}
	
	

}
