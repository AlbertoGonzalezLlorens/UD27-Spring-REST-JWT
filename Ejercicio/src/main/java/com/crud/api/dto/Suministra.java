package com.crud.api.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="suministra")//en caso que la tabla sea diferente
public class Suministra  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "precio")//no hace falta si se llama igual
	private int precio;

    @ManyToOne
    @JoinColumn(name="idproveedor")
    private Proveedores proveedores;
    @ManyToOne
    @JoinColumn(name="codigopieza")
    private Piezas piezas;
	
	//Constructores
	
	public Suministra() {
	
	}

	public Suministra(int id, int precio, Proveedores proveedores, Piezas piezas) {
		//super();
		this.id=id;
		this.precio = precio;
		this.proveedores = proveedores;
		this.piezas = piezas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Proveedores getProveedores() {
		return proveedores;
	}

	public void setProveedores(Proveedores proveedores) {
		this.proveedores = proveedores;
	}

	public Piezas getPiezas() {
		return piezas;
	}

	public void setPiezas(Piezas piezas) {
		this.piezas = piezas;
	}

	@Override
	public String toString() {
		return "Suministra [id=" + id + ", precio=" + precio + ", proveedores=" + proveedores + ", piezas=" + piezas
				+ "]";
	}
}
