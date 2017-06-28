package com.algaworks.gestaofesta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class GestaoFestaController {
	@RequestMapping("")
	public String home(){
		return "home";
	}
}
