package com.olmo.restOlmo.cines;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

public class Cine {

	
	
	
	
	private String nombre;
	
	
	private String cif;
	
	
	private List<Sala> salas =new ArrayList<Sala>();


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCif() {
		return cif;
	}


	public void setCif(String cif) {
		this.cif = cif;
	}


	public List<Sala> getSalas() {
		return salas;
	}


	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}
	
	
	
	
}
