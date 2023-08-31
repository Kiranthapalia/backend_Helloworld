package com.example.hello.world.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Contact {
	@RequestMapping("/contact")
	public String hello() {
		return "This is the contact page.";
	}
}
