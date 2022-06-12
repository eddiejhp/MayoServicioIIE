package com.idat.MayoServicioPrueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MayoServicioPrueba.model.Productos;
import com.idat.MayoServicioPrueba.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	//INJECCION DE CAPA REPOSITORIO
	@Autowired
	private ProductoRepository repository;
	
	@Override
	public void guardarProducto(Productos producto) {
		// TODO Auto-generated method stub
		//Se actualiza a metodos de JPA
		repository.save(producto);
	}

	@Override
	public void actualizarProducto(Productos producto) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(producto);
	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<Productos> listarProductos() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Productos obtenerProductoId(Integer id) {
		// TODO Auto-generated method stub
		//return repository.getByid(id);
		return repository.findById(id).orElse(null);
	}

}
