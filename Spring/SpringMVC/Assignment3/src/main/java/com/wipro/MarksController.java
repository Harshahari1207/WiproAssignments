package com.wipro;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.cglib.transform.impl.AddStaticInitTransformer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MarksController {
	@RequestMapping("insertMarks")
	public ModelAndView Addmarks(HttpServletRequest request, HttpServletResponse response) {
		int i = Integer.parseInt(request.getParameter("eng"));
		int j = Integer.parseInt(request.getParameter("sci"));
		int k = Integer.parseInt(request.getParameter("math"));
		
		int a = i+j+k;
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("marks", a);
		
		return mv;
	}

}
