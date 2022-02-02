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

@Entity
@Table(name="appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="appointment")
	private int appointment;
	  
	
	     @NotNull(message="appointment number is mandatory")
	     @Column(name="appointmentnumber")
	     private String appointmentnumber;
	     
	     @Temporal(value=TemporalType.DATE)
	     @Column(name="testdate")
	     private Date testdate;
	     
	     @NotNull(message="enter your time slot..!!")
	     @Column(name="timeslot")
	     private String timeslot;
	     
	     @NotNull(message="test result is mandatory")
	     @Column(name="testresult")
	     private String testresult;
		public Appointment() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Appointment(String appointmentnumber, Date testdate, String timeslot, String testresult) {
			super();
			this.appointmentnumber = appointmentnumber;
			this.testdate = testdate;
			this.timeslot = timeslot;
			this.testresult = testresult;
		}
		public String getAppointmentnumber() {
			return appointmentnumber;
		}
		public void setAppointmentnumber(String appointmentnumber) {
			this.appointmentnumber = appointmentnumber;
		}
		public Date getTestdate() {
			return testdate;
		}
		public void setTestdate(Date testdate) {
			this.testdate = testdate;
		}
		public String getTimeslot() {
			return timeslot;
		}
		public void setTimeslot(String timeslot) {
			this.timeslot = timeslot;
		}
		public String getTestresult() {
			return testresult;
		}
		public void setTestresult(String testresult) {
			this.testresult = testresult;
		}
		@Override
		public String toString() {
			return "Appointment [appointmentnumber=" + appointmentnumber + ", testdate=" + testdate + ", timeslot="
					+ timeslot + ", testresult=" + testresult + "]";
		}
	     
	     
	     
}
