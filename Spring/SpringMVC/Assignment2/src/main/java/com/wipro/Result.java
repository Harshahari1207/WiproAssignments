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
		ArrayList<String> series = new ArrayList<>(Arrays.asList("Stranger Things", "Money Heist", "Hello World", "The 100", "Game of Throwns", "Squad Game", "Death Note", "The Witcher", "Manifest","Statement"));
		mv.setViewName("results");
		mv.addObject("series", series);
		return mv;
	}

}
