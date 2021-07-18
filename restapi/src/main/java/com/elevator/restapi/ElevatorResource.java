package com.elevator.restapi;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("elevators")
public class ElevatorResource {
	ElevatorRepository repo = new ElevatorRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Elevator> getElevatorDetails() {
		return repo.getElevatorDetails();
	}
	
	@GET
	@Path("elevator/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Elevator getElevator(@PathParam("id")int id) {  //To fetch any ID of the elevators
		return repo.getElevator(id);
	}
	
	@POST
	@Path("elevator")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Elevator creatElevatorData(Elevator e1) {
		System.out.println(e1);	
		repo.create(e1);
		return e1;
	}
}

