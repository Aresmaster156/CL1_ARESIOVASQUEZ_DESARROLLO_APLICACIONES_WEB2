package org.cibertec.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.modelo.DetalleOrden;

public interface IDetalleOrdenService {
	public List<DetalleOrden> findAll();
	public void delete(String id);
	public DetalleOrden save( DetalleOrden producto);
	public void update(DetalleOrden producto);


}
