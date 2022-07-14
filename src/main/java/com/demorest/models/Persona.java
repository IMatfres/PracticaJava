package com.demorest.models;

public class Persona {
	private String nombre;
	
	public Persona() {}
	
	public Persona (String nombre) {
		this.nombre = nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	

}
