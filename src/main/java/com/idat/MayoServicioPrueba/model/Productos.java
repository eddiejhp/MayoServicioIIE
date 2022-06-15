package com.idat.MayoServicioPrueba.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "Productos") // Por buenas practicas definir el nombre de la tabla
@Entity //Para indicar que es una entidad de tipo tabla
public class Productos {

	@Id //Para indicar que es el identificador y Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Para indicar que el campo sea autogenerado 1 2 3...
	private Integer idProducto; //@Column(definir nombre de la tabla) Opcional
	private String nombreProducto;
	private String descripcion;
	private Double precio;
	private Integer stock;
	
	//Para relacionar 1 a 1
	@OneToOne (mappedBy = "producto") //Se coloca el cualquiera de las clases solo cuando ese de 1 a 1 o muchos a muchos
	private Proveedor proveedor;
	
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(
			name = "productos_clientes",
			joinColumns = @JoinColumn(
					name = "id_producto", 
					nullable = false, 
					unique =true, 
					foreignKey =  @ForeignKey(foreignKeyDefinition = "foreign key(id_producto) references Productos(id_producto)")					
			),
			inverseJoinColumns = @JoinColumn(
					name = "id_Cliente", 
					nullable = false, 
					unique =true, 
					foreignKey =  @ForeignKey(foreignKeyDefinition ="foreign key(id_cliente) references cliente(id_cliente)")						
					)
			)
	
	private List<Cliente> cliente = new ArrayList<>();
	
	
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
