package com.wipro.Assignment1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HariController {
	
	@RequestMapping("hello")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("welcome")
	public ModelAndView welcome(login l, Errors errors) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("l",l);
		
		
		if(l.getPass().equals("Wipro@123")) {
			mv.setViewName("welcome");
			return mv;
		}else {
			mv.setViewName("invalid");
			return mv;
		}
	}
	

}
