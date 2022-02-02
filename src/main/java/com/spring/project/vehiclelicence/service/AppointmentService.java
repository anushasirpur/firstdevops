package com.spring.project.vehiclelicence.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.vehiclelicence.entity.Address;
import com.spring.project.vehiclelicence.entity.Appointment;
import com.spring.project.vehiclelicence.repo.AppointmentRepository;


@Service
public class AppointmentService {
	@Autowired
	AppointmentRepository appointmentRepository;

	public Appointment createAppointment(Appointment appointments) {
		// TODO Auto-generated method stub
		return appointmentRepository.save(appointments);
	}

	public List<Appointment> getAppointments() {
		// TODO Auto-generated method stub
		return appointmentRepository.findAll();
	}

	public boolean deleteAllAppointment() {
		try{
			appointmentRepository.deleteAll();
		}catch(Exception e){
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}

	public Appointment updateAppointment(int appointment, Appointment obj) {
		Optional<Appointment>addContainer=appointmentRepository.findById(appointment);
		if(addContainer.isPresent())
		{
			Appointment oldObj= addContainer.get();
			oldObj.setAppointmentnumber(obj.getAppointmentnumber());
			oldObj.setTimeslot(obj.getTimeslot());
			System.out.println("successfully updated");
			return appointmentRepository.saveAndFlush(oldObj);
		}
		
		System.out.println("no object found with these id");
		     return obj;
		
	}

}
