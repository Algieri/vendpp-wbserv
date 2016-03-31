package com.vendapp.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Entity de la tabla Vendedores
 */
@Entity
@Table(name="vendedores")
public class Vendedor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_vendedor")
	private Integer idVendedor;
	
	@Column(name = "nombre_vendedor")
	private String nombreVendedor;
	
	@Column(name = "id_ruta")
	private Integer idRuta;

	
	

	
	public Integer getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
	}

	public String getNombreVendedor() {
		return nombreVendedor;
	}

	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}
	public Integer getIdRuta() {
		return idRuta;
	}

	public void setIdRuta(Integer idRuta) {
		this.idRuta = idRuta;
	}



	
}