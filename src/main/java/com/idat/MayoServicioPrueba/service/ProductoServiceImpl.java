package com.idat.MayoServicioPrueba.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MayoServicioPrueba.dto.ProductoDTORequest;
import com.idat.MayoServicioPrueba.dto.ProductoDTOResponse;
import com.idat.MayoServicioPrueba.model.Productos;
import com.idat.MayoServicioPrueba.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	//INJECCION DE CAPA REPOSITORIO
	@Autowired
	private ProductoRepository repository;
	
	@Override
	public void guardarProducto(ProductoDTORequest producto) {
		//Se actualiza a metodos de JPA
		
		Productos p = new Productos();
		p.setNombreProducto(producto.getNombre());
		p.setDescripcion(p.getDescripcion());
		p.setPrecio(producto.getPrecioProducto());
		p.setStock(producto.getStockProducto());
		repository.save(p);
	}

	@Override
	public void actualizarProducto(ProductoDTORequest producto) {
		
		Productos p = new Productos();
		p.setIdProducto(producto.getId());
		p.setNombreProducto(producto.getNombre());
		p.setDescripcion(p.getDescripcion());
		p.setPrecio(producto.getPrecioProducto());
		p.setStock(producto.getStockProducto());
		repository.saveAndFlush(p);
	}

	@Override
	public void eliminarProducto(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<ProductoDTOResponse> listarProductos() {
		
		List<ProductoDTOResponse> listar = new ArrayList<>();
		ProductoDTOResponse dto = null;
		List<Productos> p = repository.findAll();
		
		for (Productos productos : p) {
			
			dto = new ProductoDTOResponse();
			
			dto.setDescripcionProducto(productos.getDescripcion());
			dto.setNombre(productos.getNombreProducto());
			dto.setPrecioProducto(productos.getPrecio());
			dto.setStockProducto(productos.getStock());
			dto.setId(productos.getIdProducto());
			
			listar.add(dto);
		}
		
		return listar;
	}

	@Override
	public ProductoDTOResponse obtenerProductoId(Integer id) {
		
		Productos productos = repository.findById(id).orElse(null);
		ProductoDTOResponse dto = new ProductoDTOResponse();
		
		dto.setDescripcionProducto(productos.getDescripcion());
		dto.setNombre(productos.getNombreProducto());
		dto.setPrecioProducto(productos.getPrecio());
		dto.setStockProducto(productos.getStock());
		dto.setId(productos.getIdProducto());
		
		return dto;
	}

}
