package com.example.MyBatisPractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EtcController {

	@GetMapping("/")
	public String book() {

		return "redirect:/h2-console";

	}

}
