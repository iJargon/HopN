package edu.csupomona.cs480.data;

import java.util.ArrayList;

/*
 * 	Event object
 */
public class Event {
	private String eventID;
	private String name;
	private String location;
	private String date;
	private String start_time;
	private String end_time;
	private ArrayList<Driver> drivers;

	public void addDriver(User u, int x ) {
		Driver d = new Driver(u, x);
		drivers.add(d);
	}
	
	public Driver getDriver(User u) {
		for (Driver driver: drivers) {
			if (u.getUserID() == driver.getDriver().getUserID()) {
				return driver;
			}
		}
		return null;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public String getEventID() {
		return eventID;
	}
	
	public void setEventID(String eventID) {
		this.eventID = eventID;
	}
}
