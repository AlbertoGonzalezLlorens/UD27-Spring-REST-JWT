package com.crud.api.service;

import java.util.List;

import com.crud.api.dto.Proveedores;

public interface IProveedoresService {
	
	//Metodos del CRUD
	public List<Proveedores> listarProveedores(); //Listar All 
	
	public Proveedores guardarProveedores(Proveedores proveedores);	//Guarda un Rol CREATE
	
	public Proveedores proveedoresXID(String id); //Leer datos de un Rol READ
	
	public Proveedores actualizarProveedores(Proveedores proveedores); //Actualiza datos del Rol UPDATE
	
	public void eliminarProveedores(String id);// Elimina el Rol DELETE

}
