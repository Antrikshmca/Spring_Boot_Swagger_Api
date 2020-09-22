package com.antriksh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestfulApi {

	@GetMapping(value="/")
	public String print()
	{
		return "welcome to spring boot swagger";
	}

}
