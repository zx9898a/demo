package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DemoController {
	 @GetMapping("/hello")
	    public String hello() {
	        return "Hello World, Spring Boot running in Docker container";
	    }
}
