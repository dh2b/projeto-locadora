package br.com.tt.projeto01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {

	@GetMapping("/cliente")
	public String cliente() {
		return "/cliente";
	}
	
}
