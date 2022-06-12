package com.idat.MayoServicioPrueba.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Productos") // Por buenas practicas definir el nombre de la tabla
@Entity //Para indicar que es una entidad de tipo tabla
public class Productos {

	@Id //Para indicar que es el identificador y Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Para indicar que el campo sea autogenerado 1 2 3...
	private Integer idProducto;
	//@Column(definir nombre de la tabla) Opcional
	private String nombreProducto;
	private String descripcion;
	private Double precio;
	private Integer stock;
	
	
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	
}
