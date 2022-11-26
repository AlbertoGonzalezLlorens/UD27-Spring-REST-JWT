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
import com.crud.api.dto.Piezas;
import com.crud.api.service.PiezasServiceImpl;


@RestController
@RequestMapping("/api")

public class PiezasController {

	
	@Autowired
	PiezasServiceImpl PiezasServiceImpl;
	
	@GetMapping("/piezas")
	public List<Piezas> listarPiezas(){
		return PiezasServiceImpl.listarPiezas();
	}
	
	@PostMapping("/piezas")
	public Piezas salvarPiezas(@RequestBody Piezas piezas) {
		
		return PiezasServiceImpl.guardarPiezas(piezas);
	}
	
	@GetMapping("/piezas/{codigo}")
	public Piezas piezasXID(@PathVariable(name="codigo") int codigo) {
		
		Piezas piezas_xid= new Piezas();
		
		piezas_xid=PiezasServiceImpl.piezasXID(codigo);
		
		System.out.println("Piezas XID: "+piezas_xid);
		
		return piezas_xid;
	}
	
	@PutMapping("/piezas/{codigo}")
	public Piezas actualizarPiezas(@PathVariable(name="codigo")int codigo,@RequestBody Piezas piezas) {
		
		Piezas piezas_seleccionado= new Piezas();
		Piezas piezas_actualizado= new Piezas();
		
		piezas_seleccionado= PiezasServiceImpl.piezasXID(codigo);
		piezas_seleccionado.setNombre(piezas.getNombre());

		piezas_actualizado = PiezasServiceImpl.actualizarPiezas(piezas_seleccionado);
		
		System.out.println("La pieza actualizado es: "+ piezas_actualizado);
		
		return piezas_actualizado;
	}
	
	@DeleteMapping("/piezas/{codigo}")
	public void eleiminarPiezas(@PathVariable(name="codigo")int codigo) {
		PiezasServiceImpl.eliminarPiezas(codigo);
	}
	
	
}