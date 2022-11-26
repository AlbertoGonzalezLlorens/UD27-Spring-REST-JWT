package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.IProveedoresDAO;
import com.crud.api.dto.Proveedores;


@Service
public class ProveedoresServiceImpl implements IProveedoresService{
	
	//Utilizamos los metodos de la interface IRolDAO, es como si instaciaramos.
	@Autowired
	IProveedoresDAO iProveedoresDAO;

	@Override
	public List<Proveedores> listarProveedores() {
		
		return iProveedoresDAO.findAll();
	}

	@Override
	public Proveedores guardarProveedores(Proveedores proveedores) {
		
		return iProveedoresDAO.save(proveedores);
	}

	@Override
	public Proveedores proveedoresXID(String id) {
		
		return iProveedoresDAO.findById(id).get();
	}

	@Override
	public Proveedores actualizarProveedores(Proveedores proveedores) {
		
		return iProveedoresDAO.save(proveedores);
	}

	@Override
	public void eliminarProveedores(String id) {
		
		iProveedoresDAO.deleteById(id);
		
	}

}