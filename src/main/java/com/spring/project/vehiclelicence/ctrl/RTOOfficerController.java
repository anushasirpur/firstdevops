package com.spring.project.vehiclelicence.ctrl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
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

import com.spring.project.vehiclelicence.entity.RTOOfficer;
import com.spring.project.vehiclelicence.entity.User;
import com.spring.project.vehiclelicence.service.RTOOfficerService;

@RestController
public class RTOOfficerController {
	@Autowired
	RTOOfficerService rtoofficerservice;
	@PostMapping("/rto_officers")
	public RTOOfficer createRTOOfficer(@Valid@RequestBody RTOOfficer rto_officers){
		return rtoofficerservice.createRTOOfficer(rto_officers);
	}
	@GetMapping("/rto_officers")
	public List<RTOOfficer>getRTOOfficer(){
		return rtoofficerservice.getRto_officers();
	}
	
	 @DeleteMapping("/rto_officers")
	  	public boolean deleteAllUser(){
	  		return rtoofficerservice.deleteAllRTOOfficer();
	  	}
	  	@PutMapping("/rto_officers/{rtoofficer}")
	  	public RTOOfficer updateRTOOfficer(@PathVariable int rtoofficer, @RequestBody RTOOfficer obj){
	  		return  rtoofficerservice.updateRTOOficer(rtoofficer,obj);
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
