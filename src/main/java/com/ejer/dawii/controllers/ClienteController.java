package com.ejer.dawii.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ejer.dawii.models.Cliente;
import com.ejer.dawii.repositories.IClienteRepository;

@Controller
public class ClienteController {
	@Autowired
	private IClienteRepository repository;
	
	public Cliente registrarCliente(Cliente cliente) {
		try {
			Optional<Cliente> clienteEmail = repository.findByCliEma(cliente.getCliEma());
			if (clienteEmail.isPresent()) {
				System.out.println("El correo electronico se encuentra registrado");
				return null;
			}
			return repository.save(cliente);
		} catch (Exception e) {
			System.out.println("Error al registrar cliente - "+ e.getMessage());
			return null;
		}
	}
}
