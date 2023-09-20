package com.ejer.dawii.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ejer.dawii.models.Factura;
import com.ejer.dawii.repositories.IFacturaRepository;

@Controller
public class FacturaController {
	@Autowired
	private IFacturaRepository repository;
	
	public Factura registrarFactura(Factura factura) {
		try {
			Optional<Factura> facturaNumero = repository.findByFacNum(factura.getFacNum());
			if (facturaNumero.isPresent()) {
				System.out.println("El numero de factura ya existe");
				return null;
			}
			return repository.save(factura);
		} catch (Exception e) {
			System.out.println("Error al registrar factura - "+ e.getMessage());
			return null;
		}
	}
}
