package org.cibertec.edu.pe.service;

import org.cibertec.edu.pe.service.IDetalleOrdenService;

import java.util.List;

import org.cibertec.edu.pe.interfaces.IDetalleOrdenRepository;
import org.cibertec.edu.pe.modelo.DetalleOrden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DetalleOrdenServiceImpl implements IDetalleOrdenService{
	
	@Autowired
	private IDetalleOrdenRepository detalleOrdenRepository;

	@Override
	public List<DetalleOrden> findAll() {
		return detalleOrdenRepository.findAll();
	}

	@Override
	public void delete(String id) {
		detalleOrdenRepository.deleteById(id);	
		
	}

	@Override
	public DetalleOrden save(DetalleOrden producto) {
		return detalleOrdenRepository.save(producto);
	}

	@Override
	public void update(DetalleOrden producto) {
		detalleOrdenRepository.save(producto);	
		
	}



}
