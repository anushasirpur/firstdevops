package com.spring.project.vehiclelicence.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.vehiclelicence.entity.Document;
import com.spring.project.vehiclelicence.entity.DrivingLicence;
import com.spring.project.vehiclelicence.repo.DrivingLicenceRepository;
@Service
public class DrivingLicenceService {
	@Autowired
	DrivingLicenceRepository drivinglicenceRepository;

	public DrivingLicence createDrivingLicence(DrivingLicence drivinglicence) {
		// TODO Auto-generated method stub
		return drivinglicenceRepository.save(drivinglicence);
	}

	public List<DrivingLicence> getDrivingLicence() {
		// TODO Auto-generated method stub
		return drivinglicenceRepository.findAll();
	}

	public boolean deleteAllDrivingLicence() {
		try{
			drivinglicenceRepository.deleteAll();
		}catch(Exception e){
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}

	public DrivingLicence updateDrivingLicence(int drivinglicence, DrivingLicence obj) {
		Optional<DrivingLicence>addContainer=drivinglicenceRepository.findById(drivinglicence);
		if(addContainer.isPresent())
		{
			DrivingLicence oldObj= addContainer.get();
			oldObj.setDrivinglicencenumber(obj.getDrivinglicencenumber());
			oldObj.setDateofissue(obj.getDateofissue());
			System.out.println("successfully updated");
			return drivinglicenceRepository.saveAndFlush(oldObj);
		}
		
		System.out.println("no object found with these id");
		return obj;
	}

}
