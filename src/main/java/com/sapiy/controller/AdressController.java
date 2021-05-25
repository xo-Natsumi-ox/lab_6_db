package com.sapiy.controller;

import com.sapiy.domain.Adress;
import com.sapiy.service.AdressService;
import com.sapiy.service.ServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adress")
public class AdressController extends GeneralController<Adress> {

  @Autowired
  AdressService adressService;

  @Override
  public ServiceInterface<Adress> getService() {
    return adressService;
  }

}
