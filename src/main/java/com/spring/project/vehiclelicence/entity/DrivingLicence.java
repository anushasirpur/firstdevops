package com.spring.project.vehiclelicence.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="drivinglicence")
public class DrivingLicence {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="drivinglicence")
	private int drivinglicence;
	
	@NotNull(message="enter your driving licence number")
	@Pattern(regexp="^[a-zA-Z]{2}-\\d\\d-(19\\d\\d|20[01][0-9])-\\d{7}$")
	@Column(name="drivinglicencenumber")
	private String drivinglicencenumber;
	
	@Temporal(value=TemporalType.DATE)
	@Column(name="dateofissue") 
	private Date dateofissue;
	
	@Temporal(value=TemporalType.DATE)
	@Column(name="validtill")
	private Date validtill;
	public DrivingLicence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DrivingLicence(String drivinglicencenumber, Date dateofissue, Date validtill) {
		super();
		this.drivinglicencenumber = drivinglicencenumber;
		this.dateofissue = dateofissue;
		this.validtill = validtill;
	}
	public String getDrivinglicencenumber() {
		return drivinglicencenumber;
	}
	public void setDrivinglicencenumber(String drivinglicencenumber) {
		this.drivinglicencenumber = drivinglicencenumber;
	}
	public Date getDateofissue() {
		return dateofissue;
	}
	public void setDateofissue(Date dateofissue) {
		this.dateofissue = dateofissue;
	}
	public Date getValidtill() {
		return validtill;
	}
	public void setValidtill(Date validtill) {
		this.validtill = validtill;
	}
	@Override
	public String toString() {
		return "DrivingLicence [drivinglicencenumber=" + drivinglicencenumber + ", dateofissue=" + dateofissue
				+ ", validtill=" + validtill + "]";
	}
	
	

}
