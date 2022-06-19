package com.idat.MayoServicioPrueba.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.MayoServicioPrueba.dto.ProductoDTORequest;
import com.idat.MayoServicioPrueba.dto.ProductoDTOResponse;;

public interface ProductoService {
	
	//Operaciones a interactuar con mi BD
	
		void guardarProducto(ProductoDTORequest producto);
		void actualizarProducto(ProductoDTORequest producto);
		void eliminarProducto(Integer id);
		List<ProductoDTOResponse> listarProductos();
		ProductoDTOResponse obtenerProductoId(Integer id);

}
