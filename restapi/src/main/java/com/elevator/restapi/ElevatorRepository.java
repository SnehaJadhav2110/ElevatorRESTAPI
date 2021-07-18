package com.elevator.restapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElevatorRepository {
	Connection con = null;
	String url = "jdbc:mysql://0.0.0.0:1521/RestDB";
	String username = "SYSTEM";
	String password = "root";
	
	public ElevatorRepository() {		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, username , password);
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
	}
	public List<Elevator> getElevatorDetails() {
		List<Elevator> elevators = new ArrayList<>();
		String sql = "select * from Elevator";
		try {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);	
		while(rs.next()) {
			Elevator e = new Elevator();
			e.setId(rs.getInt(1));
			e.setCapacity(rs.getDouble(2));
			e.setCompany(rs.getString(2));
			e.setBuilding(rs.getString(3));
			e.setFloors(rs.getInt(4));
			e.setStatus(rs.getString(5));
			
			elevators.add(e);
			}
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
		return elevators;
	}
		
	
	public Elevator getElevator(int id) {
		String sql = "select * from Elevator where id="+id;
		Elevator e = new Elevator();
		try {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		if(rs.next()) {			
			e.setId(rs.getInt(1));
			e.setCapacity(rs.getDouble(2));
			e.setCompany(rs.getString(2));
			e.setBuilding(rs.getString(3));
			e.setFloors(rs.getInt(4));
			e.setStatus(rs.getString(5));
			
			}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		return e;	
	}

	public void create(Elevator e1) {
		String sql = "insert into Elevator values(?,?,?,?,?,?)";
		try {
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, e1.getId());
		st.setDouble(2, e1.getCapacity());
		st.setString(3, e1.getCompany());
		st.setString(13, e1.getBuilding());
		st.setInt(4, e1.getFloors());
		st.setString(5, e1.getStatus());
		st.executeUpdate();	
		}
		catch(Exception e11) {
			System.out.println(e11);
		}
	}
}


