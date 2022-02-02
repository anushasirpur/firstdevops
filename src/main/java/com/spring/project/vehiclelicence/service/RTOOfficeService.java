package com.spring.project.vehiclelicence.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.vehiclelicence.entity.Document;
import com.spring.project.vehiclelicence.entity.RTOOffice;
import com.spring.project.vehiclelicence.repo.RTOOfficeRepository;

@Service
public class RTOOfficeService {
	@Autowired
	RTOOfficeRepository rtoofficeRepository;

	public RTOOffice createRTOOffice(RTOOffice rto_office) {
		// TODO Auto-generated method stub
		return rtoofficeRepository.save(rto_office);
	}

	public List<RTOOffice> getRto_office() {
		// TODO Auto-generated method stub
		return rtoofficeRepository.findAll();
	}

	public boolean deleteAllRTOOffice() {
		try{
			rtoofficeRepository.deleteAll();
		}catch(Exception e){
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}

	public RTOOffice updateRTOOffice(int rtooffice, RTOOffice obj) {
		Optional<RTOOffice>addContainer=rtoofficeRepository.findById(rtooffice);
		if(addContainer.isPresent())
		{
			RTOOffice oldObj= addContainer.get();
			oldObj.setRtoid(obj.getRtoid());
			oldObj.setRtoname(obj.getRtoname());
			System.out.println("successfully updated");
			return rtoofficeRepository.saveAndFlush(oldObj);
		}
		
		System.out.println("no object found with these id");
		return obj;
	}

}
