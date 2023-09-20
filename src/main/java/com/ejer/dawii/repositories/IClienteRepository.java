package com.ejer.dawii.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ejer.dawii.models.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Integer> {
	Optional<Cliente> findByCliEma(String email);
}
