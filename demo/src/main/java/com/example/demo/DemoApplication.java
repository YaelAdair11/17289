package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("COMO ESTAS");
	}

	@RequestMapping("/hola")
	public String home(){
		System.out.println("Bienvenido");
		return "Bienvenido a Spring Boot!";
	}

	@RequestMapping("/adios")
	public String hello(){
		System.out.println("Adios");
		return "Hasta luego!";
	}

	@RequestMapping("/html")
	public String html(){
		System.out.println("HTML");
		return "<html><body><h1>Hola Mundo en HTML</h1><p>Este es un ejemplo de respuesta HTML.</p></body></html>";
	}
}
