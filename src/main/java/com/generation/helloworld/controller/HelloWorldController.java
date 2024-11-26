package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}

	@GetMapping("/bsm")
	public List<String> bsm() {
		return Arrays.asList(
				"Lista de habilidades BSM:",
				"Proatividade",
				"Orientação ao Futuro",			
				"Responsabilidade Pessoal",
				"Comunicação",
				"Mentalidade de Crescimento",
				"Trabalho em Equipe",			
				"Persistência",
				"Orientação ao Detalhe");
	}

	@GetMapping("/objetivos")
	public List<String> objetivos() {
		return Arrays.asList(
				"Objetivos desta semana:",
				"Aprimorar o conhecimento em Spring Boot",
				"Praticar a criação de APIs RESTful",
				"Reforçar conceitos de banco de dados e SQL",			
				"Melhorar habilidades em Java");
	}

}
