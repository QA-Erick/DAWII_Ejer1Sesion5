package com.ejer.dawii.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ejer.dawii.models.DetalleFactura;

@Repository
public interface IDetalleFacturaRepository extends CrudRepository<DetalleFactura, Integer> {

}
