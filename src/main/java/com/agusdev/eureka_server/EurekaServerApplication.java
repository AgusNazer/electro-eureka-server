package com.agusdev.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
	//@Override
	public void addCorsMappings(CorsRegistry registry) {
		// Configuración global para permitir CORS en todos los endpoints
		registry.addMapping("/**") // Aplica CORS a todos los endpoints
				.allowedOrigins("http://localhost:5173") // Dirección de tu frontend (ajústalo según sea necesario)
				.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos HTTP permitidos
				.allowedHeaders("*") // Permite todos los encabezados
				.allowCredentials(true); // Permite credenciales (como cookies, autenticación)
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);


	}

}
