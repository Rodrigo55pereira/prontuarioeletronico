package com.twtech.prontuario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TituloController {

	@RequestMapping("/prontuario/solicitacaoCirurgia")
	public String novo() {
		return "SolicitacaoCirurgia";
	}
	
	@RequestMapping("/prontuario/email")
	public String email() {
		return "Email";
	}
	
	@RequestMapping("/prontuario/conteudo")
	public String conteudo() {
		return "Content";
	}
	
	@RequestMapping("/prontuario/saidasHospitalares")
	public String saidas() {
		return "SaidasHospitalares";
	}
}
 