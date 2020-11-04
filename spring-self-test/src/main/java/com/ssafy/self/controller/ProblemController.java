package com.ssafy.self.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssafy.self.model.service.ProblemService;

@Controller
@RequestMapping(value ="/problem")
public class ProblemController {

	@Autowired
	private ProblemService service;
	
}
