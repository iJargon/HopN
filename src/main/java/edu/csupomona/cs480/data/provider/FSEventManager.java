package edu.csupomona.cs480.data.provider;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import edu.csupomona.cs480.data.Event;
import edu.csupomona.cs480.data.EventMap;
import edu.csupomona.cs480.util.ResourceResolver;

/**
 * The implementation of {@link UserManager} interface
 * using file system.
 * <p>
 * This class demonstrates how you can use the file system
 * as a database to store your data.
 *
 */
public class FSEventManager implements EventManager {

	/**
	 * We persist all the user related objects as JSON.
	 * <p>
	 */
	private static final ObjectMapper JSON = new ObjectMapper();

	/**
	 * Load the event map from the local file.
	 *
	 * @return
	 */
	private EventMap getEventMap() {
		EventMap eventMap = null;
		File eventFile = ResourceResolver.getEventFile();
		if (eventFile.exists()) {
			// read the file and convert the JSON content
			// to the EventMap object
			try {
				eventMap = JSON.readValue(eventFile, EventMap.class);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			eventMap = new EventMap();
		}
		return eventMap;
	}

	/**
	 * Save and persist the event map in the local file.
	 *
	 * @param eventMap
	 */
	private void persistEventMap(EventMap eventMap) {
		try {
			// convert the event object to JSON format
			JSON.writeValue(ResourceResolver.getEventFile(), eventMap);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Event getEvent(int eventId) {
		EventMap eventMap = getEventMap();
		return eventMap.get(eventId);
	}

	@Override
	public void updateEvent(Event event) {
		EventMap eventMap = getEventMap();
		eventMap.put(event.getEventID(), event);
		persistEventMap(eventMap);
	}

	@Override
	public void deleteEvent(int eventID) {
		EventMap eventMap = getEventMap();
		eventMap.remove(eventID);
		persistEventMap(eventMap);		
	}

	@Override
	public List<Event> listAllEvents() {
		EventMap eventMap = getEventMap();
		return new ArrayList<Event>(eventMap.values());
	}

}
