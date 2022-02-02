package com.spring.project.vehiclelicence.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.vehiclelicence.entity.Applicant;
import com.spring.project.vehiclelicence.entity.Application;
import com.spring.project.vehiclelicence.repo.ApplicantRepository;
@Service
public class ApplicantService {
	@Autowired
	ApplicantRepository applicantRepository;

	public Applicant createApplicant(Applicant applicant) {
		// TODO Auto-generated method stub
		return applicantRepository.save(applicant);
	}

	public List<Applicant> getApplicants() {
		// TODO Auto-generated method stub
		return applicantRepository.findAll();
	}

	public boolean deleteAllApplicant() {
		// TODO Auto-generated method stub
		try{
			applicantRepository.deleteAll();
		}catch (Exception e){
			return false;
		}
		return true;
	}

	public Applicant updateApplicant(int applicantId, Applicant obj) {
		Optional<Applicant>addContainer=applicantRepository.findById(applicantId);
		if(addContainer.isPresent())
		{
			Applicant oldObj= addContainer.get();
			oldObj.setFirstname(obj.getFirstname());
			oldObj.setFirstname(obj.getLastname());
			System.out.println("successfully updated");
			return applicantRepository.saveAndFlush(oldObj);
		}
		
		System.out.println("no object found with these id");
		return obj;
		
		// TODO Auto-generated method stub
		
	}

	
}
