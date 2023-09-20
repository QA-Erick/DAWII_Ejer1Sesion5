package com.ejer.dawii;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ejer.dawii.controllers.ClienteController;
import com.ejer.dawii.controllers.FacturaController;
import com.ejer.dawii.models.Cliente;
import com.ejer.dawii.models.Factura;

@SpringBootApplication
public class DawiiEjer1Sesion5Application {

	public static void main(String[] args) {
		SpringApplication.run(DawiiEjer1Sesion5Application.class, args);
	}

	@Bean
	public CommandLineRunner testMain(ClienteController clienteController, FacturaController facturaController) {
		return args -> {
			Cliente cliente1 = new Cliente();
			cliente1.setCliNom("Pedro Navaja");
			cliente1.setCliEma("pednavaja@gmail.com");
			
			if (clienteController.registrarCliente(cliente1) != null) {
				System.out.println("Se registro al cliente exitosamente!");
			}
			
			Factura factura1 = new Factura();
			factura1.setFacNum(2);
			factura1.setFacFch("2023-09-16");
			factura1.setCliente(cliente1);
			
			if (facturaController.registrarFactura(factura1) != null) {
				System.out.println("Se registro la factura exitosamente!");
			}
		};
	}
}
