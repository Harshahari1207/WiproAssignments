package com.wipro.Assignment1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.Assignment1.dao.EmpRepo;
import com.wipro.Assignment1.model.Employee;

@Controller
public class EmpController {
	
	@Autowired
	EmpRepo repo;
	
	@RequestMapping("home")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("welcome")
	public String welcome() {
		return "welcome.jsp";
	}
	@RequestMapping("/addEmp")
	public String addEmployee(Employee employee) {
		
		repo.save(employee);
		return "welcome.jsp";
	}
	
	@RequestMapping("/getEmp")
	public ModelAndView getEmployee(@RequestParam int empid) {
		
		ModelAndView mv = new ModelAndView("showEmp.jsp");
		Employee employee = repo.findById(empid).orElse(new Employee());
		mv.addObject(employee);
		return mv;
	}
	
	@RequestMapping("/deleteEmp")
	public ModelAndView deleteEmployee(@RequestParam int empid) {
		
		ModelAndView mv = new ModelAndView("welcome.jsp");
		repo.deleteById(empid);
		
		return mv;
	}
	
	@RequestMapping("/updateEmp")
	public ModelAndView updateEmployee(@RequestParam int empid, Employee employee) {
		
		ModelAndView mv = new ModelAndView("welcome.jsp");
		repo.save(employee);
		
		return mv;
	}

}
