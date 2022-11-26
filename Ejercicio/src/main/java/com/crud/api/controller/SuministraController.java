package com.crud.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud.api.dto.Suministra;
import com.crud.api.service.SuministraServiceImpl;


@RestController
@RequestMapping("/api")

public class SuministraController {

	
	@Autowired
	SuministraServiceImpl SuministraServiceImpl;
	
	@GetMapping("/suministran")
	public List<Suministra> listarSuministra(){
		return SuministraServiceImpl.listarSuministra();
	}
	
	@PostMapping("/suministran")
	public Suministra salvarSuministra(@RequestBody Suministra suministra) {
		
		return SuministraServiceImpl.guardarSuministra(suministra);
	}
	
	@GetMapping("/suministran/{id}")
	public Suministra suministraXID(@PathVariable(name="id") int id) {
		
		Suministra suministra_xid= new Suministra();
		
		suministra_xid=SuministraServiceImpl.suministraXID(id);
		
		System.out.println("Suministra XID: "+suministra_xid);
		
		return suministra_xid;
	}
	
	@PutMapping("/suministran/{id}")
	public Suministra actualizarSuministra(@PathVariable(name="id")int id,@RequestBody Suministra suministra) {
		
		Suministra suministra_seleccionado= new Suministra();
		Suministra suministra_actualizado= new Suministra();
		
		suministra_seleccionado= SuministraServiceImpl.suministraXID(id);
		suministra_seleccionado.setPrecio(suministra.getPrecio());
		suministra_seleccionado.setProveedores(suministra.getProveedores());
		suministra_seleccionado.setPiezas(suministra.getPiezas());

		suministra_actualizado = SuministraServiceImpl.actualizarSuministra(suministra_seleccionado);
		
		System.out.println("Suministra actualizado es: "+ suministra_actualizado);
		
		return suministra_actualizado;
	}
	
	@DeleteMapping("/suministran/{id}")
	public void eleiminarSuministran(@PathVariable(name="id")int id) {
		SuministraServiceImpl.eliminarSuministra(id);
	}
	
	
}