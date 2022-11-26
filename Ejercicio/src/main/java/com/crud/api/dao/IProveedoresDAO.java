package com.crud.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.api.dto.Proveedores;

public interface IProveedoresDAO extends JpaRepository<Proveedores, String>{

}
