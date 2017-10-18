package edu.csupomona.cs480.data;

/*
 * 	Event object
 */
public class Event {
	private	int total;
	private int eventID;
	private String name;
	private String location;
	private String date;
	private String start_time;
	private String end_time;
	
	public Event() {
		// unique eventID automatically given at creation of an event
		total++;
		this.eventID = total;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
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

	public int getEventID() {
		return eventID;
	}
}
