package com.exercise43webservicesrest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/Mensajes") //resource == class
public class Mensajes {
	
	@Path("/diLoTuyo")// /rest/Mensajes/diLoTuyo
	@GET
	public String sayHello()
	{
		return "You have a mosco";
	}
	
	

}
