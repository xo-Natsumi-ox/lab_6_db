package com.sapiy.controller;

import com.sapiy.domain.Doctor;
import com.sapiy.service.DoctorService;
import com.sapiy.service.ServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController extends GeneralController<Doctor> {

  @Autowired
  DoctorService doctorService;

  @Override
  public ServiceInterface<Doctor> getService() {
    return doctorService;
  }

}
