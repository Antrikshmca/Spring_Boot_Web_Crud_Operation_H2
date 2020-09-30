package com.antriksh.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.antriksh.model.EmployeeEntity;


@Repository
public interface EmployeeRepository 
			extends CrudRepository<EmployeeEntity, Long> {

}
