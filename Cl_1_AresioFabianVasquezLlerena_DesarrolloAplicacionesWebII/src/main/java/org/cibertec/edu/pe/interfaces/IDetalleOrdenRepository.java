package org.cibertec.edu.pe.interfaces;

import org.cibertec.edu.pe.modelo.DetalleOrden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IDetalleOrdenRepository extends JpaRepository<DetalleOrden, String> {

}
