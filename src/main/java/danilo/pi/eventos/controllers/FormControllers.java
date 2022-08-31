package danilo.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import danilo.pi.eventos.Models.Dados;

@Controller
public class FormControllers {

	@RequestMapping("/eventos/form")
	private String form() {
		return "form";
	}
	
	@PostMapping("/eventos/add")
	private String add(Dados dados) {
		System.out.println(dados);
		return "add";
	}
	
}
