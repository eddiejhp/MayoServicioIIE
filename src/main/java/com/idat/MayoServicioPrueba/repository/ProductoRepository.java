package com.idat.MayoServicioPrueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MayoServicioPrueba.model.Productos;

//Al importar el @Repository borrar los objetos ya que el JPA los brinda
@Repository
public interface ProductoRepository extends JpaRepository<Productos, Integer>{
	
	//Operaciones a interactuar con mi BD
	
//	void guardarProducto(Productos producto);
//	void actualizarProducto(Productos producto);
//	void eliminarProducto(Integer id);
//	List<Productos> listarProductos();
//	Productos obtenerProductoId(Integer id);
	
	//NUEVA INTERFAZ EN MODO DE JPA
	
}
