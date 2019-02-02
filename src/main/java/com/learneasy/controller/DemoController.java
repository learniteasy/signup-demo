package com.learneasy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learneasy.config.PropertyConfiguration;

/**
 * 1.run [curl -X POST http://localhost:8080/actuator/refresh]
 * 
 * 
 * 
 */
@RestController
public class DemoController {

	@Autowired
	private PropertyConfiguration propertyConfiguration;

	@RequestMapping("/test")
	public String test() {
		StringBuilder builder = new StringBuilder();
		builder.append("test property - ").append(propertyConfiguration.getTestProperty()).append(" ")
				.append("local property - ").append(propertyConfiguration.getLocalTestProperty());
		return builder.toString();
	}
}
