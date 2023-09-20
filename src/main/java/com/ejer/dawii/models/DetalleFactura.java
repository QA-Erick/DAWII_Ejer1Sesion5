package com.ejer.dawii.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DetalleFactura")
public class DetalleFactura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "det_fac_id")
	private int detFacId;
	
	@Column(name = "det_fac_pro")
	private String detFacPro;
	
	@Column(name = "det_fac_can")
	private int detFacCan;
	
	@Column(name = "det_fac_prc")
	private double detFacPrc;
	
	@ManyToOne
	@JoinColumn(name = "fac_id")
	private Factura factura;
}
