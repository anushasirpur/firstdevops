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

import com.spring.project.vehiclelicence.entity.Applicant;
import com.spring.project.vehiclelicence.entity.Application;
import com.spring.project.vehiclelicence.service.ApplicantService;

@RestController
public class ApplicantController {
	@Autowired
	ApplicantService applicantservice;
	@PostMapping("/applicants")
	public Applicant createApplicant(@Valid@RequestBody Applicant applicant){
		return applicantservice.createApplicant(applicant);
		
	}
	@GetMapping("/applicants")
	public List<Applicant>getApplicant(){
		return applicantservice.getApplicants();
	}
	@DeleteMapping("/applicants")
	public boolean deleteAllApplicant(){
		return applicantservice.deleteAllApplicant();
	}
	@PutMapping("/applicants/{applicantId")
	public Applicant updateApplicant(@PathVariable int applicantId, @RequestBody Applicant obj){
		return  applicantservice.updateApplicant(applicantId,obj);
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
