package com.javatech.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApiController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getData() {

		return "Hello World";
	}

}