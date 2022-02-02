package com.spring.project.vehiclelicence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.project.vehiclelicence.entity.Challan;


@Repository
public interface ChallanRepository extends JpaRepository<Challan, Integer> {

}
