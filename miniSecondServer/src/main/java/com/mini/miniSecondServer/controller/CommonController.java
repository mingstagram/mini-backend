package com.mini.miniSecondServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common/api/")
public class CommonController {
	
	@GetMapping("/list")
	public String commonList() {
		return "mini-second-server:list";
	}

}
