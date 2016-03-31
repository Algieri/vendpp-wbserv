package com.vendapp.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Entity de la tabla Producto
 */
@Entity
@Table(name="productos")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_producto")
	private Integer idProducto;
	
	@Column(name = "nombre_producto")
	private String nombreProducto;
	
	@Column(name = "precio")
	private float Precio;
	
	@Column(name = "cantidad")
	private Integer Cantidad;
	
	
	
	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}




	
	public float getPrecio() {
		return Precio;
	}

	public void setPrecio(float Precio ) {
		this.Precio = Precio;
	}
	

	public Integer getCantidad() {
		return Cantidad;
	}

	public void setCantidad(Integer Cantidad ) {
		this.Cantidad = Cantidad;
	}
	









	
}
