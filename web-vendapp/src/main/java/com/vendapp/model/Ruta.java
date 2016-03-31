package com.vendapp.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity de la tabla Ruta
 */

@Entity
@Table(name="ruta")
public class Ruta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_ruta")
	private Integer idRuta;
	
	@Column(name = "descripcion")
	private String Descripcion;
	
	

	
	public Integer getIdRuta() {
		return idRuta;
	}

	public void setIdRuta(Integer idRuta) {
		this.idRuta =idRuta;
	}


	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}


	
}