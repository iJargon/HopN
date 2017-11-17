package edu.csupomona.cs480.data;

public class Driver {
	private User driver;
	private User[] passengers;
	private int passengerCount;
	
	public Driver(User u, int x) {
		this.driver = u;
		passengers = new User[x];
		passengerCount = 0;
	}

	public User getDriver() {
		return driver;
	}

	public void setDriver(User driver) {
		this.driver = driver;
	}
	
	public void addPassenger(User u) {
		passengers[passengerCount] = u;
		passengerCount++;
	}
	
	public int getPassengerCount() {
		return passengerCount;
	}	
	
	
}
