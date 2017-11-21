package edu.csupomona.cs480.data;

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
	private String driver = "Be a Driver!";
	private String p1 = "HOPN!";
	private String p2 = "HOPN!";
	private String p3 = "HOPN!";
	private String p4 = "HOPN!";

	public void setDriver(String userID) {
		this.driver = userID;
	}
	
	public String getDriver() {
		return driver;
	}
	
	public String getP1() {
		return p1;
	}

	public void setP1(String p1) {
		this.p1 = p1;
	}

	public String getP2() {
		return p2;
	}

	public void setP2(String p2) {
		this.p2 = p2;
	}

	public String getP3() {
		return p3;
	}

	public void setP3(String p3) {
		this.p3 = p3;
	}

	public String getP4() {
		return p4;
	}

	public void setP4(String p4) {
		this.p4 = p4;
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
