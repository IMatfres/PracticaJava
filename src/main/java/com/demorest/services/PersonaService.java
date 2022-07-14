package com.demorest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demorest.models.Persona;

@Service
public class PersonaService {
	private final List<Persona> personas = new ArrayList<Persona>();
	
	public List<Persona> getAll () {
		return this.personas;
	}
	
	public void add (Persona p) {
		this.personas.add(p);
	}
	
	public Persona getUserByName (String nombre) {
		for (Persona persona : personas) {
			if(persona.getNombre().equalsIgnoreCase(nombre)) {
				return persona;
			}
		}
		
		return null;
	}
	
}
