package com.spring.project.vehiclelicence.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.vehiclelicence.entity.Address;
import com.spring.project.vehiclelicence.entity.Document;
import com.spring.project.vehiclelicence.repo.DocumentRepository;
@Service
public class DocumentService {
	@Autowired
	DocumentRepository documentRepository;

	public Document createDocument(Document document) {
		// TODO Auto-generated method stub
		return documentRepository.save(document);
	}

	public List<Document> getDocuments() {
		// TODO Auto-generated method stub
		return documentRepository.findAll();
	}

	public boolean deleteAllDocument() {
		try{
			documentRepository.deleteAll();
		}catch(Exception e){
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}

	public Document updateDocument(int document, Document obj) {
		Optional<Document>addContainer=documentRepository.findById(document);
		if(addContainer.isPresent())
		{
			Document oldObj= addContainer.get();
			oldObj.setPhoto(obj.getPhoto());
			oldObj.setIdproof(obj.getIdproof());
			System.out.println("successfully updated");
			return documentRepository.saveAndFlush(oldObj);
		}
		
		System.out.println("no object found with these id");
		return obj;
		
	}

}
