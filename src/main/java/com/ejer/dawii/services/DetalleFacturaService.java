package com.ejer.dawii.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejer.dawii.models.DetalleFactura;
import com.ejer.dawii.repositories.IDetalleFacturaRepository;

@Service
public class DetalleFacturaService {
	@Autowired
	private IDetalleFacturaRepository repository;
	
	public DetalleFactura registrarDetalleFactura(DetalleFactura detalleFactura) {
		try {
			return repository.save(detalleFactura);
		} catch (Exception e) {
			throw e;
		}
	}
}
