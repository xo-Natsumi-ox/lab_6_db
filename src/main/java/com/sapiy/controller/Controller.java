package com.sapiy.controller;

import java.sql.SQLException;
import java.util.List;
import org.springframework.http.ResponseEntity;

import com.sapiy.service.ServiceInterface;

public interface Controller<T> {
  ServiceInterface<T> getService();

  ResponseEntity<List<T>> findAll() throws SQLException;

  ResponseEntity<T> findById(Integer id) throws SQLException;

  ResponseEntity<T> create(T entity) throws SQLException;

  ResponseEntity<T> update(Integer id, T entity) throws SQLException;

  ResponseEntity<T> delete(Integer id) throws SQLException;

}
