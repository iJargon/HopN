package edu.csupomona.cs480;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.csupomona.cs480.data.Event;
import edu.csupomona.cs480.data.provider.EventManager;
import edu.csupomona.cs480.data.provider.FSEventManager;

public class EventManagerTest {

	@Test
	public void testUpdateEvent() {
		EventManager eventmanager = new FSEventManager();
		Event event = new Event();
		event.setDate("Feb 3");
		event.setEnd_time("5 pm");
		event.setEventID("PolyFounders");
		event.setName("HackPoly 2018");
		event.setLocation("CPP");
		event.setStart_time("8 am");
		eventmanager.updateEvent(event);
		
		assertEquals("8 am", eventmanager.getEvent("PolyFounders").getStart_time());
	}
	
	@Test
	public void testGetEvent() {
		EventManager eventmanager = new FSEventManager();
		Event event = new Event();
		event.setDate("Tomorrow");
		event.setEnd_time("4pm");
		event.setEventID("Meeting");
		event.setName("Scrum");
		event.setLocation("LA");
		event.setStart_time("11am");
		eventmanager.updateEvent(event);
		
		assertEquals("Scrum", eventmanager.getEvent("123").getName());
	}
	
	@Test
	public void testDeleteEvent() {
		EventManager eventmanager = new FSEventManager();
		Event event = new Event();
		event.setDate("yesterday");
		event.setEnd_time("12pm");
		event.setEventID("LOL");
		event.setName("Taco");
		event.setLocation("Outback");
		event.setStart_time("2am");
		eventmanager.updateEvent(event);
		eventmanager.deleteEvent(event.getEventID());
		
		assertNull(eventmanager.getEvent(event.getEventID()));
	}
	
	@Test
	public void testAddCarpoolers() {
		EventManager eventmanager = new FSEventManager();
		Event event = new Event();
		event.setDate("11/18");
		event.setEnd_time("4pm");
		event.setEventID("meet");
		event.setName("standup");
		event.setLocation("whiteboard");
		event.setStart_time("3:45pm");
		event.setDriver("billy");
		event.setP1("Bob");
		event.setP2("Charley");
		event.setP3("Winston");
		event.setP4("Dur");
		eventmanager.updateEvent(event);
		
		assertEquals("Scrum", eventmanager.getEvent("123").getName());
	}

}
