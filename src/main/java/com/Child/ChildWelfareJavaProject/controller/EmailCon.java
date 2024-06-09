package com.Child.ChildWelfareJavaProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class EmailCon {
	
	
	@GetMapping("welcome")
	public String WElcome() {
		return "this is welcome api ";
	}
	
	

}
