package com.qburst.ps.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Sreekesh
 * @version 0.1
 * @since ${date} ${time}
 *
 */
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView home(){
		ModelAndView model=new ModelAndView();
		model.addObject("message","Please login");
		model.setViewName("home");
		return model;
	}
	
	@RequestMapping(value="/login")
	public ModelAndView login(){
		ModelAndView model=new ModelAndView();
		model.addObject("messsage", "Welcome");
		model.setViewName("login");
		return model;
	}
}
