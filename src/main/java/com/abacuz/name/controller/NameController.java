package com.abacuz.name.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abacuz.name.service.NameService;

@RestController
public class NameController {

	@Autowired
	private NameService service;
	
	@RequestMapping("/name")
	public String  getName() {
		return service.getName();
	}
}
