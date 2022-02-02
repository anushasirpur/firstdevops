package com.spring.project.vehiclelicence.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.vehiclelicence.entity.Application;
import com.spring.project.vehiclelicence.repo.ApplicationRepository;

@Service
public class ApplicationService {
	@Autowired
	ApplicationRepository applicationRepository;

	public Application createApplication(Application application) {
		// TODO Auto-generated method stub
		return applicationRepository.save(application);
	}

	public List<Application> getApplications() {
		// TODO Auto-generated method stub
		return applicationRepository.findAll();
	}
	
	public boolean deleteAllApplication(){
		try{
			applicationRepository.deleteAll();
		}catch (Exception e)
		{
			return false;
		}
		return true;
	}

	public Application updateApplication(int application, Application obj) {
		Optional<Application> addContainer=applicationRepository.findById(application);
		if(addContainer.isPresent())
		{
			Application oldObj= addContainer.get();
			oldObj.setApplicationNumner(obj.getApplicationNumner());
			oldObj.setApplicationDate(obj.getApplicationDate());
			System.out.println("successfully updated");
			return applicationRepository.saveAndFlush(oldObj);
		}
		
		System.out.println("no object found with these id");
		return obj;
			
		// TODO Auto-generated method stub
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


