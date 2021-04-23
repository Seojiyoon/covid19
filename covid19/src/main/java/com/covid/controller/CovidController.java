package com.covid.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.covid.domain.CovidAgeEntity;
import com.covid.service.CovidService;

@Controller
@RequestMapping("/covid/*")
public class CovidController {
	
	 @Inject
	 private CovidService service;

	 @RequestMapping(value = "/list", method = RequestMethod.GET)
	 public void getList(Model model) throws Exception {
	  
		 CovidAgeEntity covid = null;
		 covid = service.list();	
	  model.addAttribute("covid", covid);
	 }

}
