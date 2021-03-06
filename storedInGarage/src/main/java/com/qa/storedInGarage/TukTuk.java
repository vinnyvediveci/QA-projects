package com.qa.storedInGarage;

public class TukTuk extends Vehicle {
 
	private String driverId;
	private boolean hasHood; 
	  
	  public TukTuk(String driverId, boolean hasHood) {
		  this.driverId = driverId;
		  this.hasHood = hasHood;
	  }

	public boolean isHasHood() {
		return hasHood;
	}

	public void setHasHood(boolean hasHood) {
		this.hasHood = hasHood;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	 @Override
	  public String toString() {
		  return this.getDriverId() + " " + this.isHasHood();
	 }
}
