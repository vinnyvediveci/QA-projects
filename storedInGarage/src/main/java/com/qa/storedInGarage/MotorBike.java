package com.qa.storedInGarage;

public class MotorBike extends Vehicle {
     
	private String typeOfBike;
	private int topSpeed;
	
	public MotorBike(String typeOfBike, int topSpeed) {
		this.typeOfBike = typeOfBike;
		this.topSpeed = topSpeed;
	}
	
	public static void wheelie () {
		
	}
	
	public static void rev() {
		
	}

	public String getTypeofBike() {
		return typeOfBike;
	}

	public void setTypeofBike(String typeofBike) {
		this.typeOfBike = typeofBike;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	 @Override
	  public String toString() {
		  return this.getTypeofBike() + " " + this.getTopSpeed();
	 }
}
