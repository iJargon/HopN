package edu.csupomona.cs480;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.csupomona.cs480.data.Event;
import edu.csupomona.cs480.data.provider.EventManager;
import edu.csupomona.cs480.data.provider.FSEventManager;

public class EventManagerTest {

	@Test
	public void testUpdateEvent() {
		EventManager eventmanager = new FSEventManager();
		Event event = new Event();
		event.setDate("today");
		event.setEnd_time("10pm");
		event.setEventID("party");
		event.setName("Halloween Party");
		event.setLocation("CPP");
		event.setStart_time("6pm");
		eventmanager.updateEvent(event);
		
		assertEquals("6pm", eventmanager.getEvent("party").getStart_time());
	}
	
	@Test
	public void testGetEvent() {
		EventManager eventmanager = new FSEventManager();
		Event event = new Event();
		event.setDate("tomorrow");
		event.setEnd_time("4pm");
		event.setEventID("123");
		event.setName("Scrum");
		event.setLocation("work");
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

}
