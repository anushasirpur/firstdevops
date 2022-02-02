package com.spring.project.vehiclelicence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.project.vehiclelicence.entity.RTOOffice;



@Repository
public interface RTOOfficeRepository extends JpaRepository<RTOOffice, Integer> {

}
