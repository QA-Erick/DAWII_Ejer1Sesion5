package com.ejer.dawii.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ejer.dawii.models.DetalleFactura;
import com.ejer.dawii.repositories.IDetalleFacturaRepository;

@Controller
public class DetalleFacturaController {
	@Autowired
	private IDetalleFacturaRepository repository;
	
	public DetalleFactura registrarDetalleFactura(DetalleFactura detalleFactura) {
		try {
			return repository.save(detalleFactura);
		} catch (Exception e) {
			System.out.println("Error al registrar Detalle de Factura - "+ e.getMessage());
			return null;
		}
	}
}
