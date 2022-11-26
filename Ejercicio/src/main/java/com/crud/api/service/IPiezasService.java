package com.crud.api.service;

import java.util.List;

import com.crud.api.dto.Piezas;

public interface IPiezasService {
	
		//Metodos del CRUD
		public List<Piezas> listarPiezas(); //Listar All 
		
		public Piezas guardarPiezas(Piezas piezas);	//Guarda un Usuario CREATE
		
		public Piezas piezasXID(int codigo); //Leer datos de un Usuario READ
		
		public Piezas actualizarPiezas(Piezas piezas); //Actualiza datos del Usuario UPDATE
		
		public void eliminarPiezas(int codigo);// Elimina el Usuario DELETE

}
