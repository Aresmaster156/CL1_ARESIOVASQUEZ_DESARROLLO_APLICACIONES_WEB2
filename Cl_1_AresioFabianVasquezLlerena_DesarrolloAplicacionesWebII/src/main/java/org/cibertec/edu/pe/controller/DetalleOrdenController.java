package org.cibertec.edu.pe.controller;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.modelo.DetalleOrden;
import org.cibertec.edu.pe.modelo.Producto;
import org.cibertec.edu.pe.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class DetalleOrdenController {
	@Autowired
	private ProductoService servicio;
	
	// Método  Listar
	@GetMapping("/listar")	
	public String Listado(Model m) {
		List<Producto> lista = servicio.findAll();
		m.addAttribute("productos", lista);
		return "listado";	
	}
	// Método  grabar
	@PostMapping("/save")
	public String save(@Validated Producto ObjC, Model m) {
		servicio.save(ObjC);
		return "redirect:/listar";
	}
	
	// Método para editar
	@GetMapping("/editar/{id}")
	public String edit(@PathVariable String id, Model m) {
		Optional<DetalleOrden> ObjC = servicio.Buscar(id);
		m.addAttribute("colaborador", ObjC);
		return "form";		
	}
	
	// Método para eliminar
	@GetMapping("/eliminar/{id}")
	public String delete(@PathVariable String id, Model m) {
		servicio.delete(id);
		return "redirect:/listar";	
	}

}
