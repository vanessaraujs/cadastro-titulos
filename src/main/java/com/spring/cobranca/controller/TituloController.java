package com.spring.cobranca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TituloController {
	
	@RequestMapping("/titulos/Home")
	public String novo() {
		return "Home";
	}
}
