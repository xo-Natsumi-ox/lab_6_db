package com.sapiy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapiy.domain.Adress;

@Repository
public interface AdressRepository extends JpaRepository<Adress, Integer> {

}
