package com.sapiy.service;

import com.sapiy.domain.Adress;
import com.sapiy.repository.AdressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AdressService extends GeneralService<Adress> {

  @Autowired
  AdressRepository adressRepository;

  @Override
  public JpaRepository<Adress, Integer> getRepository() {
    return adressRepository;
  }

}
