package com.spring.project.vehiclelicence.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="RtoOffice")
public class RTOOffice {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rtooffice")
	 private int rtooffice;
	
	@NotNull(message="rto id number is mandatory")
	@Column(name="rtoid")
	private int rtoid;
	
	@NotNull(message="rto name is mandatory")
	@Column(name="rtoname")
	private String rtoname;
	public RTOOffice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RTOOffice(int rtoid, String rtoname) {
		super();
		this.rtoid = rtoid;
		this.rtoname = rtoname;
	}
	public int getRtoid() {
		return rtoid;
	}
	public void setRtoid(int rtoid) {
		this.rtoid = rtoid;
	}
	public String getRtoname() {
		return rtoname;
	}
	public void setRtoname(String rtoname) {
		this.rtoname = rtoname;
	}
	@Override
	public String toString() {
		return "RTOOffice [rtoid=" + rtoid + ", rtoname=" + rtoname + "]";
	}
	

}
