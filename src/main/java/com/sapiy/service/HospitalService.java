package com.sapiy.service;

import com.sapiy.domain.Hospital;
import com.sapiy.repository.HospitalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class HospitalService extends GeneralService<Hospital> {

  @Autowired
  HospitalRepository hospitalRepository;

  @Override
  public JpaRepository<Hospital, Integer> getRepository() {
    return hospitalRepository;
  }

}
