package com.spring.project.vehiclelicence.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.vehiclelicence.entity.Address;
import com.spring.project.vehiclelicence.entity.Application;
import com.spring.project.vehiclelicence.repo.AddressRepository;
@Service
public class AddressService {
	@Autowired
	AddressRepository addressRepository;

	public Address createAddress(Address address) {
		// TODO Auto-generated method stub
		return addressRepository.save(address);
	}
	

	public List<Address> getAddress() {
		// TODO Auto-generated method stub
		return addressRepository.findAll();
	}

	public boolean deleteAllAddress() {
		// TODO Auto-generated method stub
		try{
			addressRepository.deleteAll();
		}catch(Exception e){
			return false;
		}
		return true;
	}

	public Address updateAddress(int address, Address obj) {
		Optional<Address>addContainer=addressRepository.findById(address);
		if(addContainer.isPresent())
		{
			Address oldObj= addContainer.get();
			oldObj.setCity(obj.getCity());
			oldObj.setState(obj.getState());
			System.out.println("successfully updated");
			return addressRepository.saveAndFlush(oldObj);
		}
		
		System.out.println("no object found with these id");
		return obj;
		
		
		
		
		
		
		
		
	}

}
