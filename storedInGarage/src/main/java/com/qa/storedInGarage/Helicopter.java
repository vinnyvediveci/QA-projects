package com.qa.storedInGarage;

public class Helicopter extends Vehicle{

	private int rotorLength;
	private int maxDistanceOnFullTank;
	  
	public Helicopter(int rotorLength, int maxDistanceOnFullTank) {
		this.rotorLength = rotorLength;
		this.maxDistanceOnFullTank = maxDistanceOnFullTank;
	}
	  public static void takeOff() {
		  
	  }
	  
	  public static void hover() {
		  
	  }
	  public int getRotorLength() {
			return rotorLength;
		}

		public void setRotorLength(int rotorLength) {
			this.rotorLength = rotorLength;
		}
		
	  @Override
	  public String toString() {
		  return this.getRotorLength() + " " + this.getMaxDistanceOnFullTank();
	  }
	public int getMaxDistanceOnFullTank() {
		return maxDistanceOnFullTank;
	}
	public void setMaxDistanceOnFullTank(int maxDistanceOnFullTank) {
		this.maxDistanceOnFullTank = maxDistanceOnFullTank;
	}
	  
}