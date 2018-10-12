package com.qa.storedInGarage;

import java.util.ArrayList;
import java.util.stream.Collectors;



public class Garage {
	private ArrayList<Vehicle> objectList;

	public Garage() {
		objectList = new ArrayList<Vehicle>();
	}
	
	public void addVehicle(Vehicle Vehicle) {
		objectList.add(Vehicle);
	}
	
	public ArrayList<Vehicle> listVehicles() {

		return objectList;

	}
   
	 public ArrayList<Vehicle> calculateBill(Vehicle Vehicle) {
        ArrayList<Vehicle> vehicleList = (ArrayList<Vehicle>) objectList.stream().filter(n -> n.getClass() == Vehicle.getClass()).collect(Collectors.toList());
        return vehicleList;
	 }
 

}
