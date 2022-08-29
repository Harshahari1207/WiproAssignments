package com.wipro.Assignment1;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@Autowired
	EmpRepo empRepo;
	@RequestMapping("/home")
	public String home() {
		
		return "home.jsp";
	}
	@RequestMapping("/addEmp")
	public String addEmp(Employee employee) {
		empRepo.save(employee);
		return "home.jsp";
	}
	
	@RequestMapping("/employees")
	@ResponseBody
	public List<Employee> getAllEmployee(){
		return empRepo.findAll();
	}
	
	@RequestMapping("/delemp/{empid}")
	@ResponseBody
	public void deleteEmp(@PathVariable("empid") int empid) {
		empRepo.deleteById(empid);
	}
	
	@RequestMapping("/getemp/{empid}")
	@ResponseBody
	public String getEmp(@PathVariable int empid) {
		return empRepo.findById(empid).toString();
	}
	
	@PutMapping("/updemp")
	public Employee updemp(@RequestBody Employee employee) {
		empRepo.save(employee);
		return employee;
	}

}
