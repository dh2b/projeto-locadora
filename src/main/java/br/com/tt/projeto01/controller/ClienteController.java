package br.com.tt.projeto01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	private final String template1 = "cliente"; 
	
	
	@GetMapping("/cliente")
	public String cliente() {
		return "/cliente";
	}
	
}
