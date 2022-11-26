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
import com.crud.api.dto.Proveedores;
import com.crud.api.service.ProveedoresServiceImpl;


@RestController
@RequestMapping("/api")

public class ProveedoresController {

	
	@Autowired
	ProveedoresServiceImpl ProveedoresServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedores> listarProveedores(){
		return ProveedoresServiceImpl.listarProveedores();
	}
	
	@PostMapping("/proveedores")
	public Proveedores salvarProveedores(@RequestBody Proveedores proveedores) {
		
		return ProveedoresServiceImpl.guardarProveedores(proveedores);
	}
	
	@GetMapping("/proveedores/{id}")
	public Proveedores proveedoresXID(@PathVariable(name="id") String id) {
		
		Proveedores proveedores_xid= new Proveedores();
		
		proveedores_xid=ProveedoresServiceImpl.proveedoresXID(id);
		
		System.out.println("Proveedores XID: "+proveedores_xid);
		
		return proveedores_xid;
	}
	
	@PutMapping("/proveedores/{id}")
	public Proveedores actualizarProveedores(@PathVariable(name="id")String id,@RequestBody Proveedores proveedores) {
		
		Proveedores proveedores_seleccionado= new Proveedores();
		Proveedores proveedores_actualizado= new Proveedores();
		
		proveedores_seleccionado= ProveedoresServiceImpl.proveedoresXID(id);
		proveedores_seleccionado.setNombre(proveedores.getNombre());

		proveedores_actualizado = ProveedoresServiceImpl.actualizarProveedores(proveedores_seleccionado);
		
		System.out.println("El proveedor actualizado es: "+ proveedores_actualizado);
		
		return proveedores_actualizado;
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void eleiminarProveedores(@PathVariable(name="id")String id) {
		ProveedoresServiceImpl.eliminarProveedores(id);
	}
	
	
}

