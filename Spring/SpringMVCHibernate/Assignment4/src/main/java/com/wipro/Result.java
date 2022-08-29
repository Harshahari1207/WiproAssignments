package com.wipro;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Result {
	@RequestMapping("/results")
	public ModelAndView showResults() {
		ModelAndView mv = new ModelAndView();
		ArrayList<String> mov = new ArrayList<>(Arrays.asList("Thor", "PS1", "Captain Marvel", "Iron Man", "Doctor Strange", "RRR", "Vikram", "Billa", "Don", "Mass"));
		mv.addObject("mov",mov);
		mv.setViewName("results");
		return mv;
	}

}
