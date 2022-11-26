package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.IPiezasDAO;
import com.crud.api.dto.Piezas;

@Service
public class PiezasServiceImpl implements IPiezasService{
	
	//Utilizamos los metodos de la interface IUsuarioDAO, es como si instaciaramos.
	@Autowired
	IPiezasDAO iPiezasDAO;

	@Override
	public List<Piezas> listarPiezas() {
		
		return iPiezasDAO.findAll();
	}

	@Override
	public Piezas guardarPiezas(Piezas piezas) {
		
		return iPiezasDAO.save(piezas);
	}

	@Override
	public Piezas piezasXID(int codigo) {
		
		return iPiezasDAO.findById(codigo).get();
	}

	@Override
	public Piezas actualizarPiezas(Piezas piezas) {
		
		return iPiezasDAO.save(piezas);
	}

	@Override
	public void eliminarPiezas(int codigo) {
		
		iPiezasDAO.deleteById(codigo);
		
	}

}