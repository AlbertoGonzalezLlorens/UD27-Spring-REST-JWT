package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.ISuministraDAO;
import com.crud.api.dto.Suministra;

@Service
public class SuministraServiceImpl implements ISuministraService{
	
	//Utilizamos los metodos de la interface IUsuarioDAO, es como si instaciaramos.
	@Autowired
	ISuministraDAO iSuministraADAO;

	@Override
	public List<Suministra> listarSuministra() {
		
		return iSuministraADAO.findAll();
	}

	@Override
	public Suministra guardarSuministra(Suministra suministra) {
		
		return iSuministraADAO.save(suministra);
	}

	@Override
	public Suministra suministraXID(int id) {
		
		return iSuministraADAO.findById(id).get();
	}

	@Override
	public Suministra actualizarSuministra(Suministra suministra) {
		
		return iSuministraADAO.save(suministra);
	}

	@Override
	public void eliminarSuministra(int id) {
		
		iSuministraADAO.deleteById(id);
		
	}

}