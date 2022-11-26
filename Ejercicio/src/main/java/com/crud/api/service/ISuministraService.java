package com.crud.api.service;

import java.util.List;

import com.crud.api.dto.Suministra;

public interface ISuministraService {
	
		//Metodos del CRUD
		public List<Suministra> listarSuministra(); //Listar All 
		
		public Suministra guardarSuministra(Suministra suministra);	
		
		public Suministra suministraXID(int id); //Leer datos de un Usuario READ
		
		public Suministra actualizarSuministra(Suministra suministra); //Actualiza datos del Usuario UPDATE
		
		public void eliminarSuministra(int id);// Elimina el Usuario DELETE

}
