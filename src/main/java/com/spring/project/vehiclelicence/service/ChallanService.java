package com.spring.project.vehiclelicence.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.vehiclelicence.entity.Address;
import com.spring.project.vehiclelicence.entity.Challan;
import com.spring.project.vehiclelicence.repo.ChallanRepository;


@Service
public class ChallanService {
	@Autowired
	ChallanRepository challanRepository;

	public Challan createChallan(Challan challans) {
		// TODO Auto-generated method stub
		return  challanRepository.save(challans);
	}

	public List<Challan> getChallans() {
		// TODO Auto-generated method stub
		return challanRepository.findAll();
	}

	public boolean deleteAllChallan() {
		try{
			challanRepository.deleteAll();
		}catch(Exception e){
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}

	public Challan updateChallan(int challan, Challan obj) {
		
		Optional<Challan>addContainer=challanRepository.findById(challan);
		if(addContainer.isPresent())
		{
			Challan oldObj= addContainer.get();
			oldObj.setChallannumber(obj.getChallannumber());
			oldObj.setVehiclenumber(obj.getVehiclenumber());
			System.out.println("successfully updated");
			return challanRepository.saveAndFlush(oldObj);
		}
		
		System.out.println("no object found with these id");
		return obj;
		
		
		
		
		
		
		
		
	}

}
