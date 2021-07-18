package com.elevator.restapi;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Elevator {

	private int id;
	private double capacity;
	private String company;
	private int floors;
	private String status;
	private String building;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getFloors() {
		return floors;
	}
	public void setFloors(int floors) {
		this.floors = floors;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	@Override
	public String toString() {
		return "Elevator [id=" + id + "\n, capacity=" + capacity + "\n, company=" + company + "\n, floors=" + floors
				+ "\n, status=" + status + "\n, building=" + building + "]";
	}
	

	

	

}
