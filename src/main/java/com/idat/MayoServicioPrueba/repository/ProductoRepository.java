package com.idat.MayoServicioPrueba.repository;

import java.util.List;

import com.idat.MayoServicioPrueba.model.Productos;

public interface ProductoRepository {
	
	//Operaciones a interactuar con mi BD
	
	void guardarProducto(Productos producto);
	void actualizarProducto(Productos producto);
	void eliminarProducto(Integer id);
	List<Productos> listarProductos();
	Productos obtenerProductoId(Integer id);
	
}
