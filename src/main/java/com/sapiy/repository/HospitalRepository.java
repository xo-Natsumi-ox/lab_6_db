package com.sapiy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapiy.domain.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

}
