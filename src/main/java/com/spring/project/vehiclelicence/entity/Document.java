package com.spring.project.vehiclelicence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Documents")
public class Document {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="document")
	private int document;
	
	@NotNull(message="photo is mandatory")
    @Column(name="photo")
	private String photo;
	
	@NotNull(message="id proof is mandatory")
    @Column(name="idproof")
	private String idproof;
	
	@NotNull(message="address proof is mandatory")
    @Column(name="addressproof")
	private String addressproof;
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Document(String photo, String idproof, String addressproof) {
		super();
		this.photo = photo;
		this.idproof = idproof;
		this.addressproof = addressproof;
	}

	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getIdproof() {
		return idproof;
	}
	public void setIdproof(String idproof) {
		this.idproof = idproof;
	}
	public String getAddressproof() {
		return addressproof;
	}
	public void setAddressproof(String addressproof) {
		this.addressproof = addressproof;
	}
	@Override
	public String toString() {
		return "Document [photo=" + photo + ", idproof=" + idproof + ", addressproof=" + addressproof + "]";
	}
	
}
