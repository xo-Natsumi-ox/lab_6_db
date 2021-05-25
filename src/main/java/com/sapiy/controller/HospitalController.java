package com.sapiy.controller;

import com.sapiy.domain.Hospital;
import com.sapiy.service.HospitalService;
import com.sapiy.service.ServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital")
public class HospitalController extends GeneralController<Hospital> {

  @Autowired
  HospitalService hospitalService;

  @Override
  public ServiceInterface<Hospital> getService() {
    return hospitalService;
  }

}
