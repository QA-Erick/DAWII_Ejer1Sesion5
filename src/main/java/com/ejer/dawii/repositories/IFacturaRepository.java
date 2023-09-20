package com.ejer.dawii.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ejer.dawii.models.Factura;

@Repository
public interface IFacturaRepository extends CrudRepository<Factura, Integer> {
	Optional<Factura> findByFacNum(int numero);
}
