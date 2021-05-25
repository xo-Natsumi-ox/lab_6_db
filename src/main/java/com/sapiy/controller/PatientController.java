package com.sapiy.controller;

import com.sapiy.domain.Patient;
import com.sapiy.service.PatientService;
import com.sapiy.service.ServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientController extends GeneralController<Patient> {

  @Autowired
  PatientService patientService;

  @Override
  public ServiceInterface<Patient> getService() {
    return patientService;
  }

}
