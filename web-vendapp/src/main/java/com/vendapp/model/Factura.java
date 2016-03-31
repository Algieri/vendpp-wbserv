package com.vendapp.model; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity de la tabla Facturas
 */
@Entity
@Table(name = "facturas")
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_factura")
	private Integer idFactura;
	
	@Column(name = "fecha_factura")
	private String fechaFactura;
	
	@Column(name = "id_vendedor")
	private Integer idVendedor;

	@Column(name = "id_cliente")
	private Integer idCliente;

	
	@Column(name = "importe")
	private String iImporte;
	
	
	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	public String getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public Integer getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
		}



	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
		}


	

	public String getImporte() {
		return iImporte;
	}

	public void setImporte(String Importe) {
		this.iImporte = Importe;
		}	
	

}