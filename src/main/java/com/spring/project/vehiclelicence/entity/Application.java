package com.spring.project.vehiclelicence.entity;

import javax.persistence.Column;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="application_user")
public class Application {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="applicationid")
	private int application;
	
	      @Enumerated(value=EnumType.STRING)
	      private ApplicationType applicationType;
	     
	
	      @NotNull(message="application number is mandatory")
	      @Column(name="appicationNumber")
          private String applicationNumner;
	      
	    
	      
	      @Column(name="appicationDate")
          private String applicationDate;
	      @NotNull(message="mode of payment is mandatory")
	      @Column(name="modeOfpayment")
          private String modeOfPayment;
	      @NotNull(message="enter your amount paid")
	      @Column(name="amountpaid")
          private double amountPaid;
	      @NotNull(message="paymentstatus is needed")
	      @Column(name="paymentstatus")
          private String paymentStatus;
	      
	      @Enumerated(value=EnumType.STRING)
	      private ApplicationStatus applicationStatus;
	     
	      
	      @NotNull(message="remarks are mandatory")
	      @Column(name="reamrks")
          private String remarks;
		public Application() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Application(String applicationNumner, String applicationDate, String modeOfPayment, double amountPaid,
				String paymentStatus, String remarks) {
			super();
			this.applicationNumner = applicationNumner;
			this.applicationDate = applicationDate;
			this.modeOfPayment = modeOfPayment;
			this.amountPaid = amountPaid;
			this.paymentStatus = paymentStatus;
			this.remarks = remarks;
		}

		public String getApplicationNumner() {
			return applicationNumner;
		}
		public void setApplicationNumner(String applicationNumner) {
			this.applicationNumner = applicationNumner;
		}
		public String getApplicationDate() {
			return applicationDate;
		}
		public void setApplicationDate(String applicationDate) {
			this.applicationDate = applicationDate;
		}
		public String getModeOfPayment() {
			return modeOfPayment;
		}
		public void setModeOfPayment(String modeOfPayment) {
			this.modeOfPayment = modeOfPayment;
		}
		public double getAmountPaid() {
			return amountPaid;
		}
		public void setAmountPaid(double amountPaid) {
			this.amountPaid = amountPaid;
		}
		public String getPaymentStatus() {
			return paymentStatus;
		}
		public void setPaymentStatus(String paymentStatus) {
			this.paymentStatus = paymentStatus;
		}
		public String getRemarks() {
			return remarks;
		}
		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
		@Override
		public String toString() {
			return "Application [applicationNumner=" + applicationNumner + ", applicationDate=" + applicationDate
					+ ", modeOfPayment=" + modeOfPayment + ", amountPaid=" + amountPaid + ", paymentStatus="
					+ paymentStatus + ", remarks=" + remarks + "]";
		}
          
}
