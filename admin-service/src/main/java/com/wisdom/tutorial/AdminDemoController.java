package com.wisdom.tutorial;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin-demo")
public class AdminDemoController {
	@Value("${test.admin.prop}")
	private String testProperty;

	@GetMapping
	public String test() {
		
		return testProperty;
	}
}