package com.qa.storedInGarage;

public abstract class Vehicle {
	
	
	
   private int vehicleNo;
   private int wheelNumber;
   private String ownerName;
   private String fuelType;
   private int mileage;
   private String color;
   
   
   
public int getVehicleNo() {
	return vehicleNo;
}
public void setVehicleNo(int vehicleNo) {
	this.vehicleNo = vehicleNo;
}
public int getWheelNumber() {
	return wheelNumber;
}
public void setWheelNumber(int wheelNumber) {
	this.wheelNumber = wheelNumber;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getFuelType() {
	return fuelType;
}
public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
}
public int getMileage() {
	return mileage;
}
public void setMileage(int mileage) {
	this.mileage = mileage;
}
   
   
}
