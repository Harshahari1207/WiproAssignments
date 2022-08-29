package com.wipro.Assignment1.dao;

import org.springframework.data.repository.CrudRepository;

import com.wipro.Assignment1.model.Employee;

public interface EmpRepo extends CrudRepository<Employee, Integer>{
	
	

}
