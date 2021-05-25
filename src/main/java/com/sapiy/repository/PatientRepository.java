package com.sapiy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapiy.domain.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
