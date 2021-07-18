package com.elevator.restapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElevatorRepository {
		List<Elevator> elevators;

	public ElevatorRepository() {
		elevators = new ArrayList<>();
		
		Elevator e1 = new Elevator();
		e1.setId(1);
		e1.setCapacity(1000.0);
		e1.setCompany("ABC");
		e1.setFloors(10);
		e1.setStatus("Active");
		e1.setBuilding("PQR");
		
		Elevator e2 = new Elevator();
		e2.setId(2);
		e2.setCapacity(1300);
		e2.setCompany("XYZ");
		e2.setFloors(10);
		e2.setStatus("Inactive");
		e1.setBuilding("LMN");
		
		elevators.add(e1);
		elevators.add(e2);
			
		}
	
	public List<Elevator> getElevatorDetails() {
		return elevators;
	}
	
	public Elevator getElevator(int id) {
		for(Elevator e :elevators) {
			if(e.getId()==id)
				return e;
		}
		return new Elevator();
		
	}

	public void create(Elevator e1) {
		elevators.add(e1);
		
	}
}


