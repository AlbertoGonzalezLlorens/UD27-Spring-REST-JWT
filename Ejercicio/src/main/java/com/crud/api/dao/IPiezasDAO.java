package com.crud.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.api.dto.Piezas;

public interface IPiezasDAO extends JpaRepository<Piezas, Integer>{

}
