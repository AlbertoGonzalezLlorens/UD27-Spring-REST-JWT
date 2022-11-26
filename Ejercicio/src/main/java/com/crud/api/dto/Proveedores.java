package com.crud.api.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.crud.api.dto.Suministra;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="proveedores")
public class Proveedores {

	//Atributos de entidad cliente
	@Id
	private String id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;

    @OneToMany
    @JoinColumn(name="idproveedor")
    private List<Suministra> suministra;
	
	//Constructores
	
	public Proveedores() {
	
	}


	public Proveedores(String id, String nombre) {
		//super();
		this.id = id;
		this.nombre = nombre;

	}

	
	//Getters y Setters
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the usuario
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idproveedor")
	public List<Suministra> getSuministra() {
		return suministra;
	}

	/**
	 * @param usuario the video to set
	 */
	public void setSuministra(List<Suministra> suministra) {
		this.suministra = suministra;
	}

	//Metodo impresion de datos por consola
	
	@Override
	public String toString() {
		return "Proveedores [id=" + id + ", nombre=" + nombre + "]";
	}

}