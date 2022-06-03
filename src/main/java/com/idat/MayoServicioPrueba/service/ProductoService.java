package com.idat.MayoServicioPrueba.service;

import java.util.List;

import com.idat.MayoServicioPrueba.model.Productos;

public interface ProductoService {
	
	//Operaciones a interactuar con mi BD
	
		void guardarProducto(Productos producto);
		void actualizarProducto(Productos producto);
		void eliminarProducto(Integer id);
		List<Productos> listarProductos();
		Productos obtenerProductoId(Integer id);

}
