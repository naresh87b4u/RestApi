package com.example.demo.rest.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
	
	@RequestMapping("/hello")
	public String getString()
	{
		return "Hello Narendran";
	}

}
