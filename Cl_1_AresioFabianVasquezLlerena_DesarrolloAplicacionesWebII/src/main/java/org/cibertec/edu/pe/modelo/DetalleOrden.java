package org.cibertec.edu.pe.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detallesorden")
public class DetalleOrden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String nombre;
	private double cantidad;
	private double subtotal;
	private double precioenvio;
	private double descuento;
	private double total;
	
	
	@ManyToOne
	private Producto producto;
	
	public DetalleOrden() {
	
	}

	public DetalleOrden(String id, String nombre, double cantidad, double subtotal, double precioenvio,
			double descuento, double total, Producto producto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.precioenvio = precioenvio;
		this.descuento = descuento;
		this.total = total;
		this.producto = producto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getPrecioenvio() {
		return precioenvio;
	}

	public void setPrecioenvio(double precioenvio) {
		this.precioenvio = precioenvio;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "DetalleOrden [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + 
				", subtotal=" + subtotal +  ", precioenvio=" + precioenvio +  ", descuento=" + descuento + ", total=" + total + "]";
	}

}

