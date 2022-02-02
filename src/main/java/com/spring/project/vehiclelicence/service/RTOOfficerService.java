package com.spring.project.vehiclelicence.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.vehiclelicence.entity.RTOOfficer;
import com.spring.project.vehiclelicence.entity.User;
import com.spring.project.vehiclelicence.repo.RTOOfficerRepository;
@Service
public class RTOOfficerService {
	@Autowired
	RTOOfficerRepository rtoofficerRepository;

	public RTOOfficer createRTOOfficer(RTOOfficer rto_officers) {
		// TODO Auto-generated method stub
		return rtoofficerRepository.save(rto_officers);
	}

	public List<RTOOfficer> getRto_officers() {
		// TODO Auto-generated method stub
		return rtoofficerRepository.findAll();
	}

	public boolean deleteAllRTOOfficer() {
		try{
			rtoofficerRepository.deleteAll();
		}catch(Exception e){
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}

	public RTOOfficer updateRTOOficer(int rtoofficer, RTOOfficer obj) {
		Optional<RTOOfficer>addContainer=rtoofficerRepository.findById(rtoofficer);
		if(addContainer.isPresent())
		{
			RTOOfficer oldObj= addContainer.get();
			oldObj.setUsername(obj.getUsername());
			oldObj.setPassword(obj.getPassword());
			System.out.println("successfully updated");
			return rtoofficerRepository.saveAndFlush(oldObj);
		}
		
		System.out.println("no object found with these id");
		return obj;
	}

}
