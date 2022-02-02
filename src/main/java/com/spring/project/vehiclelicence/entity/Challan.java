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
@Table(name="challan")
public class Challan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="challan")
	private int challan;
	
	
	@NotNull(message="challan number is mandatory")
	@Column(name="challanNumber")
	private String challannumber;
	
	@NotNull(message="vehicle number is mandatory")
	@Pattern(regexp="^[A-Z]{2}[0-9]{2}[A-Z]{1,2}[0-9]{4}$",message="vehicle number must be valid")
	@Column(name="vehicleNumber")
	private String vehiclenumber;
	
	@NotNull(message="amount should not be null..!!!")
	@Column(name="amount")
	private double amount;
	public Challan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Challan(String challannumber, String vehiclenumber, double amount) {
		super();
		this.challannumber = challannumber;
		this.vehiclenumber = vehiclenumber;
		this.amount = amount;
	}
	public String getChallannumber() {
		return challannumber;
	}
	public void setChallannumber(String challannumber) {
		this.challannumber = challannumber;
	}
	public String getVehiclenumber() {
		return vehiclenumber;
	}
	public void setVehiclenumber(String vehiclenumber) {
		this.vehiclenumber = vehiclenumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Challan [challannumber=" + challannumber + ", vehiclenumber=" + vehiclenumber + ", amount=" + amount
				+ "]";
	}
	

}
