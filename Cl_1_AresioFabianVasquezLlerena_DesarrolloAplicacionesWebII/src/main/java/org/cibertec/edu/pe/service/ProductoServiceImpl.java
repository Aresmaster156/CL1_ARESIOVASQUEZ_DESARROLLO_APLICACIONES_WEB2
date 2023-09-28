package org.cibertec.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaces.IProductoRepository;
import org.cibertec.edu.pe.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private IProductoRepository productoRepository;


	@Override
	public List<Producto> findAll() {
		return productoRepository.findAll();
	}


}
