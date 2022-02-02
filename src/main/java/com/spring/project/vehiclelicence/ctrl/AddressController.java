package com.spring.project.vehiclelicence.ctrl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.vehiclelicence.entity.Address;
import com.spring.project.vehiclelicence.entity.Application;
import com.spring.project.vehiclelicence.service.AddressService;

@RestController
public class AddressController {
	@Autowired
	AddressService addresservice;
	@PostMapping("/address")
	public Address createAddress(@Valid@RequestBody Address address){
		return addresservice.createAddress(address);
	}
	@GetMapping("/address")
	public List<Address> getAddress(){
		return addresservice.getAddress();
	}
	@DeleteMapping("/address")
	public boolean deleteAllAddress(){
		return addresservice.deleteAllAddress();
	}
	@PutMapping("/address/{address}")
	public Address updateAddress(@PathVariable int address, @RequestBody Address obj){
		return  addresservice.updateAddress(address,obj);
	
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	
	public Map<String,String> handleValidationExceptions(MethodArgumentNotValidException ex){
	  Map<String,String> errors=new HashMap<>();
	  ex.getBindingResult().getAllErrors().forEach((error)->{
		  String fieldName= ((FieldError) error).getField();
		  String errorMessage = error.getDefaultMessage();
		  errors.put(fieldName,errorMessage);
	   });
	  return errors;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


