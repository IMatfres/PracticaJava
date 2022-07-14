package com.demorest.controllers;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.demorest.models.Persona;
import com.demorest.services.PersonaService;

@Component
@Path("/api")
public class ConfigController {
	private PersonaService personaService;
	
	public ConfigController (PersonaService personaService) {
		this.personaService = personaService;
	}
	
	@GET
	@Path("/users")
	@Produces("application/json")
	public List<Persona> getAll () {
		return this.personaService.getAll();
	}
	
	@POST
	@Path("/users")
	@Produces("application/json")
	@Consumes("application/json")
	public Response createPersona(Persona p) {
		this.personaService.add(p);
		return Response.created(
				URI.create("/users/"+p.getNombre())
	    ).build();
	}
	
	@GET
	@Path("/users/{nombre}")
	@Produces("application/json")
	public Persona getUserByName (@PathParam("nombre")String nombre) {
		return this.personaService.getUserByName(nombre);
	}
	
	
	
}
