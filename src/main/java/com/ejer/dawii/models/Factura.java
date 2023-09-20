package com.ejer.dawii.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Factura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fac_id")
	private int facId;
	
	@Column(name = "fac_num")
	private int facNum;
	
	@Column(name = "fac_fch")
	private String facFch;
	
	@ManyToOne
	@JoinColumn(name = "cli_id")
	private Cliente cliente;

	@OneToMany(mappedBy = "factura")
	private List<DetalleFactura> detalleFacturas;
}
